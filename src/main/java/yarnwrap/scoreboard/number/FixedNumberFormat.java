package yarnwrap.scoreboard.number;
public class FixedNumberFormat { public net.minecraft.scoreboard.number.FixedNumberFormat wrapperContained; public FixedNumberFormat(net.minecraft.scoreboard.number.FixedNumberFormat wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.scoreboard.number.NumberFormatType TYPE() { return new yarnwrap.scoreboard.number.NumberFormatType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.scoreboard.number.NumberFormatType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.scoreboard.number.NumberFormatType TYPE() { return new yarnwrap.scoreboard.number.NumberFormatType(net.minecraft.scoreboard.number.FixedNumberFormat.TYPE); }
// public static void TYPE(yarnwrap.scoreboard.number.NumberFormatType value, ) { net.minecraft.scoreboard.number.FixedNumberFormat.TYPE = value.wrapperContained; }

// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
// public void text(yarnwrap.text.Text value) { wrapperContained.text = value.wrapperContained; }
// public static yarnwrap.text.Text text() { return new yarnwrap.text.Text(net.minecraft.scoreboard.number.FixedNumberFormat.text); }
// public static void text(yarnwrap.text.Text value, ) { net.minecraft.scoreboard.number.FixedNumberFormat.text = value.wrapperContained; }

public FixedNumberFormat(yarnwrap.text.Text text) { this.wrapperContained = new net.minecraft.scoreboard.number.FixedNumberFormat(text.wrapperContained); }

}