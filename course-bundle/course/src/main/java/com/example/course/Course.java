package com.example.course;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int id;
    private String courseName;
    private String location;
    private float price;
    private String duration;
    private String summary;

    public Course(String courseName, String location, float price, String duration, String summary) {
        this.courseName = courseName;
        this.location = location;
        this.price = price;
        this.duration = duration;
        this.summary = summary;
    }

    public Course () {

    }

    // default constructor for Entity...
    // abstract password (GIT)
    // final steps

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLocation() {
        return location;
    }

    public float getPrice() {
        return price;
    }

    public String getDuration() {
        return duration;
    }

    public String getSummary() {
        return summary;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", duration='" + duration + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
