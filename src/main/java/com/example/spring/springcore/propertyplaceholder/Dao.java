package com.example.spring.springcore.propertyplaceholder;

public class Dao {
    private String dbUrl;

    public Dao(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public String toString() {
        return "Dao{" +
                "dbUrl='" + dbUrl + '\'' +
                '}';
    }
}
