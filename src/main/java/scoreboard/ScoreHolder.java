package yarnwrap.scoreboard;
public class ScoreHolder { public net.minecraft.scoreboard.ScoreHolder wrapperContained; public ScoreHolder(net.minecraft.scoreboard.ScoreHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String WILDCARD_NAME() { return wrapperContained.WILDCARD_NAME; }
public yarnwrap.scoreboard.ScoreHolder WILDCARD() { return new yarnwrap.scoreboard.ScoreHolder(wrapperContained.WILDCARD); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public yarnwrap.scoreboard.ScoreHolder fromProfile(com.mojang.authlib.GameProfile gameProfile) { return new yarnwrap.scoreboard.ScoreHolder(wrapperContained.fromProfile(gameProfile)); }
// public yarnwrap.scoreboard.ScoreHolder fromName(java.lang.String name) { return new yarnwrap.scoreboard.ScoreHolder(wrapperContained.fromName(name)); }
public yarnwrap.text.Text getStyledDisplayName() { return new yarnwrap.text.Text(wrapperContained.getStyledDisplayName()); }
public java.lang.String getNameForScoreboard() { return wrapperContained.getNameForScoreboard(); }

}