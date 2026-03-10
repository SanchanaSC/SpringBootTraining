package com.example.project2.dto.response;

public class BillResponse {
    private String productName;
    private int totalprice;
    private int netPrice;
    public BillResponse(String productName, int totalprice,int netPrice) {
        this.productName = productName;
        this.totalprice = totalprice;
        this.netPrice=netPrice;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getTotalprice() {
        return totalprice;
    }
    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }
    public int getNetPrice() {
        return netPrice;
    }
    public void setNetPrice(int netPrice) {
        this.netPrice = netPrice;
    }
   

    
}
