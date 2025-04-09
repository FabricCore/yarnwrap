package yarnwrap.server.command;
public class PlaySoundCommand { public net.minecraft.server.command.PlaySoundCommand wrapperContained; public PlaySoundCommand(net.minecraft.server.command.PlaySoundCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public com.mojang.brigadier.builder.LiteralArgumentBuilder makeArgumentsForCategory(yarnwrap.sound.SoundCategory category) { return wrapperContained.makeArgumentsForCategory(category.wrapperContained); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.util.Identifier sound,yarnwrap.sound.SoundCategory category,yarnwrap.util.math.Vec3d pos,float volume,float pitch,float minVolume) { return wrapperContained.execute(source.wrapperContained,targets,sound.wrapperContained,category.wrapperContained,pos.wrapperContained,volume,pitch,minVolume); }
// public java.util.Collection toList(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.toList(player.wrapperContained); }

}