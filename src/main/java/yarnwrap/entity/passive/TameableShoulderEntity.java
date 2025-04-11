package yarnwrap.entity.passive;
public class TameableShoulderEntity { public net.minecraft.entity.passive.TameableShoulderEntity wrapperContained; public TameableShoulderEntity(net.minecraft.entity.passive.TameableShoulderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int READY_TO_SIT_COOLDOWN() { return wrapperContained.READY_TO_SIT_COOLDOWN; }
// public void READY_TO_SIT_COOLDOWN(int value) { wrapperContained.READY_TO_SIT_COOLDOWN = value; }
// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
public boolean isReadyToSitOnPlayer() { return wrapperContained.isReadyToSitOnPlayer(); }
public boolean mountOnto(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.mountOnto(player.wrapperContained); }

}