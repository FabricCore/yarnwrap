package yarnwrap.server.dedicated.command;
public class SetIdleTimeoutCommand { public net.minecraft.server.dedicated.command.SetIdleTimeoutCommand wrapperContained; public SetIdleTimeoutCommand(net.minecraft.server.dedicated.command.SetIdleTimeoutCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int execute(yarnwrap.server.command.ServerCommandSource source,int minutes) { return wrapperContained.execute(source.wrapperContained,minutes); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }

}