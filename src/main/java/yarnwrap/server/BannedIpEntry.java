package yarnwrap.server;
public class BannedIpEntry { public net.minecraft.server.BannedIpEntry wrapperContained; public BannedIpEntry(net.minecraft.server.BannedIpEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String getIp(com.google.gson.JsonObject json) { return wrapperContained.getIp(json); }

}