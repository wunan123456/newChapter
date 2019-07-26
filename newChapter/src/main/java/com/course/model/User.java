package com.course.model;

import lombok.Data;

/**
 * @author: nan.wn
 * @date: 2019/7/25 16:25
 * @version: V1.0
 * @Description:
 */
@Data
public class User {
    private int id;
    private String userName;
    private String passWord;
    private int age;
    private String sex;
    private int permission;
    private int isDelete;
    //fenzhi shang jingx l xiu gai
}
