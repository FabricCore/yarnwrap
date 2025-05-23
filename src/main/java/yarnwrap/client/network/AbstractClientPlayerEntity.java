package yarnwrap.client.network;
public class AbstractClientPlayerEntity { public net.minecraft.client.network.AbstractClientPlayerEntity wrapperContained; public AbstractClientPlayerEntity(net.minecraft.client.network.AbstractClientPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float elytraRoll() { return wrapperContained.elytraRoll; }
public void elytraRoll(float value) { wrapperContained.elytraRoll = value; }
// public static float elytraRoll() { return net.minecraft.client.network.AbstractClientPlayerEntity.elytraRoll; }
// public static void elytraRoll(float value, ) { net.minecraft.client.network.AbstractClientPlayerEntity.elytraRoll = value; }

public float elytraYaw() { return wrapperContained.elytraYaw; }
public void elytraYaw(float value) { wrapperContained.elytraYaw = value; }
// public static float elytraYaw() { return net.minecraft.client.network.AbstractClientPlayerEntity.elytraYaw; }
// public static void elytraYaw(float value, ) { net.minecraft.client.network.AbstractClientPlayerEntity.elytraYaw = value; }

public float elytraPitch() { return wrapperContained.elytraPitch; }
public void elytraPitch(float value) { wrapperContained.elytraPitch = value; }
// public static float elytraPitch() { return net.minecraft.client.network.AbstractClientPlayerEntity.elytraPitch; }
// public static void elytraPitch(float value, ) { net.minecraft.client.network.AbstractClientPlayerEntity.elytraPitch = value; }

// public yarnwrap.client.network.PlayerListEntry playerListEntry() { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.playerListEntry); }
// public void playerListEntry(yarnwrap.client.network.PlayerListEntry value) { wrapperContained.playerListEntry = value.wrapperContained; }
// public static yarnwrap.client.network.PlayerListEntry playerListEntry() { return new yarnwrap.client.network.PlayerListEntry(net.minecraft.client.network.AbstractClientPlayerEntity.playerListEntry); }
// public static void playerListEntry(yarnwrap.client.network.PlayerListEntry value, ) { net.minecraft.client.network.AbstractClientPlayerEntity.playerListEntry = value.wrapperContained; }

public yarnwrap.client.world.ClientWorld clientWorld() { return new yarnwrap.client.world.ClientWorld(wrapperContained.clientWorld); }
// public void clientWorld(yarnwrap.client.world.ClientWorld value) { wrapperContained.clientWorld = value.wrapperContained; }
// public static yarnwrap.client.world.ClientWorld clientWorld() { return new yarnwrap.client.world.ClientWorld(net.minecraft.client.network.AbstractClientPlayerEntity.clientWorld); }
// public static void clientWorld(yarnwrap.client.world.ClientWorld value, ) { net.minecraft.client.network.AbstractClientPlayerEntity.clientWorld = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d lastVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.lastVelocity); }
// public void lastVelocity(yarnwrap.util.math.Vec3d value) { wrapperContained.lastVelocity = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d lastVelocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.network.AbstractClientPlayerEntity.lastVelocity); }
// public static void lastVelocity(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.network.AbstractClientPlayerEntity.lastVelocity = value.wrapperContained; }

public float lastDistanceMoved() { return wrapperContained.lastDistanceMoved; }
public void lastDistanceMoved(float value) { wrapperContained.lastDistanceMoved = value; }
// public static float lastDistanceMoved() { return net.minecraft.client.network.AbstractClientPlayerEntity.lastDistanceMoved; }
// public static void lastDistanceMoved(float value, ) { net.minecraft.client.network.AbstractClientPlayerEntity.lastDistanceMoved = value; }

public float distanceMoved() { return wrapperContained.distanceMoved; }
public void distanceMoved(float value) { wrapperContained.distanceMoved = value; }
// public static float distanceMoved() { return net.minecraft.client.network.AbstractClientPlayerEntity.distanceMoved; }
// public static void distanceMoved(float value, ) { net.minecraft.client.network.AbstractClientPlayerEntity.distanceMoved = value; }

// public AbstractClientPlayerEntity(yarnwrap.client.world.ClientWorld world,com.mojang.authlib.GameProfile profile) { this.wrapperContained = new net.minecraft.client.network.AbstractClientPlayerEntity(world.wrapperContained,profile); }
public float getFovMultiplier(boolean firstPerson,float fovEffectScale) { return wrapperContained.getFovMultiplier(firstPerson,fovEffectScale); }
// public static float getFovMultiplier(boolean firstPerson,float fovEffectScale, ) { return net.minecraft.client.network.AbstractClientPlayerEntity.getFovMultiplier(firstPerson,fovEffectScale); }
// public yarnwrap.client.network.PlayerListEntry getPlayerListEntry() { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.getPlayerListEntry()); }
// public static yarnwrap.client.network.PlayerListEntry getPlayerListEntry() { return new yarnwrap.client.network.PlayerListEntry(net.minecraft.client.network.AbstractClientPlayerEntity.getPlayerListEntry()); }
public yarnwrap.util.math.Vec3d lerpVelocity(float tickProgress) { return new yarnwrap.util.math.Vec3d(wrapperContained.lerpVelocity(tickProgress)); }
// public static yarnwrap.util.math.Vec3d lerpVelocity(float tickProgress, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.network.AbstractClientPlayerEntity.lerpVelocity(tickProgress)); }
public yarnwrap.client.util.SkinTextures getSkinTextures() { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures()); }
// public static yarnwrap.client.util.SkinTextures getSkinTextures() { return new yarnwrap.client.util.SkinTextures(net.minecraft.client.network.AbstractClientPlayerEntity.getSkinTextures()); }

}