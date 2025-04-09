package yarnwrap.command.argument;
public class BlockStateArgumentType { public net.minecraft.command.argument.BlockStateArgumentType wrapperContained; public BlockStateArgumentType(net.minecraft.command.argument.BlockStateArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(wrapperContained.registryWrapper); }
public yarnwrap.command.argument.BlockStateArgumentType blockState(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { return new yarnwrap.command.argument.BlockStateArgumentType(wrapperContained.blockState(commandRegistryAccess.wrapperContained)); }
public yarnwrap.command.argument.BlockStateArgument getBlockState(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.command.argument.BlockStateArgument(wrapperContained.getBlockState(context,name)); }

}