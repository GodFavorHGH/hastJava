package com.haugv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Menu {

    private int id;
    private String parentId;
    private String menuId;
    private String menuName;
    private String status;
    private String isParent;
    private String menuLevel;
    private Timestamp createTime;
    private Timestamp updateTime;
    private List<Menu> childList;

}
