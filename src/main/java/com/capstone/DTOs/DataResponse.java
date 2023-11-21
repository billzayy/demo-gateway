package com.capstone.DTOs;

public class DataResponse {
    private String status;
    private String data;

    public DataResponse() {
    }

    public DataResponse(String status, String data) {
        this.status = status;
        this.data = data;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataResponse{" +
                "status='" + status + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
