package com.dange.rabbitchiptronic;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class QueueConsumer {

    @RabbitListener(queues = {"${queue.name}"} , concurrency = "${concurrent-threads}")
    public void receive(@Payload Notification fileBody) throws InterruptedException {
        Thread.sleep(300); //API Call
        log.info("Message " + fileBody);
    }

}
