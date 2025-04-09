package yarnwrap.server.dedicated.command;
public class DeOpCommand { public net.minecraft.server.dedicated.command.DeOpCommand wrapperContained; public DeOpCommand(net.minecraft.server.dedicated.command.DeOpCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_DEOPPED_EXCEPTION() { return wrapperContained.ALREADY_DEOPPED_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int deop(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.deop(source.wrapperContained,targets); }

}