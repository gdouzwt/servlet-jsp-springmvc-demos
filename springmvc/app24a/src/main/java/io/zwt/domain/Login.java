package io.zwt.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Login implements Serializable {
    private static final long serialVersionUID = -38L;

    private String userName;
    private String password;

}
