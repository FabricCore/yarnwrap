package yarnwrap.server.command;
public class KickCommand { public net.minecraft.server.command.KickCommand wrapperContained; public KickCommand(net.minecraft.server.command.KickCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType CANNOT_KICK_OWNER_EXCEPTION() { return wrapperContained.CANNOT_KICK_OWNER_EXCEPTION; }
// public void CANNOT_KICK_OWNER_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.CANNOT_KICK_OWNER_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType CANNOT_KICK_OWNER_EXCEPTION() { return net.minecraft.server.command.KickCommand.CANNOT_KICK_OWNER_EXCEPTION; }
// public static void CANNOT_KICK_OWNER_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.KickCommand.CANNOT_KICK_OWNER_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType CANNOT_KICK_SINGLEPLAYER_EXCEPTION() { return wrapperContained.CANNOT_KICK_SINGLEPLAYER_EXCEPTION; }
// public void CANNOT_KICK_SINGLEPLAYER_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.CANNOT_KICK_SINGLEPLAYER_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType CANNOT_KICK_SINGLEPLAYER_EXCEPTION() { return net.minecraft.server.command.KickCommand.CANNOT_KICK_SINGLEPLAYER_EXCEPTION; }
// public static void CANNOT_KICK_SINGLEPLAYER_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.KickCommand.CANNOT_KICK_SINGLEPLAYER_EXCEPTION = value; }

// public int method_13409(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13409(context); }
// public static int method_13409(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.KickCommand.method_13409(context); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.KickCommand.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.text.Text reason) { return wrapperContained.execute(source.wrapperContained,targets,reason.wrapperContained); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.text.Text reason, ) { return net.minecraft.server.command.KickCommand.execute(source.wrapperContained,targets,reason.wrapperContained); }
// public int method_13412(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13412(context); }
// public static int method_13412(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.KickCommand.method_13412(context); }
// public boolean method_13413(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13413(source.wrapperContained); }
// public static boolean method_13413(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.KickCommand.method_13413(source.wrapperContained); }

}