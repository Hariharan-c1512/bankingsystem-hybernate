package com.kce.main;

import com.kce.entity.TransferBean;
import com.kce.service.BankService;
import com.kce.util.InsufficientFundException;

public class BankMain {
	public static void main(String[] args) throws InsufficientFundException
 {
		// View Balance
		BankService bankService=new BankService();
		System.out.println(bankService.checkBalance("1234567890"));		 
		// TransferMoney
		TransferBean transferBean = new TransferBean();		 
		transferBean.setFromAccountNumber("1234567890");
		transferBean.setAmount(5125);
		transferBean.setToAccountNumber("1234567891");
		transferBean.setDateOfTransaction(new java.util.Date());		 
		System.out.println(bankService.transfer(transferBean));
		}

}