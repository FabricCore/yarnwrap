package yarnwrap.command.argument;
public class BlockStateArgumentType { public net.minecraft.command.argument.BlockStateArgumentType wrapperContained; public BlockStateArgumentType(net.minecraft.command.argument.BlockStateArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.BlockStateArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.BlockStateArgumentType.EXAMPLES = value; }

// public yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(wrapperContained.registryWrapper); }
// public void registryWrapper(yarnwrap.registry.RegistryWrapper value) { wrapperContained.registryWrapper = value.wrapperContained; }
// public static yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(net.minecraft.command.argument.BlockStateArgumentType.registryWrapper); }
// public static void registryWrapper(yarnwrap.registry.RegistryWrapper value, ) { net.minecraft.command.argument.BlockStateArgumentType.registryWrapper = value.wrapperContained; }

public BlockStateArgumentType(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { this.wrapperContained = new net.minecraft.command.argument.BlockStateArgumentType(commandRegistryAccess.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.BlockStateArgumentType.listSuggestions(context,builder); }
// public yarnwrap.command.argument.BlockStateArgumentType blockState(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { return new yarnwrap.command.argument.BlockStateArgumentType(wrapperContained.blockState(commandRegistryAccess.wrapperContained)); }
// public static yarnwrap.command.argument.BlockStateArgumentType blockState(yarnwrap.command.CommandRegistryAccess commandRegistryAccess, ) { return new yarnwrap.command.argument.BlockStateArgumentType(net.minecraft.command.argument.BlockStateArgumentType.blockState(commandRegistryAccess.wrapperContained)); }
// public yarnwrap.command.argument.BlockStateArgument getBlockState(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.command.argument.BlockStateArgument(wrapperContained.getBlockState(context,name)); }
// public static yarnwrap.command.argument.BlockStateArgument getBlockState(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.command.argument.BlockStateArgument(net.minecraft.command.argument.BlockStateArgumentType.getBlockState(context,name)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.BlockStateArgumentType.parse(reader); }

}