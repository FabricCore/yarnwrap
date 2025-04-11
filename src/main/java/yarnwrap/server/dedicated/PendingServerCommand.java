package yarnwrap.server.dedicated;
public class PendingServerCommand { public net.minecraft.server.dedicated.PendingServerCommand wrapperContained; public PendingServerCommand(net.minecraft.server.dedicated.PendingServerCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String command() { return wrapperContained.command; }
// public void command(java.lang.String value) { wrapperContained.command = value; }
public yarnwrap.server.command.ServerCommandSource source() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.source); }
// public void source(yarnwrap.server.command.ServerCommandSource value) { wrapperContained.source = value.wrapperContained; }

}