package yarnwrap.scoreboard;
public class ServerScoreboard { public net.minecraft.scoreboard.ServerScoreboard wrapperContained; public ServerScoreboard(net.minecraft.scoreboard.ServerScoreboard wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List updateListeners() { return wrapperContained.updateListeners; }
// public void updateListeners(java.util.List value) { wrapperContained.updateListeners = value; }
// public static java.util.List updateListeners() { return net.minecraft.scoreboard.ServerScoreboard.updateListeners; }
// public static void updateListeners(java.util.List value, ) { net.minecraft.scoreboard.ServerScoreboard.updateListeners = value; }

// public java.util.Set syncableObjectives() { return wrapperContained.syncableObjectives; }
// public void syncableObjectives(java.util.Set value) { wrapperContained.syncableObjectives = value; }
// public static java.util.Set syncableObjectives() { return net.minecraft.scoreboard.ServerScoreboard.syncableObjectives; }
// public static void syncableObjectives(java.util.Set value, ) { net.minecraft.scoreboard.ServerScoreboard.syncableObjectives = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.scoreboard.ServerScoreboard.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.scoreboard.ServerScoreboard.server = value.wrapperContained; }

// public yarnwrap.world.PersistentStateType STATE_TYPE() { return new yarnwrap.world.PersistentStateType(wrapperContained.STATE_TYPE); }
// public void STATE_TYPE(yarnwrap.world.PersistentStateType value) { wrapperContained.STATE_TYPE = value.wrapperContained; }
public static yarnwrap.world.PersistentStateType STATE_TYPE() { return new yarnwrap.world.PersistentStateType(net.minecraft.scoreboard.ServerScoreboard.STATE_TYPE); }
// public static void STATE_TYPE(yarnwrap.world.PersistentStateType value, ) { net.minecraft.scoreboard.ServerScoreboard.STATE_TYPE = value.wrapperContained; }

public ServerScoreboard(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.scoreboard.ServerScoreboard(server.wrapperContained); }
public void addUpdateListener(java.lang.Runnable listener) { wrapperContained.addUpdateListener(listener); }
// public static void addUpdateListener(java.lang.Runnable listener, ) { net.minecraft.scoreboard.ServerScoreboard.addUpdateListener(listener); }
public int countDisplaySlots(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.countDisplaySlots(objective.wrapperContained); }
// public static int countDisplaySlots(yarnwrap.scoreboard.ScoreboardObjective objective, ) { return net.minecraft.scoreboard.ServerScoreboard.countDisplaySlots(objective.wrapperContained); }
public java.util.List createChangePackets(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.createChangePackets(objective.wrapperContained); }
// public static java.util.List createChangePackets(yarnwrap.scoreboard.ScoreboardObjective objective, ) { return net.minecraft.scoreboard.ServerScoreboard.createChangePackets(objective.wrapperContained); }
public void stopSyncing(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.stopSyncing(objective.wrapperContained); }
// public static void stopSyncing(yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.ServerScoreboard.stopSyncing(objective.wrapperContained); }
public void startSyncing(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.startSyncing(objective.wrapperContained); }
// public static void startSyncing(yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.ServerScoreboard.startSyncing(objective.wrapperContained); }
public java.util.List createRemovePackets(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.createRemovePackets(objective.wrapperContained); }
// public static java.util.List createRemovePackets(yarnwrap.scoreboard.ScoreboardObjective objective, ) { return net.minecraft.scoreboard.ServerScoreboard.createRemovePackets(objective.wrapperContained); }
// public void runUpdateListeners() { wrapperContained.runUpdateListeners(); }
// public static void runUpdateListeners() { net.minecraft.scoreboard.ServerScoreboard.runUpdateListeners(); }
// public yarnwrap.scoreboard.ScoreboardState unpackState(Object packedState) { return new yarnwrap.scoreboard.ScoreboardState(wrapperContained.unpackState(packedState)); }
// public static yarnwrap.scoreboard.ScoreboardState unpackState(Object packedState, ) { return new yarnwrap.scoreboard.ScoreboardState(net.minecraft.scoreboard.ServerScoreboard.unpackState(packedState)); }
// public yarnwrap.scoreboard.ScoreboardState createState() { return new yarnwrap.scoreboard.ScoreboardState(wrapperContained.createState()); }
// public static yarnwrap.scoreboard.ScoreboardState createState() { return new yarnwrap.scoreboard.ScoreboardState(net.minecraft.scoreboard.ServerScoreboard.createState()); }
// public com.mojang.serialization.Codec method_67325(Object context) { return wrapperContained.method_67325(context); }
// public static com.mojang.serialization.Codec method_67325(Object context, ) { return net.minecraft.scoreboard.ServerScoreboard.method_67325(context); }
// public yarnwrap.scoreboard.ScoreboardState method_67326(Object context) { return new yarnwrap.scoreboard.ScoreboardState(wrapperContained.method_67326(context)); }
// public static yarnwrap.scoreboard.ScoreboardState method_67326(Object context, ) { return new yarnwrap.scoreboard.ScoreboardState(net.minecraft.scoreboard.ServerScoreboard.method_67326(context)); }
// public void method_70593(yarnwrap.server.world.ServerWorld player) { wrapperContained.method_70593(player.wrapperContained); }
// public static void method_70593(yarnwrap.server.world.ServerWorld player, ) { net.minecraft.scoreboard.ServerScoreboard.method_70593(player.wrapperContained); }
// public void refreshWaypointTrackingFor(yarnwrap.scoreboard.Team team) { wrapperContained.refreshWaypointTrackingFor(team.wrapperContained); }
// public static void refreshWaypointTrackingFor(yarnwrap.scoreboard.Team team, ) { net.minecraft.scoreboard.ServerScoreboard.refreshWaypointTrackingFor(team.wrapperContained); }
// public void refreshWaypointTrackingFor(java.lang.String playerName) { wrapperContained.refreshWaypointTrackingFor(playerName); }
// public static void refreshWaypointTrackingFor(java.lang.String playerName, ) { net.minecraft.scoreboard.ServerScoreboard.refreshWaypointTrackingFor(playerName); }
// public yarnwrap.server.network.ServerPlayerEntity method_70596(java.lang.String playerName) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.method_70596(playerName)); }
// public static yarnwrap.server.network.ServerPlayerEntity method_70596(java.lang.String playerName, ) { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.scoreboard.ServerScoreboard.method_70596(playerName)); }

}