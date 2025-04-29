package yarnwrap.command.argument;
public class RegistryEntryPredicateArgumentType { public net.minecraft.command.argument.RegistryEntryPredicateArgumentType wrapperContained; public RegistryEntryPredicateArgumentType(net.minecraft.command.argument.RegistryEntryPredicateArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.RegistryEntryPredicateArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.RegistryEntryPredicateArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NOT_FOUND_EXCEPTION() { return wrapperContained.NOT_FOUND_EXCEPTION; }
// public void NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.NOT_FOUND_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NOT_FOUND_EXCEPTION() { return net.minecraft.command.argument.RegistryEntryPredicateArgumentType.NOT_FOUND_EXCEPTION; }
// public static void NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.command.argument.RegistryEntryPredicateArgumentType.NOT_FOUND_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType WRONG_TYPE_EXCEPTION() { return wrapperContained.WRONG_TYPE_EXCEPTION; }
// public void WRONG_TYPE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value) { wrapperContained.WRONG_TYPE_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType WRONG_TYPE_EXCEPTION() { return net.minecraft.command.argument.RegistryEntryPredicateArgumentType.WRONG_TYPE_EXCEPTION; }
// public static void WRONG_TYPE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value, ) { net.minecraft.command.argument.RegistryEntryPredicateArgumentType.WRONG_TYPE_EXCEPTION = value; }

// public yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(wrapperContained.registryWrapper); }
// public void registryWrapper(yarnwrap.registry.RegistryWrapper value) { wrapperContained.registryWrapper = value.wrapperContained; }
// public static yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(net.minecraft.command.argument.RegistryEntryPredicateArgumentType.registryWrapper); }
// public static void registryWrapper(yarnwrap.registry.RegistryWrapper value, ) { net.minecraft.command.argument.RegistryEntryPredicateArgumentType.registryWrapper = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(net.minecraft.command.argument.RegistryEntryPredicateArgumentType.registryRef); }
// public static void registryRef(yarnwrap.registry.RegistryKey value, ) { net.minecraft.command.argument.RegistryEntryPredicateArgumentType.registryRef = value.wrapperContained; }

public RegistryEntryPredicateArgumentType(yarnwrap.command.CommandRegistryAccess registryAccess,yarnwrap.registry.RegistryKey registryRef) { this.wrapperContained = new net.minecraft.command.argument.RegistryEntryPredicateArgumentType(registryAccess.wrapperContained,registryRef.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.RegistryEntryPredicateArgumentType.listSuggestions(context,builder); }
// public com.mojang.brigadier.exceptions.CommandSyntaxException method_45632(yarnwrap.registry.RegistryKey entry) { return wrapperContained.method_45632(entry.wrapperContained); }
// public static com.mojang.brigadier.exceptions.CommandSyntaxException method_45632(yarnwrap.registry.RegistryKey entry, ) { return net.minecraft.command.argument.RegistryEntryPredicateArgumentType.method_45632(entry.wrapperContained); }
// public com.mojang.brigadier.exceptions.CommandSyntaxException method_45633(yarnwrap.registry.RegistryKey entryList) { return wrapperContained.method_45633(entryList.wrapperContained); }
// public static com.mojang.brigadier.exceptions.CommandSyntaxException method_45633(yarnwrap.registry.RegistryKey entryList, ) { return net.minecraft.command.argument.RegistryEntryPredicateArgumentType.method_45633(entryList.wrapperContained); }
// public Object getRegistryEntryPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getRegistryEntryPredicate(context,name,registryRef.wrapperContained); }
// public static Object getRegistryEntryPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.command.argument.RegistryEntryPredicateArgumentType.getRegistryEntryPredicate(context,name,registryRef.wrapperContained); }
// public yarnwrap.command.argument.RegistryEntryPredicateArgumentType registryEntryPredicate(yarnwrap.command.CommandRegistryAccess registryRef,yarnwrap.registry.RegistryKey registryAccess) { return new yarnwrap.command.argument.RegistryEntryPredicateArgumentType(wrapperContained.registryEntryPredicate(registryRef.wrapperContained,registryAccess.wrapperContained)); }
// public static yarnwrap.command.argument.RegistryEntryPredicateArgumentType registryEntryPredicate(yarnwrap.command.CommandRegistryAccess registryRef,yarnwrap.registry.RegistryKey registryAccess, ) { return new yarnwrap.command.argument.RegistryEntryPredicateArgumentType(net.minecraft.command.argument.RegistryEntryPredicateArgumentType.registryEntryPredicate(registryRef.wrapperContained,registryAccess.wrapperContained)); }
// public com.mojang.brigadier.Message method_45639(java.lang.Object tag,java.lang.Object type) { return wrapperContained.method_45639(tag,type); }
// public static com.mojang.brigadier.Message method_45639(java.lang.Object tag,java.lang.Object type, ) { return net.minecraft.command.argument.RegistryEntryPredicateArgumentType.method_45639(tag,type); }
// public com.mojang.brigadier.Message method_45640(java.lang.Object tag,java.lang.Object type,java.lang.Object expectedType) { return wrapperContained.method_45640(tag,type,expectedType); }
// public static com.mojang.brigadier.Message method_45640(java.lang.Object tag,java.lang.Object type,java.lang.Object expectedType, ) { return net.minecraft.command.argument.RegistryEntryPredicateArgumentType.method_45640(tag,type,expectedType); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.RegistryEntryPredicateArgumentType.parse(reader); }

}