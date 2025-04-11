package yarnwrap.entity.boss;
public class ServerBossBar { public net.minecraft.entity.boss.ServerBossBar wrapperContained; public ServerBossBar(net.minecraft.entity.boss.ServerBossBar wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean visible() { return wrapperContained.visible; }
// public void visible(boolean value) { wrapperContained.visible = value; }
// public java.util.Set players() { return wrapperContained.players; }
// public void players(java.util.Set value) { wrapperContained.players = value; }
// public java.util.Set unmodifiablePlayers() { return wrapperContained.unmodifiablePlayers; }
// public void unmodifiablePlayers(java.util.Set value) { wrapperContained.unmodifiablePlayers = value; }
public void addPlayer(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.addPlayer(player.wrapperContained); }
public void removePlayer(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.removePlayer(player.wrapperContained); }
// public void sendPacket(java.util.function.Function bossBarToPacketFunction) { wrapperContained.sendPacket(bossBarToPacketFunction); }
public void setVisible(boolean visible) { wrapperContained.setVisible(visible); }
public java.util.Collection getPlayers() { return wrapperContained.getPlayers(); }
public boolean isVisible() { return wrapperContained.isVisible(); }
public void clearPlayers() { wrapperContained.clearPlayers(); }

}