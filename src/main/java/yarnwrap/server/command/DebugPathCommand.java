package yarnwrap.server.command;
public class DebugPathCommand { public net.minecraft.server.command.DebugPathCommand wrapperContained; public DebugPathCommand(net.minecraft.server.command.DebugPathCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SOURCE_NOT_MOB_EXCEPTION() { return wrapperContained.SOURCE_NOT_MOB_EXCEPTION; }
// public void SOURCE_NOT_MOB_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SOURCE_NOT_MOB_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType PATH_NOT_FOUND_EXCEPTION() { return wrapperContained.PATH_NOT_FOUND_EXCEPTION; }
// public void PATH_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.PATH_NOT_FOUND_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TARGET_NOT_REACHED_EXCEPTION() { return wrapperContained.TARGET_NOT_REACHED_EXCEPTION; }
// public void TARGET_NOT_REACHED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.TARGET_NOT_REACHED_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_36188(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_36188(context); }
// public boolean method_36189(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_36189(source.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos) { return wrapperContained.execute(source.wrapperContained,pos.wrapperContained); }

}