package yarnwrap.scoreboard.number;
public class StyledNumberFormat { public net.minecraft.scoreboard.number.StyledNumberFormat wrapperContained; public StyledNumberFormat(net.minecraft.scoreboard.number.StyledNumberFormat wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.scoreboard.number.NumberFormatType TYPE() { return new yarnwrap.scoreboard.number.NumberFormatType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.scoreboard.number.NumberFormatType value) { wrapperContained.TYPE = value.wrapperContained; }
public yarnwrap.scoreboard.number.StyledNumberFormat EMPTY() { return new yarnwrap.scoreboard.number.StyledNumberFormat(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.scoreboard.number.StyledNumberFormat value) { wrapperContained.EMPTY = value.wrapperContained; }
public yarnwrap.scoreboard.number.StyledNumberFormat RED() { return new yarnwrap.scoreboard.number.StyledNumberFormat(wrapperContained.RED); }
// public void RED(yarnwrap.scoreboard.number.StyledNumberFormat value) { wrapperContained.RED = value.wrapperContained; }
public yarnwrap.scoreboard.number.StyledNumberFormat YELLOW() { return new yarnwrap.scoreboard.number.StyledNumberFormat(wrapperContained.YELLOW); }
// public void YELLOW(yarnwrap.scoreboard.number.StyledNumberFormat value) { wrapperContained.YELLOW = value.wrapperContained; }
// public yarnwrap.text.Style style() { return new yarnwrap.text.Style(wrapperContained.style); }
// public void style(yarnwrap.text.Style value) { wrapperContained.style = value.wrapperContained; }
public StyledNumberFormat(yarnwrap.text.Style style) { this.wrapperContained = new net.minecraft.scoreboard.number.StyledNumberFormat(style.wrapperContained); }

}