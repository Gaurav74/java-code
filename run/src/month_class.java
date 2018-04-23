
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class month_class {
    public static void main(String[] args) {
        Month mon=Month.JULY;
        Month monjan=Month.of(1);
        System.out.println(monjan.toString());
        System.out.println("month = "+mon);
        Locale local=Locale.getDefault();
        System.out.println(mon.getDisplayName(TextStyle.FULL, local));
        System.out.println(mon.maxLength());
        System.out.println(Arrays.toString(Month.values()));
        
    }
    
}
