package datas;

import java.util.Calendar;

public class ExampleTwoDate{
    public static void main(String[] args){

        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: " +agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " +agora.getTime());
    }
}
