public class GraphParser extends Parser {
    private SymbolTable symbolTable = new SymbolTable();

    public GraphParser(TokenStream input) {
        super(input);
    }


    public final void node_stmt() throws RecognitionException {
        Token idToken = null;
        Token labelToken = null;

        try {
            idToken = match(ID);
            match(NODO_LABEL);
            labelToken = _input.LT(1);

            String nodeName = idToken.getText();
            String labelValue = labelToken.getText().substring(7, labelToken.getText().length() - 1);

            symbolTable.addSymbol(nodeName, "nodo", labelValue);
        } catch (RecognitionException re) {

        }
    }

    public void printSymbolTable() {
        for (String symbolName : symbolTable.getAllSymbolNames()) {
            SymbolEntry entry = symbolTable.getSymbol(symbolName);
            System.out.println("Nombre: " + symbolName + ", Tipo: " + entry.getType() + ", Valor: " + entry.getValue());
        }
    }
}
