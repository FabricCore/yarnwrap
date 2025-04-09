package yarnwrap.command.argument;
public class ItemStringReader { public net.minecraft.command.argument.ItemStringReader wrapperContained; public ItemStringReader(net.minecraft.command.argument.ItemStringReader wrapperContained) { this.wrapperContained = wrapperContained; }

public char OPEN_SQUARE_BRACKET() { return wrapperContained.OPEN_SQUARE_BRACKET; }
public char CLOSED_SQUARE_BRACKET() { return wrapperContained.CLOSED_SQUARE_BRACKET; }
public char COMMA() { return wrapperContained.COMMA; }
public char EQUAL_SIGN() { return wrapperContained.EQUAL_SIGN; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ITEM_ID_EXCEPTION() { return wrapperContained.INVALID_ITEM_ID_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_COMPONENT_EXCEPTION() { return wrapperContained.UNKNOWN_COMPONENT_EXCEPTION; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType MALFORMED_COMPONENT_EXCEPTION() { return wrapperContained.MALFORMED_COMPONENT_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType COMPONENT_EXPECTED_EXCEPTION() { return wrapperContained.COMPONENT_EXPECTED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType REPEATED_COMPONENT_EXCEPTION() { return wrapperContained.REPEATED_COMPONENT_EXCEPTION; }
// public java.util.function.Function SUGGEST_DEFAULT() { return wrapperContained.SUGGEST_DEFAULT; }
// public Object itemRegistry() { return wrapperContained.itemRegistry; }
// public com.mojang.serialization.DynamicOps nbtOps() { return wrapperContained.nbtOps; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType MALFORMED_ITEM_EXCEPTION() { return wrapperContained.MALFORMED_ITEM_EXCEPTION; }
public char EXCLAMATION_MARK() { return wrapperContained.EXCLAMATION_MARK; }
// public void consume(com.mojang.brigadier.StringReader reader,Object callbacks) { wrapperContained.consume(reader,callbacks); }
// public void validate(com.mojang.brigadier.StringReader reader,yarnwrap.registry.entry.RegistryEntry item,yarnwrap.component.ComponentChanges components) { wrapperContained.validate(reader,item.wrapperContained,components.wrapperContained); }
// public Object consume(com.mojang.brigadier.StringReader reader) { return wrapperContained.consume(reader); }
public java.util.concurrent.CompletableFuture getSuggestions(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.getSuggestions(builder); }

}