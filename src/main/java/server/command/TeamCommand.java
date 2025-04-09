package yarnwrap.server.command;
public class TeamCommand { public net.minecraft.server.command.TeamCommand wrapperContained; public TeamCommand(net.minecraft.server.command.TeamCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OPTION_COLOR_UNCHANGED_EXCEPTION() { return wrapperContained.OPTION_COLOR_UNCHANGED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OPTION_SEE_FRIENDLY_INVISIBLES_ALREADY_ENABLED_EXCEPTION() { return wrapperContained.OPTION_SEE_FRIENDLY_INVISIBLES_ALREADY_ENABLED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ADD_DUPLICATE_EXCEPTION() { return wrapperContained.ADD_DUPLICATE_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OPTION_COLLISION_RULE_UNCHANGED_EXCEPTION() { return wrapperContained.OPTION_COLLISION_RULE_UNCHANGED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EMPTY_UNCHANGED_EXCEPTION() { return wrapperContained.EMPTY_UNCHANGED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OPTION_NAMETAG_VISIBILITY_UNCHANGED_EXCEPTION() { return wrapperContained.OPTION_NAMETAG_VISIBILITY_UNCHANGED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OPTION_FRIENDLY_FIRE_ALREADY_ENABLED_EXCEPTION() { return wrapperContained.OPTION_FRIENDLY_FIRE_ALREADY_ENABLED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OPTION_FRIENDLY_FIRE_ALREADY_DISABLED_EXCEPTION() { return wrapperContained.OPTION_FRIENDLY_FIRE_ALREADY_DISABLED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OPTION_NAME_UNCHANGED_EXCEPTION() { return wrapperContained.OPTION_NAME_UNCHANGED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OPTION_SEE_FRIENDLY_INVISIBLES_ALREADY_DISABLED_EXCEPTION() { return wrapperContained.OPTION_SEE_FRIENDLY_INVISIBLES_ALREADY_DISABLED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OPTION_DEATH_MESSAGE_VISIBILITY_UNCHANGED_EXCEPTION() { return wrapperContained.OPTION_DEATH_MESSAGE_VISIBILITY_UNCHANGED_EXCEPTION; }
// public int executeModifyDisplayName(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team,yarnwrap.text.Text displayName) { return wrapperContained.executeModifyDisplayName(source.wrapperContained,team.wrapperContained,displayName.wrapperContained); }
// public int executeModifyCollisionRule(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team,Object collisionRule) { return wrapperContained.executeModifyCollisionRule(source.wrapperContained,team.wrapperContained,collisionRule); }
// public int executeLeave(yarnwrap.server.command.ServerCommandSource source,java.util.Collection members) { return wrapperContained.executeLeave(source.wrapperContained,members); }
// public int executeAdd(yarnwrap.server.command.ServerCommandSource source,java.lang.String team,yarnwrap.text.Text displayName) { return wrapperContained.executeAdd(source.wrapperContained,team,displayName.wrapperContained); }
// public int executeJoin(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team,java.util.Collection members) { return wrapperContained.executeJoin(source.wrapperContained,team.wrapperContained,members); }
// public int executeEmpty(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team) { return wrapperContained.executeEmpty(source.wrapperContained,team.wrapperContained); }
// public int executeListTeams(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeListTeams(source.wrapperContained); }
// public int executeModifyNametagVisibility(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team,Object visibility) { return wrapperContained.executeModifyNametagVisibility(source.wrapperContained,team.wrapperContained,visibility); }
// public int executeModifyDeathMessageVisibility(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team,Object visibility) { return wrapperContained.executeModifyDeathMessageVisibility(source.wrapperContained,team.wrapperContained,visibility); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int executeModifyPrefix(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team,yarnwrap.text.Text prefix) { return wrapperContained.executeModifyPrefix(source.wrapperContained,team.wrapperContained,prefix.wrapperContained); }
// public int executeModifyColor(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team,yarnwrap.util.Formatting color) { return wrapperContained.executeModifyColor(source.wrapperContained,team.wrapperContained,color.wrapperContained); }
// public int executeRemove(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team) { return wrapperContained.executeRemove(source.wrapperContained,team.wrapperContained); }
// public int executeListMembers(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team) { return wrapperContained.executeListMembers(source.wrapperContained,team.wrapperContained); }
// public int executeModifySeeFriendlyInvisibles(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team,boolean allowed) { return wrapperContained.executeModifySeeFriendlyInvisibles(source.wrapperContained,team.wrapperContained,allowed); }
// public int executeModifyFriendlyFire(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team,boolean allowed) { return wrapperContained.executeModifyFriendlyFire(source.wrapperContained,team.wrapperContained,allowed); }
// public int executeModifySuffix(yarnwrap.server.command.ServerCommandSource source,yarnwrap.scoreboard.Team team,yarnwrap.text.Text suffix) { return wrapperContained.executeModifySuffix(source.wrapperContained,team.wrapperContained,suffix.wrapperContained); }
// public int executeAdd(yarnwrap.server.command.ServerCommandSource source,java.lang.String team) { return wrapperContained.executeAdd(source.wrapperContained,team); }
// public yarnwrap.text.Text getMemberName(java.util.Collection members) { return new yarnwrap.text.Text(wrapperContained.getMemberName(members)); }

}