package yarnwrap.command.argument;
public class TeamArgumentType { public net.minecraft.command.argument.TeamArgumentType wrapperContained; public TeamArgumentType(net.minecraft.command.argument.TeamArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_TEAM_EXCEPTION() { return wrapperContained.UNKNOWN_TEAM_EXCEPTION; }
// public void UNKNOWN_TEAM_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_TEAM_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_TEAM_EXCEPTION() { return net.minecraft.command.argument.TeamArgumentType.UNKNOWN_TEAM_EXCEPTION; }
// public static void UNKNOWN_TEAM_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.TeamArgumentType.UNKNOWN_TEAM_EXCEPTION = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.TeamArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.TeamArgumentType.EXAMPLES = value; }

public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.TeamArgumentType.listSuggestions(context,builder); }
// public yarnwrap.scoreboard.Team getTeam(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.Team(wrapperContained.getTeam(context,name)); }
// public static yarnwrap.scoreboard.Team getTeam(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.scoreboard.Team(net.minecraft.command.argument.TeamArgumentType.getTeam(context,name)); }
// public com.mojang.brigadier.Message method_9481(java.lang.Object name) { return wrapperContained.method_9481(name); }
// public static com.mojang.brigadier.Message method_9481(java.lang.Object name, ) { return net.minecraft.command.argument.TeamArgumentType.method_9481(name); }
// public yarnwrap.command.argument.TeamArgumentType team() { return new yarnwrap.command.argument.TeamArgumentType(wrapperContained.team()); }
public static yarnwrap.command.argument.TeamArgumentType team() { return new yarnwrap.command.argument.TeamArgumentType(net.minecraft.command.argument.TeamArgumentType.team()); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.TeamArgumentType.parse(reader); }

}