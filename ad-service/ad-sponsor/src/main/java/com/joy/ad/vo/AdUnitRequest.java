package com.joy.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * Created by SongLiang on 2019-09-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitRequest {

    private Long planId;

    private String unitName;

    private Integer positionType;

    private Long budget;

    public boolean createValidate() {
        return null != planId && !StringUtils.isEmpty(unitName)
                && positionType != null && budget != null;
    }

}
