/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.exampletwo;

import th.geniustree.intership.exampleone.Car;
import th.geniustree.intership.exampleone.XCar;

/**
 *
 * @author M6500
 */
public class Client {

    public static void main(String[] args) {
        Car xcar = new XCar();
     
        if (xcar.startEngine() != true) {
            xcar.go();
        }else{
            System.out.println("not go");
        }
    }
}
