package yarnwrap.server.dedicated.command;
public class BanCommand { public net.minecraft.server.dedicated.command.BanCommand wrapperContained; public BanCommand(net.minecraft.server.dedicated.command.BanCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_BANNED_EXCEPTION() { return wrapperContained.ALREADY_BANNED_EXCEPTION; }
// public void ALREADY_BANNED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_BANNED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_BANNED_EXCEPTION() { return net.minecraft.server.dedicated.command.BanCommand.ALREADY_BANNED_EXCEPTION; }
// public static void ALREADY_BANNED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.dedicated.command.BanCommand.ALREADY_BANNED_EXCEPTION = value; }

// public int method_13020(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13020(context); }
// public static int method_13020(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.dedicated.command.BanCommand.method_13020(context); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.dedicated.command.BanCommand.register(dispatcher); }
// public int ban(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.text.Text reason) { return wrapperContained.ban(source.wrapperContained,targets,reason.wrapperContained); }
// public static int ban(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.text.Text reason, ) { return net.minecraft.server.dedicated.command.BanCommand.ban(source.wrapperContained,targets,reason.wrapperContained); }
// public int method_13023(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13023(context); }
// public static int method_13023(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.dedicated.command.BanCommand.method_13023(context); }

}