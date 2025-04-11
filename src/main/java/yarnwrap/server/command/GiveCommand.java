package yarnwrap.server.command;
public class GiveCommand { public net.minecraft.server.command.GiveCommand wrapperContained; public GiveCommand(net.minecraft.server.command.GiveCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_STACKS() { return wrapperContained.MAX_STACKS; }
// public void MAX_STACKS(int value) { wrapperContained.MAX_STACKS = value; }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.argument.ItemStackArgument item,java.util.Collection targets,int count) { return wrapperContained.execute(source.wrapperContained,item.wrapperContained,targets,count); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }

}