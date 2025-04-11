package yarnwrap.server.command;
public class ReloadCommand { public net.minecraft.server.command.ReloadCommand wrapperContained; public ReloadCommand(net.minecraft.server.command.ReloadCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13530(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13530(context); }
// public boolean method_13531(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13531(source.wrapperContained); }
// public java.util.Collection findNewDataPacks(yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.world.SaveProperties saveProperties,java.util.Collection enabledDataPacks) { return wrapperContained.findNewDataPacks(dataPackManager.wrapperContained,saveProperties.wrapperContained,enabledDataPacks); }
// public java.lang.Void method_29479(yarnwrap.server.command.ServerCommandSource throwable) { return wrapperContained.method_29479(throwable.wrapperContained); }
public void tryReloadDataPacks(java.util.Collection dataPacks,yarnwrap.server.command.ServerCommandSource source) { wrapperContained.tryReloadDataPacks(dataPacks,source.wrapperContained); }

}