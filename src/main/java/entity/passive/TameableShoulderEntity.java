package yarnwrap.entity.passive;
public class TameableShoulderEntity { public net.minecraft.entity.passive.TameableShoulderEntity wrapperContained; public TameableShoulderEntity(net.minecraft.entity.passive.TameableShoulderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int READY_TO_SIT_COOLDOWN() { return wrapperContained.READY_TO_SIT_COOLDOWN; }
// public int ticks() { return wrapperContained.ticks; }
public boolean isReadyToSitOnPlayer() { return wrapperContained.isReadyToSitOnPlayer(); }
public boolean mountOnto(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.mountOnto(player.wrapperContained); }

}