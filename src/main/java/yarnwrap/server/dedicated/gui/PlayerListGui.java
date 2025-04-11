package yarnwrap.server.dedicated.gui;
public class PlayerListGui { public net.minecraft.server.dedicated.gui.PlayerListGui wrapperContained; public PlayerListGui(net.minecraft.server.dedicated.gui.PlayerListGui wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tick() { return wrapperContained.tick; }
// public void tick(int value) { wrapperContained.tick = value; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
public PlayerListGui(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.server.dedicated.gui.PlayerListGui(server.wrapperContained); }
// public void tick() { wrapperContained.tick(); }

}