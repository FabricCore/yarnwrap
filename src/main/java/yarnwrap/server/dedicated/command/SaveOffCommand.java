package yarnwrap.server.dedicated.command;
public class SaveOffCommand { public net.minecraft.server.dedicated.command.SaveOffCommand wrapperContained; public SaveOffCommand(net.minecraft.server.dedicated.command.SaveOffCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_OFF_EXCEPTION() { return wrapperContained.ALREADY_OFF_EXCEPTION; }
// public void ALREADY_OFF_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_OFF_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_OFF_EXCEPTION() { return net.minecraft.server.dedicated.command.SaveOffCommand.ALREADY_OFF_EXCEPTION; }
// public static void ALREADY_OFF_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.dedicated.command.SaveOffCommand.ALREADY_OFF_EXCEPTION = value; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.dedicated.command.SaveOffCommand.register(dispatcher); }
// public int method_13557(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13557(context); }
// public static int method_13557(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.dedicated.command.SaveOffCommand.method_13557(context); }
// public boolean method_13558(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13558(source.wrapperContained); }
// public static boolean method_13558(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.dedicated.command.SaveOffCommand.method_13558(source.wrapperContained); }

}