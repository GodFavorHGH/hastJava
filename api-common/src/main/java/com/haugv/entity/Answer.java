package com.haugv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Answer {
    /**唯一主键*/
    private int id;
    /***/
    private int topicId;
    /***/
    private int userId;
    /***/
    private String createTime;
    /***/
    private int content;
    /***/
    private String authStatus;
    /***/
    private String authTime;
}
