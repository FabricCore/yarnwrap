package yarnwrap.server.command;
public class DifficultyCommand { public net.minecraft.server.command.DifficultyCommand wrapperContained; public DifficultyCommand(net.minecraft.server.command.DifficultyCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILURE_EXCEPTION() { return wrapperContained.FAILURE_EXCEPTION; }
// public void FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.FAILURE_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public com.mojang.brigadier.Message method_13170(java.lang.Object difficulty) { return wrapperContained.method_13170(difficulty); }
// public int method_13171(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13171(context); }
// public boolean method_13172(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13172(source.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.world.Difficulty difficulty) { return wrapperContained.execute(source.wrapperContained,difficulty.wrapperContained); }
// public int method_13174(yarnwrap.world.Difficulty context) { return wrapperContained.method_13174(context.wrapperContained); }

}