package com.caogen.ad.mysql.listener;

import com.caogen.ad.mysql.dto.BinlogRowData;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-03 18:19
 */
public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);

}
