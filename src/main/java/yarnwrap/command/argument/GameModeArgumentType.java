package yarnwrap.command.argument;
public class GameModeArgumentType { public net.minecraft.command.argument.GameModeArgumentType wrapperContained; public GameModeArgumentType(net.minecraft.command.argument.GameModeArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public net.minecraft.world.GameMode[] VALUES() { return wrapperContained.VALUES; }
// public void VALUES(net.minecraft.world.GameMode[] value) { wrapperContained.VALUES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_GAME_MODE_EXCEPTION() { return wrapperContained.INVALID_GAME_MODE_EXCEPTION; }
// public void INVALID_GAME_MODE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_GAME_MODE_EXCEPTION = value; }
public yarnwrap.command.argument.GameModeArgumentType gameMode() { return new yarnwrap.command.argument.GameModeArgumentType(wrapperContained.gameMode()); }
// public yarnwrap.world.GameMode getGameMode(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.world.GameMode(wrapperContained.getGameMode(context,name)); }

}