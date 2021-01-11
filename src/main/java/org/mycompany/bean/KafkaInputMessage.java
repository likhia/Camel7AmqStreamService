package org.mycompany.bean;

public class KafkaInputMessage {
    private String message=null;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}