package yarnwrap.client.network;
public class LanServerInfo { public net.minecraft.client.network.LanServerInfo wrapperContained; public LanServerInfo(net.minecraft.client.network.LanServerInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String motd() { return wrapperContained.motd; }
// public long lastTimeMillis() { return wrapperContained.lastTimeMillis; }
// public java.lang.String addressPort() { return wrapperContained.addressPort; }
public java.lang.String getAddressPort() { return wrapperContained.getAddressPort(); }
public java.lang.String getMotd() { return wrapperContained.getMotd(); }
public void updateLastTime() { wrapperContained.updateLastTime(); }

}