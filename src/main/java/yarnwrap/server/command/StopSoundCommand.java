package yarnwrap.server.command;
public class StopSoundCommand { public net.minecraft.server.command.StopSoundCommand wrapperContained; public StopSoundCommand(net.minecraft.server.command.StopSoundCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int method_13680(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13680(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public boolean method_13682(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13682(source.wrapperContained); }
// public int method_13683(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13683(context); }
// public int method_13684(yarnwrap.sound.SoundCategory context) { return wrapperContained.method_13684(context.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.sound.SoundCategory category,yarnwrap.util.Identifier sound) { return wrapperContained.execute(source.wrapperContained,targets,category.wrapperContained,sound.wrapperContained); }
// public int method_13686(yarnwrap.sound.SoundCategory context) { return wrapperContained.method_13686(context.wrapperContained); }

}