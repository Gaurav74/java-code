/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

/**
 *
 * @author HP
 */
public class time1 {
    public static void main(String[] args ){
        Month mon=Month.of(9);
        Locale local=Locale.getDefault();
        System.out.println(mon.getDisplayName(TextStyle.SHORT,local)); 
        System.out.println(mon.getDisplayName(TextStyle.FULL,local)); 
        System.out.println(mon.getDisplayName(TextStyle.NARROW,local));
        System.out.printf("%d\n",Month.JANUARY.maxLength());
        LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
System.out.println(date);
System.out.println(nextWed);
System.out.println(date.getDayOfWeek());
                }
    
}
