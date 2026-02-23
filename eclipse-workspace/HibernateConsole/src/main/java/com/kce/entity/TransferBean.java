package com.kce.entity;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "TRANSFER_TBL")
public class TransferBean {
    
    @Id
    @Column(name = "Transaction_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_seq")
    @SequenceGenerator(name = "transaction_seq", sequenceName = "transaction_seq", allocationSize = 1)
    private int transactionID;
    
    @Column(name = "From_Account_Number")
    private String fromAccountNumber;
    
    @Column(name = "To_Account_Number")
    private String toAccountNumber;
    
    @Column(name = "Date_Of_Transaction")
    private Date dateOfTransaction;
    
    @Column(name = "Amount")
    private float amount;

    // Constructors
    public TransferBean() {}  // Required for Hibernate
    
    public TransferBean(int transactionID, String fromAccountNumber, String toAccountNumber, 
                       Date dateOfTransaction, float amount) {
        this.transactionID = transactionID;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.dateOfTransaction = dateOfTransaction;
        this.amount = amount;
    }

    // All getters/setters (your exact originals)
    public int getTransactionID() { return transactionID; }
    public void setTransactionID(int transactionID) { this.transactionID = transactionID; }
    
    public String getFromAccountNumber() { return fromAccountNumber; }
    public void setFromAccountNumber(String fromAccountNumber) { this.fromAccountNumber = fromAccountNumber; }
    
    public String getToAccountNumber() { return toAccountNumber; }
    public void setToAccountNumber(String toAccountNumber) { this.toAccountNumber = toAccountNumber; }
    
    public Date getDateOfTransaction() { return dateOfTransaction; }
    public void setDateOfTransaction(Date dateOfTransaction) { this.dateOfTransaction = dateOfTransaction; }
    
    public float getAmount() { return amount; }
    public void setAmount(float amount) { this.amount = amount; }
}
