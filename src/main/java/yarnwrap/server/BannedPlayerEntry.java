package yarnwrap.server;
public class BannedPlayerEntry { public net.minecraft.server.BannedPlayerEntry wrapperContained; public BannedPlayerEntry(net.minecraft.server.BannedPlayerEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public BannedPlayerEntry(com.google.gson.JsonObject json) { this.wrapperContained = new net.minecraft.server.BannedPlayerEntry(json); }
public BannedPlayerEntry(com.mojang.authlib.GameProfile profile) { this.wrapperContained = new net.minecraft.server.BannedPlayerEntry(profile); }
public BannedPlayerEntry(com.mojang.authlib.GameProfile profile,java.util.Date created,java.lang.String source,java.util.Date expiry,java.lang.String reason) { this.wrapperContained = new net.minecraft.server.BannedPlayerEntry(profile,created,source,expiry,reason); }
// public com.mojang.authlib.GameProfile profileFromJson(com.google.gson.JsonObject json) { return wrapperContained.profileFromJson(json); }
// public static com.mojang.authlib.GameProfile profileFromJson(com.google.gson.JsonObject json, ) { return net.minecraft.server.BannedPlayerEntry.profileFromJson(json); }

}