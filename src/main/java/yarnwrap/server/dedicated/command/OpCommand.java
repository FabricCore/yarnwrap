package yarnwrap.server.dedicated.command;
public class OpCommand { public net.minecraft.server.dedicated.command.OpCommand wrapperContained; public OpCommand(net.minecraft.server.dedicated.command.OpCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_OPPED_EXCEPTION() { return wrapperContained.ALREADY_OPPED_EXCEPTION; }
// public void ALREADY_OPPED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_OPPED_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int op(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.op(source.wrapperContained,targets); }

}