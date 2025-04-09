package yarnwrap.scoreboard;
public class ScoreboardDisplaySlot { public net.minecraft.scoreboard.ScoreboardDisplaySlot wrapperContained; public ScoreboardDisplaySlot(net.minecraft.scoreboard.ScoreboardDisplaySlot wrapperContained) { this.wrapperContained = wrapperContained; }

public Object CODEC() { return wrapperContained.CODEC; }
public java.util.function.IntFunction FROM_ID() { return wrapperContained.FROM_ID; }
// public int id() { return wrapperContained.id; }
// public java.lang.String name() { return wrapperContained.name; }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.scoreboard.ScoreboardDisplaySlot fromFormatting(yarnwrap.util.Formatting formatting) { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(wrapperContained.fromFormatting(formatting.wrapperContained)); }

}