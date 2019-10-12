package com.joy.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by SongLiang on 2019-10-08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitTable {

    private Long unitId;

    private Integer unitStatus;

    private Integer positionType;

    private Long planId;

}
