package datas;

import java.util.Calendar;

public class ExampleThree {
    public static void main(String[] args){

        Calendar now = Calendar.getInstance();

        System.out.printf("%tc\n", now);
        //Sat Aug 07 22:58:33 BRT 2021

        System.out.printf("%tF\n", now);
        //2021-08-07

        System.out.printf("%tD\n", now);
        //08/07/21

        System.out.printf("%tr\n", now);
        //22:58:33 PM

        System.out.printf("%tT\n", now);
        //22:58:33
    }
}
