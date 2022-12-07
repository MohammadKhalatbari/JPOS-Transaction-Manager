package org.jpos.entity;

import java.util.Date;
import java.util.UUID;

public class ResponseTransaction {

    private Integer id;
    private UUID transactionId;
    private Date date;
    private String codedId;
    private UUID buyerAccount;
    private UUID accountId;
    private String inquiryResponse;
    private String buyResponseValue;
    private boolean buyResponseSuccess;
    private boolean chargeResponseSuccess;
    private String buyResponsetrackingCode;

    public ResponseTransaction() {
    }

    public ResponseTransaction(UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId, String inquiryResponse, String buyResponseValue, boolean buyResponseSuccess) {
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
        this.inquiryResponse = inquiryResponse;
        this.buyResponseValue = buyResponseValue;
        this.buyResponseSuccess = buyResponseSuccess;
    }

    public ResponseTransaction(Integer id, UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId, String inquiryResponse, String buyResponseValue, boolean buyResponseSuccess) {
        this.id = id;
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
        this.inquiryResponse = inquiryResponse;
        this.buyResponseValue = buyResponseValue;
        this.buyResponseSuccess = buyResponseSuccess;
    }

    public ResponseTransaction(UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId, String inquiryResponse, String buyResponseValue, boolean buyResponseSuccess, boolean chargeResponseSuccess) {
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
        this.inquiryResponse = inquiryResponse;
        this.buyResponseValue = buyResponseValue;
        this.buyResponseSuccess = buyResponseSuccess;
        this.chargeResponseSuccess = chargeResponseSuccess;
    }

    public ResponseTransaction(Integer id, UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId, String inquiryResponse, String buyResponseValue, boolean buyResponseSuccess, boolean chargeResponseSuccess) {
        this.id = id;
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
        this.inquiryResponse = inquiryResponse;
        this.buyResponseValue = buyResponseValue;
        this.buyResponseSuccess = buyResponseSuccess;
        this.chargeResponseSuccess = chargeResponseSuccess;
    }

    public ResponseTransaction(Integer id, UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId, String inquiryResponse, String buyResponseValue, boolean buyResponseSuccess, boolean chargeResponseSuccess, String buyResponsetrackingCode) {
        this.id = id;
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
        this.inquiryResponse = inquiryResponse;
        this.buyResponseValue = buyResponseValue;
        this.buyResponseSuccess = buyResponseSuccess;
        this.chargeResponseSuccess = chargeResponseSuccess;
        this.buyResponsetrackingCode = buyResponsetrackingCode;
    }

    public ResponseTransaction(UUID transactionId, Date date, String codedId, UUID buyerAccount, UUID accountId, String inquiryResponse, String buyResponseValue, boolean buyResponseSuccess, boolean chargeResponseSuccess, String buyResponsetrackingCode) {
        this.transactionId = transactionId;
        this.date = date;
        this.codedId = codedId;
        this.buyerAccount = buyerAccount;
        this.accountId = accountId;
        this.inquiryResponse = inquiryResponse;
        this.buyResponseValue = buyResponseValue;
        this.buyResponseSuccess = buyResponseSuccess;
        this.chargeResponseSuccess = chargeResponseSuccess;
        this.buyResponsetrackingCode = buyResponsetrackingCode;
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

    public String getInquiryResponse() {
        return inquiryResponse;
    }

    public void setInquiryResponse(String inquiryResponse) {
        this.inquiryResponse = inquiryResponse;
    }

    public String getBuyResponseValue() {
        return buyResponseValue;
    }

    public void setBuyResponseValue(String buyResponseValue) {
        this.buyResponseValue = buyResponseValue;
    }

    public boolean isBuyResponseSuccess() {
        return buyResponseSuccess;
    }

    public void setBuyResponseSuccess(boolean buyResponseSuccess) {
        this.buyResponseSuccess = buyResponseSuccess;
    }

    public boolean isChargeResponseSuccess() {
        return chargeResponseSuccess;
    }

    public void setChargeResponseSuccess(boolean chargeResponseSuccess) {
        this.chargeResponseSuccess = chargeResponseSuccess;
    }

    public String getBuyResponsetrackingCode() {
        return buyResponsetrackingCode;
    }

    public void setBuyResponsetrackingCode(String buyResponsetrackingCode) {
        this.buyResponsetrackingCode = buyResponsetrackingCode;
    }
}
