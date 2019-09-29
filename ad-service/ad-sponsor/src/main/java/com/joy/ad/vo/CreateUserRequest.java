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
public class CreateUserRequest {

    private String username;

    public boolean validate() {
        return StringUtils.isEmpty(username);
    }

}
