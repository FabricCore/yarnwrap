package yarnwrap.server.command;
public class SpectateCommand { public net.minecraft.server.command.SpectateCommand wrapperContained; public SpectateCommand(net.minecraft.server.command.SpectateCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SPECTATE_SELF_EXCEPTION() { return wrapperContained.SPECTATE_SELF_EXCEPTION; }
// public void SPECTATE_SELF_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SPECTATE_SELF_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NOT_SPECTATOR_EXCEPTION() { return wrapperContained.NOT_SPECTATOR_EXCEPTION; }
// public void NOT_SPECTATOR_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.NOT_SPECTATOR_EXCEPTION = value; }
// public boolean method_23651(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_23651(source.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity entity,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.execute(source.wrapperContained,entity.wrapperContained,player.wrapperContained); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_23654(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_23654(context); }
// public com.mojang.brigadier.Message method_23655(java.lang.Object playerName) { return wrapperContained.method_23655(playerName); }
// public int method_23656(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_23656(context); }
// public int method_23657(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_23657(context); }

}