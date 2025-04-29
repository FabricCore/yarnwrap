package yarnwrap.scoreboard;
public class ServerScoreboard { public net.minecraft.scoreboard.ServerScoreboard wrapperContained; public ServerScoreboard(net.minecraft.scoreboard.ServerScoreboard wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List updateListeners() { return wrapperContained.updateListeners; }
// public void updateListeners(java.util.List value) { wrapperContained.updateListeners = value; }
// public static java.util.List updateListeners() { return net.minecraft.scoreboard.ServerScoreboard.updateListeners; }
// public static void updateListeners(java.util.List value, ) { net.minecraft.scoreboard.ServerScoreboard.updateListeners = value; }

// public java.util.Set objectives() { return wrapperContained.objectives; }
// public void objectives(java.util.Set value) { wrapperContained.objectives = value; }
// public static java.util.Set objectives() { return net.minecraft.scoreboard.ServerScoreboard.objectives; }
// public static void objectives(java.util.Set value, ) { net.minecraft.scoreboard.ServerScoreboard.objectives = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.scoreboard.ServerScoreboard.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.scoreboard.ServerScoreboard.server = value.wrapperContained; }

public ServerScoreboard(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.scoreboard.ServerScoreboard(server.wrapperContained); }
public void addUpdateListener(java.lang.Runnable listener) { wrapperContained.addUpdateListener(listener); }
// public static void addUpdateListener(java.lang.Runnable listener, ) { net.minecraft.scoreboard.ServerScoreboard.addUpdateListener(listener); }
public int getSlot(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.getSlot(objective.wrapperContained); }
// public static int getSlot(yarnwrap.scoreboard.ScoreboardObjective objective, ) { return net.minecraft.scoreboard.ServerScoreboard.getSlot(objective.wrapperContained); }
public java.util.List createChangePackets(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.createChangePackets(objective.wrapperContained); }
// public static java.util.List createChangePackets(yarnwrap.scoreboard.ScoreboardObjective objective, ) { return net.minecraft.scoreboard.ServerScoreboard.createChangePackets(objective.wrapperContained); }
public void removeScoreboardObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.removeScoreboardObjective(objective.wrapperContained); }
// public static void removeScoreboardObjective(yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.ServerScoreboard.removeScoreboardObjective(objective.wrapperContained); }
public void addScoreboardObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.addScoreboardObjective(objective.wrapperContained); }
// public static void addScoreboardObjective(yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.ServerScoreboard.addScoreboardObjective(objective.wrapperContained); }
public java.util.List createRemovePackets(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.createRemovePackets(objective.wrapperContained); }
// public static java.util.List createRemovePackets(yarnwrap.scoreboard.ScoreboardObjective objective, ) { return net.minecraft.scoreboard.ServerScoreboard.createRemovePackets(objective.wrapperContained); }
// public void runUpdateListeners() { wrapperContained.runUpdateListeners(); }
// public static void runUpdateListeners() { net.minecraft.scoreboard.ServerScoreboard.runUpdateListeners(); }
// public yarnwrap.scoreboard.ScoreboardState stateFromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.scoreboard.ScoreboardState(wrapperContained.stateFromNbt(nbt.wrapperContained,registryLookup)); }
// public static yarnwrap.scoreboard.ScoreboardState stateFromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup, ) { return new yarnwrap.scoreboard.ScoreboardState(net.minecraft.scoreboard.ServerScoreboard.stateFromNbt(nbt.wrapperContained,registryLookup)); }
// public yarnwrap.scoreboard.ScoreboardState createState() { return new yarnwrap.scoreboard.ScoreboardState(wrapperContained.createState()); }
// public static yarnwrap.scoreboard.ScoreboardState createState() { return new yarnwrap.scoreboard.ScoreboardState(net.minecraft.scoreboard.ServerScoreboard.createState()); }
public Object getPersistentStateType() { return wrapperContained.getPersistentStateType(); }
// public static Object getPersistentStateType() { return net.minecraft.scoreboard.ServerScoreboard.getPersistentStateType(); }

}