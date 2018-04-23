/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream_api;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HP
 */
public class sort {
    public static void main(String[] args) {
        try {
            List list=Arrays.asList(1,2,5,6,7,8,4);
            list.stream().map(s->(int)s+1).sorted().forEach(System.out::println);
             } catch (Exception e) {
        }
    }
}
