package yarnwrap.scoreboard;
public class ScoreboardDisplaySlot { public net.minecraft.scoreboard.ScoreboardDisplaySlot wrapperContained; public ScoreboardDisplaySlot(net.minecraft.scoreboard.ScoreboardDisplaySlot wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
// public static Object CODEC() { return net.minecraft.scoreboard.ScoreboardDisplaySlot.CODEC; }
// // public static void CODEC(Object value, ) { net.minecraft.scoreboard.ScoreboardDisplaySlot.CODEC = value; }

// public java.util.function.IntFunction FROM_ID() { return wrapperContained.FROM_ID; }
// public void FROM_ID(java.util.function.IntFunction value) { wrapperContained.FROM_ID = value; }
public static java.util.function.IntFunction FROM_ID() { return net.minecraft.scoreboard.ScoreboardDisplaySlot.FROM_ID; }
// public static void FROM_ID(java.util.function.IntFunction value, ) { net.minecraft.scoreboard.ScoreboardDisplaySlot.FROM_ID = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.scoreboard.ScoreboardDisplaySlot.id; }
// public static void id(int value, ) { net.minecraft.scoreboard.ScoreboardDisplaySlot.id = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.scoreboard.ScoreboardDisplaySlot.name; }
// public static void name(java.lang.String value, ) { net.minecraft.scoreboard.ScoreboardDisplaySlot.name = value; }

// // public ScoreboardDisplaySlot(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.scoreboard.ScoreboardDisplaySlot(id,name); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.scoreboard.ScoreboardDisplaySlot.getId(); }
// public yarnwrap.scoreboard.ScoreboardDisplaySlot fromFormatting(yarnwrap.util.Formatting formatting) { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(wrapperContained.fromFormatting(formatting.wrapperContained)); }
// public static yarnwrap.scoreboard.ScoreboardDisplaySlot fromFormatting(yarnwrap.util.Formatting formatting, ) { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(net.minecraft.scoreboard.ScoreboardDisplaySlot.fromFormatting(formatting.wrapperContained)); }

}