package yarnwrap.server.command;
public class TitleCommand { public net.minecraft.server.command.TitleCommand wrapperContained; public TitleCommand(net.minecraft.server.command.TitleCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int executeReset(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeReset(source.wrapperContained,targets); }
// public int method_13800(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13800(context); }
// public int method_13801(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13801(context); }
// public int executeTitle(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.text.Text title,java.lang.String titleType,java.util.function.Function constructor) { return wrapperContained.executeTitle(source.wrapperContained,targets,title.wrapperContained,titleType,constructor); }
// public int method_13803(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13803(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int executeClear(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeClear(source.wrapperContained,targets); }
// public int executeTimes(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,int fadeIn,int stay,int fadeOut) { return wrapperContained.executeTimes(source.wrapperContained,targets,fadeIn,stay,fadeOut); }
// public int method_13807(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13807(context); }
// public int method_13808(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13808(context); }
// public int method_13809(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13809(context); }
// public boolean method_13810(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13810(source.wrapperContained); }

}