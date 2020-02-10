package io.zwt.spring.app23a.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Employee  implements Serializable {
    private static final long serialVersionUID = -908L;

	private long id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private int salaryLevel;
}
