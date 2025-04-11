package yarnwrap.command.argument;
public class TeamArgumentType { public net.minecraft.command.argument.TeamArgumentType wrapperContained; public TeamArgumentType(net.minecraft.command.argument.TeamArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_TEAM_EXCEPTION() { return wrapperContained.UNKNOWN_TEAM_EXCEPTION; }
// public void UNKNOWN_TEAM_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_TEAM_EXCEPTION = value; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public yarnwrap.scoreboard.Team getTeam(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.Team(wrapperContained.getTeam(context,name)); }
public yarnwrap.command.argument.TeamArgumentType team() { return new yarnwrap.command.argument.TeamArgumentType(wrapperContained.team()); }

}