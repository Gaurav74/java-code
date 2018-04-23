
import java.time.LocalDate;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class date_day {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               GregorianCalendar day=new GregorianCalendar(1997,3,15);
              
        System.out.println(day.getTime());
        LocalDate today=LocalDate.now();
        System.out.println(today);
       LocalDate todaydate=LocalDate.of(1997,7,1);
        System.out.println(today.getDayOfWeek());
    }
    
}
