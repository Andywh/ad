package com.joy.ad.constant;

import lombok.Getter;

/**
 * Created by SongLiang on 2019-09-27
 */
@Getter
public enum CommonStatus {
    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer code, String desc) {
        this.status = code;
        this.desc = desc;
    }

}
