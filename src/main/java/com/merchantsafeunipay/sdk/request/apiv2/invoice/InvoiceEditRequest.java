package com.merchantsafeunipay.sdk.request.apiv2.invoice;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.InvoiceEditResponse;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class InvoiceEditRequest extends ApiRequest<InvoiceEditResponse> {
    private String dealerCode;

    private String invoiceId;

    private String name;

    private String dueDate;

    private BigDecimal amount;

    private Currency currency;

    private Map<String, String> extra = new LinkedHashMap<>();

    private String merchantOrderId;

    private InvoiceEditRequest() {
    }

    public static InvoiceEditRequestBuilder builder() {
        return new InvoiceEditRequestBuilder();
    }

    @Override
    public Class<InvoiceEditResponse> responseClass() {
        return InvoiceEditResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.INVOICEID, this.invoiceId);
        addToPayload(Param.NAME, this.name);
        addToPayload(Param.DUEDATE, this.dueDate);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.EXTRA, this.extra);
        addToPayload(Param.MERCHANTORDERID, this.merchantOrderId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.INVOICEEDIT;
    }

    public static final class InvoiceEditRequestBuilder {
        private String dealerCode;

        private String invoiceId;

        private String name;

        private String dueDate;

        private BigDecimal amount;

        private Currency currency;

        private Authentication authentication;

        private Map<String, String> extra = new LinkedHashMap<>();

        private String merchantOrderId;

        public InvoiceEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public InvoiceEditRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public InvoiceEditRequestBuilder withInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public InvoiceEditRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public InvoiceEditRequestBuilder withDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public InvoiceEditRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public InvoiceEditRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public InvoiceEditRequestBuilder withExtra(Map<String, String> extra){
            this.extra = extra;
            return this;
        }

        public InvoiceEditRequestBuilder withMerchantOrderId(String merchantOrderId){
            this.merchantOrderId = merchantOrderId;
            return this;
        }

        public InvoiceEditRequest build() {
            InvoiceEditRequest request = new InvoiceEditRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.invoiceId = this.invoiceId;
            request.name = this.name;
            request.dueDate = this.dueDate;
            request.amount = this.amount;
            request.currency = this.currency;
            request.extra = this.extra;
            request.merchantOrderId = this.merchantOrderId;
            return request;
        }
    }
}
