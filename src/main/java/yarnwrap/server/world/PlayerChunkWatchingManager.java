package yarnwrap.server.world;
public class PlayerChunkWatchingManager { public net.minecraft.server.world.PlayerChunkWatchingManager wrapperContained; public PlayerChunkWatchingManager(net.minecraft.server.world.PlayerChunkWatchingManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2BooleanMap watchingPlayers() { return wrapperContained.watchingPlayers; }
// public void watchingPlayers(it.unimi.dsi.fastutil.objects.Object2BooleanMap value) { wrapperContained.watchingPlayers = value; }
// public static it.unimi.dsi.fastutil.objects.Object2BooleanMap watchingPlayers() { return net.minecraft.server.world.PlayerChunkWatchingManager.watchingPlayers; }
// public static void watchingPlayers(it.unimi.dsi.fastutil.objects.Object2BooleanMap value, ) { net.minecraft.server.world.PlayerChunkWatchingManager.watchingPlayers = value; }

public boolean isWatchDisabled(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.isWatchDisabled(player.wrapperContained); }
// public static boolean isWatchDisabled(yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.world.PlayerChunkWatchingManager.isWatchDisabled(player.wrapperContained); }
public java.util.Set getPlayersWatchingChunk() { return wrapperContained.getPlayersWatchingChunk(); }
// public static java.util.Set getPlayersWatchingChunk() { return net.minecraft.server.world.PlayerChunkWatchingManager.getPlayersWatchingChunk(); }
public void remove(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.remove(player.wrapperContained); }
// public static void remove(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.PlayerChunkWatchingManager.remove(player.wrapperContained); }
public void add(yarnwrap.server.network.ServerPlayerEntity player,boolean inactive) { wrapperContained.add(player.wrapperContained,inactive); }
// public static void add(yarnwrap.server.network.ServerPlayerEntity player,boolean inactive, ) { net.minecraft.server.world.PlayerChunkWatchingManager.add(player.wrapperContained,inactive); }
public void disableWatch(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.disableWatch(player.wrapperContained); }
// public static void disableWatch(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.PlayerChunkWatchingManager.disableWatch(player.wrapperContained); }
public void enableWatch(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.enableWatch(player.wrapperContained); }
// public static void enableWatch(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.PlayerChunkWatchingManager.enableWatch(player.wrapperContained); }
public boolean isWatchInactive(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.isWatchInactive(player.wrapperContained); }
// public static boolean isWatchInactive(yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.world.PlayerChunkWatchingManager.isWatchInactive(player.wrapperContained); }

}