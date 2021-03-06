package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.response.misc.MoneySerializer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class Payment {
    private String paymentDate;
    @JsonSerialize(using = MoneySerializer.class)
    private BigDecimal paymentAmount;
    @JsonSerialize(using = MoneySerializer.class)
    private BigDecimal paidAmount;
    private String panIIN;
    private String panLast4;
    private String dealerCode;
    private String dealerName;
    private String customerName;
    private String customerNameMasked;
    private String merchantPaymentId;
    private String merchantName;
    private Currency currency;
    private List<String> invoiceIds = new ArrayList<>();

    public String getPaymentDate() {
        return paymentDate;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public String getPanIIN() {
        return panIIN;
    }

    public String getPanLast4() {
        return panLast4;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public String getDealerName() {
        return dealerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerNameMasked() {
        return customerNameMasked;
    }

    public String getMerchantPaymentId() {
        return merchantPaymentId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public List<String> getInvoiceIds() {
        return invoiceIds;
    }

    public void setInvoiceIds(List<String> invoiceIds) {
        this.invoiceIds = invoiceIds;
    }
}
