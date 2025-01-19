package ru.vlad.springcourse.models;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name not by empty")
    @Size(max = 30, message = "Name is long or short")
    @Column(name = "name")
    private String name;

    @Max(value = 100, message = "Age can't be greater than 100")
    @Column(name = "age")
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() { }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
