package com.karolrogozinski.service;

import com.karolrogozinski.dto.Purchase;
import com.karolrogozinski.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);


}
