package project.structural.proxy;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@EqualsAndHashCode
@Getter
public class Employee {

    private int id;
    private String name;
    private String designation;
}
