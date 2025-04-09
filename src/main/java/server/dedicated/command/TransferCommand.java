package yarnwrap.server.dedicated.command;
public class TransferCommand { public net.minecraft.server.dedicated.command.TransferCommand wrapperContained; public TransferCommand(net.minecraft.server.dedicated.command.TransferCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_PLAYERS_EXCEPTION() { return wrapperContained.NO_PLAYERS_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeTransfer(yarnwrap.server.command.ServerCommandSource source,java.lang.String host,int port,java.util.Collection players) { return wrapperContained.executeTransfer(source.wrapperContained,host,port,players); }

}