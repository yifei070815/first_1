package com.kanq.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static void main(String[] args) {

        String beginTime = "2018-07-28 14:42:32";
        String endTime = "2018-07-29 12:26:32";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {

            //==============Data格式的转成毫秒===================
            Date date1 = format.parse(beginTime); //将字符串转成时间格式
            Date date2 = format.parse(endTime);   //将字符串转成时间格式


           if (date1.before(date2)) {
               System.out.println("a");
           }else {
               System.out.println("b");
           }

            long beginMillisecond = date1.getTime();//时间格式转成毫秒
            long endMillisecond = date2.getTime();//时间格式转成毫秒

            System.out.println("beginMillisecond======>" + beginMillisecond);
            System.out.println("endMillisecond========>" + endMillisecond);
            //==============Data格式的转成毫秒===================

            //==================================================

            //==============毫秒转日期Data格式===================

            String data1 = format.format(beginMillisecond);
            String data2 = format.format(endMillisecond);

            System.out.println(data1+"-------------"+data2);
            //==============毫秒转日期Data格式===================


            Boolean b = beginMillisecond < endMillisecond;
            if(b){
                System.out.println("开始时间小于结束时间");//true  开始时间小于结束时间 开始时间小于结束时间
            }else {
                System.out.println("开始时间大于结束时间");
            }


        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
