package com.neoteric.Swiggy.Service;

import com.neoteric.Swiggy.Model.Address;
import com.neoteric.Swiggy.Model.LogInDetails;
import com.neoteric.Swiggy.Model.Menu;
import com.neoteric.Swiggy.Model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class LoginService {


    public List<Restaurant> loginprocess (LogInDetails logInDetails){

        String userName="sampath";
        String password="babi";
if(userName.equals(logInDetails.userName)&&password.equals(logInDetails.password)){
     Restaurant pistaHouse=new Restaurant();
     pistaHouse.restaurantName="pistaHouse";
     pistaHouse.rating="3.5";


    Address pistahouseAddress=new Address("kphp","kphpRoadNo1","507124");

    pistaHouse.address=pistahouseAddress;
    Menu menu=new Menu("fishfry","Non-veg",450);
    Menu menu1=new Menu("chickenpalav","Non-veg",670);
    Menu menu2=new Menu(" vegbiryani","veg",450);

    List pistaHouseMenuList=new ArrayList<>();
    pistaHouseMenuList.add(menu);
    pistaHouseMenuList.add(menu1);
    pistaHouseMenuList.add(menu2);
    pistaHouse.menuList=pistaHouseMenuList;

    System.out.println("list of pistahouse"+pistaHouse);

    Restaurant hotelmiyabhai=new Restaurant();
    hotelmiyabhai.restaurantName="hotelmiyabhai";
    hotelmiyabhai.rating="4.5";


    Address hotelmiyabhaiAddress=new Address("kphp","kphpRoadNo1","507124");

    hotelmiyabhai.address=hotelmiyabhaiAddress;
    Menu menuA=new Menu("fishfry","Non-veg",450);
    Menu menuB=new Menu("chickenpalav","Non-veg",670);
    Menu menuC=new Menu(" vegbiryani","veg",450);
    System.out.println("list of hotelmiyabahi"+hotelmiyabhai);


    List hotelmiyabhaimenulist=new ArrayList<>();
    hotelmiyabhaimenulist.add(menuA);
    hotelmiyabhaimenulist.add(menuB);
    hotelmiyabhaimenulist.add(menuB);
    hotelmiyabhai.menuList=hotelmiyabhaimenulist;


    List<Restaurant> restaurant=new ArrayList<>();
    restaurant.add(pistaHouse);
    restaurant.add(hotelmiyabhai);

    System.out.println("list of restaurant"+restaurant);

 return restaurant;

}else {
    System.out.println("login failed");
    return null;
}
    }


}
