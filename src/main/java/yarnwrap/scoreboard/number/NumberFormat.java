package yarnwrap.scoreboard.number;
public class NumberFormat { public net.minecraft.scoreboard.number.NumberFormat wrapperContained; public NumberFormat(net.minecraft.scoreboard.number.NumberFormat wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.scoreboard.number.NumberFormatType getType() { return new yarnwrap.scoreboard.number.NumberFormatType(wrapperContained.getType()); }
// public static yarnwrap.scoreboard.number.NumberFormatType getType() { return new yarnwrap.scoreboard.number.NumberFormatType(net.minecraft.scoreboard.number.NumberFormat.getType()); }
public yarnwrap.text.MutableText format(int number) { return new yarnwrap.text.MutableText(wrapperContained.format(number)); }
// public static yarnwrap.text.MutableText format(int number, ) { return new yarnwrap.text.MutableText(net.minecraft.scoreboard.number.NumberFormat.format(number)); }

}