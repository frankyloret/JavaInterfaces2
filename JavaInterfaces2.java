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
public class JavaInterfaces2 {
    static Shoe hightop;
    static Book using_java;
    
    public static void init(){
        hightop = new Shoe();
        using_java = new Book();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        init();
        orderInfo(hightop);
        orderInfo(using_java);
    }
    public static void orderInfo(Product item){
        item.showName();
        System.out.println("To order from " + item.MAKER + " call" + item.PHONE + ".");
        System.out.println("Each item costs $" + item.getPrice(1));
    }
}
