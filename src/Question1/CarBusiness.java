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
public class CarBusiness extends CarType implements Cars {

    /**
     *
     * @param type
     */
    public CarBusiness(String type) {
        super(type);
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        if (type.equalsIgnoreCase("Tayota")) {
            return 500000;
        } else if (type.equalsIgnoreCase("Ford")) {
            return 100000;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCost: " + getCost() + "\n" + "American Made: " + getAmericanMade() + "\n"
                + "Japanees Made: " + getJapaneesMade() + "\n";
    }

}
