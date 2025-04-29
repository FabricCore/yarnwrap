package yarnwrap.client.network;
public class LanServerInfo { public net.minecraft.client.network.LanServerInfo wrapperContained; public LanServerInfo(net.minecraft.client.network.LanServerInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String motd() { return wrapperContained.motd; }
// public void motd(java.lang.String value) { wrapperContained.motd = value; }
// public static java.lang.String motd() { return net.minecraft.client.network.LanServerInfo.motd; }
// public static void motd(java.lang.String value, ) { net.minecraft.client.network.LanServerInfo.motd = value; }

// public long lastTimeMillis() { return wrapperContained.lastTimeMillis; }
// public void lastTimeMillis(long value) { wrapperContained.lastTimeMillis = value; }
// public static long lastTimeMillis() { return net.minecraft.client.network.LanServerInfo.lastTimeMillis; }
// public static void lastTimeMillis(long value, ) { net.minecraft.client.network.LanServerInfo.lastTimeMillis = value; }

// public java.lang.String addressPort() { return wrapperContained.addressPort; }
// public void addressPort(java.lang.String value) { wrapperContained.addressPort = value; }
// public static java.lang.String addressPort() { return net.minecraft.client.network.LanServerInfo.addressPort; }
// public static void addressPort(java.lang.String value, ) { net.minecraft.client.network.LanServerInfo.addressPort = value; }

public LanServerInfo(java.lang.String motd,java.lang.String addressPort) { this.wrapperContained = new net.minecraft.client.network.LanServerInfo(motd,addressPort); }
public java.lang.String getAddressPort() { return wrapperContained.getAddressPort(); }
// public static java.lang.String getAddressPort() { return net.minecraft.client.network.LanServerInfo.getAddressPort(); }
public java.lang.String getMotd() { return wrapperContained.getMotd(); }
// public static java.lang.String getMotd() { return net.minecraft.client.network.LanServerInfo.getMotd(); }
public void updateLastTime() { wrapperContained.updateLastTime(); }
// public static void updateLastTime() { net.minecraft.client.network.LanServerInfo.updateLastTime(); }

}