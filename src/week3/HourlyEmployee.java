/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.time.LocalDate;

/**
 *
 * @author Will
 */
public class HourlyEmployee extends Employee {

    private double hourlyRate, hoursWorked;
    private double MINIMUMWAGE = 11.40;
    
    public HourlyEmployee(String first, String last, int sin, LocalDate dob, int hourlyRate) {
        super(first, last, sin, dob);
        
        hoursWorked = 0;
        setPayRate(hourlyRate);
    }
    
    /**
     * this method will validate that the payrate is above minimum wage and set the instance variable
     * @return 
     */
    public void setPayRate(double payRate){
     if (payRate >= MINIMUMWAGE)   
         this.hourlyRate = payRate;
     else
         throw new IllegalArgumentException("Your workers aren't illegal immigrants, you need to pay them at least " + MINIMUMWAGE);
    }
    
    public void addHoursWorked(double hoursWorked){
        
        if (hoursWorked > 0)
            this.hoursWorked += hoursWorked;
        else
            throw new IllegalArgumentException("New hours worked must be greater than 0");
    }
    

    @Override
    public PayCheque getPayCheque() {
        double payAmount = hoursWorked * hourlyRate;
        PayCheque newPayCheque = new PayCheque(super.toString(), payAmount, "Guap");
        
        hoursWorked = 0;
        
        return newPayCheque;
    }
    
}
    

