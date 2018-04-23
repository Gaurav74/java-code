
import java.time.Month;
import java.time.MonthDay;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class month_day {
    public static void main(String[] args) {
        MonthDay mday=MonthDay.of(Month.JULY,1);
        System.out.println(mday);
        System.out.println(mday.isValidYear(1997));
    }
    
}
