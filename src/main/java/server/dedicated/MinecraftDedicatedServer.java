package yarnwrap.server.dedicated;
public class MinecraftDedicatedServer { public net.minecraft.server.dedicated.MinecraftDedicatedServer wrapperContained; public MinecraftDedicatedServer(net.minecraft.server.dedicated.MinecraftDedicatedServer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.rcon.RconCommandOutput rconCommandOutput() { return new yarnwrap.server.rcon.RconCommandOutput(wrapperContained.rconCommandOutput); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.List commandQueue() { return wrapperContained.commandQueue; }
// public yarnwrap.server.rcon.QueryResponseHandler queryResponseHandler() { return new yarnwrap.server.rcon.QueryResponseHandler(wrapperContained.queryResponseHandler); }
// public yarnwrap.server.rcon.RconListener rconServer() { return new yarnwrap.server.rcon.RconListener(wrapperContained.rconServer); }
// public yarnwrap.server.dedicated.ServerPropertiesLoader propertiesLoader() { return new yarnwrap.server.dedicated.ServerPropertiesLoader(wrapperContained.propertiesLoader); }
// public yarnwrap.server.dedicated.gui.DedicatedServerGui gui() { return new yarnwrap.server.dedicated.gui.DedicatedServerGui(wrapperContained.gui); }
// public yarnwrap.server.filter.TextFilterer filterer() { return new yarnwrap.server.filter.TextFilterer(wrapperContained.filterer); }
// public yarnwrap.util.profiler.log.SubscribableDebugSampleLog debugSampleLog() { return new yarnwrap.util.profiler.log.SubscribableDebugSampleLog(wrapperContained.debugSampleLog); }
// public yarnwrap.server.SampleSubscriptionTracker subscriptionTracker() { return new yarnwrap.server.SampleSubscriptionTracker(wrapperContained.subscriptionTracker); }
// public yarnwrap.server.ServerLinks serverLinks() { return new yarnwrap.server.ServerLinks(wrapperContained.serverLinks); }
public void executeQueuedCommands() { wrapperContained.executeQueuedCommands(); }
// public void sleepFiveSeconds() { wrapperContained.sleepFiveSeconds(); }
public long getMaxTickTime() { return wrapperContained.getMaxTickTime(); }
public void enqueueCommand(java.lang.String command,yarnwrap.server.command.ServerCommandSource commandSource) { wrapperContained.enqueueCommand(command,commandSource.wrapperContained); }
public void createGui() { wrapperContained.createGui(); }
// public boolean convertData() { return wrapperContained.convertData(); }
public void setUseWhitelist(boolean useWhitelist) { wrapperContained.setUseWhitelist(useWhitelist); }
// public java.util.Optional parseBugReportLink(yarnwrap.server.dedicated.ServerPropertiesHandler propertiesHandler) { return wrapperContained.parseBugReportLink(propertiesHandler.wrapperContained); }
// public yarnwrap.server.ServerLinks loadServerLinks(yarnwrap.server.dedicated.ServerPropertiesLoader propertiesLoader) { return new yarnwrap.server.ServerLinks(wrapperContained.loadServerLinks(propertiesLoader.wrapperContained)); }

}