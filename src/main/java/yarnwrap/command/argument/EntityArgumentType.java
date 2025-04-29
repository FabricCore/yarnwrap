package yarnwrap.command.argument;
public class EntityArgumentType { public net.minecraft.command.argument.EntityArgumentType wrapperContained; public EntityArgumentType(net.minecraft.command.argument.EntityArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType PLAYER_NOT_FOUND_EXCEPTION() { return wrapperContained.PLAYER_NOT_FOUND_EXCEPTION; }
// public void PLAYER_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.PLAYER_NOT_FOUND_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType PLAYER_NOT_FOUND_EXCEPTION() { return net.minecraft.command.argument.EntityArgumentType.PLAYER_NOT_FOUND_EXCEPTION; }
// public static void PLAYER_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.EntityArgumentType.PLAYER_NOT_FOUND_EXCEPTION = value; }

// public boolean playersOnly() { return wrapperContained.playersOnly; }
// public void playersOnly(boolean value) { wrapperContained.playersOnly = value; }
// public static boolean playersOnly() { return net.minecraft.command.argument.EntityArgumentType.playersOnly; }
// public static void playersOnly(boolean value, ) { net.minecraft.command.argument.EntityArgumentType.playersOnly = value; }

// public boolean singleTarget() { return wrapperContained.singleTarget; }
// public void singleTarget(boolean value) { wrapperContained.singleTarget = value; }
// public static boolean singleTarget() { return net.minecraft.command.argument.EntityArgumentType.singleTarget; }
// public static void singleTarget(boolean value, ) { net.minecraft.command.argument.EntityArgumentType.singleTarget = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.EntityArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.EntityArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_MANY_ENTITIES_EXCEPTION() { return wrapperContained.TOO_MANY_ENTITIES_EXCEPTION; }
// public void TOO_MANY_ENTITIES_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.TOO_MANY_ENTITIES_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_MANY_ENTITIES_EXCEPTION() { return net.minecraft.command.argument.EntityArgumentType.TOO_MANY_ENTITIES_EXCEPTION; }
// public static void TOO_MANY_ENTITIES_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.EntityArgumentType.TOO_MANY_ENTITIES_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION() { return wrapperContained.PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION; }
// public void PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION() { return net.minecraft.command.argument.EntityArgumentType.PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION; }
// public static void PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.EntityArgumentType.PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_ALLOWED_EXCEPTION() { return wrapperContained.NOT_ALLOWED_EXCEPTION; }
// public void NOT_ALLOWED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NOT_ALLOWED_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_ALLOWED_EXCEPTION() { return net.minecraft.command.argument.EntityArgumentType.NOT_ALLOWED_EXCEPTION; }
// public static void NOT_ALLOWED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.EntityArgumentType.NOT_ALLOWED_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ENTITY_NOT_FOUND_EXCEPTION() { return wrapperContained.ENTITY_NOT_FOUND_EXCEPTION; }
// public void ENTITY_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ENTITY_NOT_FOUND_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType ENTITY_NOT_FOUND_EXCEPTION() { return net.minecraft.command.argument.EntityArgumentType.ENTITY_NOT_FOUND_EXCEPTION; }
// public static void ENTITY_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.EntityArgumentType.ENTITY_NOT_FOUND_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_MANY_PLAYERS_EXCEPTION() { return wrapperContained.TOO_MANY_PLAYERS_EXCEPTION; }
// public void TOO_MANY_PLAYERS_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.TOO_MANY_PLAYERS_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_MANY_PLAYERS_EXCEPTION() { return net.minecraft.command.argument.EntityArgumentType.TOO_MANY_PLAYERS_EXCEPTION; }
// public static void TOO_MANY_PLAYERS_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.EntityArgumentType.TOO_MANY_PLAYERS_EXCEPTION = value; }

// public EntityArgumentType(boolean singleTarget,boolean playersOnly) { this.wrapperContained = new net.minecraft.command.argument.EntityArgumentType(singleTarget,playersOnly); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.EntityArgumentType.listSuggestions(context,builder); }
// public yarnwrap.command.argument.EntityArgumentType player() { return new yarnwrap.command.argument.EntityArgumentType(wrapperContained.player()); }
public static yarnwrap.command.argument.EntityArgumentType player() { return new yarnwrap.command.argument.EntityArgumentType(net.minecraft.command.argument.EntityArgumentType.player()); }
// public yarnwrap.command.argument.EntityArgumentType entities() { return new yarnwrap.command.argument.EntityArgumentType(wrapperContained.entities()); }
public static yarnwrap.command.argument.EntityArgumentType entities() { return new yarnwrap.command.argument.EntityArgumentType(net.minecraft.command.argument.EntityArgumentType.entities()); }
// public java.util.Collection getOptionalEntities(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getOptionalEntities(context,name); }
// public static java.util.Collection getOptionalEntities(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.EntityArgumentType.getOptionalEntities(context,name); }
// public yarnwrap.command.argument.EntityArgumentType players() { return new yarnwrap.command.argument.EntityArgumentType(wrapperContained.players()); }
public static yarnwrap.command.argument.EntityArgumentType players() { return new yarnwrap.command.argument.EntityArgumentType(net.minecraft.command.argument.EntityArgumentType.players()); }
// public yarnwrap.command.argument.EntityArgumentType entity() { return new yarnwrap.command.argument.EntityArgumentType(wrapperContained.entity()); }
public static yarnwrap.command.argument.EntityArgumentType entity() { return new yarnwrap.command.argument.EntityArgumentType(net.minecraft.command.argument.EntityArgumentType.entity()); }
// public java.util.Collection getOptionalPlayers(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getOptionalPlayers(context,name); }
// public static java.util.Collection getOptionalPlayers(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.EntityArgumentType.getOptionalPlayers(context,name); }
// public void method_9311(yarnwrap.command.CommandSource builder) { wrapperContained.method_9311(builder.wrapperContained); }
// public static void method_9311(yarnwrap.command.CommandSource builder, ) { net.minecraft.command.argument.EntityArgumentType.method_9311(builder.wrapperContained); }
// public java.util.Collection getPlayers(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getPlayers(context,name); }
// public static java.util.Collection getPlayers(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.EntityArgumentType.getPlayers(context,name); }
// public yarnwrap.entity.Entity getEntity(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(context,name)); }
// public static yarnwrap.entity.Entity getEntity(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.entity.Entity(net.minecraft.command.argument.EntityArgumentType.getEntity(context,name)); }
// public yarnwrap.server.network.ServerPlayerEntity getPlayer(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer(context,name)); }
// public static yarnwrap.server.network.ServerPlayerEntity getPlayer(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.command.argument.EntityArgumentType.getPlayer(context,name)); }
// public java.util.Collection getEntities(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getEntities(context,name); }
// public static java.util.Collection getEntities(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.EntityArgumentType.getEntities(context,name); }
// public yarnwrap.command.EntitySelector parse(com.mojang.brigadier.StringReader reader,boolean allowAtSelectors) { return new yarnwrap.command.EntitySelector(wrapperContained.parse(reader,allowAtSelectors)); }
// public static yarnwrap.command.EntitySelector parse(com.mojang.brigadier.StringReader reader,boolean allowAtSelectors, ) { return new yarnwrap.command.EntitySelector(net.minecraft.command.argument.EntityArgumentType.parse(reader,allowAtSelectors)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.EntityArgumentType.parse(reader); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader,java.lang.Object source) { return wrapperContained.parse(reader,source); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader,java.lang.Object source, ) { return net.minecraft.command.argument.EntityArgumentType.parse(reader,source); }

}