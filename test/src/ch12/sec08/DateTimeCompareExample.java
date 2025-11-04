package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		//LocalDateTime startDateTime= LocalDateTime.of(2025, 1,1,0,0,0);
		LocalDateTime startDateTime= LocalDateTime.now();
		System.out.println("시작일:  " + startDateTime.format(dtf));
		LocalDateTime endDateTime= LocalDateTime.of(2026, 4,24,0,0,0);
		System.out.println("종료일:  " + endDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println();
		}else if(startDateTime.isEqual(endDateTime)) {
			System.out.println();
		}else if(startDateTime.isAfter(endDateTime)) {
			System.out.println();
		}
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		

		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 월: " + remainMonth);
		System.out.println("남은 일" + remainDay);
		System.out.println("남은 시간" + remainHour);
		System.out.println("남은 분" + remainMinute);
		System.out.println("남은 초" + remainSecond);
		

	}

}
