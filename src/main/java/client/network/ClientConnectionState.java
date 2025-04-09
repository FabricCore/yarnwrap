package yarnwrap.client.network;
public class ClientConnectionState { public net.minecraft.client.network.ClientConnectionState wrapperContained; public ClientConnectionState(net.minecraft.client.network.ClientConnectionState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession); }
// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo); }
// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession()); }
// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo()); }

}