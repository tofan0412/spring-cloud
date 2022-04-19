package com.elevenst.api;

import com.elevenst.api.service.ProductRemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/displays")
public class DisplayController {
    private final ProductRemoteService productRemoteService;
    public DisplayController(ProductRemoteService productRemoteService) {
        this.productRemoteService = productRemoteService;
    }

    public DisplayController(ProductRemoteService productRemoteService) {
        this.productRemoteService = productRemoteService;
    }

    @GetMapping(path = "/{displayId}")
    public String getDisplayDetail(@PathVariable String displayId) {
        String productInfo = productRemoteService.getProductInfo("11111");
        return String.format("[display id = %s at %s %s ]", displayId, System.currentTimeMillis(), productInfo);
    }

    private String getProductInfo() {
        return productRemoteService.getProductInfo("12345");
    }
}