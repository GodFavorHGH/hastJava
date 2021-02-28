package com.haugv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author 98285
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    private int id;
    private String subject;
    private int sequence;
    private String title;
    private String content;
    private Timestamp createTime;
    private Timestamp updateTime;
}
