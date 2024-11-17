package com.example.assignment_4;

public class Item {
    private String title;
    private String subtitle;
    private String description;
    private int leftIconResId; // Resource ID for the left image

    public Item(String title, String subtitle, String description, int leftIconResId) {
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.leftIconResId = leftIconResId;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDescription() {
        return description;
    }

    public int getLeftIconResId() {
        return leftIconResId;
    }
}
