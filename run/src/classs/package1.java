/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

/**
 *
 * @author HP
 */
public class package1 {
    public static void main(String args[]){
    Package p=Package.getPackage("java.lang");
    System.out.println("Class name= "+p.getClass());
    System.out.println("Package name= "+p.getName());
    System.out.println("Vendor specification= "+p.getSpecificationVendor());
    System.out.println("Specification version= "+p.getSpecificationVersion());
    System.out.println("Implementation title= "+p.getImplementationTitle());
    System.out.println("Implementation vendor= "+p.getImplementationVendor());
    System.out.println("Version specification= "+p.getSpecificationVersion());
    }
}
