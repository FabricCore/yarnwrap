package yarnwrap.server.dedicated.command;
public class TransferCommand { public net.minecraft.server.dedicated.command.TransferCommand wrapperContained; public TransferCommand(net.minecraft.server.dedicated.command.TransferCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_PLAYERS_EXCEPTION() { return wrapperContained.NO_PLAYERS_EXCEPTION; }
// public void NO_PLAYERS_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NO_PLAYERS_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_56523(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56523(context); }
// public boolean method_56524(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_56524(source.wrapperContained); }
// public int executeTransfer(yarnwrap.server.command.ServerCommandSource source,java.lang.String host,int port,java.util.Collection players) { return wrapperContained.executeTransfer(source.wrapperContained,host,port,players); }
// public int method_56527(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56527(context); }
// public int method_56529(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_56529(context); }

}