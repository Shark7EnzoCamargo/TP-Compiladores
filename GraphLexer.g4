grammar GraphLexer;

DOT : 'digraph' | 'graph';
ID : [a-zA-Z_][a-zA-Z_0-9]*;
INT : [0-9]+;
WS : [ \t\r\n]+ -> skip;

graph : DOT ID '{' stmt_list '}';
stmt_list : stmt (';' stmt)*;
stmt : node_stmt | edge_stmt | attr_stmt;

node_stmt : node_id '=' ID '[' attr_list? ']';
edge_stmt : node_id edgeRHS attr_list?;
edgeRHS : '->' node_id edgeRHS?;
node_id : ID;

attr_stmt : 'graph' attr_list | 'node' attr_list | 'edge' attr_list;

attr_list : '[' a_list? ']';
a_list : ID '=' ID (',' ID '=' ID)*;

node : node_id | string;
string : '"' ~'"'* '"';

