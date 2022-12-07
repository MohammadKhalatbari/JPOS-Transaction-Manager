package org.jpos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

public class JposTransaction {


    private Integer id;
//    private UUID userId;
//    private Integer amount;
//    private UUID vendorId;
    private UUID transactionId;
    private Date date;
    private String codedId;
    private UUID buyerAccount;
    private UUID accountId;

    public JposTransaction() {
    }

//    public JposTransaction(UUID userId, Integer amount, UUID vendorId, UUID transactionId, Date date) {
//        this.userId = userId;
//        this.amount = amount;
//        this.vendorId = vendorId;
//        this.transactionId = transactionId;
//        this.date = date;
//    }
//
//    public JposTransaction(Integer id, UUID userId, Integer amount, UUID vendorId, UUID transactionId, Date date) {
//        this.id = id;
//        this.userId = userId;
//        this.amount = amount;
//        this.vendorId = vendorId;
//        this.transactionId = transactionId;
//        this.date = date;
//    }


    public JposTransaction(Integer id, UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId) {
        this.id = id;
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
    }

    public JposTransaction(UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId) {
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public UUID getUserId() {
//        return userId;
//    }

//    public void setUserId(UUID userId) {
//        this.userId = userId;
//    }
//
//    public Integer getAmount() {
//        return amount;
//    }
//
//    public void setAmount(Integer amount) {
//        this.amount = amount;
//    }
//
//    public UUID getVendorId() {
//        return vendorId;
//    }
//
//    public void setVendorId(UUID vendorId) {
//        this.vendorId = vendorId;
//    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCodedId() {
        return codedId;
    }

    public void setCodedId(String codedId) {
        this.codedId = codedId;
    }

    public UUID getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(UUID buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }
}

