package yarnwrap.server.command;
public class SayCommand { public net.minecraft.server.command.SayCommand wrapperContained; public SayCommand(net.minecraft.server.command.SayCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.SayCommand.register(dispatcher); }
// public int method_13563(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13563(context); }
// public static int method_13563(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.SayCommand.method_13563(context); }
// public boolean method_13564(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13564(source.wrapperContained); }
// public static boolean method_13564(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.SayCommand.method_13564(source.wrapperContained); }
// public void method_43657(com.mojang.brigadier.context.CommandContext message) { wrapperContained.method_43657(message); }
// public static void method_43657(com.mojang.brigadier.context.CommandContext message, ) { net.minecraft.server.command.SayCommand.method_43657(message); }

}