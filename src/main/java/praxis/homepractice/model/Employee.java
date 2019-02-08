package praxis.homepractice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String department;


}
