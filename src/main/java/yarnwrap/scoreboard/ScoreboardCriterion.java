package yarnwrap.scoreboard;
public class ScoreboardCriterion { public net.minecraft.scoreboard.ScoreboardCriterion wrapperContained; public ScoreboardCriterion(net.minecraft.scoreboard.ScoreboardCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.scoreboard.ScoreboardCriterion.name; }
// public static void name(java.lang.String value, ) { net.minecraft.scoreboard.ScoreboardCriterion.name = value; }

// public java.util.Map CRITERIA() { return wrapperContained.CRITERIA; }
// public void CRITERIA(java.util.Map value) { wrapperContained.CRITERIA = value; }
// public static java.util.Map CRITERIA() { return net.minecraft.scoreboard.ScoreboardCriterion.CRITERIA; }
// public static void CRITERIA(java.util.Map value, ) { net.minecraft.scoreboard.ScoreboardCriterion.CRITERIA = value; }

// public net.minecraft.scoreboard.ScoreboardCriterion[] KILLED_BY_TEAMS() { return wrapperContained.KILLED_BY_TEAMS; }
// public void KILLED_BY_TEAMS(net.minecraft.scoreboard.ScoreboardCriterion[] value) { wrapperContained.KILLED_BY_TEAMS = value; }
public static net.minecraft.scoreboard.ScoreboardCriterion[] KILLED_BY_TEAMS() { return net.minecraft.scoreboard.ScoreboardCriterion.KILLED_BY_TEAMS; }
// public static void KILLED_BY_TEAMS(net.minecraft.scoreboard.ScoreboardCriterion[] value, ) { net.minecraft.scoreboard.ScoreboardCriterion.KILLED_BY_TEAMS = value; }

// public boolean readOnly() { return wrapperContained.readOnly; }
// public void readOnly(boolean value) { wrapperContained.readOnly = value; }
// public static boolean readOnly() { return net.minecraft.scoreboard.ScoreboardCriterion.readOnly; }
// public static void readOnly(boolean value, ) { net.minecraft.scoreboard.ScoreboardCriterion.readOnly = value; }

// public net.minecraft.scoreboard.ScoreboardCriterion[] TEAM_KILLS() { return wrapperContained.TEAM_KILLS; }
// public void TEAM_KILLS(net.minecraft.scoreboard.ScoreboardCriterion[] value) { wrapperContained.TEAM_KILLS = value; }
public static net.minecraft.scoreboard.ScoreboardCriterion[] TEAM_KILLS() { return net.minecraft.scoreboard.ScoreboardCriterion.TEAM_KILLS; }
// public static void TEAM_KILLS(net.minecraft.scoreboard.ScoreboardCriterion[] value, ) { net.minecraft.scoreboard.ScoreboardCriterion.TEAM_KILLS = value; }

// public Object defaultRenderType() { return wrapperContained.defaultRenderType; }
// // public void defaultRenderType(Object value) { wrapperContained.defaultRenderType = value; }
// // public static Object defaultRenderType() { return net.minecraft.scoreboard.ScoreboardCriterion.defaultRenderType; }
// // public static void defaultRenderType(Object value, ) { net.minecraft.scoreboard.ScoreboardCriterion.defaultRenderType = value; }

// public java.util.Map SIMPLE_CRITERIA() { return wrapperContained.SIMPLE_CRITERIA; }
// public void SIMPLE_CRITERIA(java.util.Map value) { wrapperContained.SIMPLE_CRITERIA = value; }
// public static java.util.Map SIMPLE_CRITERIA() { return net.minecraft.scoreboard.ScoreboardCriterion.SIMPLE_CRITERIA; }
// public static void SIMPLE_CRITERIA(java.util.Map value, ) { net.minecraft.scoreboard.ScoreboardCriterion.SIMPLE_CRITERIA = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.scoreboard.ScoreboardCriterion.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.scoreboard.ScoreboardCriterion.CODEC = value; }

// public ScoreboardCriterion(java.lang.String name) { this.wrapperContained = new net.minecraft.scoreboard.ScoreboardCriterion(name); }
// public ScoreboardCriterion(java.lang.String name,boolean readOnly,Object defaultRenderType) { this.wrapperContained = new net.minecraft.scoreboard.ScoreboardCriterion(name,readOnly,defaultRenderType); }
// public java.util.Optional getOrCreateStatCriterion(yarnwrap.stat.StatType statType,yarnwrap.util.Identifier id) { return wrapperContained.getOrCreateStatCriterion(statType.wrapperContained,id.wrapperContained); }
// public static java.util.Optional getOrCreateStatCriterion(yarnwrap.stat.StatType statType,yarnwrap.util.Identifier id, ) { return net.minecraft.scoreboard.ScoreboardCriterion.getOrCreateStatCriterion(statType.wrapperContained,id.wrapperContained); }
// public java.util.Optional getOrCreateStatCriterion(java.lang.String name) { return wrapperContained.getOrCreateStatCriterion(name); }
// public static java.util.Optional getOrCreateStatCriterion(java.lang.String name, ) { return net.minecraft.scoreboard.ScoreboardCriterion.getOrCreateStatCriterion(name); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.scoreboard.ScoreboardCriterion.getName(); }
public boolean isReadOnly() { return wrapperContained.isReadOnly(); }
// public static boolean isReadOnly() { return net.minecraft.scoreboard.ScoreboardCriterion.isReadOnly(); }
public Object getDefaultRenderType() { return wrapperContained.getDefaultRenderType(); }
// public static Object getDefaultRenderType() { return net.minecraft.scoreboard.ScoreboardCriterion.getDefaultRenderType(); }
// public java.util.Optional method_17948(java.lang.String type) { return wrapperContained.method_17948(type); }
// public static java.util.Optional method_17948(java.lang.String type, ) { return net.minecraft.scoreboard.ScoreboardCriterion.method_17948(type); }
// public yarnwrap.scoreboard.ScoreboardCriterion create(java.lang.String name,boolean readOnly,Object defaultRenderType) { return new yarnwrap.scoreboard.ScoreboardCriterion(wrapperContained.create(name,readOnly,defaultRenderType)); }
// public static yarnwrap.scoreboard.ScoreboardCriterion create(java.lang.String name,boolean readOnly,Object defaultRenderType, ) { return new yarnwrap.scoreboard.ScoreboardCriterion(net.minecraft.scoreboard.ScoreboardCriterion.create(name,readOnly,defaultRenderType)); }
// public yarnwrap.scoreboard.ScoreboardCriterion create(java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardCriterion(wrapperContained.create(name)); }
// public static yarnwrap.scoreboard.ScoreboardCriterion create(java.lang.String name, ) { return new yarnwrap.scoreboard.ScoreboardCriterion(net.minecraft.scoreboard.ScoreboardCriterion.create(name)); }
// public java.util.Set getAllSimpleCriteria() { return wrapperContained.getAllSimpleCriteria(); }
public static java.util.Set getAllSimpleCriteria() { return net.minecraft.scoreboard.ScoreboardCriterion.getAllSimpleCriteria(); }
// public com.mojang.serialization.DataResult method_67466(java.lang.String name) { return wrapperContained.method_67466(name); }
// public static com.mojang.serialization.DataResult method_67466(java.lang.String name, ) { return net.minecraft.scoreboard.ScoreboardCriterion.method_67466(name); }

}