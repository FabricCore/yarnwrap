package yarnwrap.server.dedicated.gui;
public class PlayerListGui { public net.minecraft.server.dedicated.gui.PlayerListGui wrapperContained; public PlayerListGui(net.minecraft.server.dedicated.gui.PlayerListGui wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tick() { return wrapperContained.tick; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void tick() { wrapperContained.tick(); }

}