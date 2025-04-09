package yarnwrap.server.command;
public class ExperienceCommand { public net.minecraft.server.command.ExperienceCommand wrapperContained; public ExperienceCommand(net.minecraft.server.command.ExperienceCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_POINT_INVALID_EXCEPTION() { return wrapperContained.SET_POINT_INVALID_EXCEPTION; }
// public int executeAdd(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,int amount,Object component) { return wrapperContained.executeAdd(source.wrapperContained,targets,amount,component); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,Object component) { return wrapperContained.executeQuery(source.wrapperContained,player.wrapperContained,component); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeSet(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,int amount,Object component) { return wrapperContained.executeSet(source.wrapperContained,targets,amount,component); }

}