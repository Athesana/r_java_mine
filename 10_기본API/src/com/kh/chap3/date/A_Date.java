package com.kh.chap3.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class A_Date {

	public void method1() {
		// Date 클래스에서 날짜, 시간을 어떻게 처리하는지
	
		//기본 생성자를 통해서 Date 객체를 생성하면 현재 시간과 날짜에 대한 정보를 가지고 객체를 생성한다.
		Date now = new Date();
		
		System.out.println(now.toGMTString());
		
		// 1970년 1월 1일 00시를 기준으로 밀리 세컨드 단위로 표기된다.
		// 한국시간(KST)로 출력 될 땐 GMT(그리니치 평균시) 보다 +9시간 증가된 시간으로 표시된다.
		Date when = new Date(1);
		
		System.out.println(when);
	
		when = new Date(1000);
		System.out.println(when);
		
		
		// Deprecated 된 생성자를 사용한 Date 객체 생성
		Date when2 = new Date((2021-1900), (9-1), 7);
		System.out.println(when2);
		
		System.out.println(now.getTime());
		System.out.println(now.getYear() + 1900);
		System.out.println(now.getMonth() + 1);
		System.out.println(now.getDate());
		System.out.println(now.getDay());
		System.out.println(now.getHours());
		System.out.println(now.getMinutes());
		System.out.println(now.getSeconds());
		
		//여기까지 전부 구 작업 방식
		
		// SimpleDateFormat 클래스 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss:SSS초 (E) a");
		String formatDate = sdf.format(now);
		
		System.out.println(formatDate);
		
		
		
	
	}
	
	public void method2() {
		
		/*
		 * Date는 대부분의 메소드가 Deprecated 되었고, 단순히 특정 시점의 날짜 정보를 저장하는 역할만 한다.
		 * 자바 8부터는 날짜와 시간을 나타내는 java.time 패키지를 제공한다.
		 */
		
		LocalDateTime now = LocalDateTime.now();  //<-now = 정적 static 메소드
		LocalDateTime when = LocalDateTime.of(2021, 5, 25, 22, 30, 25);
		System.out.println(now);
		System.out.println(when);
		System.out.println();
		
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		System.out.println();
		
		LocalDateTime plusDays = now.plusDays(1).plusMonths(1).plusYears(1); // 메소드 체이닝 가능
		LocalDateTime minusDays = now.minusDays(1);  // 쁠마 된 각각 객체가 만들어진다.
		
		System.out.println(now);
		System.out.println(plusDays);
		System.out.println(minusDays);
		System.out.println();
		
		System.out.println(now.isAfter(plusDays));  //< 현재 기준으로 내가 매개값으로 넘겨준 날짜(plusDays) 기준 이후야? // false
		System.out.println(now.isBefore(plusDays));  // <plusDays 기준으로 내가 이전이야? //true
		System.out.println(now.isAfter(minusDays));
		System.out.println(now.isBefore(minusDays)); //< 현재 기준으로 마이너스데이보다 내가 이전이야?
		
//		LocalDate localDate = LocalDate.now();
//		LocalDate localDate = LocalDate.of(2021, 05, 25);  // 날짜 정보만 가지고 올 때
		LocalDate localDate = now.toLocalDate();  // 시간 정보만 가지고 올 떄
//		LocalTime localTime = LocalTime.now();
//		LocalTime localTime = LocalTime.of(22, 30, 50);  // 시 분 초 세팅 가능
		LocalTime localTime = now.toLocalTime();
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println();
		
		//D-Day를 구해보자 : Period클래스 (날짜의 차이를 가져올 때 사용)
		
		Period period = Period.between(plusDays.toLocalDate(), minusDays.toLocalDate());
		
		System.out.println("D-day : " + period.getDays());
		
		long between = ChronoUnit.DAYS.between(plusDays.toLocalDate(), minusDays.toLocalDate());
		System.out.println(between);
		//연도까지 차이날 경우에는 Chrono를 사용한다. 
		
		System.out.println();
		
		
		// 문자열을 LocalDate 객체로 파싱
//		localDate = LocalDate.parse("2021-06-25");
//		localDate = LocalDate.parse("2021.06.25", DateTimeFormatter.ofPattern("yyyy.MM.dd"));
		localDate = localDate.parse("20210625", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(localDate);
		System.out.println();
		
		//LocalDateTime 객체를 문자열로 포맷팅(원하는 날짜 형태로 출력하고 싶을 떄 - DateTimeFormatter클래스 사용)
		System.out.println(now.toString());
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초"))); //내가 패턴 만들기
		System.out.println(now.format(DateTimeFormatter.ISO_ORDINAL_DATE)); // 2021년의 몇 번째 일인지 2021-XXX 
		System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE)); //몇 번째 주인지
		System.out.println(ZonedDateTime.now());  //+09:00[Asia/Seoul]
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME)); // +0900 KST 9시간
		
		
	}
	
}
