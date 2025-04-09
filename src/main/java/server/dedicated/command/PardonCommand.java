package yarnwrap.server.dedicated.command;
public class PardonCommand { public net.minecraft.server.dedicated.command.PardonCommand wrapperContained; public PardonCommand(net.minecraft.server.dedicated.command.PardonCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_UNBANNED_EXCEPTION() { return wrapperContained.ALREADY_UNBANNED_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int pardon(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.pardon(source.wrapperContained,targets); }

}