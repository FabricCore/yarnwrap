package yarnwrap.command.argument;
public class TeamArgumentType { public net.minecraft.command.argument.TeamArgumentType wrapperContained; public TeamArgumentType(net.minecraft.command.argument.TeamArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_TEAM_EXCEPTION() { return wrapperContained.UNKNOWN_TEAM_EXCEPTION; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public yarnwrap.scoreboard.Team getTeam(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.Team(wrapperContained.getTeam(context,name)); }
public yarnwrap.command.argument.TeamArgumentType team() { return new yarnwrap.command.argument.TeamArgumentType(wrapperContained.team()); }

}