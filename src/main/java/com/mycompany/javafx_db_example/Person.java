package com.mycompany.javafx_db_example;

/**
 * @author justinsam
 */

public class Person {

    //add a field for each column in the table
    private String name;
    private String email;
    private String number;
    private String address;
    private String password;
    private int salary;


    /**
     * Initialize all the variables of Person class
     */
    public Person() {
        this.name = " ";
        this.email = " ";
        this.number = " ";
        this.address = " ";
        this.password = " ";
        this.salary = 0;
    }


    /**
     *  Sets the variables of the Person class
     * @param name
     * @param email
     * @param number
     * @param address
     * @param salary
     * @param password
     */
    public Person(String name, String email, String number, String address, int salary, String password) {
       this.setName(name);
       this.setEmail(email);
       this.setNumber(number);
       this.setAddress(address);
       this.password = password;
        this.setSalary(salary);
    }

    // fix the getters and setters to match the fields

    /**
     * Gets the salary
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * sets the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Gets the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the email
     * @return email
     */

    public String getEmail() {
        return email;
    }

    /**
     * Sets the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *  its get's the number
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     *  sets the number
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * gets the address
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
