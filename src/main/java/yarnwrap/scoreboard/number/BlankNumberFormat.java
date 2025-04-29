package yarnwrap.scoreboard.number;
public class BlankNumberFormat { public net.minecraft.scoreboard.number.BlankNumberFormat wrapperContained; public BlankNumberFormat(net.minecraft.scoreboard.number.BlankNumberFormat wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.scoreboard.number.BlankNumberFormat INSTANCE() { return new yarnwrap.scoreboard.number.BlankNumberFormat(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.scoreboard.number.BlankNumberFormat value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.scoreboard.number.BlankNumberFormat INSTANCE() { return new yarnwrap.scoreboard.number.BlankNumberFormat(net.minecraft.scoreboard.number.BlankNumberFormat.INSTANCE); }
// public static void INSTANCE(yarnwrap.scoreboard.number.BlankNumberFormat value, ) { net.minecraft.scoreboard.number.BlankNumberFormat.INSTANCE = value.wrapperContained; }

// public yarnwrap.scoreboard.number.NumberFormatType TYPE() { return new yarnwrap.scoreboard.number.NumberFormatType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.scoreboard.number.NumberFormatType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.scoreboard.number.NumberFormatType TYPE() { return new yarnwrap.scoreboard.number.NumberFormatType(net.minecraft.scoreboard.number.BlankNumberFormat.TYPE); }
// public static void TYPE(yarnwrap.scoreboard.number.NumberFormatType value, ) { net.minecraft.scoreboard.number.BlankNumberFormat.TYPE = value.wrapperContained; }


}