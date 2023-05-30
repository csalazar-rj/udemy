package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Datas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// realizando cálculos com datas
		// Este projeto foi adicionado a stage do .git
		
		LocalDate d01 = LocalDate.parse("2023-05-28");
		LocalDateTime d02 = LocalDateTime.parse("2023-05-28T10:53:15");		
		Instant d03 = Instant.parse("2023-05-29T01:20:10Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		
		System.out.println("Local Date");
		System.out.println("d01: " + d01);
		System.out.println("d01 pastWeek: " + pastWeekLocalDate);
		
		System.out.println("");
		System.out.println("Local Date Time");
		LocalDateTime pastWeekLocalDateTine = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		System.out.println("pastWeekLocalDateTine: " + pastWeekLocalDateTine);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		
		System.out.println("");
		System.out.println("Instant");
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		System.out.println("");
		System.out.println("Duração de Tempo");
		System.out.println("");
		
		Duration d1 = Duration.between(pastWeekLocalDateTine, d02);
		System.out.println("d1 em dias: " + d1.toDays());
		
	}

}
