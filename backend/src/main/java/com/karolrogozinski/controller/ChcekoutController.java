package com.karolrogozinski.controller;

import com.karolrogozinski.dto.Purchase;
import com.karolrogozinski.dto.PurchaseResponse;
import com.karolrogozinski.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class ChcekoutController {

    private CheckoutService checkoutService;

    public ChcekoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;

    }
}
