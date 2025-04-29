package yarnwrap.server.command;
public class PublishCommand { public net.minecraft.server.command.PublishCommand wrapperContained; public PublishCommand(net.minecraft.server.command.PublishCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ALREADY_PUBLISHED_EXCEPTION() { return wrapperContained.ALREADY_PUBLISHED_EXCEPTION; }
// public void ALREADY_PUBLISHED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.ALREADY_PUBLISHED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType ALREADY_PUBLISHED_EXCEPTION() { return net.minecraft.server.command.PublishCommand.ALREADY_PUBLISHED_EXCEPTION; }
// public static void ALREADY_PUBLISHED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.server.command.PublishCommand.ALREADY_PUBLISHED_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return net.minecraft.server.command.PublishCommand.FAILED_EXCEPTION; }
// public static void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.PublishCommand.FAILED_EXCEPTION = value; }

// public int method_13508(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13508(context); }
// public static int method_13508(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.PublishCommand.method_13508(context); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,int port,boolean allowCommands,yarnwrap.world.GameMode gameMode) { return wrapperContained.execute(source.wrapperContained,port,allowCommands,gameMode.wrapperContained); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,int port,boolean allowCommands,yarnwrap.world.GameMode gameMode, ) { return net.minecraft.server.command.PublishCommand.execute(source.wrapperContained,port,allowCommands,gameMode.wrapperContained); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.PublishCommand.register(dispatcher); }
// public com.mojang.brigadier.Message method_13511(java.lang.Object port) { return wrapperContained.method_13511(port); }
// public static com.mojang.brigadier.Message method_13511(java.lang.Object port, ) { return net.minecraft.server.command.PublishCommand.method_13511(port); }
// public int method_13512(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13512(context); }
// public static int method_13512(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.PublishCommand.method_13512(context); }
// public boolean method_13513(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13513(source.wrapperContained); }
// public static boolean method_13513(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.PublishCommand.method_13513(source.wrapperContained); }
// public yarnwrap.text.MutableText getStartedText(int port) { return new yarnwrap.text.MutableText(wrapperContained.getStartedText(port)); }
// public static yarnwrap.text.MutableText getStartedText(int port, ) { return new yarnwrap.text.MutableText(net.minecraft.server.command.PublishCommand.getStartedText(port)); }

}