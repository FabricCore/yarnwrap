package yarnwrap.client.network;
public class LegacyServerPinger { public net.minecraft.client.network.LegacyServerPinger wrapperContained; public LegacyServerPinger(net.minecraft.client.network.LegacyServerPinger wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.base.Splitter SPLITTER() { return wrapperContained.SPLITTER; }
// public void SPLITTER(com.google.common.base.Splitter value) { wrapperContained.SPLITTER = value; }
// public yarnwrap.client.network.ServerAddress serverAddress() { return new yarnwrap.client.network.ServerAddress(wrapperContained.serverAddress); }
// public void serverAddress(yarnwrap.client.network.ServerAddress value) { wrapperContained.serverAddress = value.wrapperContained; }
// public Object handler() { return wrapperContained.handler; }
// // public void handler(Object value) { wrapperContained.handler = value; }

}