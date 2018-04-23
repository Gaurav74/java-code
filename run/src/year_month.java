
import java.time.Month;
import java.time.YearMonth;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class year_month {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Month.AUGUST.length(Boolean.FALSE));
        System.out.println(YearMonth.of(1997,Month.JULY).lengthOfMonth());
        YearMonth _yearMonth=YearMonth.of(1997, Month.JULY);
        boolean bool=_yearMonth.isLeapYear();
        System.out.println(bool);
        
    }
    
}
