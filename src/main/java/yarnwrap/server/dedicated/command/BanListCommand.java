package yarnwrap.server.dedicated.command;
public class BanListCommand { public net.minecraft.server.dedicated.command.BanListCommand wrapperContained; public BanListCommand(net.minecraft.server.dedicated.command.BanListCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.execute(source.wrapperContained,targets); }

}