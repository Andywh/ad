package com.joy.ad.utils;

import com.joy.ad.exception.AdException;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.time.DateUtils;

import java.util.Date;

/**
 * Created by SongLiang on 2019-09-27
 */
public class CommonUtils {

    private static String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy/MM/dd", "yyyy.MM.ddd"
    };

    public static String md5(String value) {
        return DigestUtils.md5Hex(value).toUpperCase();
    }

    public static Date parseStringDate(String dateString) throws AdException {
        try {
            return DateUtils.parseDate(dateString, parsePatterns);
        } catch (Exception ex) {
            throw new AdException(ex.getMessage());
        }
    }

}
