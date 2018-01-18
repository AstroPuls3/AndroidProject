package com.btse.tomabot.icecreamfinder;

/**
 * Created by tomab on 12/22/2017.
 */

import java.util.ArrayList;
import java.util.List;

public class IceCreamExpert {
    List<String> getBrands(String icType) {
        List<String> brands = new ArrayList<>();
        if(icType.equals("tillamook")) {
            brands.add("almond fudge");
            brands.add("banana split");
            brands.add("caramel toffee crunch");
            brands.add("chocolate");
            brands.add("french vanilla");
            brands.add("mudslide");
            brands.add("rocky road");
        } else if(icType.equals("ben & jerrys")) {
            brands.add("chocolate cherry garcia");
            brands.add("chocolate fudge brownie");
            brands.add("chocolate therapy");
            brands.add("chunky monkey");
            brands.add("cherry garcia");
            brands.add("cocoa loco");
            brands.add("chocolate chip cookie dough");
        } else if(icType.equals("haagendaz")){
            brands.add("banana peanut butter chip");
            brands.add("belgian chocolate");
            brands.add("butter pecan");
            brands.add("caramel cone");
            brands.add("honey salted caramel almond");
            brands.add("midnight cookies and cream");
            brands.add("pistachio");
            brands.add("sea salt caramel truffle");
        } else if(icType.equals("breyers")) {
            brands.add("chocolate chip");
            brands.add("almond butter");
            brands.add("chocolate");
            brands.add("chocolate chip");
            brands.add("mint chocolate chip");
            brands.add("butter pecan");
            brands.add("coffee");
            brands.add("peach");
        } else {
            brands.add("chocolate");
            brands.add("strawberry");
            brands.add("vanilla");
        }
        return brands;
    }
}
