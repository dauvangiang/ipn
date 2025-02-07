package com.dvgiang.ipndemo;

public class IpnDTO {
    private String pg_amount;
    private String pg_currency;
    private String pg_merchant_id;
    private String pg_order_info;
    private String pg_order_reference;
    private String pg_payment_method;
    private String pg_card_number;
    private String pg_card_holder_name;
    private String pg_payment_channel;
    private String pg_transaction_number;
    private String pg_issuer_txn_reference;
    private String pg_issuer_code;
    private String error_code;
    private String pg_issuer_response_code;
    private String pg_paytime;
    private String session_id;
    private String mac_type;
    private String mac;

    public IpnDTO() {
    }

    public IpnDTO(String pg_amount, String pg_currency, String pg_merchant_id, String pg_order_info, String pg_order_reference, String pg_payment_method, String pg_card_number, String pg_card_holder_name, String pg_payment_channel, String pg_transaction_number, String pg_issuer_txn_reference, String pg_issuer_code, String error_code, String pg_issuer_response_code, String pg_paytime, String session_id, String mac_type, String mac) {
        this.pg_amount = pg_amount;
        this.pg_currency = pg_currency;
        this.pg_merchant_id = pg_merchant_id;
        this.pg_order_info = pg_order_info;
        this.pg_order_reference = pg_order_reference;
        this.pg_payment_method = pg_payment_method;
        this.pg_card_number = pg_card_number;
        this.pg_card_holder_name = pg_card_holder_name;
        this.pg_payment_channel = pg_payment_channel;
        this.pg_transaction_number = pg_transaction_number;
        this.pg_issuer_txn_reference = pg_issuer_txn_reference;
        this.pg_issuer_code = pg_issuer_code;
        this.error_code = error_code;
        this.pg_issuer_response_code = pg_issuer_response_code;
        this.pg_paytime = pg_paytime;
        this.session_id = session_id;
        this.mac_type = mac_type;
        this.mac = mac;
    }

    public String getPg_amount() {
        return pg_amount;
    }

    public void setPg_amount(String pg_amount) {
        this.pg_amount = pg_amount;
    }

    public String getPg_currency() {
        return pg_currency;
    }

    public void setPg_currency(String pg_currency) {
        this.pg_currency = pg_currency;
    }

    public String getPg_merchant_id() {
        return pg_merchant_id;
    }

    public void setPg_merchant_id(String pg_merchant_id) {
        this.pg_merchant_id = pg_merchant_id;
    }

    public String getPg_order_info() {
        return pg_order_info;
    }

    public void setPg_order_info(String pg_order_info) {
        this.pg_order_info = pg_order_info;
    }

    public String getPg_order_reference() {
        return pg_order_reference;
    }

    public void setPg_order_reference(String pg_order_reference) {
        this.pg_order_reference = pg_order_reference;
    }

    public String getPg_payment_method() {
        return pg_payment_method;
    }

    public void setPg_payment_method(String pg_payment_method) {
        this.pg_payment_method = pg_payment_method;
    }

    public String getPg_card_number() {
        return pg_card_number;
    }

    public void setPg_card_number(String pg_card_number) {
        this.pg_card_number = pg_card_number;
    }

    public String getPg_card_holder_name() {
        return pg_card_holder_name;
    }

    public void setPg_card_holder_name(String pg_card_holder_name) {
        this.pg_card_holder_name = pg_card_holder_name;
    }

    public String getPg_payment_channel() {
        return pg_payment_channel;
    }

    public void setPg_payment_channel(String pg_payment_channel) {
        this.pg_payment_channel = pg_payment_channel;
    }

    public String getPg_transaction_number() {
        return pg_transaction_number;
    }

    public void setPg_transaction_number(String pg_transaction_number) {
        this.pg_transaction_number = pg_transaction_number;
    }

    public String getPg_issuer_txn_reference() {
        return pg_issuer_txn_reference;
    }

    public void setPg_issuer_txn_reference(String pg_issuer_txn_reference) {
        this.pg_issuer_txn_reference = pg_issuer_txn_reference;
    }

    public String getPg_issuer_code() {
        return pg_issuer_code;
    }

    public void setPg_issuer_code(String pg_issuer_code) {
        this.pg_issuer_code = pg_issuer_code;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getPg_issuer_response_code() {
        return pg_issuer_response_code;
    }

    public void setPg_issuer_response_code(String pg_issuer_response_code) {
        this.pg_issuer_response_code = pg_issuer_response_code;
    }

    public String getPg_paytime() {
        return pg_paytime;
    }

    public void setPg_paytime(String pg_paytime) {
        this.pg_paytime = pg_paytime;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getMac_type() {
        return mac_type;
    }

    public void setMac_type(String mac_type) {
        this.mac_type = mac_type;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
