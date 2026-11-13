package com.example.javaapp;

public class PonJeyashree {
    private final String name;

    public PonJeyashree(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name + ".");
        System.out.println(Utility.line("B.Tech AI & Data Science"));
    }

    public static void main(String[] args) {
        new PonJeyashree("Pon Jeyashree").introduce();
    }
}
