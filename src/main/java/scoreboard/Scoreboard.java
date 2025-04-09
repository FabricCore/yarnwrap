package yarnwrap.scoreboard;
public class Scoreboard { public net.minecraft.scoreboard.Scoreboard wrapperContained; public Scoreboard(net.minecraft.scoreboard.Scoreboard wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectMap teams() { return wrapperContained.teams; }
// public it.unimi.dsi.fastutil.objects.Object2ObjectMap teamsByScoreHolder() { return wrapperContained.teamsByScoreHolder; }
// public it.unimi.dsi.fastutil.objects.Object2ObjectMap objectives() { return wrapperContained.objectives; }
// public it.unimi.dsi.fastutil.objects.Reference2ObjectMap objectivesByCriterion() { return wrapperContained.objectivesByCriterion; }
// public java.util.Map scores() { return wrapperContained.scores; }
// public java.util.Map objectiveSlots() { return wrapperContained.objectiveSlots; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public void clearDeadEntity(yarnwrap.entity.Entity entity) { wrapperContained.clearDeadEntity(entity.wrapperContained); }
public java.util.Collection getObjectives() { return wrapperContained.getObjectives(); }
public void onScoreHolderRemoved(yarnwrap.scoreboard.ScoreHolder scoreHolder) { wrapperContained.onScoreHolderRemoved(scoreHolder.wrapperContained); }
public yarnwrap.scoreboard.Team getTeam(java.lang.String name) { return new yarnwrap.scoreboard.Team(wrapperContained.getTeam(name)); }
public void updateScoreboardTeam(yarnwrap.scoreboard.Team team) { wrapperContained.updateScoreboardTeam(team.wrapperContained); }
public void removeScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.removeScore(scoreHolder.wrapperContained,objective.wrapperContained); }
public void removeScoreHolderFromTeam(java.lang.String scoreHolderName,yarnwrap.scoreboard.Team team) { wrapperContained.removeScoreHolderFromTeam(scoreHolderName,team.wrapperContained); }
public void setObjectiveSlot(yarnwrap.scoreboard.ScoreboardDisplaySlot slot,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.setObjectiveSlot(slot.wrapperContained,objective.wrapperContained); }
public java.util.Collection getTeams() { return wrapperContained.getTeams(); }
public void updateScoreboardTeamAndPlayers(yarnwrap.scoreboard.Team team) { wrapperContained.updateScoreboardTeamAndPlayers(team.wrapperContained); }
public void forEachScore(yarnwrap.scoreboard.ScoreboardCriterion criterion,yarnwrap.scoreboard.ScoreHolder scoreHolder,java.util.function.Consumer action) { wrapperContained.forEachScore(criterion.wrapperContained,scoreHolder.wrapperContained,action); }
public java.util.Collection getObjectiveNames() { return wrapperContained.getObjectiveNames(); }
public yarnwrap.scoreboard.Team getScoreHolderTeam(java.lang.String scoreHolderName) { return new yarnwrap.scoreboard.Team(wrapperContained.getScoreHolderTeam(scoreHolderName)); }
public it.unimi.dsi.fastutil.objects.Object2IntMap getScoreHolderObjectives(yarnwrap.scoreboard.ScoreHolder scoreHolder) { return wrapperContained.getScoreHolderObjectives(scoreHolder.wrapperContained); }
// public yarnwrap.scoreboard.ScoreboardObjective addObjective(java.lang.String name,yarnwrap.scoreboard.ScoreboardCriterion criterion,yarnwrap.text.Text displayName,Object renderType,boolean displayAutoUpdate,yarnwrap.scoreboard.number.NumberFormat numberFormat) { return new yarnwrap.scoreboard.ScoreboardObjective(wrapperContained.addObjective(name,criterion.wrapperContained,displayName.wrapperContained,renderType,displayAutoUpdate,numberFormat.wrapperContained)); }
// public yarnwrap.nbt.NbtList toNbt(Object registries) { return new yarnwrap.nbt.NbtList(wrapperContained.toNbt(registries)); }
public yarnwrap.scoreboard.ScoreboardObjective getNullableObjective(java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardObjective(wrapperContained.getNullableObjective(name)); }
public yarnwrap.scoreboard.Team addTeam(java.lang.String name) { return new yarnwrap.scoreboard.Team(wrapperContained.addTeam(name)); }
public boolean addScoreHolderToTeam(java.lang.String scoreHolderName,yarnwrap.scoreboard.Team team) { return wrapperContained.addScoreHolderToTeam(scoreHolderName,team.wrapperContained); }
public void updateRemovedObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.updateRemovedObjective(objective.wrapperContained); }
public void updateExistingObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.updateExistingObjective(objective.wrapperContained); }
// public void updateScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective,yarnwrap.scoreboard.ScoreboardScore score) { wrapperContained.updateScore(scoreHolder.wrapperContained,objective.wrapperContained,score.wrapperContained); }
public java.util.Collection getKnownScoreHolders() { return wrapperContained.getKnownScoreHolders(); }
public yarnwrap.scoreboard.ScoreAccess getOrCreateScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { return new yarnwrap.scoreboard.ScoreAccess(wrapperContained.getOrCreateScore(scoreHolder.wrapperContained,objective.wrapperContained)); }
public java.util.Collection getScoreboardEntries(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.getScoreboardEntries(objective.wrapperContained); }
public void updateObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.updateObjective(objective.wrapperContained); }
// public void readNbt(yarnwrap.nbt.NbtList list,Object registries) { wrapperContained.readNbt(list.wrapperContained,registries); }
public yarnwrap.scoreboard.ScoreboardObjective getObjectiveForSlot(yarnwrap.scoreboard.ScoreboardDisplaySlot slot) { return new yarnwrap.scoreboard.ScoreboardObjective(wrapperContained.getObjectiveForSlot(slot.wrapperContained)); }
public void onScoreRemoved(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.onScoreRemoved(scoreHolder.wrapperContained,objective.wrapperContained); }
public void removeTeam(yarnwrap.scoreboard.Team team) { wrapperContained.removeTeam(team.wrapperContained); }
public void updateRemovedTeam(yarnwrap.scoreboard.Team team) { wrapperContained.updateRemovedTeam(team.wrapperContained); }
public void removeObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.removeObjective(objective.wrapperContained); }
public boolean clearTeam(java.lang.String scoreHolderName) { return wrapperContained.clearTeam(scoreHolderName); }
public java.util.Collection getTeamNames() { return wrapperContained.getTeamNames(); }
// public void resetScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.resetScore(scoreHolder.wrapperContained,objective.wrapperContained); }
public yarnwrap.scoreboard.ScoreAccess getOrCreateScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective,boolean forceWritable) { return new yarnwrap.scoreboard.ScoreAccess(wrapperContained.getOrCreateScore(scoreHolder.wrapperContained,objective.wrapperContained,forceWritable)); }
public void removeScores(yarnwrap.scoreboard.ScoreHolder scoreHolder) { wrapperContained.removeScores(scoreHolder.wrapperContained); }
public yarnwrap.scoreboard.ReadableScoreboardScore getScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { return new yarnwrap.scoreboard.ReadableScoreboardScore(wrapperContained.getScore(scoreHolder.wrapperContained,objective.wrapperContained)); }
// public yarnwrap.scoreboard.Scores getScores(java.lang.String scoreHolderName) { return new yarnwrap.scoreboard.Scores(wrapperContained.getScores(scoreHolderName)); }

}