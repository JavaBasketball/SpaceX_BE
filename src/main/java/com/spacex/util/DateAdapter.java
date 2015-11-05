
/**
 * 
 */

package com.spacex.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.WebApplicationException;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * 
 * @ClassName:DateAdapter.java

 * @Description: TODO

 * @author Vino Dang

 * @date 2015年10月25日

 * @version V1.0
 */

public class DateAdapter extends XmlAdapter<String, Date> {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
    "yyyy-MM-dd HH:mm:ss");

    @Override
    public String marshal(Date date) {
        return dateFormat.format(date);
    }

    @Override
    public Date unmarshal(String dateStr) {
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new WebApplicationException();
        }
    }
}

