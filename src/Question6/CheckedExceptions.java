/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author 16055
 */
public class CheckedExceptions {

    /**
     *
     */
    public void fileNotFoundException() {
        File file = new File("nofile.txt");
        try {

            FileInputStream sc1 = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            //Any file not found exceptions by the Scanner sc1 will be caught here
            System.out.println("File Not Found in the Directory");
           
        }
    }



}
