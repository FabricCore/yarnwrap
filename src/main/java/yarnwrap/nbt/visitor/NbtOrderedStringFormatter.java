package yarnwrap.nbt.visitor;
public class NbtOrderedStringFormatter { public net.minecraft.nbt.visitor.NbtOrderedStringFormatter wrapperContained; public NbtOrderedStringFormatter(net.minecraft.nbt.visitor.NbtOrderedStringFormatter wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map ENTRY_ORDER_OVERRIDES() { return wrapperContained.ENTRY_ORDER_OVERRIDES; }
// public void ENTRY_ORDER_OVERRIDES(java.util.Map value) { wrapperContained.ENTRY_ORDER_OVERRIDES = value; }
// public java.util.Set IGNORED_PATHS() { return wrapperContained.IGNORED_PATHS; }
// public void IGNORED_PATHS(java.util.Set value) { wrapperContained.IGNORED_PATHS = value; }
// public java.util.regex.Pattern SIMPLE_NAME() { return wrapperContained.SIMPLE_NAME; }
// public void SIMPLE_NAME(java.util.regex.Pattern value) { wrapperContained.SIMPLE_NAME = value; }
// public java.lang.String KEY_VALUE_SEPARATOR() { return wrapperContained.KEY_VALUE_SEPARATOR; }
// public void KEY_VALUE_SEPARATOR(java.lang.String value) { wrapperContained.KEY_VALUE_SEPARATOR = value; }
// public java.lang.String ENTRY_SEPARATOR() { return wrapperContained.ENTRY_SEPARATOR; }
// public void ENTRY_SEPARATOR(java.lang.String value) { wrapperContained.ENTRY_SEPARATOR = value; }
// public java.lang.String prefix() { return wrapperContained.prefix; }
// public void prefix(java.lang.String value) { wrapperContained.prefix = value; }
// public int indentationLevel() { return wrapperContained.indentationLevel; }
// public void indentationLevel(int value) { wrapperContained.indentationLevel = value; }
// public java.util.List pathParts() { return wrapperContained.pathParts; }
// public void pathParts(java.util.List value) { wrapperContained.pathParts = value; }
// public java.lang.String result() { return wrapperContained.result; }
// public void result(java.lang.String value) { wrapperContained.result = value; }
// public java.lang.String SQUARE_OPEN_BRACKET() { return wrapperContained.SQUARE_OPEN_BRACKET; }
// public void SQUARE_OPEN_BRACKET(java.lang.String value) { wrapperContained.SQUARE_OPEN_BRACKET = value; }
// public java.lang.String SQUARE_CLOSE_BRACKET() { return wrapperContained.SQUARE_CLOSE_BRACKET; }
// public void SQUARE_CLOSE_BRACKET(java.lang.String value) { wrapperContained.SQUARE_CLOSE_BRACKET = value; }
// public java.lang.String SEMICOLON() { return wrapperContained.SEMICOLON; }
// public void SEMICOLON(java.lang.String value) { wrapperContained.SEMICOLON = value; }
// public java.lang.String SPACE() { return wrapperContained.SPACE; }
// public void SPACE(java.lang.String value) { wrapperContained.SPACE = value; }
// public java.lang.String CURLY_OPEN_BRACKET() { return wrapperContained.CURLY_OPEN_BRACKET; }
// public void CURLY_OPEN_BRACKET(java.lang.String value) { wrapperContained.CURLY_OPEN_BRACKET = value; }
// public java.lang.String CURLY_CLOSE_BRACKET() { return wrapperContained.CURLY_CLOSE_BRACKET; }
// public void CURLY_CLOSE_BRACKET(java.lang.String value) { wrapperContained.CURLY_CLOSE_BRACKET = value; }
// public java.lang.String NEW_LINE() { return wrapperContained.NEW_LINE; }
// public void NEW_LINE(java.lang.String value) { wrapperContained.NEW_LINE = value; }
public NbtOrderedStringFormatter(java.lang.String prefix,int indentationLevel,java.util.List pathParts) { this.wrapperContained = new net.minecraft.nbt.visitor.NbtOrderedStringFormatter(prefix,indentationLevel,pathParts); }
public java.lang.String joinPath() { return wrapperContained.joinPath(); }
// public java.lang.String escapeName(java.lang.String name) { return wrapperContained.escapeName(name); }
// public void method_32282(java.util.HashMap map) { wrapperContained.method_32282(map); }
public java.lang.String apply(yarnwrap.nbt.NbtElement element) { return wrapperContained.apply(element.wrapperContained); }
// public void popPathPart() { wrapperContained.popPathPart(); }
// public void pushPathPart(java.lang.String part) { wrapperContained.pushPathPart(part); }
// public java.util.List getSortedNames(yarnwrap.nbt.NbtCompound compound) { return wrapperContained.getSortedNames(compound.wrapperContained); }

}