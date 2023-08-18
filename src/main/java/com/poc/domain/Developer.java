package com.poc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "developers")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Developer extends BaseDO {
    private String fullName;
    private String position;
    private int yearExperience;
}
