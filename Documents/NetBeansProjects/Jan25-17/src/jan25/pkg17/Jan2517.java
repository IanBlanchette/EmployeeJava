/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan25.pkg17;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Ian
 */
public class Jan2517 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee employee1 = new Employee ("Fred","Flintstone", 1234, LocalDate.of(1998,Month.MARCH, 14));
        
        System.out.printf("Employee1 is %s%n", employee1);
        System.out.printf("The employee was born on %s, that was a %s%n", employee1.getDateOfBirth(), employee1.getDateOfBirth().getDayOfWeek());
        
        Employee employee2 = new Employee ("Ian", "Blanchette", 4321, LocalDate.of(1990,Month.NOVEMBER, 15));
        
         System.out.printf("Employee2 is %s%n", employee2);
        System.out.printf("The employee was born on %s, that was a %s%n", employee1.getDateOfBirth(), employee1.getDateOfBirth().getDayOfWeek());
    }
    
}
