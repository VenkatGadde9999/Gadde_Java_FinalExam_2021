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
public class Equal_Hashcode {
    private String name;
        private int age;
        private int weight;
        
        /**
         * 
         * @param name will take the name
         * @param age will take the age
         * @param weight will take the weight
         */

        public Equal_Hashcode(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        /**
         * 
         * @param will check if the values are equal
         * @return will return if they are true or false after comparing the true or false
         */

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Equal_Hashcode Rohit = (Equal_Hashcode) o;
            return age == Rohit.age &&
                    weight == Rohit.weight &&
                    name.equals(Rohit.name);
        }
    }
