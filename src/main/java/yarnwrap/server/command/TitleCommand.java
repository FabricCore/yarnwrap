package yarnwrap.server.command;
public class TitleCommand { public net.minecraft.server.command.TitleCommand wrapperContained; public TitleCommand(net.minecraft.server.command.TitleCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int executeReset(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeReset(source.wrapperContained,targets); }
// public static int executeReset(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets, ) { return net.minecraft.server.command.TitleCommand.executeReset(source.wrapperContained,targets); }
// public int method_13800(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13800(context); }
// public static int method_13800(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TitleCommand.method_13800(context); }
// public int method_13801(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13801(context); }
// public static int method_13801(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TitleCommand.method_13801(context); }
// public int executeTitle(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.text.Text title,java.lang.String titleType,java.util.function.Function constructor) { return wrapperContained.executeTitle(source.wrapperContained,targets,title.wrapperContained,titleType,constructor); }
// public static int executeTitle(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.text.Text title,java.lang.String titleType,java.util.function.Function constructor, ) { return net.minecraft.server.command.TitleCommand.executeTitle(source.wrapperContained,targets,title.wrapperContained,titleType,constructor); }
// public int method_13803(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13803(context); }
// public static int method_13803(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TitleCommand.method_13803(context); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess, ) { net.minecraft.server.command.TitleCommand.register(dispatcher,registryAccess.wrapperContained); }
// public int executeClear(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeClear(source.wrapperContained,targets); }
// public static int executeClear(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets, ) { return net.minecraft.server.command.TitleCommand.executeClear(source.wrapperContained,targets); }
// public int executeTimes(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,int fadeIn,int stay,int fadeOut) { return wrapperContained.executeTimes(source.wrapperContained,targets,fadeIn,stay,fadeOut); }
// public static int executeTimes(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,int fadeIn,int stay,int fadeOut, ) { return net.minecraft.server.command.TitleCommand.executeTimes(source.wrapperContained,targets,fadeIn,stay,fadeOut); }
// public int method_13807(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13807(context); }
// public static int method_13807(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TitleCommand.method_13807(context); }
// public int method_13808(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13808(context); }
// public static int method_13808(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TitleCommand.method_13808(context); }
// public int method_13809(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13809(context); }
// public static int method_13809(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TitleCommand.method_13809(context); }
// public boolean method_13810(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13810(source.wrapperContained); }
// public static boolean method_13810(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.TitleCommand.method_13810(source.wrapperContained); }

}