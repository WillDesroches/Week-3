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
        HourlyEmployee employee = new HourlyEmployee("Dank", "MemeLord", 420420420,
                LocalDate.of(1996, Month.JUNE, 17), 30);
        System.out.printf("Employee 1 is %s%n", employee);
        
        employee.addHoursWorked(30);
        System.out.printf("the paycheque for employee 1 is %s%n", employee.getPayCheque());
    }
    
}
