package com.firstdata.gcs.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {

    private final long id;

    private final String name;

}
