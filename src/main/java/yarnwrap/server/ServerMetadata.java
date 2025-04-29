package yarnwrap.server;
public class ServerMetadata { public net.minecraft.server.ServerMetadata wrapperContained; public ServerMetadata(net.minecraft.server.ServerMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean secureChatEnforced() { return wrapperContained.secureChatEnforced; }
// public void secureChatEnforced(boolean value) { wrapperContained.secureChatEnforced = value; }
// public static boolean secureChatEnforced() { return net.minecraft.server.ServerMetadata.secureChatEnforced; }
// public static void secureChatEnforced(boolean value, ) { net.minecraft.server.ServerMetadata.secureChatEnforced = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.server.ServerMetadata.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.server.ServerMetadata.CODEC = value; }

// public boolean secureChatEnforced() { return wrapperContained.secureChatEnforced(); }
// // public static boolean secureChatEnforced() { return net.minecraft.server.ServerMetadata.secureChatEnforced(); }
// public com.mojang.datafixers.kinds.App method_49092(Object instance) { return wrapperContained.method_49092(instance); }
// public static com.mojang.datafixers.kinds.App method_49092(Object instance, ) { return net.minecraft.server.ServerMetadata.method_49092(instance); }

}