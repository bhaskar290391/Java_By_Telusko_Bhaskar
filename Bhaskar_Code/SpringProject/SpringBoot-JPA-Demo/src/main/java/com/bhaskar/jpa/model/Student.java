package com.bhaskar.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name="Student_Data")
public class Student {

    @Id
    private int studentId;
    private String studentName;
    private int studentMarks;

}
