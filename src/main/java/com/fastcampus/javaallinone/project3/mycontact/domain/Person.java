package com.fastcampus.javaallinone.project3.mycontact.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
//@Getter
//@Setter
//@ToString
@NoArgsConstructor
@RequiredArgsConstructor
//@EqualsAndHashCode
@Data
public class Person {
    @Id
    @GeneratedValue //default 자동 생성
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private int age;

    private String hobby;

    private String bloodType;

    private String address;

    private LocalDate birthday;

    private String job;

    @ToString.Exclude
    private String phoneNumber;


}
