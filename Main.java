import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        GraphLexer lexer = new GraphLexer(CharStreams.fromFileName("grafo.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GraphParser parser = new GraphParser(tokens);
        ParseTree tree = parser.graph();
        System.out.println(tree.toStringTree(parser));
        lexer.getInputStream().close();
    }
}

