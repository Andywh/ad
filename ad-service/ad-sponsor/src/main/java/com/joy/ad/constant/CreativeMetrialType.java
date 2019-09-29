package com.joy.ad.constant;

import lombok.Getter;

/**
 * Created by SongLiang on 2019-09-27
 */
@Getter
public enum  CreativeMetrialType {

    JPG(1, "jpg"),
    BMP(2, "bmp"),

    MP4(3, "mp4"),
    AVI(4, "avi"),

    TXT(5, "txt");

    private int type;
    private String desc;

    CreativeMetrialType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

}
