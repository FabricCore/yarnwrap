package yarnwrap.server;
public class BannedIpList { public net.minecraft.server.BannedIpList wrapperContained; public BannedIpList(net.minecraft.server.BannedIpList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String stringifyAddress(java.net.SocketAddress address) { return wrapperContained.stringifyAddress(address); }
// public static java.lang.String stringifyAddress(java.net.SocketAddress address, ) { return net.minecraft.server.BannedIpList.stringifyAddress(address); }
public boolean isBanned(java.net.SocketAddress ip) { return wrapperContained.isBanned(ip); }
// public static boolean isBanned(java.net.SocketAddress ip, ) { return net.minecraft.server.BannedIpList.isBanned(ip); }
public yarnwrap.server.BannedIpEntry get(java.net.SocketAddress address) { return new yarnwrap.server.BannedIpEntry(wrapperContained.get(address)); }
// public static yarnwrap.server.BannedIpEntry get(java.net.SocketAddress address, ) { return new yarnwrap.server.BannedIpEntry(net.minecraft.server.BannedIpList.get(address)); }
public boolean isBanned(java.lang.String ip) { return wrapperContained.isBanned(ip); }
// public static boolean isBanned(java.lang.String ip, ) { return net.minecraft.server.BannedIpList.isBanned(ip); }

}