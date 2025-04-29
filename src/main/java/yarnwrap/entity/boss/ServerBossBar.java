package yarnwrap.entity.boss;
public class ServerBossBar { public net.minecraft.entity.boss.ServerBossBar wrapperContained; public ServerBossBar(net.minecraft.entity.boss.ServerBossBar wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean visible() { return wrapperContained.visible; }
// public void visible(boolean value) { wrapperContained.visible = value; }
// public static boolean visible() { return net.minecraft.entity.boss.ServerBossBar.visible; }
// public static void visible(boolean value, ) { net.minecraft.entity.boss.ServerBossBar.visible = value; }

// public java.util.Set players() { return wrapperContained.players; }
// public void players(java.util.Set value) { wrapperContained.players = value; }
// public static java.util.Set players() { return net.minecraft.entity.boss.ServerBossBar.players; }
// public static void players(java.util.Set value, ) { net.minecraft.entity.boss.ServerBossBar.players = value; }

// public java.util.Set unmodifiablePlayers() { return wrapperContained.unmodifiablePlayers; }
// public void unmodifiablePlayers(java.util.Set value) { wrapperContained.unmodifiablePlayers = value; }
// public static java.util.Set unmodifiablePlayers() { return net.minecraft.entity.boss.ServerBossBar.unmodifiablePlayers; }
// public static void unmodifiablePlayers(java.util.Set value, ) { net.minecraft.entity.boss.ServerBossBar.unmodifiablePlayers = value; }

// public ServerBossBar(yarnwrap.text.Text displayName,Object color,Object style) { this.wrapperContained = new net.minecraft.entity.boss.ServerBossBar(displayName.wrapperContained,color,style); }
public void addPlayer(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.addPlayer(player.wrapperContained); }
// public static void addPlayer(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.boss.ServerBossBar.addPlayer(player.wrapperContained); }
public void removePlayer(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.removePlayer(player.wrapperContained); }
// public static void removePlayer(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.boss.ServerBossBar.removePlayer(player.wrapperContained); }
// public void sendPacket(java.util.function.Function bossBarToPacketFunction) { wrapperContained.sendPacket(bossBarToPacketFunction); }
// public static void sendPacket(java.util.function.Function bossBarToPacketFunction, ) { net.minecraft.entity.boss.ServerBossBar.sendPacket(bossBarToPacketFunction); }
public void setVisible(boolean visible) { wrapperContained.setVisible(visible); }
// public static void setVisible(boolean visible, ) { net.minecraft.entity.boss.ServerBossBar.setVisible(visible); }
public java.util.Collection getPlayers() { return wrapperContained.getPlayers(); }
// public static java.util.Collection getPlayers() { return net.minecraft.entity.boss.ServerBossBar.getPlayers(); }
public boolean isVisible() { return wrapperContained.isVisible(); }
// public static boolean isVisible() { return net.minecraft.entity.boss.ServerBossBar.isVisible(); }
public void clearPlayers() { wrapperContained.clearPlayers(); }
// public static void clearPlayers() { net.minecraft.entity.boss.ServerBossBar.clearPlayers(); }

}