package yarnwrap.server.network;
public class ServerConfigurationNetworkHandler { public net.minecraft.server.network.ServerConfigurationNetworkHandler wrapperContained; public ServerConfigurationNetworkHandler(net.minecraft.server.network.ServerConfigurationNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text INVALID_PLAYER_DATA_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_PLAYER_DATA_TEXT); }
// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public java.util.Queue tasks() { return wrapperContained.tasks; }
// public yarnwrap.server.network.ServerPlayerConfigurationTask currentTask() { return new yarnwrap.server.network.ServerPlayerConfigurationTask(wrapperContained.currentTask); }
// public yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.syncedOptions); }
// public yarnwrap.server.network.SynchronizeRegistriesTask synchronizedRegistriesTask() { return new yarnwrap.server.network.SynchronizeRegistriesTask(wrapperContained.synchronizedRegistriesTask); }
// public void onTaskFinished(Object key) { wrapperContained.onTaskFinished(key); }
public void sendConfigurations() { wrapperContained.sendConfigurations(); }
public void endConfiguration() { wrapperContained.endConfiguration(); }
// public void queueSendResourcePackTask() { wrapperContained.queueSendResourcePackTask(); }
// public void pollTask() { wrapperContained.pollTask(); }

}