package com.inventory.GenericResponse;

import java.util.Arrays;

public class GenericResponse <T>{
    private Integer status;
    private String statusMessage;
    private T [] data;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GenericResponse{" +
                "status=" + status +
                ", statusMessage='" + statusMessage + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
