package yarnwrap.scoreboard;
public class ScoreboardCriterion { public net.minecraft.scoreboard.ScoreboardCriterion wrapperContained; public ScoreboardCriterion(net.minecraft.scoreboard.ScoreboardCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.util.Map CRITERIA() { return wrapperContained.CRITERIA; }
// public void CRITERIA(java.util.Map value) { wrapperContained.CRITERIA = value; }
public net.minecraft.scoreboard.ScoreboardCriterion[] KILLED_BY_TEAMS() { return wrapperContained.KILLED_BY_TEAMS; }
// public void KILLED_BY_TEAMS(net.minecraft.scoreboard.ScoreboardCriterion[] value) { wrapperContained.KILLED_BY_TEAMS = value; }
// public boolean readOnly() { return wrapperContained.readOnly; }
// public void readOnly(boolean value) { wrapperContained.readOnly = value; }
public net.minecraft.scoreboard.ScoreboardCriterion[] TEAM_KILLS() { return wrapperContained.TEAM_KILLS; }
// public void TEAM_KILLS(net.minecraft.scoreboard.ScoreboardCriterion[] value) { wrapperContained.TEAM_KILLS = value; }
// public Object defaultRenderType() { return wrapperContained.defaultRenderType; }
// // public void defaultRenderType(Object value) { wrapperContained.defaultRenderType = value; }
// public java.util.Map SIMPLE_CRITERIA() { return wrapperContained.SIMPLE_CRITERIA; }
// public void SIMPLE_CRITERIA(java.util.Map value) { wrapperContained.SIMPLE_CRITERIA = value; }
// public ScoreboardCriterion(java.lang.String name) { this.wrapperContained = new net.minecraft.scoreboard.ScoreboardCriterion(name); }
// public ScoreboardCriterion(java.lang.String name,boolean readOnly,Object defaultRenderType) { this.wrapperContained = new net.minecraft.scoreboard.ScoreboardCriterion(name,readOnly,defaultRenderType); }
// public java.util.Optional getOrCreateStatCriterion(yarnwrap.stat.StatType statType,yarnwrap.util.Identifier id) { return wrapperContained.getOrCreateStatCriterion(statType.wrapperContained,id.wrapperContained); }
public java.util.Optional getOrCreateStatCriterion(java.lang.String name) { return wrapperContained.getOrCreateStatCriterion(name); }
public java.lang.String getName() { return wrapperContained.getName(); }
public boolean isReadOnly() { return wrapperContained.isReadOnly(); }
public Object getDefaultRenderType() { return wrapperContained.getDefaultRenderType(); }
// public java.util.Optional method_17948(java.lang.String type) { return wrapperContained.method_17948(type); }
// public yarnwrap.scoreboard.ScoreboardCriterion create(java.lang.String name,boolean readOnly,Object defaultRenderType) { return new yarnwrap.scoreboard.ScoreboardCriterion(wrapperContained.create(name,readOnly,defaultRenderType)); }
// public yarnwrap.scoreboard.ScoreboardCriterion create(java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardCriterion(wrapperContained.create(name)); }
public java.util.Set getAllSimpleCriteria() { return wrapperContained.getAllSimpleCriteria(); }

}