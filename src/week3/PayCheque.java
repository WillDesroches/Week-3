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
public class PayCheque {
    private LocalDate dateIssued;
    private String employeeName;
    private double amount;
    private String memo;
    private int chequeNumber;
    private static int nextChequeNumber;

    public PayCheque(String employeeName, double amount, String memo) {
        this.dateIssued = LocalDate.now();
        this.employeeName = employeeName;
        this.amount = amount;
        this.memo = memo;
        chequeNumber = nextChequeNumber;
        
        nextChequeNumber++;
    }
    
   
    
}
