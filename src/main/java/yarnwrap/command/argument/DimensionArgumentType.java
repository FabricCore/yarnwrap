package yarnwrap.command.argument;
public class DimensionArgumentType { public net.minecraft.command.argument.DimensionArgumentType wrapperContained; public DimensionArgumentType(net.minecraft.command.argument.DimensionArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_DIMENSION_EXCEPTION() { return wrapperContained.INVALID_DIMENSION_EXCEPTION; }
// public void INVALID_DIMENSION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_DIMENSION_EXCEPTION = value; }
public yarnwrap.command.argument.DimensionArgumentType dimension() { return new yarnwrap.command.argument.DimensionArgumentType(wrapperContained.dimension()); }
// public yarnwrap.server.world.ServerWorld getDimensionArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.server.world.ServerWorld(wrapperContained.getDimensionArgument(context,name)); }

}