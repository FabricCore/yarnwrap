package yarnwrap.server.command;
public class GiveCommand { public net.minecraft.server.command.GiveCommand wrapperContained; public GiveCommand(net.minecraft.server.command.GiveCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_STACKS() { return wrapperContained.MAX_STACKS; }
// public void MAX_STACKS(int value) { wrapperContained.MAX_STACKS = value; }
// public int method_13400(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13400(context); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.argument.ItemStackArgument item,java.util.Collection targets,int count) { return wrapperContained.execute(source.wrapperContained,item.wrapperContained,targets,count); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public int method_13403(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13403(context); }
// public boolean method_13404(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13404(source.wrapperContained); }

}