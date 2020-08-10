package chess;

import tabuleiro.TabuleiroException;

public class ChessException extends TabuleiroException {
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
