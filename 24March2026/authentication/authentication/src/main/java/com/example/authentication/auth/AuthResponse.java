// package com.example.authentication.auth;

// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// public class AuthResponse {
//     private  String token;
//     private String message;
// }
package com.example.authentication.auth;

public class AuthResponse {
    private String token;
    private String message;

    public AuthResponse() {}

    public AuthResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}