package yarnwrap.server.command;
public class RaidCommand { public net.minecraft.server.command.RaidCommand wrapperContained; public RaidCommand(net.minecraft.server.command.RaidCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.raid.Raid getRaid(yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.village.raid.Raid(wrapperContained.getRaid(player.wrapperContained)); }
// public static yarnwrap.village.raid.Raid getRaid(yarnwrap.server.network.ServerPlayerEntity player, ) { return new yarnwrap.village.raid.Raid(net.minecraft.server.command.RaidCommand.getRaid(player.wrapperContained)); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess, ) { net.minecraft.server.command.RaidCommand.register(dispatcher,registryAccess.wrapperContained); }
// public int method_36193(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_36193(context); }
// public static int method_36193(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.RaidCommand.method_36193(context); }
// public int executeGlow(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeGlow(source.wrapperContained); }
// public static int executeGlow(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.RaidCommand.executeGlow(source.wrapperContained); }
// public int executeSetOmen(yarnwrap.server.command.ServerCommandSource source,int level) { return wrapperContained.executeSetOmen(source.wrapperContained,level); }
// public static int executeSetOmen(yarnwrap.server.command.ServerCommandSource source,int level, ) { return net.minecraft.server.command.RaidCommand.executeSetOmen(source.wrapperContained,level); }
// public int executeSound(yarnwrap.server.command.ServerCommandSource source,yarnwrap.text.Text type) { return wrapperContained.executeSound(source.wrapperContained,type.wrapperContained); }
// public static int executeSound(yarnwrap.server.command.ServerCommandSource source,yarnwrap.text.Text type, ) { return net.minecraft.server.command.RaidCommand.executeSound(source.wrapperContained,type.wrapperContained); }
// public int method_36197(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_36197(context); }
// public static int method_36197(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.RaidCommand.method_36197(context); }
// public int executeSpawnLeader(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeSpawnLeader(source.wrapperContained); }
// public static int executeSpawnLeader(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.RaidCommand.executeSpawnLeader(source.wrapperContained); }
// public int executeStart(yarnwrap.server.command.ServerCommandSource source,int level) { return wrapperContained.executeStart(source.wrapperContained,level); }
// public static int executeStart(yarnwrap.server.command.ServerCommandSource source,int level, ) { return net.minecraft.server.command.RaidCommand.executeStart(source.wrapperContained,level); }
// public int method_36200(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_36200(context); }
// public static int method_36200(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.RaidCommand.method_36200(context); }
// public int executeStop(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStop(source.wrapperContained); }
// public static int executeStop(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.RaidCommand.executeStop(source.wrapperContained); }
// public int method_36202(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_36202(context); }
// public static int method_36202(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.RaidCommand.method_36202(context); }
// public int executeCheck(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeCheck(source.wrapperContained); }
// public static int executeCheck(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.RaidCommand.executeCheck(source.wrapperContained); }
// public int method_36204(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_36204(context); }
// public static int method_36204(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.RaidCommand.method_36204(context); }
// public boolean method_36205(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_36205(source.wrapperContained); }
// public static boolean method_36205(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.RaidCommand.method_36205(source.wrapperContained); }
// public int method_36206(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_36206(context); }
// public static int method_36206(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.RaidCommand.method_36206(context); }
// public int method_36207(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_36207(context); }
// public static int method_36207(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.RaidCommand.method_36207(context); }

}