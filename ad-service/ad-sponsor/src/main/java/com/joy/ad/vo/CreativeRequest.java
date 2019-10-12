package com.joy.ad.vo;

import com.joy.ad.constant.CommonStatus;
import com.joy.ad.entity.Creative;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by SongLiang on 2019-09-29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeRequest {

    private String name;

    private Integer type;

    private Integer materialType;

    private Integer height;

    private Integer width;

    private Long size;

    private Integer duration;

    private Long userId;

    private String url;

    public Creative convertToEntity() {
        Creative creative = new Creative();
        creative.setName(name);
        creative.setType(type);
        creative.setMaterialType(materialType);
        creative.setHeight(height);
        creative.setWidth(width);
        creative.setSize(size);
        creative.setDuration(duration);
        creative.setAuditStatus(CommonStatus.VALID.getStatus());
        creative.setUserId(userId);
        creative.setUrl(url);
        creative.setCreateTime(new Date());
        creative.setUpdateTime(creative.getCreateTime());
        return creative;
    }

    public boolean validate() {
        // 参数校验，待完善
        return name != null && type != null && duration !=  null;
    }

}
