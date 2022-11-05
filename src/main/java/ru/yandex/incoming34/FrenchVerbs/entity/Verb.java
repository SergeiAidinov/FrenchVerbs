package ru.yandex.incoming34.FrenchVerbs.entity;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Entity
public class Verb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "verb_id", nullable = false)
    private UUID verb_id;

    private String infinitive;
    private String je;
    private String tu;
    private String il;
    private String elle;
    private String nous;
    private String vous;
    private String ils;
    private String elles;

}
