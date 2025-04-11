package yarnwrap.scoreboard;
public class ReadableScoreboardScore { public net.minecraft.scoreboard.ReadableScoreboardScore wrapperContained; public ReadableScoreboardScore(net.minecraft.scoreboard.ReadableScoreboardScore wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isLocked() { return wrapperContained.isLocked(); }
public int getScore() { return wrapperContained.getScore(); }
// public yarnwrap.text.MutableText getFormattedScore(yarnwrap.scoreboard.ReadableScoreboardScore score,yarnwrap.scoreboard.number.NumberFormat fallbackFormat) { return new yarnwrap.text.MutableText(wrapperContained.getFormattedScore(score.wrapperContained,fallbackFormat.wrapperContained)); }
public yarnwrap.text.MutableText getFormattedScore(yarnwrap.scoreboard.number.NumberFormat fallbackFormat) { return new yarnwrap.text.MutableText(wrapperContained.getFormattedScore(fallbackFormat.wrapperContained)); }
public yarnwrap.scoreboard.number.NumberFormat getNumberFormat() { return new yarnwrap.scoreboard.number.NumberFormat(wrapperContained.getNumberFormat()); }

}