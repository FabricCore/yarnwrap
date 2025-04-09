package yarnwrap.server.command;
public class TagCommand { public net.minecraft.server.command.TagCommand wrapperContained; public TagCommand(net.minecraft.server.command.TagCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ADD_FAILED_EXCEPTION() { return wrapperContained.ADD_FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REMOVE_FAILED_EXCEPTION() { return wrapperContained.REMOVE_FAILED_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeRemove(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.lang.String tag) { return wrapperContained.executeRemove(source.wrapperContained,targets,tag); }
// public int executeList(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeList(source.wrapperContained,targets); }
// public int executeAdd(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.lang.String tag) { return wrapperContained.executeAdd(source.wrapperContained,targets,tag); }
// public java.util.Collection getTags(java.util.Collection entities) { return wrapperContained.getTags(entities); }

}