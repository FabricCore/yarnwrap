package yarnwrap.server;
public class ServerMetadata { public net.minecraft.server.ServerMetadata wrapperContained; public ServerMetadata(net.minecraft.server.ServerMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean secureChatEnforced() { return wrapperContained.secureChatEnforced; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public boolean secureChatEnforced() { return wrapperContained.secureChatEnforced(); }

}