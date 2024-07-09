package com.Login;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.mail.*;
import jakarta.mail.internet.*;

public class FetchOTP {
    public String getOTP() {
        String email = "nishumuhammednisham@gmail.com";
        String password = "uywq bekm vxzg yhqk";
        String host = "imap.gmail.com"; 

        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imap");
        properties.put("mail.imap.host", host);
        properties.put("mail.imap.port", "993");
        properties.put("mail.imap.ssl.enable", "true");

        try {
            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(email, password);
                }
            });
            session.setDebug(true);
            Store store = session.getStore("imap");
            store.connect(host, email, password);

            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            String otp = null;

            Message[] messages = inbox.getMessages();
            if (messages.length > 0) {
                for (int i = messages.length - 1; i >= 0; i--) {
                    Message latestMessage = messages[i];
                    String from = latestMessage.getFrom()[0].toString();
                    String subject = latestMessage.getSubject();

                    if (from.contains("trukr.management@smartlinkstech.com") && subject.equalsIgnoreCase("Trukr Password Expired")) {
                        String body = getTextFromMessage(latestMessage);
                        otp = extractOTP(body);
                        if (otp != null) {
                            break;
                        }
                    }
                }
            } else {
                System.out.println("No messages found.");
            }
            inbox.close(true);
            store.close();

            return otp;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private static String getTextFromMessage(Message message) throws Exception {
        if (message.isMimeType("text/plain")) {
            return message.getContent().toString();
        } else if (message.isMimeType("multipart/*")) {
            return getTextFromMimeMultipart((MimeMultipart) message.getContent(), 0);
        }
        return "";
    }
    private static String getTextFromMimeMultipart(MimeMultipart mimeMultipart, int depth) throws Exception {
        if (depth > 10) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = mimeMultipart.getCount();
        for (int i = 0; i < count; i++) {
            BodyPart bodyPart = mimeMultipart.getBodyPart(i);
            if (bodyPart.isMimeType("text/plain")) {
                result.append(bodyPart.getContent());
                break;
            } else if (bodyPart.isMimeType("multipart/*")) {
                result.append(getTextFromMimeMultipart((MimeMultipart) bodyPart.getContent(), depth + 1));
            } else if (bodyPart.isMimeType("text/html")) {
                result.append(stripHtmlTags(bodyPart.getContent().toString()));
            }
        }
        return result.toString();
    }
    private static String stripHtmlTags(String html) {
        return html.replaceAll("<[^>]*>", "");
    }
    private static String extractOTP(String body) {
        Pattern otpPattern = Pattern.compile("\\b\\d{5}\\b");
        Matcher matcher = otpPattern.matcher(body);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
