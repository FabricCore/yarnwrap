package yarnwrap.command.argument;
public class RegistryEntryArgumentType { public net.minecraft.command.argument.RegistryEntryArgumentType wrapperContained; public RegistryEntryArgumentType(net.minecraft.command.argument.RegistryEntryArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_TO_PARSE_EXCEPTION() { return wrapperContained.FAILED_TO_PARSE_EXCEPTION; }
// public void FAILED_TO_PARSE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.FAILED_TO_PARSE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_TO_PARSE_EXCEPTION() { return net.minecraft.command.argument.RegistryEntryArgumentType.FAILED_TO_PARSE_EXCEPTION; }
// public static void FAILED_TO_PARSE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.FAILED_TO_PARSE_EXCEPTION = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.RegistryEntryArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.EXAMPLES = value; }

// public Object registries() { return wrapperContained.registries; }
// // public void registries(Object value) { wrapperContained.registries = value; }
// // public static Object registries() { return net.minecraft.command.argument.RegistryEntryArgumentType.registries; }
// // public static void registries(Object value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.registries = value; }

// public com.mojang.serialization.Codec entryCodec() { return wrapperContained.entryCodec; }
// public void entryCodec(com.mojang.serialization.Codec value) { wrapperContained.entryCodec = value; }
// public static com.mojang.serialization.Codec entryCodec() { return net.minecraft.command.argument.RegistryEntryArgumentType.entryCodec; }
// public static void entryCodec(com.mojang.serialization.Codec value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.entryCodec = value; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NO_SUCH_ELEMENT_EXCEPTION() { return wrapperContained.NO_SUCH_ELEMENT_EXCEPTION; }
// public void NO_SUCH_ELEMENT_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.NO_SUCH_ELEMENT_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NO_SUCH_ELEMENT_EXCEPTION() { return net.minecraft.command.argument.RegistryEntryArgumentType.NO_SUCH_ELEMENT_EXCEPTION; }
// public static void NO_SUCH_ELEMENT_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.NO_SUCH_ELEMENT_EXCEPTION = value; }

// public com.mojang.serialization.DynamicOps OPS() { return wrapperContained.OPS; }
// public void OPS(com.mojang.serialization.DynamicOps value) { wrapperContained.OPS = value; }
// public static com.mojang.serialization.DynamicOps OPS() { return net.minecraft.command.argument.RegistryEntryArgumentType.OPS; }
// public static void OPS(com.mojang.serialization.DynamicOps value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.OPS = value; }

// public java.util.Optional registry() { return wrapperContained.registry; }
// public void registry(java.util.Optional value) { wrapperContained.registry = value; }
// public static java.util.Optional registry() { return net.minecraft.command.argument.RegistryEntryArgumentType.registry; }
// public static void registry(java.util.Optional value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.registry = value; }

// public yarnwrap.util.packrat.PackratParser parser() { return new yarnwrap.util.packrat.PackratParser(wrapperContained.parser); }
// public void parser(yarnwrap.util.packrat.PackratParser value) { wrapperContained.parser = value.wrapperContained; }
// public static yarnwrap.util.packrat.PackratParser parser() { return new yarnwrap.util.packrat.PackratParser(net.minecraft.command.argument.RegistryEntryArgumentType.parser); }
// public static void parser(yarnwrap.util.packrat.PackratParser value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.parser = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(net.minecraft.command.argument.RegistryEntryArgumentType.registryRef); }
// public static void registryRef(yarnwrap.registry.RegistryKey value, ) { net.minecraft.command.argument.RegistryEntryArgumentType.registryRef = value.wrapperContained; }

// public RegistryEntryArgumentType(yarnwrap.command.CommandRegistryAccess registryAccess,yarnwrap.registry.RegistryKey registry,com.mojang.serialization.Codec entryCodec) { this.wrapperContained = new net.minecraft.command.argument.RegistryEntryArgumentType(registryAccess.wrapperContained,registry.wrapperContained,entryCodec); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder) { return wrapperContained.listSuggestions(context,suggestionsBuilder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.listSuggestions(context,suggestionsBuilder); }
// public yarnwrap.registry.entry.RegistryEntry getLootTable(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getLootTable(context,argument)); }
// public static yarnwrap.registry.entry.RegistryEntry getLootTable(com.mojang.brigadier.context.CommandContext context,java.lang.String argument, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.RegistryEntryArgumentType.getLootTable(context,argument)); }
// public Object lootTable(yarnwrap.command.CommandRegistryAccess registryAccess) { return wrapperContained.lootTable(registryAccess.wrapperContained); }
// public static Object lootTable(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.lootTable(registryAccess.wrapperContained); }
// public com.mojang.brigadier.Message method_58483(java.lang.Object argument) { return wrapperContained.method_58483(argument); }
// public static com.mojang.brigadier.Message method_58483(java.lang.Object argument, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.method_58483(argument); }
// public yarnwrap.registry.entry.RegistryEntry getLootFunction(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getLootFunction(context,argument)); }
// public static yarnwrap.registry.entry.RegistryEntry getLootFunction(com.mojang.brigadier.context.CommandContext context,java.lang.String argument, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.RegistryEntryArgumentType.getLootFunction(context,argument)); }
// public Object lootFunction(yarnwrap.command.CommandRegistryAccess registryAccess) { return wrapperContained.lootFunction(registryAccess.wrapperContained); }
// public static Object lootFunction(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.lootFunction(registryAccess.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry getLootCondition(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getLootCondition(context,argument)); }
// public static yarnwrap.registry.entry.RegistryEntry getLootCondition(com.mojang.brigadier.context.CommandContext context,java.lang.String argument, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.RegistryEntryArgumentType.getLootCondition(context,argument)); }
// public Object lootCondition(yarnwrap.command.CommandRegistryAccess registryAccess) { return wrapperContained.lootCondition(registryAccess.wrapperContained); }
// public static Object lootCondition(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.lootCondition(registryAccess.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry getArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getArgument(context,argument)); }
// public static yarnwrap.registry.entry.RegistryEntry getArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String argument, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.RegistryEntryArgumentType.getArgument(context,argument)); }
// public yarnwrap.registry.entry.RegistryEntry parse(com.mojang.brigadier.StringReader reader,yarnwrap.util.packrat.PackratParser parser,com.mojang.serialization.DynamicOps ops) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.parse(reader,parser.wrapperContained,ops)); }
// public static yarnwrap.registry.entry.RegistryEntry parse(com.mojang.brigadier.StringReader reader,yarnwrap.util.packrat.PackratParser parser,com.mojang.serialization.DynamicOps ops, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.RegistryEntryArgumentType.parse(reader,parser.wrapperContained,ops)); }
// public yarnwrap.util.packrat.PackratParser createParser(yarnwrap.registry.RegistryKey key,com.mojang.serialization.DynamicOps ops) { return new yarnwrap.util.packrat.PackratParser(wrapperContained.createParser(key.wrapperContained,ops)); }
// public static yarnwrap.util.packrat.PackratParser createParser(yarnwrap.registry.RegistryKey key,com.mojang.serialization.DynamicOps ops, ) { return new yarnwrap.util.packrat.PackratParser(net.minecraft.command.argument.RegistryEntryArgumentType.createParser(key.wrapperContained,ops)); }
// public Object method_71496(yarnwrap.util.packrat.Symbol results) { return wrapperContained.method_71496(results.wrapperContained); }
// public static Object method_71496(yarnwrap.util.packrat.Symbol results, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.method_71496(results.wrapperContained); }
// public com.mojang.brigadier.Message method_71497(java.lang.Object key,java.lang.Object registryRef) { return wrapperContained.method_71497(key,registryRef); }
// public static com.mojang.brigadier.Message method_71497(java.lang.Object key,java.lang.Object registryRef, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.method_71497(key,registryRef); }
// public yarnwrap.registry.entry.RegistryEntry getDialog(com.mojang.brigadier.context.CommandContext context,java.lang.String argument) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getDialog(context,argument)); }
// public static yarnwrap.registry.entry.RegistryEntry getDialog(com.mojang.brigadier.context.CommandContext context,java.lang.String argument, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.RegistryEntryArgumentType.getDialog(context,argument)); }
// public Object dialog(yarnwrap.command.CommandRegistryAccess registryAccess) { return wrapperContained.dialog(registryAccess.wrapperContained); }
// public static Object dialog(yarnwrap.command.CommandRegistryAccess registryAccess, ) { return net.minecraft.command.argument.RegistryEntryArgumentType.dialog(registryAccess.wrapperContained); }

}