package yarnwrap.server.command;
public class StopSoundCommand { public net.minecraft.server.command.StopSoundCommand wrapperContained; public StopSoundCommand(net.minecraft.server.command.StopSoundCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.sound.SoundCategory category,yarnwrap.util.Identifier sound) { return wrapperContained.execute(source.wrapperContained,targets,category.wrapperContained,sound.wrapperContained); }

}