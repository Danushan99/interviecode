package com.sliit.interviewapp1_t1;

public class UserModel {
    private String name;
    private String phoneNo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


    public UserModel(){
        this.name = name;
        this.phoneNo = phoneNo;

    }

    public UserModel(String name, String email, String phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;

    }
}
