package utctime;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class UtcTime {
	
    public  String getCurrentUTCTime() {
        // Get current UTC time
        LocalDateTime utcDateTime = LocalDateTime.now(ZoneOffset.UTC);

        // Format the UTC time (optional, adjust as per your requirements)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedUtcTime = utcDateTime.format(formatter);

        return formattedUtcTime;
    }

}
