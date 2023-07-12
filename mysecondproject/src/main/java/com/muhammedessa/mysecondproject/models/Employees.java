package com.muhammedessa.mysecondproject.models;

public class Employees {
    
    private long id;
    private String employeeID;
    private String name;
    private String info;


    public Employees() {
    }


    public Employees(long id, String employeeID, String name, String info) {
        this.id = id;
        this.employeeID = employeeID;
        this.name = name;
        this.info = info;
    }



    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }




}
