package com.imust.domain;



import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Author: wangJianBo
 * Date: 2020/1/30 17:26
 * Content:
 */
public class Account implements Serializable {

    private String name;
    private Integer password;
    private Double money;
    private User user;
    private Date birthday;

    private List<User> listUser;
    private Map<String,User> mapUser;


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getListUser() {
        return listUser;
    }

    public void setListUser(List<User> listUser) {
        this.listUser = listUser;
    }

    public Map<String, User> getMapUser() {
        return mapUser;
    }

    public void setMapUser(Map<String, User> mapUser) {
        this.mapUser = mapUser;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password=" + password +
                ", money=" + money +
                ", user=" + user +
                ", brithday=" + birthday +
                ", listUser=" + listUser +
                ", mapUser=" + mapUser +
                '}';
    }
}
