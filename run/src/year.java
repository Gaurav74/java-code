
import java.time.Year;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class year {
    public static void main(String[] args) {
        Year year=Year.of(1997);
        System.out.println(year.isLeap());
        System.out.println(year.minusYears(5));
        System.out.println(year.plusYears(15));
    }
    
}
