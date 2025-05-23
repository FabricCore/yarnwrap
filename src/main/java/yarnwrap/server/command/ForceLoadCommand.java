package yarnwrap.server.command;
public class ForceLoadCommand { public net.minecraft.server.command.ForceLoadCommand wrapperContained; public ForceLoadCommand(net.minecraft.server.command.ForceLoadCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return wrapperContained.TOO_BIG_EXCEPTION; }
// public void TOO_BIG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.TOO_BIG_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return net.minecraft.server.command.ForceLoadCommand.TOO_BIG_EXCEPTION; }
// public static void TOO_BIG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.server.command.ForceLoadCommand.TOO_BIG_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ADDED_FAILURE_EXCEPTION() { return wrapperContained.ADDED_FAILURE_EXCEPTION; }
// public void ADDED_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ADDED_FAILURE_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType ADDED_FAILURE_EXCEPTION() { return net.minecraft.server.command.ForceLoadCommand.ADDED_FAILURE_EXCEPTION; }
// public static void ADDED_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.ForceLoadCommand.ADDED_FAILURE_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType QUERY_FAILURE_EXCEPTION() { return wrapperContained.QUERY_FAILURE_EXCEPTION; }
// public void QUERY_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.QUERY_FAILURE_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType QUERY_FAILURE_EXCEPTION() { return net.minecraft.server.command.ForceLoadCommand.QUERY_FAILURE_EXCEPTION; }
// public static void QUERY_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.server.command.ForceLoadCommand.QUERY_FAILURE_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REMOVED_FAILURE_EXCEPTION() { return wrapperContained.REMOVED_FAILURE_EXCEPTION; }
// public void REMOVED_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.REMOVED_FAILURE_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType REMOVED_FAILURE_EXCEPTION() { return net.minecraft.server.command.ForceLoadCommand.REMOVED_FAILURE_EXCEPTION; }
// public static void REMOVED_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.ForceLoadCommand.REMOVED_FAILURE_EXCEPTION = value; }

// public int MAX_CHUNKS() { return wrapperContained.MAX_CHUNKS; }
// public void MAX_CHUNKS(int value) { wrapperContained.MAX_CHUNKS = value; }
// public static int MAX_CHUNKS() { return net.minecraft.server.command.ForceLoadCommand.MAX_CHUNKS; }
// public static void MAX_CHUNKS(int value, ) { net.minecraft.server.command.ForceLoadCommand.MAX_CHUNKS = value; }

// public int method_13363(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13363(context); }
// public static int method_13363(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ForceLoadCommand.method_13363(context); }
// public int method_13364(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13364(context); }
// public static int method_13364(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ForceLoadCommand.method_13364(context); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.ForceLoadCommand.register(dispatcher); }
// public int executeRemoveAll(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeRemoveAll(source.wrapperContained); }
// public static int executeRemoveAll(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.ForceLoadCommand.executeRemoveAll(source.wrapperContained); }
// public int method_13367(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13367(context); }
// public static int method_13367(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ForceLoadCommand.method_13367(context); }
// public int method_13368(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13368(context); }
// public static int method_13368(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ForceLoadCommand.method_13368(context); }
// public com.mojang.brigadier.Message method_13369(java.lang.Object chunkPos,java.lang.Object registryKey) { return wrapperContained.method_13369(chunkPos,registryKey); }
// public static com.mojang.brigadier.Message method_13369(java.lang.Object chunkPos,java.lang.Object registryKey, ) { return net.minecraft.server.command.ForceLoadCommand.method_13369(chunkPos,registryKey); }
// public int method_13370(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13370(context); }
// public static int method_13370(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ForceLoadCommand.method_13370(context); }
// public int executeChange(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.ColumnPos from,yarnwrap.util.math.ColumnPos to,boolean forceLoaded) { return wrapperContained.executeChange(source.wrapperContained,from.wrapperContained,to.wrapperContained,forceLoaded); }
// public static int executeChange(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.ColumnPos from,yarnwrap.util.math.ColumnPos to,boolean forceLoaded, ) { return net.minecraft.server.command.ForceLoadCommand.executeChange(source.wrapperContained,from.wrapperContained,to.wrapperContained,forceLoaded); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeQuery(source.wrapperContained); }
// public static int executeQuery(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.ForceLoadCommand.executeQuery(source.wrapperContained); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.ColumnPos pos) { return wrapperContained.executeQuery(source.wrapperContained,pos.wrapperContained); }
// public static int executeQuery(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.ColumnPos pos, ) { return net.minecraft.server.command.ForceLoadCommand.executeQuery(source.wrapperContained,pos.wrapperContained); }
// public int method_13375(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13375(context); }
// public static int method_13375(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ForceLoadCommand.method_13375(context); }
// public com.mojang.brigadier.Message method_13376(java.lang.Object maxCount,java.lang.Object count) { return wrapperContained.method_13376(maxCount,count); }
// public static com.mojang.brigadier.Message method_13376(java.lang.Object maxCount,java.lang.Object count, ) { return net.minecraft.server.command.ForceLoadCommand.method_13376(maxCount,count); }
// public void method_13377(yarnwrap.server.world.ServerWorld chunkPos) { wrapperContained.method_13377(chunkPos.wrapperContained); }
// public static void method_13377(yarnwrap.server.world.ServerWorld chunkPos, ) { net.minecraft.server.command.ForceLoadCommand.method_13377(chunkPos.wrapperContained); }
// public int method_13378(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13378(context); }
// public static int method_13378(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ForceLoadCommand.method_13378(context); }

}