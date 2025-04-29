package yarnwrap.scoreboard;
public class ScoreboardEntry { public net.minecraft.scoreboard.ScoreboardEntry wrapperContained; public ScoreboardEntry(net.minecraft.scoreboard.ScoreboardEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean hidden() { return wrapperContained.hidden(); }
// public static boolean hidden() { return net.minecraft.scoreboard.ScoreboardEntry.hidden(); }
public yarnwrap.text.MutableText formatted(yarnwrap.scoreboard.number.NumberFormat format) { return new yarnwrap.text.MutableText(wrapperContained.formatted(format.wrapperContained)); }
// public static yarnwrap.text.MutableText formatted(yarnwrap.scoreboard.number.NumberFormat format, ) { return new yarnwrap.text.MutableText(net.minecraft.scoreboard.ScoreboardEntry.formatted(format.wrapperContained)); }
public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name()); }
// public static yarnwrap.text.Text name() { return new yarnwrap.text.Text(net.minecraft.scoreboard.ScoreboardEntry.name()); }

}