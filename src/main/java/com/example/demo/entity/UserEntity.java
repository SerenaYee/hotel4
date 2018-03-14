package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author 叶佳
 */

@Setter
@Getter
@ToString
public class UserEntity {
    private Integer user_id;
    private Integer role_type;
    private String username;
    private String password;
    private String name;
    private String idcard_number;
    private String sex;
    private String tel;
    private String status;
    private Date create_date;

    public UserEntity() {
    }
}