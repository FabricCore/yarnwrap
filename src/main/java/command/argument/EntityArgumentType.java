package yarnwrap.command.argument;
public class EntityArgumentType { public net.minecraft.command.argument.EntityArgumentType wrapperContained; public EntityArgumentType(net.minecraft.command.argument.EntityArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.SimpleCommandExceptionType PLAYER_NOT_FOUND_EXCEPTION() { return wrapperContained.PLAYER_NOT_FOUND_EXCEPTION; }
// public boolean playersOnly() { return wrapperContained.playersOnly; }
// public boolean singleTarget() { return wrapperContained.singleTarget; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_MANY_ENTITIES_EXCEPTION() { return wrapperContained.TOO_MANY_ENTITIES_EXCEPTION; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION() { return wrapperContained.PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_ALLOWED_EXCEPTION() { return wrapperContained.NOT_ALLOWED_EXCEPTION; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ENTITY_NOT_FOUND_EXCEPTION() { return wrapperContained.ENTITY_NOT_FOUND_EXCEPTION; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_MANY_PLAYERS_EXCEPTION() { return wrapperContained.TOO_MANY_PLAYERS_EXCEPTION; }
public yarnwrap.command.argument.EntityArgumentType player() { return new yarnwrap.command.argument.EntityArgumentType(wrapperContained.player()); }
public yarnwrap.command.argument.EntityArgumentType entities() { return new yarnwrap.command.argument.EntityArgumentType(wrapperContained.entities()); }
// public java.util.Collection getOptionalEntities(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getOptionalEntities(context,name); }
public yarnwrap.command.argument.EntityArgumentType players() { return new yarnwrap.command.argument.EntityArgumentType(wrapperContained.players()); }
public yarnwrap.command.argument.EntityArgumentType entity() { return new yarnwrap.command.argument.EntityArgumentType(wrapperContained.entity()); }
// public java.util.Collection getOptionalPlayers(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getOptionalPlayers(context,name); }
// public java.util.Collection getPlayers(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getPlayers(context,name); }
// public yarnwrap.entity.Entity getEntity(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(context,name)); }
// public yarnwrap.server.network.ServerPlayerEntity getPlayer(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer(context,name)); }
// public java.util.Collection getEntities(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getEntities(context,name); }
// public yarnwrap.command.EntitySelector parse(com.mojang.brigadier.StringReader reader,boolean allowAtSelectors) { return new yarnwrap.command.EntitySelector(wrapperContained.parse(reader,allowAtSelectors)); }

}