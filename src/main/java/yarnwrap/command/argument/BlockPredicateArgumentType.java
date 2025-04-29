package yarnwrap.command.argument;
public class BlockPredicateArgumentType { public net.minecraft.command.argument.BlockPredicateArgumentType wrapperContained; public BlockPredicateArgumentType(net.minecraft.command.argument.BlockPredicateArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.BlockPredicateArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.BlockPredicateArgumentType.EXAMPLES = value; }

// public yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(wrapperContained.registryWrapper); }
// public void registryWrapper(yarnwrap.registry.RegistryWrapper value) { wrapperContained.registryWrapper = value.wrapperContained; }
// public static yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(net.minecraft.command.argument.BlockPredicateArgumentType.registryWrapper); }
// public static void registryWrapper(yarnwrap.registry.RegistryWrapper value, ) { net.minecraft.command.argument.BlockPredicateArgumentType.registryWrapper = value.wrapperContained; }

public BlockPredicateArgumentType(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { this.wrapperContained = new net.minecraft.command.argument.BlockPredicateArgumentType(commandRegistryAccess.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.BlockPredicateArgumentType.listSuggestions(context,builder); }
// public Object method_41951(Object result) { return wrapperContained.method_41951(result); }
// public static Object method_41951(Object result, ) { return net.minecraft.command.argument.BlockPredicateArgumentType.method_41951(result); }
// public Object method_41952(Object result) { return wrapperContained.method_41952(result); }
// public static Object method_41952(Object result, ) { return net.minecraft.command.argument.BlockPredicateArgumentType.method_41952(result); }
// public Object parse(yarnwrap.registry.RegistryWrapper registryWrapper,com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(registryWrapper.wrapperContained,reader); }
// public static Object parse(yarnwrap.registry.RegistryWrapper registryWrapper,com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.BlockPredicateArgumentType.parse(registryWrapper.wrapperContained,reader); }
// public java.util.function.Predicate getBlockPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getBlockPredicate(context,name); }
// public static java.util.function.Predicate getBlockPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.BlockPredicateArgumentType.getBlockPredicate(context,name); }
// public yarnwrap.command.argument.BlockPredicateArgumentType blockPredicate(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { return new yarnwrap.command.argument.BlockPredicateArgumentType(wrapperContained.blockPredicate(commandRegistryAccess.wrapperContained)); }
// public static yarnwrap.command.argument.BlockPredicateArgumentType blockPredicate(yarnwrap.command.CommandRegistryAccess commandRegistryAccess, ) { return new yarnwrap.command.argument.BlockPredicateArgumentType(net.minecraft.command.argument.BlockPredicateArgumentType.blockPredicate(commandRegistryAccess.wrapperContained)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.BlockPredicateArgumentType.parse(reader); }

}