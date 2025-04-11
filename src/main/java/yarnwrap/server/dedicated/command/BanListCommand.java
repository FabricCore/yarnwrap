package yarnwrap.server.dedicated.command;
public class BanListCommand { public net.minecraft.server.dedicated.command.BanListCommand wrapperContained; public BanListCommand(net.minecraft.server.dedicated.command.BanListCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int method_13013(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13013(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.execute(source.wrapperContained,targets); }
// public int method_13016(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13016(context); }
// public int method_13017(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13017(context); }
// public boolean method_13018(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13018(source.wrapperContained); }

}