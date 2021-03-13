// Generated from .\Gramatica.g4 by ANTLR 4.9.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribution}
	 * labeled alternative in {@link GramaticaParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(GramaticaParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribution}
	 * labeled alternative in {@link GramaticaParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(GramaticaParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleOperation}
	 * labeled alternative in {@link GramaticaParser#conta}.
	 * @param ctx the parse tree
	 */
	void enterSingleOperation(GramaticaParser.SingleOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleOperation}
	 * labeled alternative in {@link GramaticaParser#conta}.
	 * @param ctx the parse tree
	 */
	void exitSingleOperation(GramaticaParser.SingleOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexOperation}
	 * labeled alternative in {@link GramaticaParser#conta}.
	 * @param ctx the parse tree
	 */
	void enterComplexOperation(GramaticaParser.ComplexOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexOperation}
	 * labeled alternative in {@link GramaticaParser#conta}.
	 * @param ctx the parse tree
	 */
	void exitComplexOperation(GramaticaParser.ComplexOperationContext ctx);
}