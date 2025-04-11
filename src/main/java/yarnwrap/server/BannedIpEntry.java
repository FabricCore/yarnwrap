package yarnwrap.server;
public class BannedIpEntry { public net.minecraft.server.BannedIpEntry wrapperContained; public BannedIpEntry(net.minecraft.server.BannedIpEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public BannedIpEntry(com.google.gson.JsonObject json) { this.wrapperContained = new net.minecraft.server.BannedIpEntry(json); }
public BannedIpEntry(java.lang.String ip) { this.wrapperContained = new net.minecraft.server.BannedIpEntry(ip); }
public BannedIpEntry(java.lang.String ip,java.util.Date created,java.lang.String source,java.util.Date expiry,java.lang.String reason) { this.wrapperContained = new net.minecraft.server.BannedIpEntry(ip,created,source,expiry,reason); }
// public java.lang.String getIp(com.google.gson.JsonObject json) { return wrapperContained.getIp(json); }

}