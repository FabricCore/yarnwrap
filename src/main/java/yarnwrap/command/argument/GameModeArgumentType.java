package yarnwrap.command.argument;
public class GameModeArgumentType { public net.minecraft.command.argument.GameModeArgumentType wrapperContained; public GameModeArgumentType(net.minecraft.command.argument.GameModeArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.GameModeArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.GameModeArgumentType.EXAMPLES = value; }

// public net.minecraft.world.GameMode[] VALUES() { return wrapperContained.VALUES; }
// public void VALUES(net.minecraft.world.GameMode[] value) { wrapperContained.VALUES = value; }
// public static net.minecraft.world.GameMode[] VALUES() { return net.minecraft.command.argument.GameModeArgumentType.VALUES; }
// public static void VALUES(net.minecraft.world.GameMode[] value, ) { net.minecraft.command.argument.GameModeArgumentType.VALUES = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_GAME_MODE_EXCEPTION() { return wrapperContained.INVALID_GAME_MODE_EXCEPTION; }
// public void INVALID_GAME_MODE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_GAME_MODE_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_GAME_MODE_EXCEPTION() { return net.minecraft.command.argument.GameModeArgumentType.INVALID_GAME_MODE_EXCEPTION; }
// public static void INVALID_GAME_MODE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.GameModeArgumentType.INVALID_GAME_MODE_EXCEPTION = value; }

public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.GameModeArgumentType.listSuggestions(context,builder); }
// public yarnwrap.command.argument.GameModeArgumentType gameMode() { return new yarnwrap.command.argument.GameModeArgumentType(wrapperContained.gameMode()); }
public static yarnwrap.command.argument.GameModeArgumentType gameMode() { return new yarnwrap.command.argument.GameModeArgumentType(net.minecraft.command.argument.GameModeArgumentType.gameMode()); }
// public yarnwrap.world.GameMode getGameMode(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.world.GameMode(wrapperContained.getGameMode(context,name)); }
// public static yarnwrap.world.GameMode getGameMode(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.world.GameMode(net.minecraft.command.argument.GameModeArgumentType.getGameMode(context,name)); }
// public com.mojang.brigadier.Message method_47386(java.lang.Object gameMode) { return wrapperContained.method_47386(gameMode); }
// public static com.mojang.brigadier.Message method_47386(java.lang.Object gameMode, ) { return net.minecraft.command.argument.GameModeArgumentType.method_47386(gameMode); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.GameModeArgumentType.parse(reader); }

}