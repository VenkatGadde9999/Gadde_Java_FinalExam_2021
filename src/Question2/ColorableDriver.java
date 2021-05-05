/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author 16055
 */
public class ColorableDriver {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        GeometricObject[] geometricObjects = new Square[5];
        Square Square1 = new Square(5.0);
        Square Square2 = new Square(6.0);
        Square Square3 = new Square(3.0);
        Square Square4 = new Square(7.0);
        Square Square5 = new Square(9.0);
        
        geometricObjects[0] = Square1;
        geometricObjects[1] = Square2;
        geometricObjects[2] = Square3;
        geometricObjects[3] = Square4;
        geometricObjects[4] = Square5;

        for (GeometricObject go : geometricObjects) {
            if (go instanceof Colorable) {
                Colorable c = (Colorable) go;
                c.howToColor();
            }
            Square s = (Square) go;
            System.out.printf("Area %.2fcm\u00B2\n", s.getArea());
        }
    }
    
}
