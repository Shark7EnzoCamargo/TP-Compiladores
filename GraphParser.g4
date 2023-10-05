
grammar GraphParser;

options {
  tokenVocab = GraphLexer;
}

graph : 'digraph' ID '{' stmt_list '}';

stmt_list : (stmt SEMI_COLON)*;

stmt : node_stmt
     | edge_stmt;

node_stmt : ID NODO_LABEL;

edge_stmt : ID ARROW ID;

ID : [a-zA-Z][a-zA-Z0-9_]*;

OTHER : . -> skip;
