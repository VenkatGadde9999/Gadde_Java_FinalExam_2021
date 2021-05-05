/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author 16055
 */
public abstract class CarType implements Cars {

    /**
     *
     */
    public String Tayota;

    /**
     *
     */
    public String Ford;
    String type;

    /**
     *
     * @param type
     */
    public CarType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getJapaneesMade() {
        if (!type.equalsIgnoreCase("Tayota")) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getAmericanMade() {
        if (!type.equalsIgnoreCase("Ford")) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    public abstract double getCost();

    /**
     *
     * @return
     */
    public String CarDescription() {
        return "American and JapaneesMade Cars";

    }

    @Override
    public String toString() {
        return "type: " + type;
    }

}
