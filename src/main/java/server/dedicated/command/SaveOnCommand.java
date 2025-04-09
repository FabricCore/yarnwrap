package yarnwrap.server.dedicated.command;
public class SaveOnCommand { public net.minecraft.server.dedicated.command.SaveOnCommand wrapperContained; public SaveOnCommand(net.minecraft.server.dedicated.command.SaveOnCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_ON_EXCEPTION() { return wrapperContained.ALREADY_ON_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }

}