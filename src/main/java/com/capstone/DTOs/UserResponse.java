package com.capstone.DTOs;

import com.capstone.Entities.Users;

import java.util.List;

public class UserResponse {
    private String status;
    private List<Users> data;

    public UserResponse() {
    }

    public UserResponse(String status, List<Users> data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Users> getData() {
        return data;
    }

    public void setData(List<Users> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}

