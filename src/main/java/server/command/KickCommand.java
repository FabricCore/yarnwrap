package yarnwrap.server.command;
public class KickCommand { public net.minecraft.server.command.KickCommand wrapperContained; public KickCommand(net.minecraft.server.command.KickCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType CANNOT_KICK_OWNER_EXCEPTION() { return wrapperContained.CANNOT_KICK_OWNER_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType CANNOT_KICK_SINGLEPLAYER_EXCEPTION() { return wrapperContained.CANNOT_KICK_SINGLEPLAYER_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.text.Text reason) { return wrapperContained.execute(source.wrapperContained,targets,reason.wrapperContained); }

}