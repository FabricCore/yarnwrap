package yarnwrap.server.command;
public class KillCommand { public net.minecraft.server.command.KillCommand wrapperContained; public KillCommand(net.minecraft.server.command.KillCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.execute(source.wrapperContained,targets); }
// public int method_13431(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13431(context); }
// public boolean method_13432(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13432(source.wrapperContained); }
// public int method_22832(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22832(context); }

}