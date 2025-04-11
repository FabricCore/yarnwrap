package yarnwrap.server;
public class ServerMetadata { public net.minecraft.server.ServerMetadata wrapperContained; public ServerMetadata(net.minecraft.server.ServerMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean secureChatEnforced() { return wrapperContained.secureChatEnforced; }
// public void secureChatEnforced(boolean value) { wrapperContained.secureChatEnforced = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public boolean secureChatEnforced() { return wrapperContained.secureChatEnforced(); }
// public com.mojang.datafixers.kinds.App method_49092(Object instance) { return wrapperContained.method_49092(instance); }

}