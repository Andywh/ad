package com.joy.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by SongLiang on 2019-09-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanGetRequest {

    private Long userId;

    private List<Long> ids;

    public boolean validate() {
        return userId != null && !CollectionUtils.isEmpty(ids);
    }

}
