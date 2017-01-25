/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.Period;

/**
 *
 * @author Will
 */
public class Employee {
    private String fName;
    private String lName;
    private int sinNumber;
    private LocalDate dateOfBirth;
    
    public Employee(String first, String last, int sin, LocalDate dob) {
    fName = first;
    lName = last;
    sinNumber = sin;
    setBirthday(dob);
    
}
    public String toString() {
        return fName + lName;
        
    }
    /**
     * This method will validate that the employee is 15 - 90 years old and set the dateOfBirth instance variable
     * @param dob 
     */
    public void setBirthday(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        int age = Period.between(dob, today).getYears();
        
        if (age >= 15 && age <= 90)
            dateOfBirth = dob;
        else
            throw new IllegalArgumentException("Employees must be 15-90 years old");
    
    
        //if (birthday.compareTo(now()) > 15 || birthday.compareTo(now()) > 90)
         //dateOfBirth = birthday;  
        //else {
       //     
        //}
        
        }
    
    //GETTERS
    public String getFName() throws IllegalStateException {
    return this.fName; //will throw exception if not set
}
    public String getLName() throws IllegalStateException {
    return this.lName; //will throw exception if not set
}
    public int getSinNumber() throws IllegalStateException {
    return this.sinNumber; //will throw exception if not set
}
    public LocalDate getdateOfBirth() throws IllegalStateException {
    return this.dateOfBirth;
      
    }
}
