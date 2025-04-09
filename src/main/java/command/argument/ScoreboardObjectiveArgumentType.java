package yarnwrap.command.argument;
public class ScoreboardObjectiveArgumentType { public net.minecraft.command.argument.ScoreboardObjectiveArgumentType wrapperContained; public ScoreboardObjectiveArgumentType(net.minecraft.command.argument.ScoreboardObjectiveArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType READONLY_OBJECTIVE_EXCEPTION() { return wrapperContained.READONLY_OBJECTIVE_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_OBJECTIVE_EXCEPTION() { return wrapperContained.UNKNOWN_OBJECTIVE_EXCEPTION; }
public yarnwrap.command.argument.ScoreboardObjectiveArgumentType scoreboardObjective() { return new yarnwrap.command.argument.ScoreboardObjectiveArgumentType(wrapperContained.scoreboardObjective()); }
// public yarnwrap.scoreboard.ScoreboardObjective getWritableObjective(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardObjective(wrapperContained.getWritableObjective(context,name)); }
// public yarnwrap.scoreboard.ScoreboardObjective getObjective(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardObjective(wrapperContained.getObjective(context,name)); }

}