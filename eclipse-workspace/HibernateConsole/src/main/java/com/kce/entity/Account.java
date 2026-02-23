package com.kce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ACCOUNT_TBL")
public class Account {
    @Id
    @Column(name = "Account_Number")  // Matches your DB exactly
    private String accountNumber;
    
    @Column(name = "Customer_name")
    private String customerName;
    
    @Column(name = "Balance")
    private float balance;

    public Account() {}  // Required
    
    // Getters/Setters (keep your existing ones + add customerName)
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public float getBalance() { return balance; }
    public void setBalance(float balance) { this.balance = balance; }
}
