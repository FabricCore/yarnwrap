package yarnwrap.server.command;
public class SetBlockCommand { public net.minecraft.server.command.SetBlockCommand wrapperContained; public SetBlockCommand(net.minecraft.server.command.SetBlockCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return net.minecraft.server.command.SetBlockCommand.FAILED_EXCEPTION; }
// public static void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.SetBlockCommand.FAILED_EXCEPTION = value; }

// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos,yarnwrap.command.argument.BlockStateArgument block,Object mode,java.util.function.Predicate condition,boolean strict) { return wrapperContained.execute(source.wrapperContained,pos.wrapperContained,block.wrapperContained,mode,condition,strict); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos,yarnwrap.command.argument.BlockStateArgument block,Object mode,java.util.function.Predicate condition,boolean strict, ) { return net.minecraft.server.command.SetBlockCommand.execute(source.wrapperContained,pos.wrapperContained,block.wrapperContained,mode,condition,strict); }
// public int method_13622(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13622(context); }
// public static int method_13622(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.SetBlockCommand.method_13622(context); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess, ) { net.minecraft.server.command.SetBlockCommand.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public boolean method_13624(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_13624(pos.wrapperContained); }
// public static boolean method_13624(yarnwrap.block.pattern.CachedBlockPosition pos, ) { return net.minecraft.server.command.SetBlockCommand.method_13624(pos.wrapperContained); }
// public int method_13625(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13625(context); }
// public static int method_13625(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.SetBlockCommand.method_13625(context); }
// public int method_13626(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13626(context); }
// public static int method_13626(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.SetBlockCommand.method_13626(context); }
// public int method_66004(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_66004(context); }
// public static int method_66004(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.SetBlockCommand.method_66004(context); }
// public int method_66005(java.util.function.Predicate context) { return wrapperContained.method_66005(context); }
// public static int method_66005(java.util.function.Predicate context, ) { return net.minecraft.server.command.SetBlockCommand.method_66005(context); }

}