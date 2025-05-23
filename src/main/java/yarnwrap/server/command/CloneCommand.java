package yarnwrap.server.command;
public class CloneCommand { public net.minecraft.server.command.CloneCommand wrapperContained; public CloneCommand(net.minecraft.server.command.CloneCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate IS_AIR_PREDICATE() { return wrapperContained.IS_AIR_PREDICATE; }
// public void IS_AIR_PREDICATE(java.util.function.Predicate value) { wrapperContained.IS_AIR_PREDICATE = value; }
public static java.util.function.Predicate IS_AIR_PREDICATE() { return net.minecraft.server.command.CloneCommand.IS_AIR_PREDICATE; }
// public static void IS_AIR_PREDICATE(java.util.function.Predicate value, ) { net.minecraft.server.command.CloneCommand.IS_AIR_PREDICATE = value; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return wrapperContained.TOO_BIG_EXCEPTION; }
// public void TOO_BIG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.TOO_BIG_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return net.minecraft.server.command.CloneCommand.TOO_BIG_EXCEPTION; }
// public static void TOO_BIG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.server.command.CloneCommand.TOO_BIG_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return net.minecraft.server.command.CloneCommand.FAILED_EXCEPTION; }
// public static void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.CloneCommand.FAILED_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType OVERLAP_EXCEPTION() { return wrapperContained.OVERLAP_EXCEPTION; }
// public void OVERLAP_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.OVERLAP_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType OVERLAP_EXCEPTION() { return net.minecraft.server.command.CloneCommand.OVERLAP_EXCEPTION; }
// public static void OVERLAP_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.CloneCommand.OVERLAP_EXCEPTION = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.command.CloneCommand.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.command.CloneCommand.LOGGER = value; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess, ) { net.minecraft.server.command.CloneCommand.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,Object begin,Object end,Object destination,java.util.function.Predicate filter,Object mode,boolean strict) { return wrapperContained.execute(source.wrapperContained,begin,end,destination,filter,mode,strict); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,Object begin,Object end,Object destination,java.util.function.Predicate filter,Object mode,boolean strict, ) { return net.minecraft.server.command.CloneCommand.execute(source.wrapperContained,begin,end,destination,filter,mode,strict); }
// public boolean method_13096(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_13096(pos.wrapperContained); }
// public static boolean method_13096(yarnwrap.block.pattern.CachedBlockPosition pos, ) { return net.minecraft.server.command.CloneCommand.method_13096(pos.wrapperContained); }
// public com.mojang.brigadier.Message method_13099(java.lang.Object maxCount,java.lang.Object count) { return wrapperContained.method_13099(maxCount,count); }
// public static com.mojang.brigadier.Message method_13099(java.lang.Object maxCount,java.lang.Object count, ) { return net.minecraft.server.command.CloneCommand.method_13099(maxCount,count); }
// public com.mojang.brigadier.builder.ArgumentBuilder createModeArgs(yarnwrap.command.ArgumentGetter beginPosGetter,yarnwrap.command.ArgumentGetter endPosGetter,yarnwrap.command.ArgumentGetter destinationPosGetter,yarnwrap.command.ArgumentGetter filterGetter,boolean strict,com.mojang.brigadier.builder.ArgumentBuilder builder) { return wrapperContained.createModeArgs(beginPosGetter.wrapperContained,endPosGetter.wrapperContained,destinationPosGetter.wrapperContained,filterGetter.wrapperContained,strict,builder); }
// public static com.mojang.brigadier.builder.ArgumentBuilder createModeArgs(yarnwrap.command.ArgumentGetter beginPosGetter,yarnwrap.command.ArgumentGetter endPosGetter,yarnwrap.command.ArgumentGetter destinationPosGetter,yarnwrap.command.ArgumentGetter filterGetter,boolean strict,com.mojang.brigadier.builder.ArgumentBuilder builder, ) { return net.minecraft.server.command.CloneCommand.createModeArgs(beginPosGetter.wrapperContained,endPosGetter.wrapperContained,destinationPosGetter.wrapperContained,filterGetter.wrapperContained,strict,builder); }
// public int method_48036(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_48036(context.wrapperContained); }
// public static int method_48036(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.CloneCommand.method_48036(context.wrapperContained); }
// public Object createDimensionalPos(com.mojang.brigadier.context.CommandContext context,yarnwrap.server.world.ServerWorld world,java.lang.String name) { return wrapperContained.createDimensionalPos(context,world.wrapperContained,name); }
// public static Object createDimensionalPos(com.mojang.brigadier.context.CommandContext context,yarnwrap.server.world.ServerWorld world,java.lang.String name, ) { return net.minecraft.server.command.CloneCommand.createDimensionalPos(context,world.wrapperContained,name); }
// public com.mojang.brigadier.builder.ArgumentBuilder createSourceArgs(yarnwrap.command.CommandRegistryAccess commandRegistryAccess,yarnwrap.command.ArgumentGetter worldGetter) { return wrapperContained.createSourceArgs(commandRegistryAccess.wrapperContained,worldGetter.wrapperContained); }
// public static com.mojang.brigadier.builder.ArgumentBuilder createSourceArgs(yarnwrap.command.CommandRegistryAccess commandRegistryAccess,yarnwrap.command.ArgumentGetter worldGetter, ) { return net.minecraft.server.command.CloneCommand.createSourceArgs(commandRegistryAccess.wrapperContained,worldGetter.wrapperContained); }
// public int method_48044(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_48044(context.wrapperContained); }
// public static int method_48044(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.CloneCommand.method_48044(context.wrapperContained); }
// public int method_48049(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_48049(context.wrapperContained); }
// public static int method_48049(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.CloneCommand.method_48049(context.wrapperContained); }
// public yarnwrap.server.world.ServerWorld method_48055(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.server.world.ServerWorld(wrapperContained.method_48055(context)); }
// public static yarnwrap.server.world.ServerWorld method_48055(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.command.CloneCommand.method_48055(context)); }
// public yarnwrap.server.world.ServerWorld method_48056(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.server.world.ServerWorld(wrapperContained.method_48056(context)); }
// public static yarnwrap.server.world.ServerWorld method_48056(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.command.CloneCommand.method_48056(context)); }
// public yarnwrap.server.world.ServerWorld method_48057(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.server.world.ServerWorld(wrapperContained.method_48057(context)); }
// public static yarnwrap.server.world.ServerWorld method_48057(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.command.CloneCommand.method_48057(context)); }
// public yarnwrap.server.world.ServerWorld method_48058(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.server.world.ServerWorld(wrapperContained.method_48058(context)); }
// public static yarnwrap.server.world.ServerWorld method_48058(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.command.CloneCommand.method_48058(context)); }
// public int method_65973(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_65973(context.wrapperContained); }
// public static int method_65973(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.CloneCommand.method_65973(context.wrapperContained); }
// public Object method_65974(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_65974(context.wrapperContained); }
// public static Object method_65974(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.CloneCommand.method_65974(context.wrapperContained); }
// public java.util.function.Predicate method_65975(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_65975(context); }
// public static java.util.function.Predicate method_65975(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.CloneCommand.method_65975(context); }
// public boolean method_65976(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_65976(pos.wrapperContained); }
// public static boolean method_65976(yarnwrap.block.pattern.CachedBlockPosition pos, ) { return net.minecraft.server.command.CloneCommand.method_65976(pos.wrapperContained); }
// public com.mojang.brigadier.builder.ArgumentBuilder createDestinationArgs(yarnwrap.command.CommandRegistryAccess registries,yarnwrap.command.ArgumentGetter currentWorldGetter,yarnwrap.command.ArgumentGetter targetWorldGetter) { return wrapperContained.createDestinationArgs(registries.wrapperContained,currentWorldGetter.wrapperContained,targetWorldGetter.wrapperContained); }
// public static com.mojang.brigadier.builder.ArgumentBuilder createDestinationArgs(yarnwrap.command.CommandRegistryAccess registries,yarnwrap.command.ArgumentGetter currentWorldGetter,yarnwrap.command.ArgumentGetter targetWorldGetter, ) { return net.minecraft.server.command.CloneCommand.createDestinationArgs(registries.wrapperContained,currentWorldGetter.wrapperContained,targetWorldGetter.wrapperContained); }
// public com.mojang.brigadier.builder.ArgumentBuilder appendMode(yarnwrap.command.CommandRegistryAccess registries,yarnwrap.command.ArgumentGetter beginPosGetter,yarnwrap.command.ArgumentGetter endPosGetter,yarnwrap.command.ArgumentGetter destinationPosGetter,boolean strict,com.mojang.brigadier.builder.ArgumentBuilder builder) { return wrapperContained.appendMode(registries.wrapperContained,beginPosGetter.wrapperContained,endPosGetter.wrapperContained,destinationPosGetter.wrapperContained,strict,builder); }
// public static com.mojang.brigadier.builder.ArgumentBuilder appendMode(yarnwrap.command.CommandRegistryAccess registries,yarnwrap.command.ArgumentGetter beginPosGetter,yarnwrap.command.ArgumentGetter endPosGetter,yarnwrap.command.ArgumentGetter destinationPosGetter,boolean strict,com.mojang.brigadier.builder.ArgumentBuilder builder, ) { return net.minecraft.server.command.CloneCommand.appendMode(registries.wrapperContained,beginPosGetter.wrapperContained,endPosGetter.wrapperContained,destinationPosGetter.wrapperContained,strict,builder); }
// public Object method_65979(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_65979(context.wrapperContained); }
// public static Object method_65979(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.CloneCommand.method_65979(context.wrapperContained); }
// public java.util.function.Predicate method_65980(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_65980(context); }
// public static java.util.function.Predicate method_65980(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.CloneCommand.method_65980(context); }
// public boolean method_65981(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_65981(pos.wrapperContained); }
// public static boolean method_65981(yarnwrap.block.pattern.CachedBlockPosition pos, ) { return net.minecraft.server.command.CloneCommand.method_65981(pos.wrapperContained); }
// public Object method_65982(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_65982(context.wrapperContained); }
// public static Object method_65982(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.CloneCommand.method_65982(context.wrapperContained); }
// public java.util.function.Predicate method_65983(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_65983(context); }
// public static java.util.function.Predicate method_65983(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.CloneCommand.method_65983(context); }
// public int method_65984(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_65984(context.wrapperContained); }
// public static int method_65984(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.CloneCommand.method_65984(context.wrapperContained); }

}