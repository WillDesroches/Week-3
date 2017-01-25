/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Will
 */
public class Week3 {

    
    public static void main(String[] args) {
        Employee employee = new Employee("Dank", "Memelord", 420420420,
                LocalDate.of(1996, Month.JUNE, 17));
        System.out.printf("Employee 1 is %s%n", employee);
    }
    
}
