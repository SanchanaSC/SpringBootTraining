package com.example.project2.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project2.dto.request.BillRequest;
import com.example.project2.dto.response.ApiResponse;
import com.example.project2.dto.response.BillResponse;
import com.example.project2.service.BillService;

@RestController
@RequestMapping("/price")
public class BillController {
    private final BillService billService;
    public BillController(BillService billService){
        this.billService=billService;
    }
    @PostMapping("/calc")
    public ApiResponse getResult(@RequestBody BillRequest request){
        BillResponse result=billService.calBillResponse(request);
        return new ApiResponse("Bill calculated successfully", result);
    }
}
