package yarnwrap.command.argument;
public class RegistryPredicateArgumentType { public net.minecraft.command.argument.RegistryPredicateArgumentType wrapperContained; public RegistryPredicateArgumentType(net.minecraft.command.argument.RegistryPredicateArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.RegistryPredicateArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.RegistryPredicateArgumentType.EXAMPLES = value; }

// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(net.minecraft.command.argument.RegistryPredicateArgumentType.registryRef); }
// public static void registryRef(yarnwrap.registry.RegistryKey value, ) { net.minecraft.command.argument.RegistryPredicateArgumentType.registryRef = value.wrapperContained; }

public RegistryPredicateArgumentType(yarnwrap.registry.RegistryKey registryRef) { this.wrapperContained = new net.minecraft.command.argument.RegistryPredicateArgumentType(registryRef.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.RegistryPredicateArgumentType.listSuggestions(context,builder); }
// public Object getPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.registry.RegistryKey registryRef,com.mojang.brigadier.exceptions.DynamicCommandExceptionType invalidException) { return wrapperContained.getPredicate(context,name,registryRef.wrapperContained,invalidException); }
// public static Object getPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name,yarnwrap.registry.RegistryKey registryRef,com.mojang.brigadier.exceptions.DynamicCommandExceptionType invalidException, ) { return net.minecraft.command.argument.RegistryPredicateArgumentType.getPredicate(context,name,registryRef.wrapperContained,invalidException); }
// public yarnwrap.command.argument.RegistryPredicateArgumentType registryPredicate(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.command.argument.RegistryPredicateArgumentType(wrapperContained.registryPredicate(registryRef.wrapperContained)); }
// public static yarnwrap.command.argument.RegistryPredicateArgumentType registryPredicate(yarnwrap.registry.RegistryKey registryRef, ) { return new yarnwrap.command.argument.RegistryPredicateArgumentType(net.minecraft.command.argument.RegistryPredicateArgumentType.registryPredicate(registryRef.wrapperContained)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.RegistryPredicateArgumentType.parse(reader); }

}