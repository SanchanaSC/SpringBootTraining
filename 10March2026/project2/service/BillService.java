package com.example.project2.service;

import org.springframework.stereotype.Service;

import com.example.project2.dto.request.BillRequest;
import com.example.project2.dto.response.BillResponse;

@Service
public class BillService {
    public BillResponse calBillResponse(BillRequest req){
        int totalprice=0;
        totalprice=req.getPrice1()+req.getPrice2()+req.getPrice3()+req.getPrice4()+req.getPrice5()+req.getPrice6()+req.getPrice7()+req.getPrice8()+req.getPrice9()+req.getPrice10();
        int result=totalprice*18/100;
        int netPrice=totalprice-result;
        return new BillResponse(req.getProductName(), totalprice,netPrice);
    }
}
