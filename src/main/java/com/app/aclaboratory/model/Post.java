package com.app.aclaboratory.model;

public class Post {
    Long id;
    String status;
    String furColor;
    String breed;
    String species;
    Long age;
    String gender;
    String contacts;

    public Post(Long id, String status, String furColor, String breed, String species, Long age, String gender, String contacts) {
        this.id = id;
        this.status = status;
        this.furColor = furColor;
        this.breed = breed;
        this.species = species;
        this.age = age;
        this.gender = gender;
        this.contacts = contacts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
