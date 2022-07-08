package com.caogen.ad.consumer;

import com.alibaba.fastjson.JSON;
import com.caogen.ad.dto.MySqlRowData;
import com.caogen.ad.sender.Sender;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Author 康良玉
 * @Description 消费 Binlog Message
 * @Create 2022-07-08 11:06
 */
@Slf4j
@Component
public class BinlogConsumer {

    private final Sender sender;

    @Autowired
    public BinlogConsumer(Sender sender) {
        this.sender = sender;
    }

    @KafkaListener(topics = {"ad-search-mysql-data"}, groupId = "ad-search")
    public void processMysqlRowData(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            MySqlRowData rowData = JSON.parseObject(
                    message.toString(),
                    MySqlRowData.class
            );
            log.info("kafka processMysqlRowData: {}", JSON.toJSONString(rowData));
            sender.sender(rowData);
        }
    }
}
