package homework.medicalCenter.model;

import java.util.Objects;

public abstract class Person {
    private String id;
    private String name;
    private String surName;
    private  String phone;

    public Person(String id, String name, String surName, String phone) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.phone = phone;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(surName, person.surName) && Objects.equals(phone, person.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName, phone);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", phoneNumber='" + phone + '\'' +
                '}';
    }
}
