// Generated from GraphParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphParserParser}.
 */
public interface GraphParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphParserParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(GraphParserParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParserParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(GraphParserParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParserParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(GraphParserParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParserParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(GraphParserParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GraphParserParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GraphParserParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParserParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNode_stmt(GraphParserParser.Node_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParserParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNode_stmt(GraphParserParser.Node_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParserParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEdge_stmt(GraphParserParser.Edge_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParserParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEdge_stmt(GraphParserParser.Edge_stmtContext ctx);
}