package com.example.application.model;

import reactor.util.annotation.NonNull;

import java.time.Instant;

public class Message {

    @NonNull
    private String text;
    private Instant time;
    @NonNull
    private String useName;

    @NonNull
    public String getText() {
        return text;
    }

    public void setText(@NonNull String text) {
        this.text = text;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    @NonNull
    public String getUseName() {
        return useName;
    }

    public void setUseName(@NonNull String useName) {
        this.useName = useName;
    }
}
