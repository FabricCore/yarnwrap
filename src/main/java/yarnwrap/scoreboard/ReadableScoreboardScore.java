package yarnwrap.scoreboard;
public class ReadableScoreboardScore { public net.minecraft.scoreboard.ReadableScoreboardScore wrapperContained; public ReadableScoreboardScore(net.minecraft.scoreboard.ReadableScoreboardScore wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isLocked() { return wrapperContained.isLocked(); }
// public static boolean isLocked() { return net.minecraft.scoreboard.ReadableScoreboardScore.isLocked(); }
public int getScore() { return wrapperContained.getScore(); }
// public static int getScore() { return net.minecraft.scoreboard.ReadableScoreboardScore.getScore(); }
// public yarnwrap.text.MutableText getFormattedScore(yarnwrap.scoreboard.ReadableScoreboardScore score,yarnwrap.scoreboard.number.NumberFormat fallbackFormat) { return new yarnwrap.text.MutableText(wrapperContained.getFormattedScore(score.wrapperContained,fallbackFormat.wrapperContained)); }
// public static yarnwrap.text.MutableText getFormattedScore(yarnwrap.scoreboard.ReadableScoreboardScore score,yarnwrap.scoreboard.number.NumberFormat fallbackFormat, ) { return new yarnwrap.text.MutableText(net.minecraft.scoreboard.ReadableScoreboardScore.getFormattedScore(score.wrapperContained,fallbackFormat.wrapperContained)); }
public yarnwrap.text.MutableText getFormattedScore(yarnwrap.scoreboard.number.NumberFormat fallbackFormat) { return new yarnwrap.text.MutableText(wrapperContained.getFormattedScore(fallbackFormat.wrapperContained)); }
// public static yarnwrap.text.MutableText getFormattedScore(yarnwrap.scoreboard.number.NumberFormat fallbackFormat, ) { return new yarnwrap.text.MutableText(net.minecraft.scoreboard.ReadableScoreboardScore.getFormattedScore(fallbackFormat.wrapperContained)); }
public yarnwrap.scoreboard.number.NumberFormat getNumberFormat() { return new yarnwrap.scoreboard.number.NumberFormat(wrapperContained.getNumberFormat()); }
// public static yarnwrap.scoreboard.number.NumberFormat getNumberFormat() { return new yarnwrap.scoreboard.number.NumberFormat(net.minecraft.scoreboard.ReadableScoreboardScore.getNumberFormat()); }

}