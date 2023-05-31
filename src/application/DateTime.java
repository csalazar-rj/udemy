package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// este projeto foi adicionado ao github
		
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter dFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dFmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter dFmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate d01 = LocalDate.now();
		
		LocalDate d02 = LocalDate.parse("2023-05-28");
		LocalDate d03 = LocalDate.parse("28/05/2023", dFmt);
		LocalDateTime d04 = LocalDateTime.parse("28/05/2023 10:53", dFmt2);
		LocalDate d05 = LocalDate.of(2023, 05, 29);
		LocalDateTime d06 = LocalDateTime.parse("2023-05-29T01:20:10");
		
		Instant d07 = Instant.parse("2023-05-28T01:30:26Z");
		
		System.out.println(d01);
		
		// os 3 exemplos abaixo são válidos
		System.out.println("d02: " + d02.format(dFmt));
		System.out.println("d02: " + dFmt.format(d02));
		System.out.println("d02: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("");
		
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		
		System.out.println("d07: " + dFmt3.format(d07));
		
		// Converter Global DateTime para Local DateTime
		System.out.println("");
		System.out.println("Converter Global DateTime para Local DateTime");
		System.out.println("");
		
		Instant d10 = Instant.parse("2023-05-28T01:30:26Z");
		
		LocalDate cvt1 = LocalDate.ofInstant(d10, ZoneId.systemDefault());
		System.out.println("cvt1: " + cvt1);
		
		System.out.println("");
		System.out.println("Obtendo dados de uma data-hora-local");
		System.out.println("");
		System.out.println("Dia do Mês: " + d02.getDayOfMonth());
		
	}

}
