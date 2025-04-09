package yarnwrap.server;
public class BannedPlayerEntry { public net.minecraft.server.BannedPlayerEntry wrapperContained; public BannedPlayerEntry(net.minecraft.server.BannedPlayerEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.authlib.GameProfile profileFromJson(com.google.gson.JsonObject json) { return wrapperContained.profileFromJson(json); }

}