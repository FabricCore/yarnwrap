package yarnwrap.server.command;
public class CloneCommand { public net.minecraft.server.command.CloneCommand wrapperContained; public CloneCommand(net.minecraft.server.command.CloneCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Predicate IS_AIR_PREDICATE() { return wrapperContained.IS_AIR_PREDICATE; }
// public void IS_AIR_PREDICATE(java.util.function.Predicate value) { wrapperContained.IS_AIR_PREDICATE = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return wrapperContained.TOO_BIG_EXCEPTION; }
// public void TOO_BIG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.TOO_BIG_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OVERLAP_EXCEPTION() { return wrapperContained.OVERLAP_EXCEPTION; }
// public void OVERLAP_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.OVERLAP_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,Object begin,Object end,Object destination,java.util.function.Predicate filter,Object mode) { return wrapperContained.execute(source.wrapperContained,begin,end,destination,filter,mode); }
// public com.mojang.brigadier.builder.ArgumentBuilder createModeArgs(Object beginPosGetter,Object endPosGetter,Object destinationPosGetter,Object filterGetter,com.mojang.brigadier.builder.ArgumentBuilder builder) { return wrapperContained.createModeArgs(beginPosGetter,endPosGetter,destinationPosGetter,filterGetter,builder); }
// public Object createDimensionalPos(com.mojang.brigadier.context.CommandContext context,yarnwrap.server.world.ServerWorld world,java.lang.String name) { return wrapperContained.createDimensionalPos(context,world.wrapperContained,name); }
// public com.mojang.brigadier.builder.ArgumentBuilder createSourceArgs(yarnwrap.command.CommandRegistryAccess commandRegistryAccess,Object worldGetter) { return wrapperContained.createSourceArgs(commandRegistryAccess.wrapperContained,worldGetter); }
// public com.mojang.brigadier.builder.ArgumentBuilder createDestinationArgs(yarnwrap.command.CommandRegistryAccess commandRegistryAccess,Object sourceWorldGetter,Object targetWorldGetter) { return wrapperContained.createDestinationArgs(commandRegistryAccess.wrapperContained,sourceWorldGetter,targetWorldGetter); }

}