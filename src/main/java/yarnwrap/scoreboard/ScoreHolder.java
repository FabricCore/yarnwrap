package yarnwrap.scoreboard;
public class ScoreHolder { public net.minecraft.scoreboard.ScoreHolder wrapperContained; public ScoreHolder(net.minecraft.scoreboard.ScoreHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String WILDCARD_NAME() { return wrapperContained.WILDCARD_NAME; }
// public void WILDCARD_NAME(java.lang.String value) { wrapperContained.WILDCARD_NAME = value; }
public yarnwrap.scoreboard.ScoreHolder WILDCARD() { return new yarnwrap.scoreboard.ScoreHolder(wrapperContained.WILDCARD); }
// public void WILDCARD(yarnwrap.scoreboard.ScoreHolder value) { wrapperContained.WILDCARD = value.wrapperContained; }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public yarnwrap.scoreboard.ScoreHolder fromProfile(com.mojang.authlib.GameProfile gameProfile) { return new yarnwrap.scoreboard.ScoreHolder(wrapperContained.fromProfile(gameProfile)); }
// public yarnwrap.text.Style method_55421(yarnwrap.text.Style style) { return new yarnwrap.text.Style(wrapperContained.method_55421(style.wrapperContained)); }
// public yarnwrap.scoreboard.ScoreHolder fromName(java.lang.String name) { return new yarnwrap.scoreboard.ScoreHolder(wrapperContained.fromName(name)); }
public yarnwrap.text.Text getStyledDisplayName() { return new yarnwrap.text.Text(wrapperContained.getStyledDisplayName()); }
public java.lang.String getNameForScoreboard() { return wrapperContained.getNameForScoreboard(); }

}