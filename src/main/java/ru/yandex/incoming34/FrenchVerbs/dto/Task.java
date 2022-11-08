package ru.yandex.incoming34.FrenchVerbs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class Task {

    private final String infinitive;
    private final String grammaticalPerson;
    private final String correctAnswer;
}
