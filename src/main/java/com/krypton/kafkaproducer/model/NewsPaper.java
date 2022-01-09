package com.krypton.kafkaproducer.model;

import java.time.LocalDate;

public class NewsPaper {

    private String name;
    private LocalDate date;

    public NewsPaper(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
