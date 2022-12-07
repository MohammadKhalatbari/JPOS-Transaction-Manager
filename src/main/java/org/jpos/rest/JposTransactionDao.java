package org.jpos.rest;

import  org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jpos.ee.DB;

import java.util.Date;
import java.util.UUID;

public class JposTransactionDao {


    public Integer addRequestTransaction(
            UUID buyerAccount,
            String codedId,
            UUID accountId,
            UUID transactionId,
            Date date) {
        DB db = new DB("hibernate2.cfg.xml");
        Session session = db.open();
        Transaction tx = null;
        Integer trId = null;

        try {
            tx = session.beginTransaction();
            String strQuery = "INSERT INTO jpos.request_transaction(buyer_account, coded_id, account_id, transaction_id, transaction_date) VALUES ( " +
                    ":buyerAccount,:codedId,:accountId,:transactionid,:transactiondate)";
            session.createNativeQuery(strQuery)
                    .setParameter("buyerAccount", buyerAccount)
                    .setParameter("codedId", codedId)
                    .setParameter("accountId", accountId)
                    .setParameter("transactionid", transactionId)
                    .setParameter("transactiondate", date)
                    .executeUpdate();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            db.close();
        }
        return trId;
    }

    public Integer addResponseTransaction(
            UUID buyerAccount,
            String codedId,
            UUID accountId,
            UUID transactionId,
            Date date,
            String inquiryResponse) {
        DB db = new DB("hibernate2.cfg.xml");
        Session session = db.open();
        Transaction tx = null;
        Integer trId = null;

        try {
            tx = session.beginTransaction();
            String strQuery = "INSERT INTO jpos.response_transaction(buyer_account, coded_id, account_id, transaction_id, transaction_date, inquiry_response) VALUES ( " +
                    ":buyerAccount,:codedId,:accountId,:transactionid,:transactiondate,:inquiryResponse)";
            session.createNativeQuery(strQuery)
                    .setParameter("buyerAccount", buyerAccount)
                    .setParameter("codedId", codedId)
                    .setParameter("accountId", accountId)
                    .setParameter("transactionid", transactionId)
                    .setParameter("transactiondate", date)
                    .setParameter("inquiryResponse",inquiryResponse)
                    .executeUpdate();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            db.close();
        }
        return trId;
    }


//    public void updateTransaction(Integer id, Integer amount) {
//        DB db = new DB("hibernate2.cfg.xml");
//        Session session = db.getSessionFactory().openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//            String strQuery = "update jpos.jpos_transaction set amount=" + amount.toString() + " where id=" + id.toString();
//            session.createNativeQuery(strQuery).executeUpdate();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//    }
//
//    public String selectTransaction(UUID transactionId){
//
//        DB db = new DB("hibernate2.cfg.xml");
//        Session session = db.open();
//        Transaction tx = null;
//        String requestID = null;
//        try {
//            tx = session.beginTransaction();
//            String strQuery = "SELECT cast(p.vendorId  java.lang.String) FROM JposTransaction p where p.transactionId=:transactionid";
//            List<String> uuidList= session.createQuery(strQuery).setParameter("transactionid",transactionId) .list();
//            if (uuidList != null){
//                requestID = uuidList.get(0).toString();
//            }else requestID="";
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }return requestID;
//    }
}
