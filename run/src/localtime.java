
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class localtime {
    public static void main(String[] args) {
        LocalTime time;
        time=LocalTime.now();
        System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
        time=LocalTime.ofSecondOfDay(1254);
        System.out.println(time);
        
        
        
        
    }
    
}
