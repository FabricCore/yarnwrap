package yarnwrap.server.command;
public class TitleCommand { public net.minecraft.server.command.TitleCommand wrapperContained; public TitleCommand(net.minecraft.server.command.TitleCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int executeReset(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeReset(source.wrapperContained,targets); }
// public int executeTitle(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.text.Text title,java.lang.String titleType,java.util.function.Function constructor) { return wrapperContained.executeTitle(source.wrapperContained,targets,title.wrapperContained,titleType,constructor); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int executeClear(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeClear(source.wrapperContained,targets); }
// public int executeTimes(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,int fadeIn,int stay,int fadeOut) { return wrapperContained.executeTimes(source.wrapperContained,targets,fadeIn,stay,fadeOut); }

}