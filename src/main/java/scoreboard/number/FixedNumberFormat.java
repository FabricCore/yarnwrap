package yarnwrap.scoreboard.number;
public class FixedNumberFormat { public net.minecraft.scoreboard.number.FixedNumberFormat wrapperContained; public FixedNumberFormat(net.minecraft.scoreboard.number.FixedNumberFormat wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.scoreboard.number.NumberFormatType TYPE() { return new yarnwrap.scoreboard.number.NumberFormatType(wrapperContained.TYPE); }
// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }

}