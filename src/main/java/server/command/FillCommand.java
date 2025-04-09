package yarnwrap.server.command;
public class FillCommand { public net.minecraft.server.command.FillCommand wrapperContained; public FillCommand(net.minecraft.server.command.FillCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.BlockStateArgument AIR_BLOCK_ARGUMENT() { return new yarnwrap.command.argument.BlockStateArgument(wrapperContained.AIR_BLOCK_ARGUMENT); }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return wrapperContained.TOO_BIG_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockBox range,yarnwrap.command.argument.BlockStateArgument block,Object mode,java.util.function.Predicate filter) { return wrapperContained.execute(source.wrapperContained,range.wrapperContained,block.wrapperContained,mode,filter); }

}