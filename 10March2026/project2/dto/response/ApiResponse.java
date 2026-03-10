package com.example.project2.dto.response;

public class ApiResponse {
    private String message;
    private BillResponse data;
    public ApiResponse(String message, BillResponse data) {
        this.message = message;
        this.data = data;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public BillResponse getData() {
        return data;
    }
    public void setData(BillResponse data) {
        this.data = data;
    }
    
    


}
