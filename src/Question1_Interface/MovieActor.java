/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1_Interface;

/**
 *
 * @author 16055
 */
public class MovieActor implements Actor {
        @Override
    public void paymentForWork(int hours) {
        System.out.println("Actor will make $" + hours*300.00);
    }
        @Override
    public void Movie() {
        System.out.println("New Movie");
    }
    @Override
    public void Director() {
        System.out.println("New Director");
    }
}
