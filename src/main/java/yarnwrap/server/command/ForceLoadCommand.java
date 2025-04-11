package yarnwrap.server.command;
public class ForceLoadCommand { public net.minecraft.server.command.ForceLoadCommand wrapperContained; public ForceLoadCommand(net.minecraft.server.command.ForceLoadCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return wrapperContained.TOO_BIG_EXCEPTION; }
// public void TOO_BIG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.TOO_BIG_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ADDED_FAILURE_EXCEPTION() { return wrapperContained.ADDED_FAILURE_EXCEPTION; }
// public void ADDED_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ADDED_FAILURE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType QUERY_FAILURE_EXCEPTION() { return wrapperContained.QUERY_FAILURE_EXCEPTION; }
// public void QUERY_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.QUERY_FAILURE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REMOVED_FAILURE_EXCEPTION() { return wrapperContained.REMOVED_FAILURE_EXCEPTION; }
// public void REMOVED_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.REMOVED_FAILURE_EXCEPTION = value; }
// public int MAX_CHUNKS() { return wrapperContained.MAX_CHUNKS; }
// public void MAX_CHUNKS(int value) { wrapperContained.MAX_CHUNKS = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeRemoveAll(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeRemoveAll(source.wrapperContained); }
// public int executeChange(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.ColumnPos from,yarnwrap.util.math.ColumnPos to,boolean forceLoaded) { return wrapperContained.executeChange(source.wrapperContained,from.wrapperContained,to.wrapperContained,forceLoaded); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeQuery(source.wrapperContained); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.ColumnPos pos) { return wrapperContained.executeQuery(source.wrapperContained,pos.wrapperContained); }

}