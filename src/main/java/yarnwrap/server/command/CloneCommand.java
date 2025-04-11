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
// public boolean method_13094(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13094(source.wrapperContained); }
// public boolean method_13096(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_13096(pos.wrapperContained); }
// public com.mojang.brigadier.Message method_13099(java.lang.Object maxCount,java.lang.Object count) { return wrapperContained.method_13099(maxCount,count); }
// public com.mojang.brigadier.builder.ArgumentBuilder createModeArgs(Object beginPosGetter,Object endPosGetter,Object destinationPosGetter,Object filterGetter,com.mojang.brigadier.builder.ArgumentBuilder builder) { return wrapperContained.createModeArgs(beginPosGetter,endPosGetter,destinationPosGetter,filterGetter,builder); }
// public int method_48036(Object context) { return wrapperContained.method_48036(context); }
// public int method_48037(Object context) { return wrapperContained.method_48037(context); }
// public Object method_48038(Object context) { return wrapperContained.method_48038(context); }
// public java.util.function.Predicate method_48039(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48039(context); }
// public Object createDimensionalPos(com.mojang.brigadier.context.CommandContext context,yarnwrap.server.world.ServerWorld world,java.lang.String name) { return wrapperContained.createDimensionalPos(context,world.wrapperContained,name); }
// public boolean method_48041(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_48041(pos.wrapperContained); }
// public com.mojang.brigadier.builder.ArgumentBuilder createSourceArgs(yarnwrap.command.CommandRegistryAccess commandRegistryAccess,Object worldGetter) { return wrapperContained.createSourceArgs(commandRegistryAccess.wrapperContained,worldGetter); }
// public com.mojang.brigadier.builder.ArgumentBuilder createDestinationArgs(yarnwrap.command.CommandRegistryAccess commandRegistryAccess,Object sourceWorldGetter,Object targetWorldGetter) { return wrapperContained.createDestinationArgs(commandRegistryAccess.wrapperContained,sourceWorldGetter,targetWorldGetter); }
// public int method_48044(Object context) { return wrapperContained.method_48044(context); }
// public int method_48045(Object context) { return wrapperContained.method_48045(context); }
// public Object method_48046(Object context) { return wrapperContained.method_48046(context); }
// public java.util.function.Predicate method_48047(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48047(context); }
// public int method_48049(Object context) { return wrapperContained.method_48049(context); }
// public int method_48050(Object context) { return wrapperContained.method_48050(context); }
// public Object method_48051(Object context) { return wrapperContained.method_48051(context); }
// public java.util.function.Predicate method_48052(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_48052(context); }
// public boolean method_48053(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_48053(pos.wrapperContained); }
// public int method_48054(Object context) { return wrapperContained.method_48054(context); }
// public yarnwrap.server.world.ServerWorld method_48055(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.server.world.ServerWorld(wrapperContained.method_48055(context)); }
// public yarnwrap.server.world.ServerWorld method_48056(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.server.world.ServerWorld(wrapperContained.method_48056(context)); }
// public yarnwrap.server.world.ServerWorld method_48057(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.server.world.ServerWorld(wrapperContained.method_48057(context)); }
// public yarnwrap.server.world.ServerWorld method_48058(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.server.world.ServerWorld(wrapperContained.method_48058(context)); }

}