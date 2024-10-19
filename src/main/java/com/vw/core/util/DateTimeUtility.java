package com.vw.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtility {


    public static String getFormattedDate(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }

}
