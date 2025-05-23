package yarnwrap.scoreboard;
public class ScoreboardState { public net.minecraft.scoreboard.ScoreboardState wrapperContained; public ScoreboardState(net.minecraft.scoreboard.ScoreboardState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.scoreboard); }
// public void scoreboard(yarnwrap.scoreboard.Scoreboard value) { wrapperContained.scoreboard = value.wrapperContained; }
// public static yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(net.minecraft.scoreboard.ScoreboardState.scoreboard); }
// public static void scoreboard(yarnwrap.scoreboard.Scoreboard value, ) { net.minecraft.scoreboard.ScoreboardState.scoreboard = value.wrapperContained; }

// public java.lang.String SCOREBOARD_KEY() { return wrapperContained.SCOREBOARD_KEY; }
// public void SCOREBOARD_KEY(java.lang.String value) { wrapperContained.SCOREBOARD_KEY = value; }
public static java.lang.String SCOREBOARD_KEY() { return net.minecraft.scoreboard.ScoreboardState.SCOREBOARD_KEY; }
// public static void SCOREBOARD_KEY(java.lang.String value, ) { net.minecraft.scoreboard.ScoreboardState.SCOREBOARD_KEY = value; }

public ScoreboardState(yarnwrap.scoreboard.Scoreboard scoreboard) { this.wrapperContained = new net.minecraft.scoreboard.ScoreboardState(scoreboard.wrapperContained); }
public Object pack() { return wrapperContained.pack(); }
// public static Object pack() { return net.minecraft.scoreboard.ScoreboardState.pack(); }
// public void method_67461(yarnwrap.scoreboard.ScoreboardDisplaySlot slot,java.lang.String objectiveName) { wrapperContained.method_67461(slot.wrapperContained,objectiveName); }
// public static void method_67461(yarnwrap.scoreboard.ScoreboardDisplaySlot slot,java.lang.String objectiveName, ) { net.minecraft.scoreboard.ScoreboardState.method_67461(slot.wrapperContained,objectiveName); }
// public void unpack(Object packed) { wrapperContained.unpack(packed); }
// public static void unpack(Object packed, ) { net.minecraft.scoreboard.ScoreboardState.unpack(packed); }

}