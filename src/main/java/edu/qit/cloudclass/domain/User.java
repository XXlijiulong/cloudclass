package edu.qit.cloudclass.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author nic
 * @version 1.0
 */
@Data
public class User {
    public static final int STUDENT_IDENTITY = 0;
    public static final int TEACHER_IDENTITY = 1;

    public static final String NAME = "name";
    public static final String EMAIL = "email";

    @JsonIgnore
    private String id;

    private String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @JsonIgnore
    private Date createTime;

    private int identity;

    private String email;

    @JsonIgnore
    private String taken;
}
