package yarnwrap.scoreboard;
public class Team { public net.minecraft.scoreboard.Team wrapperContained; public Team(net.minecraft.scoreboard.Team wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public void displayName(yarnwrap.text.Text value) { wrapperContained.displayName = value.wrapperContained; }
// public static yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(net.minecraft.scoreboard.Team.displayName); }
// public static void displayName(yarnwrap.text.Text value, ) { net.minecraft.scoreboard.Team.displayName = value.wrapperContained; }

// public java.util.Set playerList() { return wrapperContained.playerList; }
// public void playerList(java.util.Set value) { wrapperContained.playerList = value; }
// public static java.util.Set playerList() { return net.minecraft.scoreboard.Team.playerList; }
// public static void playerList(java.util.Set value, ) { net.minecraft.scoreboard.Team.playerList = value; }

// public boolean showFriendlyInvisibles() { return wrapperContained.showFriendlyInvisibles; }
// public void showFriendlyInvisibles(boolean value) { wrapperContained.showFriendlyInvisibles = value; }
// public static boolean showFriendlyInvisibles() { return net.minecraft.scoreboard.Team.showFriendlyInvisibles; }
// public static void showFriendlyInvisibles(boolean value, ) { net.minecraft.scoreboard.Team.showFriendlyInvisibles = value; }

// public boolean friendlyFire() { return wrapperContained.friendlyFire; }
// public void friendlyFire(boolean value) { wrapperContained.friendlyFire = value; }
// public static boolean friendlyFire() { return net.minecraft.scoreboard.Team.friendlyFire; }
// public static void friendlyFire(boolean value, ) { net.minecraft.scoreboard.Team.friendlyFire = value; }

// public yarnwrap.text.Text prefix() { return new yarnwrap.text.Text(wrapperContained.prefix); }
// public void prefix(yarnwrap.text.Text value) { wrapperContained.prefix = value.wrapperContained; }
// public static yarnwrap.text.Text prefix() { return new yarnwrap.text.Text(net.minecraft.scoreboard.Team.prefix); }
// public static void prefix(yarnwrap.text.Text value, ) { net.minecraft.scoreboard.Team.prefix = value.wrapperContained; }

// public yarnwrap.text.Text suffix() { return new yarnwrap.text.Text(wrapperContained.suffix); }
// public void suffix(yarnwrap.text.Text value) { wrapperContained.suffix = value.wrapperContained; }
// public static yarnwrap.text.Text suffix() { return new yarnwrap.text.Text(net.minecraft.scoreboard.Team.suffix); }
// public static void suffix(yarnwrap.text.Text value, ) { net.minecraft.scoreboard.Team.suffix = value.wrapperContained; }

// public yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.scoreboard); }
// public void scoreboard(yarnwrap.scoreboard.Scoreboard value) { wrapperContained.scoreboard = value.wrapperContained; }
// public static yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(net.minecraft.scoreboard.Team.scoreboard); }
// public static void scoreboard(yarnwrap.scoreboard.Scoreboard value, ) { net.minecraft.scoreboard.Team.scoreboard = value.wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.scoreboard.Team.name; }
// public static void name(java.lang.String value, ) { net.minecraft.scoreboard.Team.name = value; }

// public Object deathMessageVisibilityRule() { return wrapperContained.deathMessageVisibilityRule; }
// // public void deathMessageVisibilityRule(Object value) { wrapperContained.deathMessageVisibilityRule = value; }
// // public static Object deathMessageVisibilityRule() { return net.minecraft.scoreboard.Team.deathMessageVisibilityRule; }
// // public static void deathMessageVisibilityRule(Object value, ) { net.minecraft.scoreboard.Team.deathMessageVisibilityRule = value; }

// public Object nameTagVisibilityRule() { return wrapperContained.nameTagVisibilityRule; }
// // public void nameTagVisibilityRule(Object value) { wrapperContained.nameTagVisibilityRule = value; }
// // public static Object nameTagVisibilityRule() { return net.minecraft.scoreboard.Team.nameTagVisibilityRule; }
// // public static void nameTagVisibilityRule(Object value, ) { net.minecraft.scoreboard.Team.nameTagVisibilityRule = value; }

// public yarnwrap.util.Formatting color() { return new yarnwrap.util.Formatting(wrapperContained.color); }
// public void color(yarnwrap.util.Formatting value) { wrapperContained.color = value.wrapperContained; }
// public static yarnwrap.util.Formatting color() { return new yarnwrap.util.Formatting(net.minecraft.scoreboard.Team.color); }
// public static void color(yarnwrap.util.Formatting value, ) { net.minecraft.scoreboard.Team.color = value.wrapperContained; }

// public Object collisionRule() { return wrapperContained.collisionRule; }
// // public void collisionRule(Object value) { wrapperContained.collisionRule = value; }
// // public static Object collisionRule() { return net.minecraft.scoreboard.Team.collisionRule; }
// // public static void collisionRule(Object value, ) { net.minecraft.scoreboard.Team.collisionRule = value; }

// public yarnwrap.text.Style nameStyle() { return new yarnwrap.text.Style(wrapperContained.nameStyle); }
// public void nameStyle(yarnwrap.text.Style value) { wrapperContained.nameStyle = value.wrapperContained; }
// public static yarnwrap.text.Style nameStyle() { return new yarnwrap.text.Style(net.minecraft.scoreboard.Team.nameStyle); }
// public static void nameStyle(yarnwrap.text.Style value, ) { net.minecraft.scoreboard.Team.nameStyle = value.wrapperContained; }

public Team(yarnwrap.scoreboard.Scoreboard scoreboard,java.lang.String name) { this.wrapperContained = new net.minecraft.scoreboard.Team(scoreboard.wrapperContained,name); }
// public void setDeathMessageVisibilityRule(Object deathMessageVisibilityRule) { wrapperContained.setDeathMessageVisibilityRule(deathMessageVisibilityRule); }
// public static void setDeathMessageVisibilityRule(Object deathMessageVisibilityRule, ) { net.minecraft.scoreboard.Team.setDeathMessageVisibilityRule(deathMessageVisibilityRule); }
public void setFriendlyFireAllowed(boolean friendlyFire) { wrapperContained.setFriendlyFireAllowed(friendlyFire); }
// public static void setFriendlyFireAllowed(boolean friendlyFire, ) { net.minecraft.scoreboard.Team.setFriendlyFireAllowed(friendlyFire); }
public yarnwrap.text.Text getSuffix() { return new yarnwrap.text.Text(wrapperContained.getSuffix()); }
// public static yarnwrap.text.Text getSuffix() { return new yarnwrap.text.Text(net.minecraft.scoreboard.Team.getSuffix()); }
public void setDisplayName(yarnwrap.text.Text displayName) { wrapperContained.setDisplayName(displayName.wrapperContained); }
// public static void setDisplayName(yarnwrap.text.Text displayName, ) { net.minecraft.scoreboard.Team.setDisplayName(displayName.wrapperContained); }
public void setPrefix(yarnwrap.text.Text prefix) { wrapperContained.setPrefix(prefix.wrapperContained); }
// public static void setPrefix(yarnwrap.text.Text prefix, ) { net.minecraft.scoreboard.Team.setPrefix(prefix.wrapperContained); }
public void setSuffix(yarnwrap.text.Text suffix) { wrapperContained.setSuffix(suffix.wrapperContained); }
// public static void setSuffix(yarnwrap.text.Text suffix, ) { net.minecraft.scoreboard.Team.setSuffix(suffix.wrapperContained); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public static yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(net.minecraft.scoreboard.Team.getDisplayName()); }
public void setColor(yarnwrap.util.Formatting color) { wrapperContained.setColor(color.wrapperContained); }
// public static void setColor(yarnwrap.util.Formatting color, ) { net.minecraft.scoreboard.Team.setColor(color.wrapperContained); }
// public yarnwrap.text.MutableText decorateName(yarnwrap.scoreboard.AbstractTeam team,yarnwrap.text.Text name) { return new yarnwrap.text.MutableText(wrapperContained.decorateName(team.wrapperContained,name.wrapperContained)); }
// public static yarnwrap.text.MutableText decorateName(yarnwrap.scoreboard.AbstractTeam team,yarnwrap.text.Text name, ) { return new yarnwrap.text.MutableText(net.minecraft.scoreboard.Team.decorateName(team.wrapperContained,name.wrapperContained)); }
public void setShowFriendlyInvisibles(boolean showFriendlyInvisible) { wrapperContained.setShowFriendlyInvisibles(showFriendlyInvisible); }
// public static void setShowFriendlyInvisibles(boolean showFriendlyInvisible, ) { net.minecraft.scoreboard.Team.setShowFriendlyInvisibles(showFriendlyInvisible); }
public yarnwrap.text.Text getPrefix() { return new yarnwrap.text.Text(wrapperContained.getPrefix()); }
// public static yarnwrap.text.Text getPrefix() { return new yarnwrap.text.Text(net.minecraft.scoreboard.Team.getPrefix()); }
// public void setCollisionRule(Object collisionRule) { wrapperContained.setCollisionRule(collisionRule); }
// public static void setCollisionRule(Object collisionRule, ) { net.minecraft.scoreboard.Team.setCollisionRule(collisionRule); }
public void setFriendlyFlagsBitwise(int flags) { wrapperContained.setFriendlyFlagsBitwise(flags); }
// public static void setFriendlyFlagsBitwise(int flags, ) { net.minecraft.scoreboard.Team.setFriendlyFlagsBitwise(flags); }
public int getFriendlyFlagsBitwise() { return wrapperContained.getFriendlyFlagsBitwise(); }
// public static int getFriendlyFlagsBitwise() { return net.minecraft.scoreboard.Team.getFriendlyFlagsBitwise(); }
public yarnwrap.text.MutableText getFormattedName() { return new yarnwrap.text.MutableText(wrapperContained.getFormattedName()); }
// public static yarnwrap.text.MutableText getFormattedName() { return new yarnwrap.text.MutableText(net.minecraft.scoreboard.Team.getFormattedName()); }
// public void setNameTagVisibilityRule(Object nameTagVisibilityRule) { wrapperContained.setNameTagVisibilityRule(nameTagVisibilityRule); }
// public static void setNameTagVisibilityRule(Object nameTagVisibilityRule, ) { net.minecraft.scoreboard.Team.setNameTagVisibilityRule(nameTagVisibilityRule); }
public yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.getScoreboard()); }
// public static yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(net.minecraft.scoreboard.Team.getScoreboard()); }

}