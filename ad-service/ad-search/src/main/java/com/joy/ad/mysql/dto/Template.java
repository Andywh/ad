package com.joy.ad.mysql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by SongLiang on 2019-10-10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Template {

    private String database;

    private List<JsonTable> tableList;

}
