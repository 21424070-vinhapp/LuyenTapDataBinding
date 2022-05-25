package com.example.luyentapdatabinding.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Users extends BaseObservable {
    private String firstName;
    private String lastName;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    @Bindable
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Users() {
    }

    public Users(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
