package yarnwrap.server.command;
public class PublishCommand { public net.minecraft.server.command.PublishCommand wrapperContained; public PublishCommand(net.minecraft.server.command.PublishCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ALREADY_PUBLISHED_EXCEPTION() { return wrapperContained.ALREADY_PUBLISHED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public int execute(yarnwrap.server.command.ServerCommandSource source,int port,boolean allowCommands,yarnwrap.world.GameMode gameMode) { return wrapperContained.execute(source.wrapperContained,port,allowCommands,gameMode.wrapperContained); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
public yarnwrap.text.MutableText getStartedText(int port) { return new yarnwrap.text.MutableText(wrapperContained.getStartedText(port)); }

}