package yarnwrap.server.network;
public class ServerItemCooldownManager { public net.minecraft.server.network.ServerItemCooldownManager wrapperContained; public ServerItemCooldownManager(net.minecraft.server.network.ServerItemCooldownManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.server.network.ServerPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.network.ServerItemCooldownManager.player); }
// public static void player(yarnwrap.server.network.ServerPlayerEntity value, ) { net.minecraft.server.network.ServerItemCooldownManager.player = value.wrapperContained; }

public ServerItemCooldownManager(yarnwrap.server.network.ServerPlayerEntity player) { this.wrapperContained = new net.minecraft.server.network.ServerItemCooldownManager(player.wrapperContained); }

}