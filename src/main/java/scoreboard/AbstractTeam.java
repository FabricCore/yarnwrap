package yarnwrap.scoreboard;
public class AbstractTeam { public net.minecraft.scoreboard.AbstractTeam wrapperContained; public AbstractTeam(net.minecraft.scoreboard.AbstractTeam wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.text.MutableText decorateName(yarnwrap.text.Text name) { return new yarnwrap.text.MutableText(wrapperContained.decorateName(name.wrapperContained)); }
public boolean shouldShowFriendlyInvisibles() { return wrapperContained.shouldShowFriendlyInvisibles(); }
public Object getDeathMessageVisibilityRule() { return wrapperContained.getDeathMessageVisibilityRule(); }
public Object getNameTagVisibilityRule() { return wrapperContained.getNameTagVisibilityRule(); }
public yarnwrap.util.Formatting getColor() { return new yarnwrap.util.Formatting(wrapperContained.getColor()); }
public Object getCollisionRule() { return wrapperContained.getCollisionRule(); }
public java.util.Collection getPlayerList() { return wrapperContained.getPlayerList(); }
public boolean isFriendlyFireAllowed() { return wrapperContained.isFriendlyFireAllowed(); }
public boolean isEqual(yarnwrap.scoreboard.AbstractTeam team) { return wrapperContained.isEqual(team.wrapperContained); }

}