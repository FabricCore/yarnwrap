package yarnwrap.nbt.visitor;
public class NbtOrderedStringFormatter { public net.minecraft.nbt.visitor.NbtOrderedStringFormatter wrapperContained; public NbtOrderedStringFormatter(net.minecraft.nbt.visitor.NbtOrderedStringFormatter wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map ENTRY_ORDER_OVERRIDES() { return wrapperContained.ENTRY_ORDER_OVERRIDES; }
// public java.util.Set IGNORED_PATHS() { return wrapperContained.IGNORED_PATHS; }
// public java.util.regex.Pattern SIMPLE_NAME() { return wrapperContained.SIMPLE_NAME; }
// public java.lang.String KEY_VALUE_SEPARATOR() { return wrapperContained.KEY_VALUE_SEPARATOR; }
// public java.lang.String ENTRY_SEPARATOR() { return wrapperContained.ENTRY_SEPARATOR; }
// public java.lang.String prefix() { return wrapperContained.prefix; }
// public int indentationLevel() { return wrapperContained.indentationLevel; }
// public java.util.List pathParts() { return wrapperContained.pathParts; }
// public java.lang.String result() { return wrapperContained.result; }
// public java.lang.String SQUARE_OPEN_BRACKET() { return wrapperContained.SQUARE_OPEN_BRACKET; }
// public java.lang.String SQUARE_CLOSE_BRACKET() { return wrapperContained.SQUARE_CLOSE_BRACKET; }
// public java.lang.String SEMICOLON() { return wrapperContained.SEMICOLON; }
// public java.lang.String SPACE() { return wrapperContained.SPACE; }
// public java.lang.String CURLY_OPEN_BRACKET() { return wrapperContained.CURLY_OPEN_BRACKET; }
// public java.lang.String CURLY_CLOSE_BRACKET() { return wrapperContained.CURLY_CLOSE_BRACKET; }
// public java.lang.String NEW_LINE() { return wrapperContained.NEW_LINE; }
public java.lang.String joinPath() { return wrapperContained.joinPath(); }
// public java.lang.String escapeName(java.lang.String name) { return wrapperContained.escapeName(name); }
public java.lang.String apply(yarnwrap.nbt.NbtElement element) { return wrapperContained.apply(element.wrapperContained); }
// public void popPathPart() { wrapperContained.popPathPart(); }
// public void pushPathPart(java.lang.String part) { wrapperContained.pushPathPart(part); }
// public java.util.List getSortedNames(yarnwrap.nbt.NbtCompound compound) { return wrapperContained.getSortedNames(compound.wrapperContained); }

}