/**
     NIM         : 10118702
     Nama        : Erwin Jelly Barus Tobing
     Kelas       : IF-6k
     Tanggal     : 28/04/2020
     Deskripsi   : membuat kelas UserModel membuat var username, password, phone dan membuat
                   getter and setter nya

 */

package com.chupakubera.latihansharedpreference.model;

public class UserModel {
    private String username;
    private String password;
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
