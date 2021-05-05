/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1_Abstract;

import static java.time.Clock.system;

/**
 *
 * @author  Venkateswararao Gadde
 */
public abstract class Actor {
    
     public void paymentForWork (int hours) {
        System.out.println("The Actor will make $"+hours*25550.00);
    }
    public abstract void Movie();
    public abstract void Director();
}
