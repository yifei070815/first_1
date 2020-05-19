package com.kanq.time;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddDayAndMonth {

    public static void main(String[] args) {

        String time = "2019-7-20 11:05:51";	//当前时间
        int numDay = 15;	//加的天数
        int numMonth=2;    //加的月数

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date currdate = null;
        try {
            currdate = format.parse(time);
        } catch ( ParseException e) {
            e.printStackTrace();
        }

        System.out.println("初始的时间是：" + currdate);

        Calendar ca = Calendar.getInstance();

        ca.setTime(currdate);

        //增加天数
        ca.add(Calendar.DATE, numDay);
        currdate = ca.getTime();//得到毫秒日期

        String enddate = format.format(currdate);//毫秒日期转Data日期
        System.out.println("增加天数以后的时间：" + enddate);

        //增加月数
        ca.add(Calendar.MONDAY,numMonth);
        currdate = ca.getTime();
        String endDate = format.format(currdate);
        System.out.println("增加月数以后的时间：" + endDate);




//　　      Date date = new Date();//获取当前时间
//　　      Calendar calendar = Calendar.getInstance(); //创建Calendar 的实例
//          calendar.setTime(date);
//    　　  calendar.add(Calendar.YEAR, -1);//当前时间减去一年，即一年前的时间
//    　　  calendar.add(Calendar.MONTH, -1);//当前时间减去一个月，即一个月前的时间
//    　　  calendar.add(Calendar.DAY_OF_MONTH,-1); //当前时间减去一天，即一天前的时间
//    　　  calendar.getTimeInMillis();//返回当前时间的毫秒数



    }

}
