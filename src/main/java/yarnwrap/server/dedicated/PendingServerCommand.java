package yarnwrap.server.dedicated;
public class PendingServerCommand { public net.minecraft.server.dedicated.PendingServerCommand wrapperContained; public PendingServerCommand(net.minecraft.server.dedicated.PendingServerCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String command() { return wrapperContained.command; }
// public void command(java.lang.String value) { wrapperContained.command = value; }
// public static java.lang.String command() { return net.minecraft.server.dedicated.PendingServerCommand.command; }
// public static void command(java.lang.String value, ) { net.minecraft.server.dedicated.PendingServerCommand.command = value; }

public yarnwrap.server.command.ServerCommandSource source() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.source); }
// public void source(yarnwrap.server.command.ServerCommandSource value) { wrapperContained.source = value.wrapperContained; }
// public static yarnwrap.server.command.ServerCommandSource source() { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.dedicated.PendingServerCommand.source); }
// public static void source(yarnwrap.server.command.ServerCommandSource value, ) { net.minecraft.server.dedicated.PendingServerCommand.source = value.wrapperContained; }

public PendingServerCommand(java.lang.String command,yarnwrap.server.command.ServerCommandSource commandSource) { this.wrapperContained = new net.minecraft.server.dedicated.PendingServerCommand(command,commandSource.wrapperContained); }

}