package yarnwrap.command.argument;
public class ScoreboardCriterionArgumentType { public net.minecraft.command.argument.ScoreboardCriterionArgumentType wrapperContained; public ScoreboardCriterionArgumentType(net.minecraft.command.argument.ScoreboardCriterionArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_CRITERION_EXCEPTION() { return wrapperContained.INVALID_CRITERION_EXCEPTION; }
public yarnwrap.command.argument.ScoreboardCriterionArgumentType scoreboardCriterion() { return new yarnwrap.command.argument.ScoreboardCriterionArgumentType(wrapperContained.scoreboardCriterion()); }
public java.lang.String getStatName(yarnwrap.stat.StatType stat,java.lang.Object value) { return wrapperContained.getStatName(stat.wrapperContained,value); }
public yarnwrap.scoreboard.ScoreboardCriterion getCriterion(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardCriterion(wrapperContained.getCriterion(context,name)); }

}