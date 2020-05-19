package com.kanq.coordinate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Coordinate {

    public static void main(String[] args) {

        /*
        存数据库：
        坐标是先乘3600 再乘32 取整保存到数据库；

        从数据库取坐标：
        先除以32，再除以3600，得到一个坐标值；
         */

        int xxx = 3508917;
        System.out.println(xxx);

        double xx = (double) xxx/32;
        System.out.println(xx);

        double x = xx/3600;
        System.out.println(x);
//==============================================================================================


    }
}
