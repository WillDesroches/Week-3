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
public class CommissionEmployee extends Employee {
    
    private double monthlySales, commissionRate;

    public CommissionEmployee(String first, String last, int sin, LocalDate dob, double comRate) {
        super(first, last, sin, dob);
        
        monthlySales = 0;
        
        setComRate(comRate);
    }

    

    private void setComRate(double comRate) {
    if (comRate > 0 && comRate < 60)
        commissionRate = comRate;
    else
        throw new IllegalArgumentException("Commission must be greater than 0 " + "& less than or equal to 60");
    }
    
    public void addSales(double newSalesAmount){
        if (newSalesAmount > 0)
            this.monthlySales += newSalesAmount;
        else
            throw new IllegalArgumentException("Sales must be greater than 0");
        
    }
    
    @Override //abstract
    public PayCheque getPayCheque() {
        double payAmount = commissionRate/100 * monthlySales;
        PayCheque newPayCheque = new PayCheque(super.toString(), payAmount, "Guap");
        
        monthlySales = 0;
        
        return newPayCheque;
    }
}
