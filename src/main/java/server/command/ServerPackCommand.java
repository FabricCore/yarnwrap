package yarnwrap.server.command;
public class ServerPackCommand { public net.minecraft.server.command.ServerPackCommand wrapperContained; public ServerPackCommand(net.minecraft.server.command.ServerPackCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executePush(yarnwrap.server.command.ServerCommandSource source,java.lang.String url,java.util.Optional uuid,java.util.Optional hash) { return wrapperContained.executePush(source.wrapperContained,url,uuid,hash); }
// public int executePop(yarnwrap.server.command.ServerCommandSource source,java.util.UUID uuid) { return wrapperContained.executePop(source.wrapperContained,uuid); }
// public void sendToAll(yarnwrap.server.command.ServerCommandSource source,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToAll(source.wrapperContained,packet.wrapperContained); }

}