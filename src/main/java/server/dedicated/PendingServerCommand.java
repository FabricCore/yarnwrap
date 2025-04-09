package yarnwrap.server.dedicated;
public class PendingServerCommand { public net.minecraft.server.dedicated.PendingServerCommand wrapperContained; public PendingServerCommand(net.minecraft.server.dedicated.PendingServerCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String command() { return wrapperContained.command; }
public yarnwrap.server.command.ServerCommandSource source() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.source); }

}