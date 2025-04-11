package yarnwrap.scoreboard;
public class Team { public net.minecraft.scoreboard.Team wrapperContained; public Team(net.minecraft.scoreboard.Team wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public void displayName(yarnwrap.text.Text value) { wrapperContained.displayName = value.wrapperContained; }
// public java.util.Set playerList() { return wrapperContained.playerList; }
// public void playerList(java.util.Set value) { wrapperContained.playerList = value; }
// public boolean showFriendlyInvisibles() { return wrapperContained.showFriendlyInvisibles; }
// public void showFriendlyInvisibles(boolean value) { wrapperContained.showFriendlyInvisibles = value; }
// public boolean friendlyFire() { return wrapperContained.friendlyFire; }
// public void friendlyFire(boolean value) { wrapperContained.friendlyFire = value; }
// public yarnwrap.text.Text prefix() { return new yarnwrap.text.Text(wrapperContained.prefix); }
// public void prefix(yarnwrap.text.Text value) { wrapperContained.prefix = value.wrapperContained; }
// public yarnwrap.text.Text suffix() { return new yarnwrap.text.Text(wrapperContained.suffix); }
// public void suffix(yarnwrap.text.Text value) { wrapperContained.suffix = value.wrapperContained; }
// public yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.scoreboard); }
// public void scoreboard(yarnwrap.scoreboard.Scoreboard value) { wrapperContained.scoreboard = value.wrapperContained; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public Object deathMessageVisibilityRule() { return wrapperContained.deathMessageVisibilityRule; }
// // public void deathMessageVisibilityRule(Object value) { wrapperContained.deathMessageVisibilityRule = value; }
// public Object nameTagVisibilityRule() { return wrapperContained.nameTagVisibilityRule; }
// // public void nameTagVisibilityRule(Object value) { wrapperContained.nameTagVisibilityRule = value; }
// public yarnwrap.util.Formatting color() { return new yarnwrap.util.Formatting(wrapperContained.color); }
// public void color(yarnwrap.util.Formatting value) { wrapperContained.color = value.wrapperContained; }
// public Object collisionRule() { return wrapperContained.collisionRule; }
// // public void collisionRule(Object value) { wrapperContained.collisionRule = value; }
// public yarnwrap.text.Style nameStyle() { return new yarnwrap.text.Style(wrapperContained.nameStyle); }
// public void nameStyle(yarnwrap.text.Style value) { wrapperContained.nameStyle = value.wrapperContained; }
public Team(yarnwrap.scoreboard.Scoreboard scoreboard,java.lang.String name) { this.wrapperContained = new net.minecraft.scoreboard.Team(scoreboard.wrapperContained,name); }
// public void setDeathMessageVisibilityRule(Object deathMessageVisibilityRule) { wrapperContained.setDeathMessageVisibilityRule(deathMessageVisibilityRule); }
public void setFriendlyFireAllowed(boolean friendlyFire) { wrapperContained.setFriendlyFireAllowed(friendlyFire); }
public yarnwrap.text.Text getSuffix() { return new yarnwrap.text.Text(wrapperContained.getSuffix()); }
public void setDisplayName(yarnwrap.text.Text displayName) { wrapperContained.setDisplayName(displayName.wrapperContained); }
public void setPrefix(yarnwrap.text.Text prefix) { wrapperContained.setPrefix(prefix.wrapperContained); }
public void setSuffix(yarnwrap.text.Text suffix) { wrapperContained.setSuffix(suffix.wrapperContained); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
public void setColor(yarnwrap.util.Formatting color) { wrapperContained.setColor(color.wrapperContained); }
public yarnwrap.text.MutableText decorateName(yarnwrap.scoreboard.AbstractTeam team,yarnwrap.text.Text name) { return new yarnwrap.text.MutableText(wrapperContained.decorateName(team.wrapperContained,name.wrapperContained)); }
public void setShowFriendlyInvisibles(boolean showFriendlyInvisible) { wrapperContained.setShowFriendlyInvisibles(showFriendlyInvisible); }
public yarnwrap.text.Text getPrefix() { return new yarnwrap.text.Text(wrapperContained.getPrefix()); }
// public void setCollisionRule(Object collisionRule) { wrapperContained.setCollisionRule(collisionRule); }
public void setFriendlyFlagsBitwise(int flags) { wrapperContained.setFriendlyFlagsBitwise(flags); }
public int getFriendlyFlagsBitwise() { return wrapperContained.getFriendlyFlagsBitwise(); }
public yarnwrap.text.MutableText getFormattedName() { return new yarnwrap.text.MutableText(wrapperContained.getFormattedName()); }
// public void setNameTagVisibilityRule(Object nameTagVisibilityRule) { wrapperContained.setNameTagVisibilityRule(nameTagVisibilityRule); }
public yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.getScoreboard()); }

}