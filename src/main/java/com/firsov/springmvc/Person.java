package com.firsov.springmvc;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    @Size(min = 3, message = "Имя должно иметь минимум 3 буквы")
    private String name;
    @NotBlank(message = "фамилия не должна быть пустой")
    private String surname;
    @Min(value = 18, message = "вам должно быть не менее 18")
    @Max(value = 120, message = "не верим, что вам больше 120")
    private int age;
    @Pattern(regexp = "(\\w{1,}[\\.-]{0,1}\\w{1,})+@(\\w{1,}[\\.-]{0,1}\\w{1,})+[\\.]{1}[a-z]{2,4}", message = "введите существующую электронную почту")
    private String email;
    private String country;
    private Map<String, String> countries;
    private  String gender;
    private final List<String> genders;
    private  String[] languages;

    public Person() {
        countries = new HashMap<>();
        countries.put("Democratic People's Republic of Korea", "DPRK");
        countries.put("People's Republic of China", "PRC");
        countries.put("Russian Federation", "RF");

        genders = new ArrayList();
        genders.add("male");
        genders.add("female");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getGenders() {
        return genders;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
