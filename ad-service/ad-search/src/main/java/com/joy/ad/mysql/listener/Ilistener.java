package com.joy.ad.mysql.listener;

import com.joy.ad.mysql.dto.BinlogRowData;

/**
 * Created by SongLiang on 2019-10-12
 */
public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);

}
