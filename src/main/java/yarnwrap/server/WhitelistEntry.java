package yarnwrap.server;
public class WhitelistEntry { public net.minecraft.server.WhitelistEntry wrapperContained; public WhitelistEntry(net.minecraft.server.WhitelistEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public WhitelistEntry(com.google.gson.JsonObject json) { this.wrapperContained = new net.minecraft.server.WhitelistEntry(json); }
public WhitelistEntry(com.mojang.authlib.GameProfile profile) { this.wrapperContained = new net.minecraft.server.WhitelistEntry(profile); }
// public com.mojang.authlib.GameProfile profileFromJson(com.google.gson.JsonObject json) { return wrapperContained.profileFromJson(json); }
// public static com.mojang.authlib.GameProfile profileFromJson(com.google.gson.JsonObject json, ) { return net.minecraft.server.WhitelistEntry.profileFromJson(json); }

}