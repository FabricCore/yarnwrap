package yarnwrap.server.network;
public class ConnectedClientData { public net.minecraft.server.network.ConnectedClientData wrapperContained; public ConnectedClientData(net.minecraft.server.network.ConnectedClientData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.syncedOptions); }
// public void syncedOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions value) { wrapperContained.syncedOptions = value.wrapperContained; }
// public static yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(net.minecraft.server.network.ConnectedClientData.syncedOptions); }
// public static void syncedOptions(yarnwrap.network.packet.c2s.common.SyncedClientOptions value, ) { net.minecraft.server.network.ConnectedClientData.syncedOptions = value.wrapperContained; }

// public yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.syncedOptions()); }
// // public static yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(net.minecraft.server.network.ConnectedClientData.syncedOptions()); }
// public yarnwrap.server.network.ConnectedClientData createDefault(com.mojang.authlib.GameProfile profile) { return new yarnwrap.server.network.ConnectedClientData(wrapperContained.createDefault(profile)); }
// public static yarnwrap.server.network.ConnectedClientData createDefault(com.mojang.authlib.GameProfile profile, ) { return new yarnwrap.server.network.ConnectedClientData(net.minecraft.server.network.ConnectedClientData.createDefault(profile)); }

}