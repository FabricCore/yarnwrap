package yarnwrap.command.argument;
public class BlockPosArgumentType { public net.minecraft.command.argument.BlockPosArgumentType wrapperContained; public BlockPosArgumentType(net.minecraft.command.argument.BlockPosArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNLOADED_EXCEPTION() { return wrapperContained.UNLOADED_EXCEPTION; }
// public void UNLOADED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.UNLOADED_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OUT_OF_WORLD_EXCEPTION() { return wrapperContained.OUT_OF_WORLD_EXCEPTION; }
// public void OUT_OF_WORLD_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.OUT_OF_WORLD_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OUT_OF_BOUNDS_EXCEPTION() { return wrapperContained.OUT_OF_BOUNDS_EXCEPTION; }
// public void OUT_OF_BOUNDS_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.OUT_OF_BOUNDS_EXCEPTION = value; }
// public yarnwrap.util.math.BlockPos getLoadedBlockPos(com.mojang.brigadier.context.CommandContext context,yarnwrap.server.world.ServerWorld world,java.lang.String name) { return new yarnwrap.util.math.BlockPos(wrapperContained.getLoadedBlockPos(context,world.wrapperContained,name)); }
public yarnwrap.util.math.BlockPos getBlockPos(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos(context,name)); }
// public yarnwrap.util.math.BlockPos getLoadedBlockPos(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.math.BlockPos(wrapperContained.getLoadedBlockPos(context,name)); }
// public yarnwrap.util.math.BlockPos getValidBlockPos(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.math.BlockPos(wrapperContained.getValidBlockPos(context,name)); }
public yarnwrap.command.argument.BlockPosArgumentType blockPos() { return new yarnwrap.command.argument.BlockPosArgumentType(wrapperContained.blockPos()); }

}