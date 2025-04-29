package yarnwrap.server.network;
public class ServerConfigurationNetworkHandler { public net.minecraft.server.network.ServerConfigurationNetworkHandler wrapperContained; public ServerConfigurationNetworkHandler(net.minecraft.server.network.ServerConfigurationNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.network.ServerConfigurationNetworkHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.network.ServerConfigurationNetworkHandler.LOGGER = value; }

// public yarnwrap.text.Text INVALID_PLAYER_DATA_TEXT() { return new yarnwrap.text.Text(wrapperContained.INVALID_PLAYER_DATA_TEXT); }
// public void INVALID_PLAYER_DATA_TEXT(yarnwrap.text.Text value) { wrapperContained.INVALID_PLAYER_DATA_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text INVALID_PLAYER_DATA_TEXT() { return new yarnwrap.text.Text(net.minecraft.server.network.ServerConfigurationNetworkHandler.INVALID_PLAYER_DATA_TEXT); }
// public static void INVALID_PLAYER_DATA_TEXT(yarnwrap.text.Text value, ) { net.minecraft.server.network.ServerConfigurationNetworkHandler.INVALID_PLAYER_DATA_TEXT = value.wrapperContained; }

// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public void profile(com.mojang.authlib.GameProfile value) { wrapperContained.profile = value; }
// public static com.mojang.authlib.GameProfile profile() { return net.minecraft.server.network.ServerConfigurationNetworkHandler.profile; }
// public static void profile(com.mojang.authlib.GameProfile value, ) { net.minecraft.server.network.ServerConfigurationNetworkHandler.profile = value; }

// public java.util.Queue tasks() { return wrapperContained.tasks; }
// public void tasks(java.util.Queue value) { wrapperContained.tasks = value; }
// public static java.util.Queue tasks() { return net.minecraft.server.network.ServerConfigurationNetworkHandler.tasks; }
// public static void tasks(java.util.Queue value, ) { net.minecraft.server.network.ServerConfigurationNetworkHandler.tasks = value; }

// public yarnwrap.server.network.ServerPlayerConfigurationTask currentTask() { return new yarnwrap.server.network.ServerPlayerConfigurationTask(wrapperContained.currentTask); }
// public void currentTask(yarnwrap.server.network.ServerPlayerConfigurationTask value) { wrapperContained.currentTask = value.wrapperContained; }
// public static yarnwrap.server.network.ServerPlayerConfigurationTask currentTask() { return new yarnwrap.server.network.ServerPlayerConfigurationTask(net.minecraft.server.network.ServerConfigurationNetworkHandler.currentTask); }
// public static void currentTask(yarnwrap.server.network.ServerPlayerConfigurationTask value, ) { net.minecraft.server.network.ServerConfigurationNetworkHandler.currentTask = value.wrapperContained; }

// public yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.syncedOptions); }
// public void syncedOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions value) { wrapperContained.syncedOptions = value.wrapperContained; }
// public static yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(net.minecraft.server.network.ServerConfigurationNetworkHandler.syncedOptions); }
// public static void syncedOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions value, ) { net.minecraft.server.network.ServerConfigurationNetworkHandler.syncedOptions = value.wrapperContained; }

// public yarnwrap.server.network.SynchronizeRegistriesTask synchronizedRegistriesTask() { return new yarnwrap.server.network.SynchronizeRegistriesTask(wrapperContained.synchronizedRegistriesTask); }
// public void synchronizedRegistriesTask(yarnwrap.server.network.SynchronizeRegistriesTask value) { wrapperContained.synchronizedRegistriesTask = value.wrapperContained; }
// public static yarnwrap.server.network.SynchronizeRegistriesTask synchronizedRegistriesTask() { return new yarnwrap.server.network.SynchronizeRegistriesTask(net.minecraft.server.network.ServerConfigurationNetworkHandler.synchronizedRegistriesTask); }
// public static void synchronizedRegistriesTask(yarnwrap.server.network.SynchronizeRegistriesTask value, ) { net.minecraft.server.network.ServerConfigurationNetworkHandler.synchronizedRegistriesTask = value.wrapperContained; }

// public void onTaskFinished(Object key) { wrapperContained.onTaskFinished(key); }
// public static void onTaskFinished(Object key, ) { net.minecraft.server.network.ServerConfigurationNetworkHandler.onTaskFinished(key); }
// public void method_52407(Object properties) { wrapperContained.method_52407(properties); }
// public static void method_52407(Object properties, ) { net.minecraft.server.network.ServerConfigurationNetworkHandler.method_52407(properties); }
public void sendConfigurations() { wrapperContained.sendConfigurations(); }
// public static void sendConfigurations() { net.minecraft.server.network.ServerConfigurationNetworkHandler.sendConfigurations(); }
public void endConfiguration() { wrapperContained.endConfiguration(); }
// public static void endConfiguration() { net.minecraft.server.network.ServerConfigurationNetworkHandler.endConfiguration(); }
// public void queueSendResourcePackTask() { wrapperContained.queueSendResourcePackTask(); }
// public static void queueSendResourcePackTask() { net.minecraft.server.network.ServerConfigurationNetworkHandler.queueSendResourcePackTask(); }
// public void pollTask() { wrapperContained.pollTask(); }
// public static void pollTask() { net.minecraft.server.network.ServerConfigurationNetworkHandler.pollTask(); }
// public java.util.stream.Stream method_56530(yarnwrap.resource.ResourcePack pack) { return wrapperContained.method_56530(pack.wrapperContained); }
// public static java.util.stream.Stream method_56530(yarnwrap.resource.ResourcePack pack, ) { return net.minecraft.server.network.ServerConfigurationNetworkHandler.method_56530(pack.wrapperContained); }

}