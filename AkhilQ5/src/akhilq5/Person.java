/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilq5;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Person {
   private String name;
   private String address;
    private String phno;
    private String email;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getaddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }


    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }
    

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Person(String name, String address, String phno, String email) {
        this.name = name;
        this.address = address;
        this.phno = phno;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", phno=" + phno + ", email=" + email + '}';
    }

    

    }

    
