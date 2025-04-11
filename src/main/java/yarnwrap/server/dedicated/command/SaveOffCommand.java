package yarnwrap.server.dedicated.command;
public class SaveOffCommand { public net.minecraft.server.dedicated.command.SaveOffCommand wrapperContained; public SaveOffCommand(net.minecraft.server.dedicated.command.SaveOffCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_OFF_EXCEPTION() { return wrapperContained.ALREADY_OFF_EXCEPTION; }
// public void ALREADY_OFF_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_OFF_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }

}