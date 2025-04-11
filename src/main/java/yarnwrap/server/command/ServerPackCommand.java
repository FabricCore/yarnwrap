package yarnwrap.server.command;
public class ServerPackCommand { public net.minecraft.server.command.ServerPackCommand wrapperContained; public ServerPackCommand(net.minecraft.server.command.ServerPackCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_55475(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_55475(context); }
// public boolean method_55476(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_55476(source.wrapperContained); }
// public int executePush(yarnwrap.server.command.ServerCommandSource source,java.lang.String url,java.util.Optional uuid,java.util.Optional hash) { return wrapperContained.executePush(source.wrapperContained,url,uuid,hash); }
// public int executePop(yarnwrap.server.command.ServerCommandSource source,java.util.UUID uuid) { return wrapperContained.executePop(source.wrapperContained,uuid); }
// public void sendToAll(yarnwrap.server.command.ServerCommandSource source,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToAll(source.wrapperContained,packet.wrapperContained); }
// public void method_55481(yarnwrap.network.packet.Packet connection) { wrapperContained.method_55481(connection.wrapperContained); }
// public int method_55482(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_55482(context); }
// public int method_55483(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_55483(context); }
// public int method_55484(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_55484(context); }

}