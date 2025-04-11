package yarnwrap.scoreboard;
public class ScoreAccess { public net.minecraft.scoreboard.ScoreAccess wrapperContained; public ScoreAccess(net.minecraft.scoreboard.ScoreAccess wrapperContained) { this.wrapperContained = wrapperContained; }

public int getScore() { return wrapperContained.getScore(); }
public void setScore(int score) { wrapperContained.setScore(score); }
public void setDisplayText(yarnwrap.text.Text text) { wrapperContained.setDisplayText(text.wrapperContained); }
public void setNumberFormat(yarnwrap.scoreboard.number.NumberFormat numberFormat) { wrapperContained.setNumberFormat(numberFormat.wrapperContained); }
public int incrementScore() { return wrapperContained.incrementScore(); }
public int incrementScore(int amount) { return wrapperContained.incrementScore(amount); }
public void resetScore() { wrapperContained.resetScore(); }
public boolean isLocked() { return wrapperContained.isLocked(); }
public void unlock() { wrapperContained.unlock(); }
public void lock() { wrapperContained.lock(); }
public yarnwrap.text.Text getDisplayText() { return new yarnwrap.text.Text(wrapperContained.getDisplayText()); }

}