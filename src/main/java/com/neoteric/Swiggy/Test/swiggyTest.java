package com.neoteric.Swiggy.Test;

import com.neoteric.Swiggy.Model.LogInDetails;
import com.neoteric.Swiggy.Model.Restaurant;
import com.neoteric.Swiggy.Service.LoginService;

import java.util.List;

public class swiggyTest {

    public static void main(String[] args) {
        LoginService loginService=new LoginService();
        LogInDetails logInDetails=new LogInDetails();
        logInDetails.userName="sampath";
        logInDetails.password="bbi";
     List<Restaurant> restaurantList = loginService.loginprocess(logInDetails);

        System.out.println(restaurantList);
    }

}
