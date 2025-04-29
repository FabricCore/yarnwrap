package yarnwrap.server;
public class OperatorEntry { public net.minecraft.server.OperatorEntry wrapperContained; public OperatorEntry(net.minecraft.server.OperatorEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public int permissionLevel() { return wrapperContained.permissionLevel; }
// public void permissionLevel(int value) { wrapperContained.permissionLevel = value; }
// public static int permissionLevel() { return net.minecraft.server.OperatorEntry.permissionLevel; }
// public static void permissionLevel(int value, ) { net.minecraft.server.OperatorEntry.permissionLevel = value; }

// public boolean bypassPlayerLimit() { return wrapperContained.bypassPlayerLimit; }
// public void bypassPlayerLimit(boolean value) { wrapperContained.bypassPlayerLimit = value; }
// public static boolean bypassPlayerLimit() { return net.minecraft.server.OperatorEntry.bypassPlayerLimit; }
// public static void bypassPlayerLimit(boolean value, ) { net.minecraft.server.OperatorEntry.bypassPlayerLimit = value; }

public OperatorEntry(com.google.gson.JsonObject json) { this.wrapperContained = new net.minecraft.server.OperatorEntry(json); }
public OperatorEntry(com.mojang.authlib.GameProfile profile,int permissionLevel,boolean bypassPlayerLimit) { this.wrapperContained = new net.minecraft.server.OperatorEntry(profile,permissionLevel,bypassPlayerLimit); }
// public com.mojang.authlib.GameProfile getProfileFromJson(com.google.gson.JsonObject json) { return wrapperContained.getProfileFromJson(json); }
// public static com.mojang.authlib.GameProfile getProfileFromJson(com.google.gson.JsonObject json, ) { return net.minecraft.server.OperatorEntry.getProfileFromJson(json); }
public boolean canBypassPlayerLimit() { return wrapperContained.canBypassPlayerLimit(); }
// public static boolean canBypassPlayerLimit() { return net.minecraft.server.OperatorEntry.canBypassPlayerLimit(); }
public int getPermissionLevel() { return wrapperContained.getPermissionLevel(); }
// public static int getPermissionLevel() { return net.minecraft.server.OperatorEntry.getPermissionLevel(); }

}