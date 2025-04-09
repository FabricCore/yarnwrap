package yarnwrap.server.rcon;
public class RconCommandOutput { public net.minecraft.server.rcon.RconCommandOutput wrapperContained; public RconCommandOutput(net.minecraft.server.rcon.RconCommandOutput wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.StringBuffer buffer() { return wrapperContained.buffer; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public yarnwrap.text.Text RCON_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.RCON_NAME_TEXT); }
// public java.lang.String RCON_NAME() { return wrapperContained.RCON_NAME; }
public yarnwrap.server.command.ServerCommandSource createRconCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.createRconCommandSource()); }
public java.lang.String asString() { return wrapperContained.asString(); }
public void clear() { wrapperContained.clear(); }

}