package yarnwrap.server.dedicated.command;
public class PardonIpCommand { public net.minecraft.server.dedicated.command.PardonIpCommand wrapperContained; public PardonIpCommand(net.minecraft.server.dedicated.command.PardonIpCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_IP_EXCEPTION() { return wrapperContained.INVALID_IP_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_UNBANNED_EXCEPTION() { return wrapperContained.ALREADY_UNBANNED_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int pardonIp(yarnwrap.server.command.ServerCommandSource source,java.lang.String target) { return wrapperContained.pardonIp(source.wrapperContained,target); }

}