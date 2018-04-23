
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class currency_format {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        /*
        //we can take locale by this also
        Locale local=new Locale("lang","countrycode");
        //other way
        NumberFormat f=NumberFormat.getCurrencyInstance(new Locale("lang","country code"));
        */
        NumberFormat currencyformatus=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat currencyformatin=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat currencyformatch=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat currencyformatfs=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        //now currency format
        String us=currencyformatus.format(payment);
        System.out.println("US: " + us);
        String india=currencyformatin.format(payment);
        System.out.println("India: " + india);
        String china=currencyformatch.format(payment);
        System.out.println("China: " + china);
        String france=currencyformatfs.format(payment);
        System.out.println("France: " + france);
          NumberFormat f=NumberFormat.getCurrencyInstance(new Locale("en","in"));
          System.out.println(f.format(new BigInteger("100000000000")));
          Format format=NumberFormat.getCurrencyInstance(new Locale("en","in"));
          System.out.println(format.format(new BigDecimal(100002002)));
      System.out.println(new DecimalFormat("##,##,###").format(10000000)); //not working
    }
    
}
