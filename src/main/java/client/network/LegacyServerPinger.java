package yarnwrap.client.network;
public class LegacyServerPinger { public net.minecraft.client.network.LegacyServerPinger wrapperContained; public LegacyServerPinger(net.minecraft.client.network.LegacyServerPinger wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.base.Splitter SPLITTER() { return wrapperContained.SPLITTER; }
// public yarnwrap.client.network.ServerAddress serverAddress() { return new yarnwrap.client.network.ServerAddress(wrapperContained.serverAddress); }
// public Object handler() { return wrapperContained.handler; }

}