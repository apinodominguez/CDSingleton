/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton obx1 = Singleton.instanciar("Angel", 1234);

       Singleton obx2 = Singleton.instanciar();
      
       obx2.setNombre("Efren");
       obx2.setdni(123);
       
        System.out.println(obx1.toString());
        System.out.println(obx2.toString());
    }
    }
    

