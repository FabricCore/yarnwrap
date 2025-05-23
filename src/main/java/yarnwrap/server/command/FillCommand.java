package yarnwrap.server.command;
public class FillCommand { public net.minecraft.server.command.FillCommand wrapperContained; public FillCommand(net.minecraft.server.command.FillCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.BlockStateArgument AIR_BLOCK_ARGUMENT() { return new yarnwrap.command.argument.BlockStateArgument(wrapperContained.AIR_BLOCK_ARGUMENT); }
// public void AIR_BLOCK_ARGUMENT(yarnwrap.command.argument.BlockStateArgument value) { wrapperContained.AIR_BLOCK_ARGUMENT = value.wrapperContained; }
// public static yarnwrap.command.argument.BlockStateArgument AIR_BLOCK_ARGUMENT() { return new yarnwrap.command.argument.BlockStateArgument(net.minecraft.server.command.FillCommand.AIR_BLOCK_ARGUMENT); }
// public static void AIR_BLOCK_ARGUMENT(yarnwrap.command.argument.BlockStateArgument value, ) { net.minecraft.server.command.FillCommand.AIR_BLOCK_ARGUMENT = value.wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return wrapperContained.TOO_BIG_EXCEPTION; }
// public void TOO_BIG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.TOO_BIG_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return net.minecraft.server.command.FillCommand.TOO_BIG_EXCEPTION; }
// public static void TOO_BIG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.server.command.FillCommand.TOO_BIG_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return net.minecraft.server.command.FillCommand.FAILED_EXCEPTION; }
// public static void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.FillCommand.FAILED_EXCEPTION = value; }

// public int method_13346(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13346(context); }
// public static int method_13346(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.FillCommand.method_13346(context); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess, ) { net.minecraft.server.command.FillCommand.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public boolean method_13348(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_13348(pos.wrapperContained); }
// public static boolean method_13348(yarnwrap.block.pattern.CachedBlockPosition pos, ) { return net.minecraft.server.command.FillCommand.method_13348(pos.wrapperContained); }
// public com.mojang.brigadier.Message method_13352(java.lang.Object maxCount,java.lang.Object count) { return wrapperContained.method_13352(maxCount,count); }
// public static com.mojang.brigadier.Message method_13352(java.lang.Object maxCount,java.lang.Object count, ) { return net.minecraft.server.command.FillCommand.method_13352(maxCount,count); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockBox range,yarnwrap.command.argument.BlockStateArgument block,Object mode,java.util.function.Predicate filter,boolean strict) { return wrapperContained.execute(source.wrapperContained,range.wrapperContained,block.wrapperContained,mode,filter,strict); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockBox range,yarnwrap.command.argument.BlockStateArgument block,Object mode,java.util.function.Predicate filter,boolean strict, ) { return net.minecraft.server.command.FillCommand.execute(source.wrapperContained,range.wrapperContained,block.wrapperContained,mode,filter,strict); }
// public int method_65985(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_65985(context.wrapperContained); }
// public static int method_65985(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.FillCommand.method_65985(context.wrapperContained); }
// public int method_65986(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_65986(context); }
// public static int method_65986(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.FillCommand.method_65986(context); }
// public com.mojang.brigadier.builder.ArgumentBuilder buildModeTree(yarnwrap.command.CommandRegistryAccess registries,com.mojang.brigadier.builder.ArgumentBuilder argumentBuilder,yarnwrap.command.ArgumentGetter from,yarnwrap.command.ArgumentGetter to,yarnwrap.command.ArgumentGetter state,Object filter) { return wrapperContained.buildModeTree(registries.wrapperContained,argumentBuilder,from.wrapperContained,to.wrapperContained,state.wrapperContained,filter); }
// public static com.mojang.brigadier.builder.ArgumentBuilder buildModeTree(yarnwrap.command.CommandRegistryAccess registries,com.mojang.brigadier.builder.ArgumentBuilder argumentBuilder,yarnwrap.command.ArgumentGetter from,yarnwrap.command.ArgumentGetter to,yarnwrap.command.ArgumentGetter state,Object filter, ) { return net.minecraft.server.command.FillCommand.buildModeTree(registries.wrapperContained,argumentBuilder,from.wrapperContained,to.wrapperContained,state.wrapperContained,filter); }
// public int method_65988(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_65988(context.wrapperContained); }
// public static int method_65988(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.FillCommand.method_65988(context.wrapperContained); }
// public java.util.function.Predicate method_65989(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_65989(context); }
// public static java.util.function.Predicate method_65989(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.FillCommand.method_65989(context); }
// public int method_65990(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_65990(context.wrapperContained); }
// public static int method_65990(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.FillCommand.method_65990(context.wrapperContained); }
// public yarnwrap.command.argument.BlockStateArgument method_65991(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.command.argument.BlockStateArgument(wrapperContained.method_65991(context)); }
// public static yarnwrap.command.argument.BlockStateArgument method_65991(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.command.argument.BlockStateArgument(net.minecraft.server.command.FillCommand.method_65991(context)); }
// public int method_65992(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_65992(context.wrapperContained); }
// public static int method_65992(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.FillCommand.method_65992(context.wrapperContained); }
// public yarnwrap.util.math.BlockPos method_65993(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_65993(context)); }
// public static yarnwrap.util.math.BlockPos method_65993(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.server.command.FillCommand.method_65993(context)); }
// public int method_65994(yarnwrap.command.ArgumentGetter context) { return wrapperContained.method_65994(context.wrapperContained); }
// public static int method_65994(yarnwrap.command.ArgumentGetter context, ) { return net.minecraft.server.command.FillCommand.method_65994(context.wrapperContained); }
// public yarnwrap.util.math.BlockPos method_65995(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_65995(context)); }
// public static yarnwrap.util.math.BlockPos method_65995(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.server.command.FillCommand.method_65995(context)); }
// public java.util.function.Predicate method_65996(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_65996(context); }
// public static java.util.function.Predicate method_65996(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.FillCommand.method_65996(context); }
// public yarnwrap.command.argument.BlockStateArgument method_65997(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.command.argument.BlockStateArgument(wrapperContained.method_65997(context)); }
// public static yarnwrap.command.argument.BlockStateArgument method_65997(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.command.argument.BlockStateArgument(net.minecraft.server.command.FillCommand.method_65997(context)); }
// public yarnwrap.util.math.BlockPos method_65998(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_65998(context)); }
// public static yarnwrap.util.math.BlockPos method_65998(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.server.command.FillCommand.method_65998(context)); }
// public yarnwrap.util.math.BlockPos method_65999(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_65999(context)); }
// public static yarnwrap.util.math.BlockPos method_65999(com.mojang.brigadier.context.CommandContext context, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.server.command.FillCommand.method_65999(context)); }

}