package com.joy.ad.sender;

import com.joy.ad.mysql.dto.MySqlRowData;

/**
 * Created by SongLiang on 2019-10-12
 */
public interface ISender {

    void sender(MySqlRowData rowData);

}
