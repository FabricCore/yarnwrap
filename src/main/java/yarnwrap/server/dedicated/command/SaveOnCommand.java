package yarnwrap.server.dedicated.command;
public class SaveOnCommand { public net.minecraft.server.dedicated.command.SaveOnCommand wrapperContained; public SaveOnCommand(net.minecraft.server.dedicated.command.SaveOnCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_ON_EXCEPTION() { return wrapperContained.ALREADY_ON_EXCEPTION; }
// public void ALREADY_ON_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_ON_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13560(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13560(context); }
// public boolean method_13561(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13561(source.wrapperContained); }

}