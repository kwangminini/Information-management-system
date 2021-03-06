package com.fastcampus.javaallinone.project3.mycontact.domain;

import lombok.*;

import javax.persistence.*;
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
    @NonNull
    private String bloodType;

    private String address;

    private LocalDate birthday;

    private String job;

    @ToString.Exclude
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    //relation
    @ToString.Exclude
    private Block block;

}
