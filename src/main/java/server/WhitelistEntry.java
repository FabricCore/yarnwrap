package yarnwrap.server;
public class WhitelistEntry { public net.minecraft.server.WhitelistEntry wrapperContained; public WhitelistEntry(net.minecraft.server.WhitelistEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.authlib.GameProfile profileFromJson(com.google.gson.JsonObject json) { return wrapperContained.profileFromJson(json); }

}