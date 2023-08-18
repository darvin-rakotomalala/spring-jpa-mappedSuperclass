package com.poc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tutorials")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tutorial extends BaseDO {
    private String title;
    private String description;
    private int level;
    private boolean published;
}
