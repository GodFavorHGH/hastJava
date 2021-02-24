package com.haugv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Answer implements Serializable {
    /**唯一主键*/
    private int id;
    /***/
    private int topicId;
    /***/
    private int userId;
    /***/
    private String createTime;
    /***/
    private String content;
    /***/
    private String authStatus;
    /***/
    private String authTime;
}
