package yarnwrap.server.world;
public class PlayerChunkWatchingManager { public net.minecraft.server.world.PlayerChunkWatchingManager wrapperContained; public PlayerChunkWatchingManager(net.minecraft.server.world.PlayerChunkWatchingManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2BooleanMap watchingPlayers() { return wrapperContained.watchingPlayers; }
// public void watchingPlayers(it.unimi.dsi.fastutil.objects.Object2BooleanMap value) { wrapperContained.watchingPlayers = value; }
public boolean isWatchDisabled(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.isWatchDisabled(player.wrapperContained); }
public java.util.Set getPlayersWatchingChunk() { return wrapperContained.getPlayersWatchingChunk(); }
public void remove(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.remove(player.wrapperContained); }
public void add(yarnwrap.server.network.ServerPlayerEntity player,boolean inactive) { wrapperContained.add(player.wrapperContained,inactive); }
public void disableWatch(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.disableWatch(player.wrapperContained); }
public void enableWatch(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.enableWatch(player.wrapperContained); }
public boolean isWatchInactive(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.isWatchInactive(player.wrapperContained); }

}