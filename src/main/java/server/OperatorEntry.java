package yarnwrap.server;
public class OperatorEntry { public net.minecraft.server.OperatorEntry wrapperContained; public OperatorEntry(net.minecraft.server.OperatorEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public int permissionLevel() { return wrapperContained.permissionLevel; }
// public boolean bypassPlayerLimit() { return wrapperContained.bypassPlayerLimit; }
// public com.mojang.authlib.GameProfile getProfileFromJson(com.google.gson.JsonObject json) { return wrapperContained.getProfileFromJson(json); }
public boolean canBypassPlayerLimit() { return wrapperContained.canBypassPlayerLimit(); }
public int getPermissionLevel() { return wrapperContained.getPermissionLevel(); }

}