package datas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

/*
 * Exemplo de como manipular LocalDate LocalTime
 */

public class ExampleFiveDate{
    public static void main(String[] args){

        LocalDate today = LocalDate.now();

        LocalDate yesterday = today.minusDays(1);

        LocalTime agora = LocalTime.now();

        LocalDateTime this_day = LocalDateTime.now();


        System.out.println(today);
        //2021-08-09

        System.out.println(yesterday);
        //2021-08-08

        System.out.println(agora);
        //14:29:58.421

        System.out.println("\n" +this_day);
    }
}
