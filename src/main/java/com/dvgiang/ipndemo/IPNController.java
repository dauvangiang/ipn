package com.dvgiang.ipndemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ipn")
public class IPNController {
    @GetMapping("/hello")
    public String hello() {
        System.err.println("Test logs!");
        return "Hello World";
    }

    @GetMapping
    public ResponseEntity<Object> getIpn(
            @RequestParam String pg_amount,
            @RequestParam String pg_currency,
            @RequestParam String pg_merchant_id,
            @RequestParam String pg_order_info,
            @RequestParam String pg_order_reference,
            @RequestParam String pg_payment_method,
            @RequestParam(required = false) String pg_card_number,
            @RequestParam(required = false) String pg_card_holder_name,
            @RequestParam String pg_payment_channel,
            @RequestParam String pg_transaction_number,
            @RequestParam String pg_issuer_txn_reference,
            @RequestParam String pg_issuer_code,
            @RequestParam String error_code,
            @RequestParam String pg_issuer_response_code,
            @RequestParam String pg_paytime,
            @RequestParam String session_id,
            @RequestParam String mac_type,
            @RequestParam String mac
    ) {
        System.err.println(pg_transaction_number);
        return ResponseEntity.ok("OK");
    }

    @PostMapping
    public ResponseEntity<Object> postIpn(@RequestBody IpnDTO ipnDTO) {
        System.err.println("Ok ok ok!");
        return ResponseEntity.ok("OK");
    }
}
