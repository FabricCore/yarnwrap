package yarnwrap.server.command;
public class ReloadCommand { public net.minecraft.server.command.ReloadCommand wrapperContained; public ReloadCommand(net.minecraft.server.command.ReloadCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public java.util.Collection findNewDataPacks(yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.world.SaveProperties saveProperties,java.util.Collection enabledDataPacks) { return wrapperContained.findNewDataPacks(dataPackManager.wrapperContained,saveProperties.wrapperContained,enabledDataPacks); }
public void tryReloadDataPacks(java.util.Collection dataPacks,yarnwrap.server.command.ServerCommandSource source) { wrapperContained.tryReloadDataPacks(dataPacks,source.wrapperContained); }

}