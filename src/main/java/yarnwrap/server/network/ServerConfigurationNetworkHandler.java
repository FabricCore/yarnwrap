package yarnwrap.server.network;
public class ServerConfigurationNetworkHandler { public net.minecraft.server.network.ServerConfigurationNetworkHandler wrapperContained; public ServerConfigurationNetworkHandler(net.minecraft.server.network.ServerConfigurationNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text INVALID_PLAYER_DATA_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_PLAYER_DATA_TEXT); }
// public void INVALID_PLAYER_DATA_TEXT(yarnwrap.text.Text value) { wrapperContained.INVALID_PLAYER_DATA_TEXT = value.wrapperContained; }
// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public void profile(com.mojang.authlib.GameProfile value) { wrapperContained.profile = value; }
// public java.util.Queue tasks() { return wrapperContained.tasks; }
// public void tasks(java.util.Queue value) { wrapperContained.tasks = value; }
// public yarnwrap.server.network.ServerPlayerConfigurationTask currentTask() { return new yarnwrap.server.network.ServerPlayerConfigurationTask(wrapperContained.currentTask); }
// public void currentTask(yarnwrap.server.network.ServerPlayerConfigurationTask value) { wrapperContained.currentTask = value.wrapperContained; }
// public yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.syncedOptions); }
// public void syncedOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions value) { wrapperContained.syncedOptions = value.wrapperContained; }
// public yarnwrap.server.network.SynchronizeRegistriesTask synchronizedRegistriesTask() { return new yarnwrap.server.network.SynchronizeRegistriesTask(wrapperContained.synchronizedRegistriesTask); }
// public void synchronizedRegistriesTask(yarnwrap.server.network.SynchronizeRegistriesTask value) { wrapperContained.synchronizedRegistriesTask = value.wrapperContained; }
// public void onTaskFinished(Object key) { wrapperContained.onTaskFinished(key); }
public void sendConfigurations() { wrapperContained.sendConfigurations(); }
public void endConfiguration() { wrapperContained.endConfiguration(); }
// public void queueSendResourcePackTask() { wrapperContained.queueSendResourcePackTask(); }
// public void pollTask() { wrapperContained.pollTask(); }

}