package com.kce.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kce.entity.TransferBean;
import com.kce.util.HibernateUtil;

public class BankDAO {

    // Save Transfer
	public String transferMoney(TransferBean bean) {
	    Transaction transaction = null;
	    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        transaction = session.beginTransaction();
	        
	        transaction.commit();
	        return "SUCCESS";
	    } catch (Exception e) {
	        if (transaction != null && transaction.isActive()) {
	            transaction.rollback(); 
	        }
	        e.printStackTrace();
	        return "FAILED";
	    }
	}

	public boolean validateAccount(String account_Number) {
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    try {
	        String hql = "select count(a) from Account a where a.accountNumber = :acc";  // FIXED HERE
	        Long count = session.createQuery(hql, Long.class)
	                            .setParameter("acc", account_Number)
	                            .uniqueResult();
	        return count != null && count > 0;
	    } finally {
	        session.close();
	    }
	}


    public float findBalance(String accountNumber) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            Float balance = session.createQuery(
            		"select a.balance from Account a where a.accountNumber = :acc",
                    Float.class
            )
            .setParameter("acc", accountNumber)
            .uniqueResult();

            return balance != null ? balance : -1;
        }
    }

    public boolean updateBalance(String accountNumber, float newBalance) {

        Transaction tx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            tx = session.beginTransaction();

            int updated = session.createQuery(
            		"update Account a set a.balance = :bal where a.accountNumber = :acc"
            )
            .setParameter("bal", newBalance)
            .setParameter("acc", accountNumber)
            .executeUpdate();

            tx.commit();
            return updated > 0;

        } catch (Exception e) {

            if (tx != null) tx.rollback();
            e.printStackTrace();
        }

        return false;
    }
}