package yarnwrap.client.network;
public class ClientConnectionState { public net.minecraft.client.network.ClientConnectionState wrapperContained; public ClientConnectionState(net.minecraft.client.network.ClientConnectionState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession); }
// public void worldSession(yarnwrap.client.session.telemetry.WorldSession value) { wrapperContained.worldSession = value.wrapperContained; }
// public static yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(net.minecraft.client.network.ClientConnectionState.worldSession); }
// public static void worldSession(yarnwrap.client.session.telemetry.WorldSession value, ) { net.minecraft.client.network.ClientConnectionState.worldSession = value.wrapperContained; }

// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo); }
// public void serverInfo(yarnwrap.client.network.ServerInfo value) { wrapperContained.serverInfo = value.wrapperContained; }
// public static yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(net.minecraft.client.network.ClientConnectionState.serverInfo); }
// public static void serverInfo(yarnwrap.client.network.ServerInfo value, ) { net.minecraft.client.network.ClientConnectionState.serverInfo = value.wrapperContained; }

// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession()); }
// // public static yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(net.minecraft.client.network.ClientConnectionState.worldSession()); }
// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo()); }
// // public static yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(net.minecraft.client.network.ClientConnectionState.serverInfo()); }

}