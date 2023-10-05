// Generated from GraphLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphLexerParser}.
 */
public interface GraphLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(GraphLexerParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(GraphLexerParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(GraphLexerParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(GraphLexerParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GraphLexerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GraphLexerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNode_stmt(GraphLexerParser.Node_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNode_stmt(GraphLexerParser.Node_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEdge_stmt(GraphLexerParser.Edge_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEdge_stmt(GraphLexerParser.Edge_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void enterEdgeRHS(GraphLexerParser.EdgeRHSContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void exitEdgeRHS(GraphLexerParser.EdgeRHSContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#node_id}.
	 * @param ctx the parse tree
	 */
	void enterNode_id(GraphLexerParser.Node_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#node_id}.
	 * @param ctx the parse tree
	 */
	void exitNode_id(GraphLexerParser.Node_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttr_stmt(GraphLexerParser.Attr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttr_stmt(GraphLexerParser.Attr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void enterAttr_list(GraphLexerParser.Attr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void exitAttr_list(GraphLexerParser.Attr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#a_list}.
	 * @param ctx the parse tree
	 */
	void enterA_list(GraphLexerParser.A_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#a_list}.
	 * @param ctx the parse tree
	 */
	void exitA_list(GraphLexerParser.A_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(GraphLexerParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(GraphLexerParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphLexerParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(GraphLexerParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphLexerParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(GraphLexerParser.StringContext ctx);
}