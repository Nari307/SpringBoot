package com.example.Department.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DepartmentDto {
    private Long id;
    private String name;
    private String location;

}
