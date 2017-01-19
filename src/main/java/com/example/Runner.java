package com.example;

import org.elasticsearch.ResourceAlreadyExistsException;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.client.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Runner implements ApplicationRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);

    private Client elasticsearchClient;

    @Autowired
    public Runner(Client elasticsearchClient) {
        this.elasticsearchClient = elasticsearchClient;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        LOGGER.info("Running");
        List<String> indices = applicationArguments.getNonOptionArgs();

        for (String index : indices) {
            LOGGER.info("Initializing index {}", index);
            try {
                CreateIndexResponse response = elasticsearchClient.admin().indices().prepareCreate(index)
                        .get();

                LOGGER.info("Response from creating {}: acked={}", index, response.isAcknowledged());
            } catch (ResourceAlreadyExistsException e) {
                LOGGER.warn("Index {} already exists", index);
            }
        }

    }
}
