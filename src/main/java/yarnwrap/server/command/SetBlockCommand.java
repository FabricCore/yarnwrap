package yarnwrap.server.command;
public class SetBlockCommand { public net.minecraft.server.command.SetBlockCommand wrapperContained; public SetBlockCommand(net.minecraft.server.command.SetBlockCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos,yarnwrap.command.argument.BlockStateArgument block,Object mode,java.util.function.Predicate condition) { return wrapperContained.execute(source.wrapperContained,pos.wrapperContained,block.wrapperContained,mode,condition); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }

}