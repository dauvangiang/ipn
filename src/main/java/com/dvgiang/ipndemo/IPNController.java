package com.dvgiang.ipndemo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("/pay")
    public String getPay() {
        String text = "00020101021238570010A000000727012700069704220113VQRQAAWFI27760208QRIBFTTA530370454061000005802VN62190107NPS68690804Test63042F6B";
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

        try {
            // Tạo ma trận QR Code
            BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, 500, 500, hints);

            // Chuyển thành BufferedImage
            BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);

            // Chuyển ảnh QR thành Base64
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(qrImage, "png", baos);
            byte[] imageBytes = baos.toByteArray();

            String base64QR = Base64.getEncoder().encodeToString(imageBytes);
            return "<html><body>" +
                    "<h2>QR Code</h2>" +
                    "<img src='data:image/png;base64," + base64QR + "' alt='QR Code' />" +
                    "</body></html>";
        } catch (WriterException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping
    public ResponseEntity<Object> postIpn(@RequestBody IpnDTO ipnDTO) {
        System.err.println("Ok ok ok!");
        return ResponseEntity.ok("OK");
    }
}
