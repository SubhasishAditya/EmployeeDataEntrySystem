package com.example.webapp3.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private  int eid;
    private  String name;
    private  String phone;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
