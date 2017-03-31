/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterfaces2;

/**
 *
 * @author VIVES
 */
public class Shoe implements Product {
    public int getPrice(int id){
        if (id==1)
            return (5);
        else
            return (10);
    }
    public void showName(){
        System.out.println("I'm a shoe!");
    }
}
