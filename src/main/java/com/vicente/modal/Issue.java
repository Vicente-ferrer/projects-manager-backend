package com.vicente.modal;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private User assignee;
}
