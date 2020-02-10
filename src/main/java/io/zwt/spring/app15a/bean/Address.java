package io.zwt.spring.app15a.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Address {
  private String line1;
    private String line2;
    private String city;
    private String state;
    private String zipCode;
    private String country;

}
