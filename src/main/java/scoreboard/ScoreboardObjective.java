package yarnwrap.scoreboard;
public class ScoreboardObjective { public net.minecraft.scoreboard.ScoreboardObjective wrapperContained; public ScoreboardObjective(net.minecraft.scoreboard.ScoreboardObjective wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public Object renderType() { return wrapperContained.renderType; }
// public yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.scoreboard); }
// public java.lang.String name() { return wrapperContained.name; }
// public yarnwrap.scoreboard.ScoreboardCriterion criterion() { return new yarnwrap.scoreboard.ScoreboardCriterion(wrapperContained.criterion); }
// public yarnwrap.text.Text bracketedDisplayName() { return new yarnwrap.text.Text(wrapperContained.bracketedDisplayName); }
// public boolean displayAutoUpdate() { return wrapperContained.displayAutoUpdate; }
// public yarnwrap.scoreboard.number.NumberFormat numberFormat() { return new yarnwrap.scoreboard.number.NumberFormat(wrapperContained.numberFormat); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public void setRenderType(Object renderType) { wrapperContained.setRenderType(renderType); }
public yarnwrap.scoreboard.ScoreboardCriterion getCriterion() { return new yarnwrap.scoreboard.ScoreboardCriterion(wrapperContained.getCriterion()); }
public yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.getScoreboard()); }
public Object getRenderType() { return wrapperContained.getRenderType(); }
public yarnwrap.text.Text toHoverableText() { return new yarnwrap.text.Text(wrapperContained.toHoverableText()); }
public void setDisplayName(yarnwrap.text.Text name) { wrapperContained.setDisplayName(name.wrapperContained); }
// public yarnwrap.text.Text generateBracketedDisplayName() { return new yarnwrap.text.Text(wrapperContained.generateBracketedDisplayName()); }
public yarnwrap.scoreboard.number.NumberFormat getNumberFormatOr(yarnwrap.scoreboard.number.NumberFormat format) { return new yarnwrap.scoreboard.number.NumberFormat(wrapperContained.getNumberFormatOr(format.wrapperContained)); }
public void setDisplayAutoUpdate(boolean displayAutoUpdate) { wrapperContained.setDisplayAutoUpdate(displayAutoUpdate); }
public void setNumberFormat(yarnwrap.scoreboard.number.NumberFormat numberFormat) { wrapperContained.setNumberFormat(numberFormat.wrapperContained); }
public boolean shouldDisplayAutoUpdate() { return wrapperContained.shouldDisplayAutoUpdate(); }
public yarnwrap.scoreboard.number.NumberFormat getNumberFormat() { return new yarnwrap.scoreboard.number.NumberFormat(wrapperContained.getNumberFormat()); }

}