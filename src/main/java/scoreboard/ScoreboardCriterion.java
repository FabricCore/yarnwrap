package yarnwrap.scoreboard;
public class ScoreboardCriterion { public net.minecraft.scoreboard.ScoreboardCriterion wrapperContained; public ScoreboardCriterion(net.minecraft.scoreboard.ScoreboardCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public java.util.Map CRITERIA() { return wrapperContained.CRITERIA; }
public net.minecraft.scoreboard.ScoreboardCriterion[] KILLED_BY_TEAMS() { return wrapperContained.KILLED_BY_TEAMS; }
// public boolean readOnly() { return wrapperContained.readOnly; }
public net.minecraft.scoreboard.ScoreboardCriterion[] TEAM_KILLS() { return wrapperContained.TEAM_KILLS; }
// public Object defaultRenderType() { return wrapperContained.defaultRenderType; }
// public java.util.Map SIMPLE_CRITERIA() { return wrapperContained.SIMPLE_CRITERIA; }
// public java.util.Optional getOrCreateStatCriterion(yarnwrap.stat.StatType statType,yarnwrap.util.Identifier id) { return wrapperContained.getOrCreateStatCriterion(statType.wrapperContained,id.wrapperContained); }
public java.util.Optional getOrCreateStatCriterion(java.lang.String name) { return wrapperContained.getOrCreateStatCriterion(name); }
public java.lang.String getName() { return wrapperContained.getName(); }
public boolean isReadOnly() { return wrapperContained.isReadOnly(); }
public Object getDefaultRenderType() { return wrapperContained.getDefaultRenderType(); }
// public yarnwrap.scoreboard.ScoreboardCriterion create(java.lang.String name,boolean readOnly,Object defaultRenderType) { return new yarnwrap.scoreboard.ScoreboardCriterion(wrapperContained.create(name,readOnly,defaultRenderType)); }
// public yarnwrap.scoreboard.ScoreboardCriterion create(java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardCriterion(wrapperContained.create(name)); }
public java.util.Set getAllSimpleCriteria() { return wrapperContained.getAllSimpleCriteria(); }

}