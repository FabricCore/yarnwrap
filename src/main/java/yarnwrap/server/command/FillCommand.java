package yarnwrap.server.command;
public class FillCommand { public net.minecraft.server.command.FillCommand wrapperContained; public FillCommand(net.minecraft.server.command.FillCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.BlockStateArgument AIR_BLOCK_ARGUMENT() { return new yarnwrap.command.argument.BlockStateArgument(wrapperContained.AIR_BLOCK_ARGUMENT); }
// public void AIR_BLOCK_ARGUMENT(yarnwrap.command.argument.BlockStateArgument value) { wrapperContained.AIR_BLOCK_ARGUMENT = value.wrapperContained; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return wrapperContained.TOO_BIG_EXCEPTION; }
// public void TOO_BIG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.TOO_BIG_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public int method_13345(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13345(context); }
// public int method_13346(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13346(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public boolean method_13348(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_13348(pos.wrapperContained); }
// public int method_13349(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13349(context); }
// public int method_13350(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13350(context); }
// public boolean method_13351(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13351(source.wrapperContained); }
// public com.mojang.brigadier.Message method_13352(java.lang.Object maxCount,java.lang.Object count) { return wrapperContained.method_13352(maxCount,count); }
// public int method_13353(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13353(context); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockBox range,yarnwrap.command.argument.BlockStateArgument block,Object mode,java.util.function.Predicate filter) { return wrapperContained.execute(source.wrapperContained,range.wrapperContained,block.wrapperContained,mode,filter); }
// public int method_13355(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13355(context); }
// public int method_13356(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13356(context); }

}