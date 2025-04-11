package yarnwrap.client.network;
public class LanServerInfo { public net.minecraft.client.network.LanServerInfo wrapperContained; public LanServerInfo(net.minecraft.client.network.LanServerInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String motd() { return wrapperContained.motd; }
// public void motd(java.lang.String value) { wrapperContained.motd = value; }
// public long lastTimeMillis() { return wrapperContained.lastTimeMillis; }
// public void lastTimeMillis(long value) { wrapperContained.lastTimeMillis = value; }
// public java.lang.String addressPort() { return wrapperContained.addressPort; }
// public void addressPort(java.lang.String value) { wrapperContained.addressPort = value; }
public LanServerInfo(java.lang.String motd,java.lang.String addressPort) { this.wrapperContained = new net.minecraft.client.network.LanServerInfo(motd,addressPort); }
public java.lang.String getAddressPort() { return wrapperContained.getAddressPort(); }
public java.lang.String getMotd() { return wrapperContained.getMotd(); }
public void updateLastTime() { wrapperContained.updateLastTime(); }

}