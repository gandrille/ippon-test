package me.gandrille.ippon.balls;

public enum ColorBall {
	RED('R'), GREEN('G'), BLUE('B');

	private char symbol;

	private ColorBall(char symbol) {
		this.symbol = symbol;
	}

	public static ColorBall fromSymbol(String symbol) {
		if (symbol.length() != 1)
			throw new RuntimeException(symbol + " must be one caracter long");
		return fromSymbol(symbol.charAt(0));
	}

	public static ColorBall fromSymbol(char symbol) {
		for (ColorBall cb : ColorBall.values()) {
			if (cb.symbol == symbol)
				return cb;
		}
		throw new RuntimeException(String.valueOf(symbol) + " is not a valid symbol");
	}
}
