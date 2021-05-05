/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9_Example2;
import java.io.*;
/**
 *
 * @author 16055
 */
public class Testthrows2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
          M m=new M();
          m.method();

    }catch(Exception e){System.out.println("exception handled");}   

    System.out.println("normal flow...");
    }
    
}

class M{
 void method()throws IOException{
  throw new IOException("device error");
 }
}
