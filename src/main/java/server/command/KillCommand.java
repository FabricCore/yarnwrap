package yarnwrap.server.command;
public class KillCommand { public net.minecraft.server.command.KillCommand wrapperContained; public KillCommand(net.minecraft.server.command.KillCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.execute(source.wrapperContained,targets); }

}