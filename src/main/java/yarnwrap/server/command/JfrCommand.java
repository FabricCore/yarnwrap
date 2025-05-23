package yarnwrap.server.command;
public class JfrCommand { public net.minecraft.server.command.JfrCommand wrapperContained; public JfrCommand(net.minecraft.server.command.JfrCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType JFR_START_FAILED_EXCEPTION() { return wrapperContained.JFR_START_FAILED_EXCEPTION; }
// public void JFR_START_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.JFR_START_FAILED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType JFR_START_FAILED_EXCEPTION() { return net.minecraft.server.command.JfrCommand.JFR_START_FAILED_EXCEPTION; }
// public static void JFR_START_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.JfrCommand.JFR_START_FAILED_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType JFR_DUMP_FAILED_EXCEPTION() { return wrapperContained.JFR_DUMP_FAILED_EXCEPTION; }
// public void JFR_DUMP_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.JFR_DUMP_FAILED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType JFR_DUMP_FAILED_EXCEPTION() { return net.minecraft.server.command.JfrCommand.JFR_DUMP_FAILED_EXCEPTION; }
// public static void JFR_DUMP_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.server.command.JfrCommand.JFR_DUMP_FAILED_EXCEPTION = value; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.JfrCommand.register(dispatcher); }
// public int method_38613(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_38613(context); }
// public static int method_38613(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.JfrCommand.method_38613(context); }
// public int executeStart(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStart(source.wrapperContained); }
// public static int executeStart(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.JfrCommand.executeStart(source.wrapperContained); }
// public com.mojang.brigadier.Message method_38615(java.lang.Object message) { return wrapperContained.method_38615(message); }
// public static com.mojang.brigadier.Message method_38615(java.lang.Object message, ) { return net.minecraft.server.command.JfrCommand.method_38615(message); }
// public int method_38616(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_38616(context); }
// public static int method_38616(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.JfrCommand.method_38616(context); }
// public int executeStop(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStop(source.wrapperContained); }
// public static int executeStop(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.JfrCommand.executeStop(source.wrapperContained); }
// public yarnwrap.text.Style method_39499(java.nio.file.Path style) { return new yarnwrap.text.Style(wrapperContained.method_39499(style)); }
// public static yarnwrap.text.Style method_39499(java.nio.file.Path style, ) { return new yarnwrap.text.Style(net.minecraft.server.command.JfrCommand.method_39499(style)); }

}