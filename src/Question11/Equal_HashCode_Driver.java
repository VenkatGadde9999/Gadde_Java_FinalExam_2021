/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author 16055
 */
public class Equal_HashCode_Driver {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new Equal_Hashcode("simmi", 17, 50)
                .equals(new Equal_Hashcode("simmi",17,50)));
        
        System.out.println(new Equal_Hashcode("Abhishek", 21, 90)
                 .equals(new Equal_Hashcode("El Barto", 10, 45)));
        
        System.out.println(new Equal_Hashcode("anni", 60,45)
                 .equals(new Object()));
    }
    
}

    

