package yarnwrap.scoreboard;
public class Scoreboard { public net.minecraft.scoreboard.Scoreboard wrapperContained; public Scoreboard(net.minecraft.scoreboard.Scoreboard wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectMap teams() { return wrapperContained.teams; }
// public void teams(it.unimi.dsi.fastutil.objects.Object2ObjectMap value) { wrapperContained.teams = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectMap teams() { return net.minecraft.scoreboard.Scoreboard.teams; }
// public static void teams(it.unimi.dsi.fastutil.objects.Object2ObjectMap value, ) { net.minecraft.scoreboard.Scoreboard.teams = value; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectMap teamsByScoreHolder() { return wrapperContained.teamsByScoreHolder; }
// public void teamsByScoreHolder(it.unimi.dsi.fastutil.objects.Object2ObjectMap value) { wrapperContained.teamsByScoreHolder = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectMap teamsByScoreHolder() { return net.minecraft.scoreboard.Scoreboard.teamsByScoreHolder; }
// public static void teamsByScoreHolder(it.unimi.dsi.fastutil.objects.Object2ObjectMap value, ) { net.minecraft.scoreboard.Scoreboard.teamsByScoreHolder = value; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectMap objectives() { return wrapperContained.objectives; }
// public void objectives(it.unimi.dsi.fastutil.objects.Object2ObjectMap value) { wrapperContained.objectives = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectMap objectives() { return net.minecraft.scoreboard.Scoreboard.objectives; }
// public static void objectives(it.unimi.dsi.fastutil.objects.Object2ObjectMap value, ) { net.minecraft.scoreboard.Scoreboard.objectives = value; }

// public it.unimi.dsi.fastutil.objects.Reference2ObjectMap objectivesByCriterion() { return wrapperContained.objectivesByCriterion; }
// public void objectivesByCriterion(it.unimi.dsi.fastutil.objects.Reference2ObjectMap value) { wrapperContained.objectivesByCriterion = value; }
// public static it.unimi.dsi.fastutil.objects.Reference2ObjectMap objectivesByCriterion() { return net.minecraft.scoreboard.Scoreboard.objectivesByCriterion; }
// public static void objectivesByCriterion(it.unimi.dsi.fastutil.objects.Reference2ObjectMap value, ) { net.minecraft.scoreboard.Scoreboard.objectivesByCriterion = value; }

// public java.util.Map scores() { return wrapperContained.scores; }
// public void scores(java.util.Map value) { wrapperContained.scores = value; }
// public static java.util.Map scores() { return net.minecraft.scoreboard.Scoreboard.scores; }
// public static void scores(java.util.Map value, ) { net.minecraft.scoreboard.Scoreboard.scores = value; }

// public java.util.Map objectiveSlots() { return wrapperContained.objectiveSlots; }
// public void objectiveSlots(java.util.Map value) { wrapperContained.objectiveSlots = value; }
// public static java.util.Map objectiveSlots() { return net.minecraft.scoreboard.Scoreboard.objectiveSlots; }
// public static void objectiveSlots(java.util.Map value, ) { net.minecraft.scoreboard.Scoreboard.objectiveSlots = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.scoreboard.Scoreboard.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.scoreboard.Scoreboard.LOGGER = value; }

public void clearDeadEntity(yarnwrap.entity.Entity entity) { wrapperContained.clearDeadEntity(entity.wrapperContained); }
// public static void clearDeadEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.scoreboard.Scoreboard.clearDeadEntity(entity.wrapperContained); }
public java.util.Collection getObjectives() { return wrapperContained.getObjectives(); }
// public static java.util.Collection getObjectives() { return net.minecraft.scoreboard.Scoreboard.getObjectives(); }
public void onScoreHolderRemoved(yarnwrap.scoreboard.ScoreHolder scoreHolder) { wrapperContained.onScoreHolderRemoved(scoreHolder.wrapperContained); }
// public static void onScoreHolderRemoved(yarnwrap.scoreboard.ScoreHolder scoreHolder, ) { net.minecraft.scoreboard.Scoreboard.onScoreHolderRemoved(scoreHolder.wrapperContained); }
public yarnwrap.scoreboard.Team getTeam(java.lang.String name) { return new yarnwrap.scoreboard.Team(wrapperContained.getTeam(name)); }
// public static yarnwrap.scoreboard.Team getTeam(java.lang.String name, ) { return new yarnwrap.scoreboard.Team(net.minecraft.scoreboard.Scoreboard.getTeam(name)); }
public void updateScoreboardTeam(yarnwrap.scoreboard.Team team) { wrapperContained.updateScoreboardTeam(team.wrapperContained); }
// public static void updateScoreboardTeam(yarnwrap.scoreboard.Team team, ) { net.minecraft.scoreboard.Scoreboard.updateScoreboardTeam(team.wrapperContained); }
public void removeScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.removeScore(scoreHolder.wrapperContained,objective.wrapperContained); }
// public static void removeScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.Scoreboard.removeScore(scoreHolder.wrapperContained,objective.wrapperContained); }
public void removeScoreHolderFromTeam(java.lang.String scoreHolderName,yarnwrap.scoreboard.Team team) { wrapperContained.removeScoreHolderFromTeam(scoreHolderName,team.wrapperContained); }
// public static void removeScoreHolderFromTeam(java.lang.String scoreHolderName,yarnwrap.scoreboard.Team team, ) { net.minecraft.scoreboard.Scoreboard.removeScoreHolderFromTeam(scoreHolderName,team.wrapperContained); }
public void setObjectiveSlot(yarnwrap.scoreboard.ScoreboardDisplaySlot slot,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.setObjectiveSlot(slot.wrapperContained,objective.wrapperContained); }
// public static void setObjectiveSlot(yarnwrap.scoreboard.ScoreboardDisplaySlot slot,yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.Scoreboard.setObjectiveSlot(slot.wrapperContained,objective.wrapperContained); }
public java.util.Collection getTeams() { return wrapperContained.getTeams(); }
// public static java.util.Collection getTeams() { return net.minecraft.scoreboard.Scoreboard.getTeams(); }
public void updateScoreboardTeamAndPlayers(yarnwrap.scoreboard.Team team) { wrapperContained.updateScoreboardTeamAndPlayers(team.wrapperContained); }
// public static void updateScoreboardTeamAndPlayers(yarnwrap.scoreboard.Team team, ) { net.minecraft.scoreboard.Scoreboard.updateScoreboardTeamAndPlayers(team.wrapperContained); }
public void forEachScore(yarnwrap.scoreboard.ScoreboardCriterion criterion,yarnwrap.scoreboard.ScoreHolder scoreHolder,java.util.function.Consumer action) { wrapperContained.forEachScore(criterion.wrapperContained,scoreHolder.wrapperContained,action); }
// public static void forEachScore(yarnwrap.scoreboard.ScoreboardCriterion criterion,yarnwrap.scoreboard.ScoreHolder scoreHolder,java.util.function.Consumer action, ) { net.minecraft.scoreboard.Scoreboard.forEachScore(criterion.wrapperContained,scoreHolder.wrapperContained,action); }
public java.util.Collection getObjectiveNames() { return wrapperContained.getObjectiveNames(); }
// public static java.util.Collection getObjectiveNames() { return net.minecraft.scoreboard.Scoreboard.getObjectiveNames(); }
public yarnwrap.scoreboard.Team getScoreHolderTeam(java.lang.String scoreHolderName) { return new yarnwrap.scoreboard.Team(wrapperContained.getScoreHolderTeam(scoreHolderName)); }
// public static yarnwrap.scoreboard.Team getScoreHolderTeam(java.lang.String scoreHolderName, ) { return new yarnwrap.scoreboard.Team(net.minecraft.scoreboard.Scoreboard.getScoreHolderTeam(scoreHolderName)); }
public it.unimi.dsi.fastutil.objects.Object2IntMap getScoreHolderObjectives(yarnwrap.scoreboard.ScoreHolder scoreHolder) { return wrapperContained.getScoreHolderObjectives(scoreHolder.wrapperContained); }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap getScoreHolderObjectives(yarnwrap.scoreboard.ScoreHolder scoreHolder, ) { return net.minecraft.scoreboard.Scoreboard.getScoreHolderObjectives(scoreHolder.wrapperContained); }
// public yarnwrap.scoreboard.ScoreboardObjective addObjective(java.lang.String name,yarnwrap.scoreboard.ScoreboardCriterion criterion,yarnwrap.text.Text displayName,Object renderType,boolean displayAutoUpdate,yarnwrap.scoreboard.number.NumberFormat numberFormat) { return new yarnwrap.scoreboard.ScoreboardObjective(wrapperContained.addObjective(name,criterion.wrapperContained,displayName.wrapperContained,renderType,displayAutoUpdate,numberFormat.wrapperContained)); }
// public static yarnwrap.scoreboard.ScoreboardObjective addObjective(java.lang.String name,yarnwrap.scoreboard.ScoreboardCriterion criterion,yarnwrap.text.Text displayName,Object renderType,boolean displayAutoUpdate,yarnwrap.scoreboard.number.NumberFormat numberFormat, ) { return new yarnwrap.scoreboard.ScoreboardObjective(net.minecraft.scoreboard.Scoreboard.addObjective(name,criterion.wrapperContained,displayName.wrapperContained,renderType,displayAutoUpdate,numberFormat.wrapperContained)); }
public yarnwrap.scoreboard.ScoreboardObjective getNullableObjective(java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardObjective(wrapperContained.getNullableObjective(name)); }
// public static yarnwrap.scoreboard.ScoreboardObjective getNullableObjective(java.lang.String name, ) { return new yarnwrap.scoreboard.ScoreboardObjective(net.minecraft.scoreboard.Scoreboard.getNullableObjective(name)); }
public yarnwrap.scoreboard.Team addTeam(java.lang.String name) { return new yarnwrap.scoreboard.Team(wrapperContained.addTeam(name)); }
// public static yarnwrap.scoreboard.Team addTeam(java.lang.String name, ) { return new yarnwrap.scoreboard.Team(net.minecraft.scoreboard.Scoreboard.addTeam(name)); }
public boolean addScoreHolderToTeam(java.lang.String scoreHolderName,yarnwrap.scoreboard.Team team) { return wrapperContained.addScoreHolderToTeam(scoreHolderName,team.wrapperContained); }
// public static boolean addScoreHolderToTeam(java.lang.String scoreHolderName,yarnwrap.scoreboard.Team team, ) { return net.minecraft.scoreboard.Scoreboard.addScoreHolderToTeam(scoreHolderName,team.wrapperContained); }
public void updateRemovedObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.updateRemovedObjective(objective.wrapperContained); }
// public static void updateRemovedObjective(yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.Scoreboard.updateRemovedObjective(objective.wrapperContained); }
public void updateExistingObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.updateExistingObjective(objective.wrapperContained); }
// public static void updateExistingObjective(yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.Scoreboard.updateExistingObjective(objective.wrapperContained); }
// public void updateScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective,yarnwrap.scoreboard.ScoreboardScore score) { wrapperContained.updateScore(scoreHolder.wrapperContained,objective.wrapperContained,score.wrapperContained); }
// public static void updateScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective,yarnwrap.scoreboard.ScoreboardScore score, ) { net.minecraft.scoreboard.Scoreboard.updateScore(scoreHolder.wrapperContained,objective.wrapperContained,score.wrapperContained); }
public java.util.Collection getKnownScoreHolders() { return wrapperContained.getKnownScoreHolders(); }
// public static java.util.Collection getKnownScoreHolders() { return net.minecraft.scoreboard.Scoreboard.getKnownScoreHolders(); }
// public java.util.List method_1179(java.lang.Object criterion2) { return wrapperContained.method_1179(criterion2); }
// public static java.util.List method_1179(java.lang.Object criterion2, ) { return net.minecraft.scoreboard.Scoreboard.method_1179(criterion2); }
public yarnwrap.scoreboard.ScoreAccess getOrCreateScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { return new yarnwrap.scoreboard.ScoreAccess(wrapperContained.getOrCreateScore(scoreHolder.wrapperContained,objective.wrapperContained)); }
// public static yarnwrap.scoreboard.ScoreAccess getOrCreateScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective, ) { return new yarnwrap.scoreboard.ScoreAccess(net.minecraft.scoreboard.Scoreboard.getOrCreateScore(scoreHolder.wrapperContained,objective.wrapperContained)); }
// public void method_1182(java.util.function.Consumer objective) { wrapperContained.method_1182(objective); }
// public static void method_1182(java.util.function.Consumer objective, ) { net.minecraft.scoreboard.Scoreboard.method_1182(objective); }
public java.util.Collection getScoreboardEntries(yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.getScoreboardEntries(objective.wrapperContained); }
// public static java.util.Collection getScoreboardEntries(yarnwrap.scoreboard.ScoreboardObjective objective, ) { return net.minecraft.scoreboard.Scoreboard.getScoreboardEntries(objective.wrapperContained); }
public void updateObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.updateObjective(objective.wrapperContained); }
// public static void updateObjective(yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.Scoreboard.updateObjective(objective.wrapperContained); }
public yarnwrap.scoreboard.ScoreboardObjective getObjectiveForSlot(yarnwrap.scoreboard.ScoreboardDisplaySlot slot) { return new yarnwrap.scoreboard.ScoreboardObjective(wrapperContained.getObjectiveForSlot(slot.wrapperContained)); }
// public static yarnwrap.scoreboard.ScoreboardObjective getObjectiveForSlot(yarnwrap.scoreboard.ScoreboardDisplaySlot slot, ) { return new yarnwrap.scoreboard.ScoreboardObjective(net.minecraft.scoreboard.Scoreboard.getObjectiveForSlot(slot.wrapperContained)); }
public void onScoreRemoved(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.onScoreRemoved(scoreHolder.wrapperContained,objective.wrapperContained); }
// public static void onScoreRemoved(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.Scoreboard.onScoreRemoved(scoreHolder.wrapperContained,objective.wrapperContained); }
public void removeTeam(yarnwrap.scoreboard.Team team) { wrapperContained.removeTeam(team.wrapperContained); }
// public static void removeTeam(yarnwrap.scoreboard.Team team, ) { net.minecraft.scoreboard.Scoreboard.removeTeam(team.wrapperContained); }
public void updateRemovedTeam(yarnwrap.scoreboard.Team team) { wrapperContained.updateRemovedTeam(team.wrapperContained); }
// public static void updateRemovedTeam(yarnwrap.scoreboard.Team team, ) { net.minecraft.scoreboard.Scoreboard.updateRemovedTeam(team.wrapperContained); }
public void removeObjective(yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.removeObjective(objective.wrapperContained); }
// public static void removeObjective(yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.Scoreboard.removeObjective(objective.wrapperContained); }
public boolean clearTeam(java.lang.String scoreHolderName) { return wrapperContained.clearTeam(scoreHolderName); }
// public static boolean clearTeam(java.lang.String scoreHolderName, ) { return net.minecraft.scoreboard.Scoreboard.clearTeam(scoreHolderName); }
public java.util.Collection getTeamNames() { return wrapperContained.getTeamNames(); }
// public static java.util.Collection getTeamNames() { return net.minecraft.scoreboard.Scoreboard.getTeamNames(); }
// public void resetScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.resetScore(scoreHolder.wrapperContained,objective.wrapperContained); }
// public static void resetScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.scoreboard.Scoreboard.resetScore(scoreHolder.wrapperContained,objective.wrapperContained); }
// public void method_55424(yarnwrap.scoreboard.ScoreboardObjective scoreHolderName,java.util.List scores) { wrapperContained.method_55424(scoreHolderName.wrapperContained,scores); }
// public static void method_55424(yarnwrap.scoreboard.ScoreboardObjective scoreHolderName,java.util.List scores, ) { net.minecraft.scoreboard.Scoreboard.method_55424(scoreHolderName.wrapperContained,scores); }
public yarnwrap.scoreboard.ScoreAccess getOrCreateScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective,boolean forceWritable) { return new yarnwrap.scoreboard.ScoreAccess(wrapperContained.getOrCreateScore(scoreHolder.wrapperContained,objective.wrapperContained,forceWritable)); }
// public static yarnwrap.scoreboard.ScoreAccess getOrCreateScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective,boolean forceWritable, ) { return new yarnwrap.scoreboard.ScoreAccess(net.minecraft.scoreboard.Scoreboard.getOrCreateScore(scoreHolder.wrapperContained,objective.wrapperContained,forceWritable)); }
// public void method_55427(org.apache.commons.lang3.mutable.MutableBoolean score) { wrapperContained.method_55427(score); }
// public static void method_55427(org.apache.commons.lang3.mutable.MutableBoolean score, ) { net.minecraft.scoreboard.Scoreboard.method_55427(score); }
public void removeScores(yarnwrap.scoreboard.ScoreHolder scoreHolder) { wrapperContained.removeScores(scoreHolder.wrapperContained); }
// public static void removeScores(yarnwrap.scoreboard.ScoreHolder scoreHolder, ) { net.minecraft.scoreboard.Scoreboard.removeScores(scoreHolder.wrapperContained); }
public yarnwrap.scoreboard.ReadableScoreboardScore getScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { return new yarnwrap.scoreboard.ReadableScoreboardScore(wrapperContained.getScore(scoreHolder.wrapperContained,objective.wrapperContained)); }
// public static yarnwrap.scoreboard.ReadableScoreboardScore getScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective, ) { return new yarnwrap.scoreboard.ReadableScoreboardScore(net.minecraft.scoreboard.Scoreboard.getScore(scoreHolder.wrapperContained,objective.wrapperContained)); }
// public yarnwrap.scoreboard.Scores getScores(java.lang.String scoreHolderName) { return new yarnwrap.scoreboard.Scores(wrapperContained.getScores(scoreHolderName)); }
// public static yarnwrap.scoreboard.Scores getScores(java.lang.String scoreHolderName, ) { return new yarnwrap.scoreboard.Scores(net.minecraft.scoreboard.Scoreboard.getScores(scoreHolderName)); }
// public yarnwrap.scoreboard.Scores method_55432(java.lang.String name) { return new yarnwrap.scoreboard.Scores(wrapperContained.method_55432(name)); }
// public static yarnwrap.scoreboard.Scores method_55432(java.lang.String name, ) { return new yarnwrap.scoreboard.Scores(net.minecraft.scoreboard.Scoreboard.method_55432(name)); }
// public void addObjective(Object packedObjective) { wrapperContained.addObjective(packedObjective); }
// public static void addObjective(Object packedObjective, ) { net.minecraft.scoreboard.Scoreboard.addObjective(packedObjective); }
// public void addTeam(Object packedTeam) { wrapperContained.addTeam(packedTeam); }
// public static void addTeam(Object packedTeam, ) { net.minecraft.scoreboard.Scoreboard.addTeam(packedTeam); }
// public void addEntry(Object packedEntry) { wrapperContained.addEntry(packedEntry); }
// public static void addEntry(Object packedEntry, ) { net.minecraft.scoreboard.Scoreboard.addEntry(packedEntry); }
// public Object method_67456(java.lang.String entryx) { return wrapperContained.method_67456(entryx); }
// public static Object method_67456(java.lang.String entryx, ) { return net.minecraft.scoreboard.Scoreboard.method_67456(entryx); }
// public java.util.stream.Stream method_67457(Object entry) { return wrapperContained.method_67457(entry); }
// public static java.util.stream.Stream method_67457(Object entry, ) { return net.minecraft.scoreboard.Scoreboard.method_67457(entry); }
// public java.util.List pack() { return wrapperContained.pack(); }
// public static java.util.List pack() { return net.minecraft.scoreboard.Scoreboard.pack(); }

}