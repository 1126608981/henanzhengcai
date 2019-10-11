package com.xq.tmall.test;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestController {
    public static void main(String[] args) throws ParseException {
        Calendar cl = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yy-MM-dd");
        Date date = sf.parse(sf.format(new Date()));
        cl.setTime(date);
        cl.add(Calendar.DATE,1);
        System.out.println(cl.getTime());
    }
}
