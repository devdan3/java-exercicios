import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


        //Assim que executar, vai mostrar na tela a data e hora atual.
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        //Vai mostrar a Data e a hora no formato que está entre ().
        LocalDate d04 = LocalDate.parse("2026-05-29");
        LocalDateTime d05 = LocalDateTime.parse("2026-05-29T02:32:20");
        Instant d06 = Instant.parse("2026-05-29T02:32:20Z");
        Instant d07 = Instant.parse("2026-05-29T02:32:20-03:00");

        //Ultilizando uma sobrecarga podemos ultilizar formatos personalizados de data-hora.
        LocalDate d08 = LocalDate.parse("31/05/2026", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("31/02/2026 16:28", fmt2);

        //Outro metódo de escrever data-hora sem precisar ter conhecimento prévio do formato ISO8601.
        LocalDate d10 = LocalDate.of(2026, 5, 31);
        LocalDateTime d11 = LocalDateTime.of(2026, 5, 31, 16, 33);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

        //Transformando em texto personalizado.
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));

        System.out.println("d06 = " + fmt3.format(d06));

        //Transformando data global em data local do usuário ou algum local específico.
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        //Obtendo dados de uma data-hora Local: dia/mês/ano e hora/minuto/segundo
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());
        System.out.println("d05 Hora = " + d05.getHour());
        System.out.println("d05 Minuto = " + d05.getMinute());
        System.out.println("d05 Segundo = " + d05.getSecond());

        //Cálculos com Data-Hora
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime );

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        System.out.println("pastWeekInstant = " + pastWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("t1 dia = " + t1.toDays());
        System.out.println("t2 dia = " + t2.toDays());
        System.out.println("t3 dia = " + t3.toDays());
    }
}