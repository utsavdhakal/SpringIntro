package com.example.spring.springcore.properties;

import java.util.Properties;

public class CountryLanguage {
    private Properties countryAndLanguage;

    public Properties getCountryAndLanguage() {
        return countryAndLanguage;
    }

    public void setCountryAndLanguage(Properties countryAndLanguage) {
        this.countryAndLanguage = countryAndLanguage;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "countryAndLanguage=" + countryAndLanguage +
                '}';
    }
}
