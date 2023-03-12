package com.dange.rabbitchiptronic.model;


import lombok.Data;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.Instant;

@Data
public class Notification implements Serializable {

    String name;
    String employeeId;
    Instant timestamp;
    Boolean isPresent;

}
