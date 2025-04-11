package yarnwrap.scoreboard;
public class ScoreboardDisplaySlot { public net.minecraft.scoreboard.ScoreboardDisplaySlot wrapperContained; public ScoreboardDisplaySlot(net.minecraft.scoreboard.ScoreboardDisplaySlot wrapperContained) { this.wrapperContained = wrapperContained; }

public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
public java.util.function.IntFunction FROM_ID() { return wrapperContained.FROM_ID; }
// public void FROM_ID(java.util.function.IntFunction value) { wrapperContained.FROM_ID = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// // public ScoreboardDisplaySlot(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.scoreboard.ScoreboardDisplaySlot(id,name); }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.scoreboard.ScoreboardDisplaySlot fromFormatting(yarnwrap.util.Formatting formatting) { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(wrapperContained.fromFormatting(formatting.wrapperContained)); }

}