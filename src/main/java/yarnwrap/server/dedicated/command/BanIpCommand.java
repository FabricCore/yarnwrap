package yarnwrap.server.dedicated.command;
public class BanIpCommand { public net.minecraft.server.dedicated.command.BanIpCommand wrapperContained; public BanIpCommand(net.minecraft.server.dedicated.command.BanIpCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_BANNED_EXCEPTION() { return wrapperContained.ALREADY_BANNED_EXCEPTION; }
// public void ALREADY_BANNED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_BANNED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_IP_EXCEPTION() { return wrapperContained.INVALID_IP_EXCEPTION; }
// public void INVALID_IP_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_IP_EXCEPTION = value; }
// public int method_13006(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13006(context); }
// public int banIp(yarnwrap.server.command.ServerCommandSource source,java.lang.String targetIp,yarnwrap.text.Text reason) { return wrapperContained.banIp(source.wrapperContained,targetIp,reason.wrapperContained); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int checkIp(yarnwrap.server.command.ServerCommandSource source,java.lang.String target,yarnwrap.text.Text reason) { return wrapperContained.checkIp(source.wrapperContained,target,reason.wrapperContained); }
// public int method_13010(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13010(context); }
// public boolean method_13011(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13011(source.wrapperContained); }

}