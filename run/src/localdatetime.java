
import java.time.LocalDateTime;
import java.time.ZoneId;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class localdatetime {
    public static void main(String[] args) {
        LocalDateTime time=LocalDateTime.now();
        System.out.println(time);
        LocalDateTime dtime=LocalDateTime.now(ZoneId.of("GMT"));
        System.out.println(dtime);
    }
    
}
