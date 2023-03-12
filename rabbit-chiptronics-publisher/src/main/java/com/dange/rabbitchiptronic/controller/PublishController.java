package com.dange.rabbitchiptronic.controller;


import com.dange.rabbitchiptronic.model.Notification;
import com.dange.rabbitchiptronic.service.QueueSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class PublishController {

    @Autowired
    private QueueSender queueSender;

    @PostMapping("/publish")
    @ResponseStatus(code = HttpStatus.OK, reason = "SUCCESS")
    public String send(@RequestBody Notification notification ){
        log.info(notification.toString());
        queueSender.send(notification);
        return "SUCCESS";
    }

}
