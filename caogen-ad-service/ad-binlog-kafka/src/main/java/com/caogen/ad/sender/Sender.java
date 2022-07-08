package com.caogen.ad.sender;

import com.caogen.ad.dto.MySqlRowData;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-03 19:03
 */
public interface Sender {

    void sender(MySqlRowData rowData);

}
