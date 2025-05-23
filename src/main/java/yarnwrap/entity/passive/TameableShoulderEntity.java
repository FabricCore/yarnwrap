package yarnwrap.entity.passive;
public class TameableShoulderEntity { public net.minecraft.entity.passive.TameableShoulderEntity wrapperContained; public TameableShoulderEntity(net.minecraft.entity.passive.TameableShoulderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.entity.passive.TameableShoulderEntity.ticks; }
// public static void ticks(int value, ) { net.minecraft.entity.passive.TameableShoulderEntity.ticks = value; }

// public int READY_TO_SIT_COOLDOWN() { return wrapperContained.READY_TO_SIT_COOLDOWN; }
// public void READY_TO_SIT_COOLDOWN(int value) { wrapperContained.READY_TO_SIT_COOLDOWN = value; }
// public static int READY_TO_SIT_COOLDOWN() { return net.minecraft.entity.passive.TameableShoulderEntity.READY_TO_SIT_COOLDOWN; }
// public static void READY_TO_SIT_COOLDOWN(int value, ) { net.minecraft.entity.passive.TameableShoulderEntity.READY_TO_SIT_COOLDOWN = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.passive.TameableShoulderEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.passive.TameableShoulderEntity.LOGGER = value; }

public boolean isReadyToSitOnPlayer() { return wrapperContained.isReadyToSitOnPlayer(); }
// public static boolean isReadyToSitOnPlayer() { return net.minecraft.entity.passive.TameableShoulderEntity.isReadyToSitOnPlayer(); }
public boolean mountOnto(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.mountOnto(player.wrapperContained); }
// public static boolean mountOnto(yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.entity.passive.TameableShoulderEntity.mountOnto(player.wrapperContained); }

}