package org.jpos.entity;

import java.util.Date;
import java.util.UUID;

public class RequestTransaction {


    private Integer id;
    private UUID transactionId;
    private Date date;
    private String codedId;
    private UUID buyerAccount;
    private UUID accountId;
    private String userName;
    private String password;

    public RequestTransaction() {
    }

    public RequestTransaction(UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId, String userName, String password) {
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
        this.userName = userName;
        this.password = password;
    }

    public RequestTransaction(Integer id, UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId, String userName, String password) {
        this.id = id;
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
        this.userName = userName;
        this.password = password;
    }

    public RequestTransaction(Integer id, UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId) {
        this.id = id;
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
    }

    public RequestTransaction(UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId) {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

