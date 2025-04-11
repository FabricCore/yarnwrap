package yarnwrap.client.network;
public class ClientConnectionState { public net.minecraft.client.network.ClientConnectionState wrapperContained; public ClientConnectionState(net.minecraft.client.network.ClientConnectionState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession); }
// public void worldSession(yarnwrap.client.session.telemetry.WorldSession value) { wrapperContained.worldSession = value.wrapperContained; }
// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo); }
// public void serverInfo(yarnwrap.client.network.ServerInfo value) { wrapperContained.serverInfo = value.wrapperContained; }
// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession()); }
// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo()); }

}