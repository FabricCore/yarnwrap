package yarnwrap.server.command;
public class DebugPathCommand { public net.minecraft.server.command.DebugPathCommand wrapperContained; public DebugPathCommand(net.minecraft.server.command.DebugPathCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SOURCE_NOT_MOB_EXCEPTION() { return wrapperContained.SOURCE_NOT_MOB_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType PATH_NOT_FOUND_EXCEPTION() { return wrapperContained.PATH_NOT_FOUND_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TARGET_NOT_REACHED_EXCEPTION() { return wrapperContained.TARGET_NOT_REACHED_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos) { return wrapperContained.execute(source.wrapperContained,pos.wrapperContained); }

}