package praxis.homepractice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Human {

    private Integer id;
    private String name;
    private String surname;
    private String gender;
    private Date birthOfDate;
    private Human mother;
    private Human father;


}
