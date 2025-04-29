package yarnwrap.server.command;
public class HelpCommand { public net.minecraft.server.command.HelpCommand wrapperContained; public HelpCommand(net.minecraft.server.command.HelpCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return net.minecraft.server.command.HelpCommand.FAILED_EXCEPTION; }
// public static void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.HelpCommand.FAILED_EXCEPTION = value; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.HelpCommand.register(dispatcher); }
// public int method_13406(com.mojang.brigadier.CommandDispatcher context) { return wrapperContained.method_13406(context); }
// public static int method_13406(com.mojang.brigadier.CommandDispatcher context, ) { return net.minecraft.server.command.HelpCommand.method_13406(context); }
// public int method_13407(com.mojang.brigadier.CommandDispatcher context) { return wrapperContained.method_13407(context); }
// public static int method_13407(com.mojang.brigadier.CommandDispatcher context, ) { return net.minecraft.server.command.HelpCommand.method_13407(context); }

}