package yarnwrap.command.argument;
public class ItemStringReader { public net.minecraft.command.argument.ItemStringReader wrapperContained; public ItemStringReader(net.minecraft.command.argument.ItemStringReader wrapperContained) { this.wrapperContained = wrapperContained; }

public char OPEN_SQUARE_BRACKET() { return wrapperContained.OPEN_SQUARE_BRACKET; }
// public void OPEN_SQUARE_BRACKET(char value) { wrapperContained.OPEN_SQUARE_BRACKET = value; }
public char CLOSED_SQUARE_BRACKET() { return wrapperContained.CLOSED_SQUARE_BRACKET; }
// public void CLOSED_SQUARE_BRACKET(char value) { wrapperContained.CLOSED_SQUARE_BRACKET = value; }
public char COMMA() { return wrapperContained.COMMA; }
// public void COMMA(char value) { wrapperContained.COMMA = value; }
public char EQUAL_SIGN() { return wrapperContained.EQUAL_SIGN; }
// public void EQUAL_SIGN(char value) { wrapperContained.EQUAL_SIGN = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ITEM_ID_EXCEPTION() { return wrapperContained.INVALID_ITEM_ID_EXCEPTION; }
// public void INVALID_ITEM_ID_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_ITEM_ID_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_COMPONENT_EXCEPTION() { return wrapperContained.UNKNOWN_COMPONENT_EXCEPTION; }
// public void UNKNOWN_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_COMPONENT_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType MALFORMED_COMPONENT_EXCEPTION() { return wrapperContained.MALFORMED_COMPONENT_EXCEPTION; }
// public void MALFORMED_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.MALFORMED_COMPONENT_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType COMPONENT_EXPECTED_EXCEPTION() { return wrapperContained.COMPONENT_EXPECTED_EXCEPTION; }
// public void COMPONENT_EXPECTED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.COMPONENT_EXPECTED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType REPEATED_COMPONENT_EXCEPTION() { return wrapperContained.REPEATED_COMPONENT_EXCEPTION; }
// public void REPEATED_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.REPEATED_COMPONENT_EXCEPTION = value; }
// public java.util.function.Function SUGGEST_DEFAULT() { return wrapperContained.SUGGEST_DEFAULT; }
// public void SUGGEST_DEFAULT(java.util.function.Function value) { wrapperContained.SUGGEST_DEFAULT = value; }
// public Object itemRegistry() { return wrapperContained.itemRegistry; }
// // public void itemRegistry(Object value) { wrapperContained.itemRegistry = value; }
// public com.mojang.serialization.DynamicOps nbtOps() { return wrapperContained.nbtOps; }
// public void nbtOps(com.mojang.serialization.DynamicOps value) { wrapperContained.nbtOps = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType MALFORMED_ITEM_EXCEPTION() { return wrapperContained.MALFORMED_ITEM_EXCEPTION; }
// public void MALFORMED_ITEM_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.MALFORMED_ITEM_EXCEPTION = value; }
public char EXCLAMATION_MARK() { return wrapperContained.EXCLAMATION_MARK; }
// public void EXCLAMATION_MARK(char value) { wrapperContained.EXCLAMATION_MARK = value; }
// public void consume(com.mojang.brigadier.StringReader reader,Object callbacks) { wrapperContained.consume(reader,callbacks); }
// public void validate(com.mojang.brigadier.StringReader reader,yarnwrap.registry.entry.RegistryEntry item,yarnwrap.component.ComponentChanges components) { wrapperContained.validate(reader,item.wrapperContained,components.wrapperContained); }
// public Object consume(com.mojang.brigadier.StringReader reader) { return wrapperContained.consume(reader); }
public java.util.concurrent.CompletableFuture getSuggestions(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.getSuggestions(builder); }

}