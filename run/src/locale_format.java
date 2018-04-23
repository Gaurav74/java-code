
import java.text.NumberFormat;
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
public class locale_format {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale[] local=NumberFormat.getAvailableLocales();
        for(Locale q:local){
            System.out.println("getCOuntry : "+q.getCountry());
            System.out.println("Dsplay Country : "+q.getDisplayCountry());
            System.out.println("getLanguage : "+q.getLanguage());
           System.out.println("Display Lnguage : "+q.getDisplayLanguage());
            System.out.println("Dispaly name : "+q.getDisplayName());
            System.out.println("ISO3 : "+q.getISO3Country());
             System.out.println("--------");
        }
    }
    
}
