import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, SymbolEntry> symbolMap = new HashMap<>();

    public void addSymbol(String name, String type, String value) {
        SymbolEntry entry = new SymbolEntry(type, value);
        symbolMap.put(name, entry);
    }

    public SymbolEntry getSymbol(String name) {
        return symbolMap.get(name);
    }

    public boolean containsSymbol(String name) {
        return symbolMap.containsKey(name);
    }
}
