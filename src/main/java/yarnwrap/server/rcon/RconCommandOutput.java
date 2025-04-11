package yarnwrap.server.rcon;
public class RconCommandOutput { public net.minecraft.server.rcon.RconCommandOutput wrapperContained; public RconCommandOutput(net.minecraft.server.rcon.RconCommandOutput wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.StringBuffer buffer() { return wrapperContained.buffer; }
// public void buffer(java.lang.StringBuffer value) { wrapperContained.buffer = value; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public yarnwrap.text.Text RCON_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.RCON_NAME_TEXT); }
// public void RCON_NAME_TEXT(yarnwrap.text.Text value) { wrapperContained.RCON_NAME_TEXT = value.wrapperContained; }
// public java.lang.String RCON_NAME() { return wrapperContained.RCON_NAME; }
// public void RCON_NAME(java.lang.String value) { wrapperContained.RCON_NAME = value; }
public RconCommandOutput(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.server.rcon.RconCommandOutput(server.wrapperContained); }
public yarnwrap.server.command.ServerCommandSource createRconCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.createRconCommandSource()); }
public java.lang.String asString() { return wrapperContained.asString(); }
public void clear() { wrapperContained.clear(); }

}