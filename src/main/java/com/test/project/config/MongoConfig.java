package com.test.project.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig
{
   public @Bean MongoClient mongoClient()
   {
       return MongoClients.create("mongodb+srv://cole:cole@cluster0.zc89r.mongodb.net/test?retryWrites=true&w=majority");
   }

   public @Bean MongoTemplate mongoTemplate()
   {
    return new MongoTemplate(mongoClient(), "test");
}
}
