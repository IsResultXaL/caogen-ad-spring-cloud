package com.caogen.ad.runner;

import com.caogen.ad.mysql.BinlogClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-03 19:24
 */
@Slf4j
@Component
public class BinlogRunner implements CommandLineRunner {

    private final BinlogClient client;

    @Autowired
    public BinlogRunner(BinlogClient client) {
        this.client = client;
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("Coming in BinlogRunner...");
        client.connect();
    }
}
