
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class localdate_tempora_adjusterl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate wed=LocalDate.of(1997,Month.JULY,1);
        System.out.println(wed +" "+ wed.getDayOfWeek().toString());
        TemporalAdjuster adj=TemporalAdjusters.next(DayOfWeek.THURSDAY);
        System.out.println(wed.with(adj));
        System.out.println(wed.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
        System.out.println(LocalDate.now());
       
    }
    
}
