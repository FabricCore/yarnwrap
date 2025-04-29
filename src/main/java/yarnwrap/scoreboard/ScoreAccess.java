package yarnwrap.scoreboard;
public class ScoreAccess { public net.minecraft.scoreboard.ScoreAccess wrapperContained; public ScoreAccess(net.minecraft.scoreboard.ScoreAccess wrapperContained) { this.wrapperContained = wrapperContained; }

public int getScore() { return wrapperContained.getScore(); }
// public static int getScore() { return net.minecraft.scoreboard.ScoreAccess.getScore(); }
public void setScore(int score) { wrapperContained.setScore(score); }
// public static void setScore(int score, ) { net.minecraft.scoreboard.ScoreAccess.setScore(score); }
public void setDisplayText(yarnwrap.text.Text text) { wrapperContained.setDisplayText(text.wrapperContained); }
// public static void setDisplayText(yarnwrap.text.Text text, ) { net.minecraft.scoreboard.ScoreAccess.setDisplayText(text.wrapperContained); }
public void setNumberFormat(yarnwrap.scoreboard.number.NumberFormat numberFormat) { wrapperContained.setNumberFormat(numberFormat.wrapperContained); }
// public static void setNumberFormat(yarnwrap.scoreboard.number.NumberFormat numberFormat, ) { net.minecraft.scoreboard.ScoreAccess.setNumberFormat(numberFormat.wrapperContained); }
public int incrementScore() { return wrapperContained.incrementScore(); }
// public static int incrementScore() { return net.minecraft.scoreboard.ScoreAccess.incrementScore(); }
public int incrementScore(int amount) { return wrapperContained.incrementScore(amount); }
// public static int incrementScore(int amount, ) { return net.minecraft.scoreboard.ScoreAccess.incrementScore(amount); }
public void resetScore() { wrapperContained.resetScore(); }
// public static void resetScore() { net.minecraft.scoreboard.ScoreAccess.resetScore(); }
public boolean isLocked() { return wrapperContained.isLocked(); }
// public static boolean isLocked() { return net.minecraft.scoreboard.ScoreAccess.isLocked(); }
public void unlock() { wrapperContained.unlock(); }
// public static void unlock() { net.minecraft.scoreboard.ScoreAccess.unlock(); }
public void lock() { wrapperContained.lock(); }
// public static void lock() { net.minecraft.scoreboard.ScoreAccess.lock(); }
public yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(wrapperContained.getDisplayText()); }
// public static yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(net.minecraft.scoreboard.ScoreAccess.getDisplayText()); }

}