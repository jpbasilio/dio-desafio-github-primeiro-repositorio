package datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleForDate{
    public static void main(String[] args){

        Date now = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mmm");

        String dataFormatada = formatter.format(now);

        System.out.println(dataFormatada);
    }
}
