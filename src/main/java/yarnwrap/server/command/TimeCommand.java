package yarnwrap.server.command;
public class TimeCommand { public net.minecraft.server.command.TimeCommand wrapperContained; public TimeCommand(net.minecraft.server.command.TimeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int method_13783(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13783(context); }
public int executeSet(yarnwrap.server.command.ServerCommandSource source,int time) { return wrapperContained.executeSet(source.wrapperContained,time); }
// public int method_13785(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13785(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int getDayTime(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getDayTime(world.wrapperContained); }
public int executeAdd(yarnwrap.server.command.ServerCommandSource source,int time) { return wrapperContained.executeAdd(source.wrapperContained,time); }
// public int method_13789(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13789(context); }
// public int method_13790(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13790(context); }
// public boolean method_13791(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13791(source.wrapperContained); }
// public int method_13792(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13792(context); }
// public int method_13793(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13793(context); }
// public int method_13794(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13794(context); }
// public int method_13795(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13795(context); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source,int time) { return wrapperContained.executeQuery(source.wrapperContained,time); }
// public int method_13797(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13797(context); }

}