package com.haugv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Topic implements Serializable {

    private int id;
    private int createUserId;
    private String title;
    private Timestamp createTime;

}
