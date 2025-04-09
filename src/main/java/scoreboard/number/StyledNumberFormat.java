package yarnwrap.scoreboard.number;
public class StyledNumberFormat { public net.minecraft.scoreboard.number.StyledNumberFormat wrapperContained; public StyledNumberFormat(net.minecraft.scoreboard.number.StyledNumberFormat wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.scoreboard.number.NumberFormatType TYPE() { return new yarnwrap.scoreboard.number.NumberFormatType(wrapperContained.TYPE); }
public yarnwrap.scoreboard.number.StyledNumberFormat EMPTY() { return new yarnwrap.scoreboard.number.StyledNumberFormat(wrapperContained.EMPTY); }
public yarnwrap.scoreboard.number.StyledNumberFormat RED() { return new yarnwrap.scoreboard.number.StyledNumberFormat(wrapperContained.RED); }
public yarnwrap.scoreboard.number.StyledNumberFormat YELLOW() { return new yarnwrap.scoreboard.number.StyledNumberFormat(wrapperContained.YELLOW); }
// public yarnwrap.text.Style style() { return new yarnwrap.text.Style(wrapperContained.style); }

}