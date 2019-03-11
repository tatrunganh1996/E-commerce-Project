package com.dac.spring.controller;

import com.dac.spring.model.ServiceResult;
import com.dac.spring.model.req.*;
import com.dac.spring.service.CustomerService;
import com.dac.spring.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/shop")
@PreAuthorize("hasRole('SHOP')")
public class ShopController {

    @Autowired
    ShopService shopService;

    @Autowired
    CustomerService customerService;

    @PostMapping("/getInfoById")
    public ResponseEntity<ServiceResult> getInfoById(HttpServletRequest request) {
        return new ResponseEntity<>(customerService.getInfo(request), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ServiceResult> updateInfo(@Valid @RequestBody ShopUpdateInfoRequest request) {
        return new ResponseEntity<>(shopService.updateInfo(request.getId(),
                request.getFirstName(),
                request.getLastName(),
                request.getPassword(),
                request.getImageURL()),HttpStatus.OK);
    }

    @PostMapping("/paginateProduct")
    public ResponseEntity<ServiceResult> paginateProduct(@Valid @RequestBody ShopGetProductRequest request) {
        return new ResponseEntity<>(shopService.paginateProductById(request.getId(),
                request.getPage(),
                request.getSize()),HttpStatus.OK);
    }

    @PostMapping("/createProduct")
    public ResponseEntity<ServiceResult> createProduct(@Valid @RequestBody ShopCreateProductRequest request) {
        return new ResponseEntity<>(shopService.createProduct(request),HttpStatus.OK);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<ServiceResult> updateProduct(@Valid @RequestBody ShopUpdateProductRequest request) {
        return new ResponseEntity<>(shopService.updateProduct(request),HttpStatus.OK);
    }

    @DeleteMapping("/deleteProduct")
    public ResponseEntity<ServiceResult> deleteProduct(@Valid @RequestBody ShopDeleteProductRequest request) {
        return new ResponseEntity<>(shopService.deleteProduct(request.getId()),HttpStatus.OK);
    }

    @PutMapping("/updateOrder")
    public ResponseEntity<ServiceResult> updateOrder(@Valid @RequestBody ShopUpdateOrderRequest request) {
        return new ResponseEntity<>(shopService.updateOrder(request.getId(),
                request.getStatus()),HttpStatus.OK);
    }

    @PutMapping("/updateOrderDetail")
    public ResponseEntity<ServiceResult> updateOrderDetail(@Valid @RequestBody ShopUpdateOrderDetailRequest request) {
        return new ResponseEntity<>(shopService.updateOrderDetail(request.getId(),
                request.getQuantity(),
                request.getProductID()),HttpStatus.OK);
    }
}
