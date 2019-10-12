package com.joy.ad.runner;

import com.joy.ad.mysql.BinlogClient;
import com.joy.ad.mysql.BinlogConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by SongLiang on 2019-10-12
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
    public void run(String... args) throws Exception {
        log.info("Comming in BinlogRunner...");
        client.connect();
    }
}
