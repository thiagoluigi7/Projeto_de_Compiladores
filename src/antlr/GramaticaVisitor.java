// Generated from .\Gramatica.g4 by ANTLR 4.9.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribution}
	 * labeled alternative in {@link GramaticaParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribution(GramaticaParser.AttributionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleOperation}
	 * labeled alternative in {@link GramaticaParser#conta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleOperation(GramaticaParser.SingleOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexOperation}
	 * labeled alternative in {@link GramaticaParser#conta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexOperation(GramaticaParser.ComplexOperationContext ctx);
}