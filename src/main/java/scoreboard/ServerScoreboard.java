package yarnwrap.scoreboard;
public class ServerScoreboard { public net.minecraft.scoreboard.ServerScoreboard wrapperContained; public ServerScoreboard(net.minecraft.scoreboard.ServerScoreboard wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List updateListeners() { return wrapperContained.updateListeners; }
// public java.util.Set objectives() { return wrapperContained.objectives; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
public void addUpdateListener(java.lang.Runnable listener) { wrapperContained.addUpdateListener(listener); }
public int getSlot(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.getSlot(objective.wrapperContained); }
public java.util.List createChangePackets(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.createChangePackets(objective.wrapperContained); }
public void removeScoreboardObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.removeScoreboardObjective(objective.wrapperContained); }
public void addScoreboardObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.addScoreboardObjective(objective.wrapperContained); }
public java.util.List createRemovePackets(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.createRemovePackets(objective.wrapperContained); }
// public void runUpdateListeners() { wrapperContained.runUpdateListeners(); }
// public yarnwrap.scoreboard.ScoreboardState stateFromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.scoreboard.ScoreboardState(wrapperContained.stateFromNbt(nbt.wrapperContained,registryLookup)); }
// public yarnwrap.scoreboard.ScoreboardState createState() { return new yarnwrap.scoreboard.ScoreboardState(wrapperContained.createState()); }
public Object getPersistentStateType() { return wrapperContained.getPersistentStateType(); }

}