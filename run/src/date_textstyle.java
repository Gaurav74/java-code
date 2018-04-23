
import java.time.DayOfWeek;
import java.time.format.TextStyle;
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
public class date_textstyle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // PrintWriter p=new PrintWriter(System.out);
       
        DayOfWeek dw=DayOfWeek.MONDAY;
        DayOfWeek dt=dw.plus(4);
        Locale local=Locale.getDefault();
        System.out.println(dt.getDisplayName(TextStyle.FULL, local));
        System.out.println(dw);
    }
    
}
