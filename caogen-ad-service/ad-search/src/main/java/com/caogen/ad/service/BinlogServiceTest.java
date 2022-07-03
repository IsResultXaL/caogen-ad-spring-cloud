package com.caogen.ad.service;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.DeleteRowsEventData;
import com.github.shyiko.mysql.binlog.event.EventData;
import com.github.shyiko.mysql.binlog.event.UpdateRowsEventData;
import com.github.shyiko.mysql.binlog.event.WriteRowsEventData;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-03 16:09
 */
public class BinlogServiceTest {

    public static void main(String[] args) throws Exception {
        BinaryLogClient client = new BinaryLogClient(
                "127.0.0.1",
                3306,
                "root",
                "caogen"
        );
        client.setServerId(1);

        //client.setBinlogFilename();
        //client.setBinlogPosition();

        //默认从最新的binlog日志监听
        client.registerEventListener(event -> {
            EventData data = event.getData();
            if (data instanceof UpdateRowsEventData) {
                System.out.println("Update----------");
                System.out.println(data.toString());
            } else if (data instanceof WriteRowsEventData) {
                System.out.println("Write----------");
                System.out.println(data.toString());
            } else if (data instanceof DeleteRowsEventData) {
                System.out.println("Delete----------");
                System.out.println(data.toString());
            }
        });

        client.connect();
    }

}
