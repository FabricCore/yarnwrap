package yarnwrap.server.command;
public class HelpCommand { public net.minecraft.server.command.HelpCommand wrapperContained; public HelpCommand(net.minecraft.server.command.HelpCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }

}