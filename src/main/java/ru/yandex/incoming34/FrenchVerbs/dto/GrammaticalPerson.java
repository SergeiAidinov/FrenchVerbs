package ru.yandex.incoming34.FrenchVerbs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class GrammaticalPerson {

	private final static String _JE = "je";
	private final static String _TU = "tu";
	private final static String _IL = "il";
	private final static String _ELLE = "elle";
	private final static String _NOUS = "nous";
	private final static String _VOUS = "vous";
	private final static String _ILS = "ils";
	private final static String _ELLES = "elles";

	@AllArgsConstructor
	@Getter
	public enum grammaticalPerson {
		JE(_JE), TU(_TU), IL(_IL), ELLE(_ELLE), NOUS(_NOUS), VOUS(_VOUS), ILS(_ILS), ELLES(_ELLES);

		private final String pronoun;
	}

}
