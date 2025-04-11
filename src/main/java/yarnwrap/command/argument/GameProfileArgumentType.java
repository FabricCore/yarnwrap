package yarnwrap.command.argument;
public class GameProfileArgumentType { public net.minecraft.command.argument.GameProfileArgumentType wrapperContained; public GameProfileArgumentType(net.minecraft.command.argument.GameProfileArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNKNOWN_PLAYER_EXCEPTION() { return wrapperContained.UNKNOWN_PLAYER_EXCEPTION; }
// public void UNKNOWN_PLAYER_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.UNKNOWN_PLAYER_EXCEPTION = value; }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public java.util.Collection method_9328(java.lang.String source) { return wrapperContained.method_9328(source); }
public yarnwrap.command.argument.GameProfileArgumentType gameProfile() { return new yarnwrap.command.argument.GameProfileArgumentType(wrapperContained.gameProfile()); }
// public java.util.Collection getProfileArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getProfileArgument(context,name); }
// public Object parse(com.mojang.brigadier.StringReader reader,boolean allowAtSelectors) { return wrapperContained.parse(reader,allowAtSelectors); }
// public void method_9332(yarnwrap.command.CommandSource builder) { wrapperContained.method_9332(builder.wrapperContained); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader,java.lang.Object source) { return wrapperContained.parse(reader,source); }

}