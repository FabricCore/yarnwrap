package yarnwrap.server.command;
public class DifficultyCommand { public net.minecraft.server.command.DifficultyCommand wrapperContained; public DifficultyCommand(net.minecraft.server.command.DifficultyCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILURE_EXCEPTION() { return wrapperContained.FAILURE_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.world.Difficulty difficulty) { return wrapperContained.execute(source.wrapperContained,difficulty.wrapperContained); }

}