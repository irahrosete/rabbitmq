package com.irahrosete.pubsub.subscriber;

import com.irahrosete.pubsub.config.MessagingConfig;
import com.irahrosete.pubsub.dto.OrderStatus;
import lombok.extern.java.Log;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Log
@Component
public class OrderConsumer {
    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        log.info("Message received from queue: " + orderStatus);
    }
}