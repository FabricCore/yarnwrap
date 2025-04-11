package yarnwrap.server.command;
public class SpectateCommand { public net.minecraft.server.command.SpectateCommand wrapperContained; public SpectateCommand(net.minecraft.server.command.SpectateCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SPECTATE_SELF_EXCEPTION() { return wrapperContained.SPECTATE_SELF_EXCEPTION; }
// public void SPECTATE_SELF_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SPECTATE_SELF_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NOT_SPECTATOR_EXCEPTION() { return wrapperContained.NOT_SPECTATOR_EXCEPTION; }
// public void NOT_SPECTATOR_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.NOT_SPECTATOR_EXCEPTION = value; }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity entity,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.execute(source.wrapperContained,entity.wrapperContained,player.wrapperContained); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }

}