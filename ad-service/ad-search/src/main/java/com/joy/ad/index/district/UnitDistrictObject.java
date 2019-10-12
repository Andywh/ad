package com.joy.ad.index.district;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by SongLiang on 2019-10-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnitDistrictObject {

    private Long unitId;

    private String province;

    private String city;

    // <String, Set<Long>>
    // province-city


}
