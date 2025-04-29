package yarnwrap.server.command;
public class SeedCommand { public net.minecraft.server.command.SeedCommand wrapperContained; public SeedCommand(net.minecraft.server.command.SeedCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,boolean dedicated) { wrapperContained.register(dispatcher,dedicated); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,boolean dedicated, ) { net.minecraft.server.command.SeedCommand.register(dispatcher,dedicated); }
// public int method_13617(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13617(context); }
// public static int method_13617(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.SeedCommand.method_13617(context); }
// public boolean method_13618(boolean source) { return wrapperContained.method_13618(source); }
// public static boolean method_13618(boolean source, ) { return net.minecraft.server.command.SeedCommand.method_13618(source); }

}