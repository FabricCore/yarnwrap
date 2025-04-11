package yarnwrap.server.command;
public class HelpCommand { public net.minecraft.server.command.HelpCommand wrapperContained; public HelpCommand(net.minecraft.server.command.HelpCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13406(com.mojang.brigadier.CommandDispatcher context) { return wrapperContained.method_13406(context); }
// public int method_13407(com.mojang.brigadier.CommandDispatcher context) { return wrapperContained.method_13407(context); }

}