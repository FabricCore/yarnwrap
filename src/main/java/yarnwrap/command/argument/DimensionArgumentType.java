package yarnwrap.command.argument;
public class DimensionArgumentType { public net.minecraft.command.argument.DimensionArgumentType wrapperContained; public DimensionArgumentType(net.minecraft.command.argument.DimensionArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_DIMENSION_EXCEPTION() { return wrapperContained.INVALID_DIMENSION_EXCEPTION; }
// public void INVALID_DIMENSION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_DIMENSION_EXCEPTION = value; }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
public yarnwrap.command.argument.DimensionArgumentType dimension() { return new yarnwrap.command.argument.DimensionArgumentType(wrapperContained.dimension()); }
// public yarnwrap.server.world.ServerWorld getDimensionArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.server.world.ServerWorld(wrapperContained.getDimensionArgument(context,name)); }
// public com.mojang.brigadier.Message method_9290(java.lang.Object id) { return wrapperContained.method_9290(id); }
// public java.lang.String method_9291(yarnwrap.registry.RegistryKey key) { return wrapperContained.method_9291(key.wrapperContained); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}