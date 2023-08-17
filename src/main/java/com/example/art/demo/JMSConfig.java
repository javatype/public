package com.example.art.demo;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.JMSException;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

// comment these to make app run
@Configuration
@EnableJms
public class JMSConfig {
    @Bean(name = "queueConnectionFactory")
    public ConnectionFactory getQueueConnectionFactory() throws JMSException {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://0");
        connectionFactory.createConnection();
        return connectionFactory;
    }
}
