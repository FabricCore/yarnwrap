package yarnwrap.server.dedicated.command;
public class BanCommand { public net.minecraft.server.dedicated.command.BanCommand wrapperContained; public BanCommand(net.minecraft.server.dedicated.command.BanCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_BANNED_EXCEPTION() { return wrapperContained.ALREADY_BANNED_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int ban(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.text.Text reason) { return wrapperContained.ban(source.wrapperContained,targets,reason.wrapperContained); }

}