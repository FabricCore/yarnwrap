package yarnwrap.server.dedicated.command;
public class SaveAllCommand { public net.minecraft.server.dedicated.command.SaveAllCommand wrapperContained; public SaveAllCommand(net.minecraft.server.dedicated.command.SaveAllCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public int saveAll(yarnwrap.server.command.ServerCommandSource source,boolean flush) { return wrapperContained.saveAll(source.wrapperContained,flush); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }

}