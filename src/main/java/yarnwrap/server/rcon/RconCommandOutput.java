package yarnwrap.server.rcon;
public class RconCommandOutput { public net.minecraft.server.rcon.RconCommandOutput wrapperContained; public RconCommandOutput(net.minecraft.server.rcon.RconCommandOutput wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.StringBuffer buffer() { return wrapperContained.buffer; }
// public void buffer(java.lang.StringBuffer value) { wrapperContained.buffer = value; }
// public static java.lang.StringBuffer buffer() { return net.minecraft.server.rcon.RconCommandOutput.buffer; }
// public static void buffer(java.lang.StringBuffer value, ) { net.minecraft.server.rcon.RconCommandOutput.buffer = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.rcon.RconCommandOutput.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.rcon.RconCommandOutput.server = value.wrapperContained; }

// public yarnwrap.text.Text RCON_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.RCON_NAME_TEXT); }
// public void RCON_NAME_TEXT(yarnwrap.text.Text value) { wrapperContained.RCON_NAME_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text RCON_NAME_TEXT() { return new yarnwrap.text.Text(net.minecraft.server.rcon.RconCommandOutput.RCON_NAME_TEXT); }
// public static void RCON_NAME_TEXT(yarnwrap.text.Text value, ) { net.minecraft.server.rcon.RconCommandOutput.RCON_NAME_TEXT = value.wrapperContained; }

// public java.lang.String RCON_NAME() { return wrapperContained.RCON_NAME; }
// public void RCON_NAME(java.lang.String value) { wrapperContained.RCON_NAME = value; }
// public static java.lang.String RCON_NAME() { return net.minecraft.server.rcon.RconCommandOutput.RCON_NAME; }
// public static void RCON_NAME(java.lang.String value, ) { net.minecraft.server.rcon.RconCommandOutput.RCON_NAME = value; }

public RconCommandOutput(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.server.rcon.RconCommandOutput(server.wrapperContained); }
public yarnwrap.server.command.ServerCommandSource createRconCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.createRconCommandSource()); }
// public static yarnwrap.server.command.ServerCommandSource createRconCommandSource() { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.rcon.RconCommandOutput.createRconCommandSource()); }
public java.lang.String asString() { return wrapperContained.asString(); }
// public static java.lang.String asString() { return net.minecraft.server.rcon.RconCommandOutput.asString(); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.server.rcon.RconCommandOutput.clear(); }

}