package com.caogen.ad.sender.kafka;

import com.alibaba.fastjson.JSON;
import com.caogen.ad.dto.MySqlRowData;
import com.caogen.ad.sender.Sender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-04 15:36
 */
@Slf4j
@Component
public class KafkaSender implements Sender {

    @Value("${adconf.kafka.topic}")
    private String topic;

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaSender(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sender(MySqlRowData rowData) {
        log.info("binlog kafka service send MySqlRowData...");
        kafkaTemplate.send(
                topic, JSON.toJSONString(rowData)
        );
    }

}
