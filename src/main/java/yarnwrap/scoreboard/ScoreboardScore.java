package yarnwrap.scoreboard;
public class ScoreboardScore { public net.minecraft.scoreboard.ScoreboardScore wrapperContained; public ScoreboardScore(net.minecraft.scoreboard.ScoreboardScore wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean locked() { return wrapperContained.locked; }
// public void locked(boolean value) { wrapperContained.locked = value; }
// public static boolean locked() { return net.minecraft.scoreboard.ScoreboardScore.locked; }
// public static void locked(boolean value, ) { net.minecraft.scoreboard.ScoreboardScore.locked = value; }

// public int score() { return wrapperContained.score; }
// public void score(int value) { wrapperContained.score = value; }
// public static int score() { return net.minecraft.scoreboard.ScoreboardScore.score; }
// public static void score(int value, ) { net.minecraft.scoreboard.ScoreboardScore.score = value; }

// public yarnwrap.text.Text displayText() { return new yarnwrap.text.Text(wrapperContained.displayText); }
// public void displayText(yarnwrap.text.Text value) { wrapperContained.displayText = value.wrapperContained; }
// public static yarnwrap.text.Text displayText() { return new yarnwrap.text.Text(net.minecraft.scoreboard.ScoreboardScore.displayText); }
// public static void displayText(yarnwrap.text.Text value, ) { net.minecraft.scoreboard.ScoreboardScore.displayText = value.wrapperContained; }

// public yarnwrap.scoreboard.number.NumberFormat numberFormat() { return new yarnwrap.scoreboard.number.NumberFormat(wrapperContained.numberFormat); }
// public void numberFormat(yarnwrap.scoreboard.number.NumberFormat value) { wrapperContained.numberFormat = value.wrapperContained; }
// public static yarnwrap.scoreboard.number.NumberFormat numberFormat() { return new yarnwrap.scoreboard.number.NumberFormat(net.minecraft.scoreboard.ScoreboardScore.numberFormat); }
// public static void numberFormat(yarnwrap.scoreboard.number.NumberFormat value, ) { net.minecraft.scoreboard.ScoreboardScore.numberFormat = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.scoreboard.ScoreboardScore.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.scoreboard.ScoreboardScore.CODEC = value; }

// public ScoreboardScore(int score,boolean locked,java.util.Optional displayText,java.util.Optional numberFormat) { this.wrapperContained = new net.minecraft.scoreboard.ScoreboardScore(score,locked,displayText,numberFormat); }
public void setLocked(boolean locked) { wrapperContained.setLocked(locked); }
// public static void setLocked(boolean locked, ) { net.minecraft.scoreboard.ScoreboardScore.setLocked(locked); }
public void setScore(int score) { wrapperContained.setScore(score); }
// public static void setScore(int score, ) { net.minecraft.scoreboard.ScoreboardScore.setScore(score); }
public void setDisplayText(yarnwrap.text.Text text) { wrapperContained.setDisplayText(text.wrapperContained); }
// public static void setDisplayText(yarnwrap.text.Text text, ) { net.minecraft.scoreboard.ScoreboardScore.setDisplayText(text.wrapperContained); }
public void setNumberFormat(yarnwrap.scoreboard.number.NumberFormat numberFormat) { wrapperContained.setNumberFormat(numberFormat.wrapperContained); }
// public static void setNumberFormat(yarnwrap.scoreboard.number.NumberFormat numberFormat, ) { net.minecraft.scoreboard.ScoreboardScore.setNumberFormat(numberFormat.wrapperContained); }
public yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(wrapperContained.getDisplayText()); }
// public static yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(net.minecraft.scoreboard.ScoreboardScore.getDisplayText()); }
// public com.mojang.datafixers.kinds.App method_67450(Object instance) { return wrapperContained.method_67450(instance); }
// public static com.mojang.datafixers.kinds.App method_67450(Object instance, ) { return net.minecraft.scoreboard.ScoreboardScore.method_67450(instance); }
// public java.util.Optional method_67451(yarnwrap.scoreboard.ScoreboardScore score) { return wrapperContained.method_67451(score.wrapperContained); }
// public static java.util.Optional method_67451(yarnwrap.scoreboard.ScoreboardScore score, ) { return net.minecraft.scoreboard.ScoreboardScore.method_67451(score.wrapperContained); }
// public java.util.Optional method_67452(yarnwrap.scoreboard.ScoreboardScore score) { return wrapperContained.method_67452(score.wrapperContained); }
// public static java.util.Optional method_67452(yarnwrap.scoreboard.ScoreboardScore score, ) { return net.minecraft.scoreboard.ScoreboardScore.method_67452(score.wrapperContained); }

}