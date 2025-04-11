package yarnwrap.server.dedicated.command;
public class SaveAllCommand { public net.minecraft.server.dedicated.command.SaveAllCommand wrapperContained; public SaveAllCommand(net.minecraft.server.dedicated.command.SaveAllCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_EXCEPTION() { return wrapperContained.FAILED_EXCEPTION; }
// public void FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_EXCEPTION = value; }
// public int method_13549(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13549(context); }
// public int saveAll(yarnwrap.server.command.ServerCommandSource source,boolean flush) { return wrapperContained.saveAll(source.wrapperContained,flush); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13553(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13553(context); }
// public boolean method_13554(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13554(source.wrapperContained); }

}