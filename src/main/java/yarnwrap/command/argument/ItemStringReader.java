package yarnwrap.command.argument;
public class ItemStringReader { public net.minecraft.command.argument.ItemStringReader wrapperContained; public ItemStringReader(net.minecraft.command.argument.ItemStringReader wrapperContained) { this.wrapperContained = wrapperContained; }

// public char OPEN_SQUARE_BRACKET() { return wrapperContained.OPEN_SQUARE_BRACKET; }
// public void OPEN_SQUARE_BRACKET(char value) { wrapperContained.OPEN_SQUARE_BRACKET = value; }
public static char OPEN_SQUARE_BRACKET() { return net.minecraft.command.argument.ItemStringReader.OPEN_SQUARE_BRACKET; }
// public static void OPEN_SQUARE_BRACKET(char value, ) { net.minecraft.command.argument.ItemStringReader.OPEN_SQUARE_BRACKET = value; }

// public char CLOSED_SQUARE_BRACKET() { return wrapperContained.CLOSED_SQUARE_BRACKET; }
// public void CLOSED_SQUARE_BRACKET(char value) { wrapperContained.CLOSED_SQUARE_BRACKET = value; }
public static char CLOSED_SQUARE_BRACKET() { return net.minecraft.command.argument.ItemStringReader.CLOSED_SQUARE_BRACKET; }
// public static void CLOSED_SQUARE_BRACKET(char value, ) { net.minecraft.command.argument.ItemStringReader.CLOSED_SQUARE_BRACKET = value; }

// public char COMMA() { return wrapperContained.COMMA; }
// public void COMMA(char value) { wrapperContained.COMMA = value; }
public static char COMMA() { return net.minecraft.command.argument.ItemStringReader.COMMA; }
// public static void COMMA(char value, ) { net.minecraft.command.argument.ItemStringReader.COMMA = value; }

// public char EQUAL_SIGN() { return wrapperContained.EQUAL_SIGN; }
// public void EQUAL_SIGN(char value) { wrapperContained.EQUAL_SIGN = value; }
public static char EQUAL_SIGN() { return net.minecraft.command.argument.ItemStringReader.EQUAL_SIGN; }
// public static void EQUAL_SIGN(char value, ) { net.minecraft.command.argument.ItemStringReader.EQUAL_SIGN = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ITEM_ID_EXCEPTION() { return wrapperContained.INVALID_ITEM_ID_EXCEPTION; }
// public void INVALID_ITEM_ID_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_ITEM_ID_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ITEM_ID_EXCEPTION() { return net.minecraft.command.argument.ItemStringReader.INVALID_ITEM_ID_EXCEPTION; }
// public static void INVALID_ITEM_ID_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.ItemStringReader.INVALID_ITEM_ID_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_COMPONENT_EXCEPTION() { return wrapperContained.UNKNOWN_COMPONENT_EXCEPTION; }
// public void UNKNOWN_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_COMPONENT_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_COMPONENT_EXCEPTION() { return net.minecraft.command.argument.ItemStringReader.UNKNOWN_COMPONENT_EXCEPTION; }
// public static void UNKNOWN_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.ItemStringReader.UNKNOWN_COMPONENT_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType MALFORMED_COMPONENT_EXCEPTION() { return wrapperContained.MALFORMED_COMPONENT_EXCEPTION; }
// public void MALFORMED_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.MALFORMED_COMPONENT_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType MALFORMED_COMPONENT_EXCEPTION() { return net.minecraft.command.argument.ItemStringReader.MALFORMED_COMPONENT_EXCEPTION; }
// public static void MALFORMED_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.command.argument.ItemStringReader.MALFORMED_COMPONENT_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType COMPONENT_EXPECTED_EXCEPTION() { return wrapperContained.COMPONENT_EXPECTED_EXCEPTION; }
// public void COMPONENT_EXPECTED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.COMPONENT_EXPECTED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType COMPONENT_EXPECTED_EXCEPTION() { return net.minecraft.command.argument.ItemStringReader.COMPONENT_EXPECTED_EXCEPTION; }
// public static void COMPONENT_EXPECTED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.ItemStringReader.COMPONENT_EXPECTED_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType REPEATED_COMPONENT_EXCEPTION() { return wrapperContained.REPEATED_COMPONENT_EXCEPTION; }
// public void REPEATED_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.REPEATED_COMPONENT_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType REPEATED_COMPONENT_EXCEPTION() { return net.minecraft.command.argument.ItemStringReader.REPEATED_COMPONENT_EXCEPTION; }
// public static void REPEATED_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.ItemStringReader.REPEATED_COMPONENT_EXCEPTION = value; }

// public java.util.function.Function SUGGEST_DEFAULT() { return wrapperContained.SUGGEST_DEFAULT; }
// public void SUGGEST_DEFAULT(java.util.function.Function value) { wrapperContained.SUGGEST_DEFAULT = value; }
// public static java.util.function.Function SUGGEST_DEFAULT() { return net.minecraft.command.argument.ItemStringReader.SUGGEST_DEFAULT; }
// public static void SUGGEST_DEFAULT(java.util.function.Function value, ) { net.minecraft.command.argument.ItemStringReader.SUGGEST_DEFAULT = value; }

// public Object itemRegistry() { return wrapperContained.itemRegistry; }
// // public void itemRegistry(Object value) { wrapperContained.itemRegistry = value; }
// // public static Object itemRegistry() { return net.minecraft.command.argument.ItemStringReader.itemRegistry; }
// // public static void itemRegistry(Object value, ) { net.minecraft.command.argument.ItemStringReader.itemRegistry = value; }

// public yarnwrap.registry.RegistryOps ops() { return new yarnwrap.registry.RegistryOps(wrapperContained.ops); }
// public void ops(yarnwrap.registry.RegistryOps value) { wrapperContained.ops = value.wrapperContained; }
// public static yarnwrap.registry.RegistryOps ops() { return new yarnwrap.registry.RegistryOps(net.minecraft.command.argument.ItemStringReader.ops); }
// public static void ops(yarnwrap.registry.RegistryOps value, ) { net.minecraft.command.argument.ItemStringReader.ops = value.wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType MALFORMED_ITEM_EXCEPTION() { return wrapperContained.MALFORMED_ITEM_EXCEPTION; }
// public void MALFORMED_ITEM_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.MALFORMED_ITEM_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType MALFORMED_ITEM_EXCEPTION() { return net.minecraft.command.argument.ItemStringReader.MALFORMED_ITEM_EXCEPTION; }
// public static void MALFORMED_ITEM_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.ItemStringReader.MALFORMED_ITEM_EXCEPTION = value; }

// public char EXCLAMATION_MARK() { return wrapperContained.EXCLAMATION_MARK; }
// public void EXCLAMATION_MARK(char value) { wrapperContained.EXCLAMATION_MARK = value; }
public static char EXCLAMATION_MARK() { return net.minecraft.command.argument.ItemStringReader.EXCLAMATION_MARK; }
// public static void EXCLAMATION_MARK(char value, ) { net.minecraft.command.argument.ItemStringReader.EXCLAMATION_MARK = value; }

// public yarnwrap.nbt.StringNbtReader snbtReader() { return new yarnwrap.nbt.StringNbtReader(wrapperContained.snbtReader); }
// public void snbtReader(yarnwrap.nbt.StringNbtReader value) { wrapperContained.snbtReader = value.wrapperContained; }
// public static yarnwrap.nbt.StringNbtReader snbtReader() { return new yarnwrap.nbt.StringNbtReader(net.minecraft.command.argument.ItemStringReader.snbtReader); }
// public static void snbtReader(yarnwrap.nbt.StringNbtReader value, ) { net.minecraft.command.argument.ItemStringReader.snbtReader = value.wrapperContained; }

// public ItemStringReader(Object registries) { this.wrapperContained = new net.minecraft.command.argument.ItemStringReader(registries); }
// public Object consume(com.mojang.brigadier.StringReader reader) { return wrapperContained.consume(reader); }
// public static Object consume(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.ItemStringReader.consume(reader); }
public java.util.concurrent.CompletableFuture getSuggestions(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.getSuggestions(builder); }
// public static java.util.concurrent.CompletableFuture getSuggestions(com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.ItemStringReader.getSuggestions(builder); }
// // public void consume(com.mojang.brigadier.StringReader reader,Object callbacks) { wrapperContained.consume(reader,callbacks); }
// public static void consume(com.mojang.brigadier.StringReader reader,Object callbacks, ) { net.minecraft.command.argument.ItemStringReader.consume(reader,callbacks); }
// public com.mojang.brigadier.Message method_58518(java.lang.Object type) { return wrapperContained.method_58518(type); }
// public static com.mojang.brigadier.Message method_58518(java.lang.Object type, ) { return net.minecraft.command.argument.ItemStringReader.method_58518(type); }
// public com.mojang.brigadier.Message method_58519(java.lang.Object type,java.lang.Object error) { return wrapperContained.method_58519(type,error); }
// public static com.mojang.brigadier.Message method_58519(java.lang.Object type,java.lang.Object error, ) { return net.minecraft.command.argument.ItemStringReader.method_58519(type,error); }
// public com.mojang.brigadier.Message method_58520(java.lang.Object id) { return wrapperContained.method_58520(id); }
// public static com.mojang.brigadier.Message method_58520(java.lang.Object id, ) { return net.minecraft.command.argument.ItemStringReader.method_58520(id); }
// public com.mojang.brigadier.Message method_58521(java.lang.Object id) { return wrapperContained.method_58521(id); }
// public static com.mojang.brigadier.Message method_58521(java.lang.Object id, ) { return net.minecraft.command.argument.ItemStringReader.method_58521(id); }
// public com.mojang.brigadier.exceptions.CommandSyntaxException method_59768(com.mojang.brigadier.StringReader error) { return wrapperContained.method_59768(error); }
// public static com.mojang.brigadier.exceptions.CommandSyntaxException method_59768(com.mojang.brigadier.StringReader error, ) { return net.minecraft.command.argument.ItemStringReader.method_59768(error); }
// public void validate(com.mojang.brigadier.StringReader reader,yarnwrap.registry.entry.RegistryEntry item,yarnwrap.component.ComponentChanges components) { wrapperContained.validate(reader,item.wrapperContained,components.wrapperContained); }
// public static void validate(com.mojang.brigadier.StringReader reader,yarnwrap.registry.entry.RegistryEntry item,yarnwrap.component.ComponentChanges components, ) { net.minecraft.command.argument.ItemStringReader.validate(reader,item.wrapperContained,components.wrapperContained); }
// public com.mojang.brigadier.Message method_59770(java.lang.Object error) { return wrapperContained.method_59770(error); }
// public static com.mojang.brigadier.Message method_59770(java.lang.Object error, ) { return net.minecraft.command.argument.ItemStringReader.method_59770(error); }

}