package com.example.library.entity;

public enum Genre {
    FICTION("Fiction"),
    NON_FICTION("Non-fiction"),
    SCIENCE("Science"),
    BIOGRAPHY("Biography"),
    HISTORY("History"),
    FANTASY("Fantasy");

    private final String label;

    Genre(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}