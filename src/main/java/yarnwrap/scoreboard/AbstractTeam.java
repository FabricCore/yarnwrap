package yarnwrap.scoreboard;
public class AbstractTeam { public net.minecraft.scoreboard.AbstractTeam wrapperContained; public AbstractTeam(net.minecraft.scoreboard.AbstractTeam wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.scoreboard.AbstractTeam.getName(); }
public yarnwrap.text.MutableText decorateName(yarnwrap.text.Text name) { return new yarnwrap.text.MutableText(wrapperContained.decorateName(name.wrapperContained)); }
// public static yarnwrap.text.MutableText decorateName(yarnwrap.text.Text name, ) { return new yarnwrap.text.MutableText(net.minecraft.scoreboard.AbstractTeam.decorateName(name.wrapperContained)); }
public boolean shouldShowFriendlyInvisibles() { return wrapperContained.shouldShowFriendlyInvisibles(); }
// public static boolean shouldShowFriendlyInvisibles() { return net.minecraft.scoreboard.AbstractTeam.shouldShowFriendlyInvisibles(); }
public Object getDeathMessageVisibilityRule() { return wrapperContained.getDeathMessageVisibilityRule(); }
// public static Object getDeathMessageVisibilityRule() { return net.minecraft.scoreboard.AbstractTeam.getDeathMessageVisibilityRule(); }
public Object getNameTagVisibilityRule() { return wrapperContained.getNameTagVisibilityRule(); }
// public static Object getNameTagVisibilityRule() { return net.minecraft.scoreboard.AbstractTeam.getNameTagVisibilityRule(); }
public yarnwrap.util.Formatting getColor() { return new yarnwrap.util.Formatting(wrapperContained.getColor()); }
// public static yarnwrap.util.Formatting getColor() { return new yarnwrap.util.Formatting(net.minecraft.scoreboard.AbstractTeam.getColor()); }
public Object getCollisionRule() { return wrapperContained.getCollisionRule(); }
// public static Object getCollisionRule() { return net.minecraft.scoreboard.AbstractTeam.getCollisionRule(); }
public java.util.Collection getPlayerList() { return wrapperContained.getPlayerList(); }
// public static java.util.Collection getPlayerList() { return net.minecraft.scoreboard.AbstractTeam.getPlayerList(); }
public boolean isFriendlyFireAllowed() { return wrapperContained.isFriendlyFireAllowed(); }
// public static boolean isFriendlyFireAllowed() { return net.minecraft.scoreboard.AbstractTeam.isFriendlyFireAllowed(); }
public boolean isEqual(yarnwrap.scoreboard.AbstractTeam team) { return wrapperContained.isEqual(team.wrapperContained); }
// public static boolean isEqual(yarnwrap.scoreboard.AbstractTeam team, ) { return net.minecraft.scoreboard.AbstractTeam.isEqual(team.wrapperContained); }

}