package yarnwrap.command.argument;
public class GameProfileArgumentType { public net.minecraft.command.argument.GameProfileArgumentType wrapperContained; public GameProfileArgumentType(net.minecraft.command.argument.GameProfileArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNKNOWN_PLAYER_EXCEPTION() { return wrapperContained.UNKNOWN_PLAYER_EXCEPTION; }
public yarnwrap.command.argument.GameProfileArgumentType gameProfile() { return new yarnwrap.command.argument.GameProfileArgumentType(wrapperContained.gameProfile()); }
// public java.util.Collection getProfileArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getProfileArgument(context,name); }
// public Object parse(com.mojang.brigadier.StringReader reader,boolean allowAtSelectors) { return wrapperContained.parse(reader,allowAtSelectors); }

}