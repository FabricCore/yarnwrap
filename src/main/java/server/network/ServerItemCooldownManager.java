package yarnwrap.server.network;
public class ServerItemCooldownManager { public net.minecraft.server.network.ServerItemCooldownManager wrapperContained; public ServerItemCooldownManager(net.minecraft.server.network.ServerItemCooldownManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.player); }

}