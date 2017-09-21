package com.TheIronYard;

/*
TODO:
Create a Student JavaBean (empty constructor and getters and setters)
    firstName
    lastName
    id
    grade
*/

public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private int grade;

    public Student(String firstName, String lastName, int id, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    // If you don't want to see ALL the information about a student, use the other toString method that only
    // provide the name.
//    @Override
//    public String toString() {
//        return "Student{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", id=" + id +
//                ", grade=" + grade +
//                '}';
//    }

    // This only provide the toString for the firstName of students
    @Override
    public String toString() {
        return this.firstName;
    }
}
