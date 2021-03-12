// Generated from .\Gramatica.g4 by ANTLR 4.9.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Programa}
	 * labeled alternative in {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Programa}
	 * labeled alternative in {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link GramaticaParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link GramaticaParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operacao}
	 * labeled alternative in {@link GramaticaParser#conta}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(GramaticaParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operacao}
	 * labeled alternative in {@link GramaticaParser#conta}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(GramaticaParser.OperacaoContext ctx);
}