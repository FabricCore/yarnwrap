package yarnwrap.client.network;
public class AbstractClientPlayerEntity { public net.minecraft.client.network.AbstractClientPlayerEntity wrapperContained; public AbstractClientPlayerEntity(net.minecraft.client.network.AbstractClientPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.world.ClientWorld clientWorld() { return new yarnwrap.client.world.ClientWorld(wrapperContained.clientWorld); }
// public void clientWorld(yarnwrap.client.world.ClientWorld value) { wrapperContained.clientWorld = value.wrapperContained; }
// public static yarnwrap.client.world.ClientWorld clientWorld() { return new yarnwrap.client.world.ClientWorld(net.minecraft.client.network.AbstractClientPlayerEntity.clientWorld); }
// public static void clientWorld(yarnwrap.client.world.ClientWorld value, ) { net.minecraft.client.network.AbstractClientPlayerEntity.clientWorld = value.wrapperContained; }

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

// public yarnwrap.util.math.Vec3d lastVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.lastVelocity); }
// public void lastVelocity(yarnwrap.util.math.Vec3d value) { wrapperContained.lastVelocity = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d lastVelocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.network.AbstractClientPlayerEntity.lastVelocity); }
// public static void lastVelocity(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.network.AbstractClientPlayerEntity.lastVelocity = value.wrapperContained; }

// public AbstractClientPlayerEntity(yarnwrap.client.world.ClientWorld world,com.mojang.authlib.GameProfile profile) { this.wrapperContained = new net.minecraft.client.network.AbstractClientPlayerEntity(world.wrapperContained,profile); }
public float getFovMultiplier() { return wrapperContained.getFovMultiplier(); }
// public static float getFovMultiplier() { return net.minecraft.client.network.AbstractClientPlayerEntity.getFovMultiplier(); }
// public yarnwrap.client.network.PlayerListEntry getPlayerListEntry() { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.getPlayerListEntry()); }
// public static yarnwrap.client.network.PlayerListEntry getPlayerListEntry() { return new yarnwrap.client.network.PlayerListEntry(net.minecraft.client.network.AbstractClientPlayerEntity.getPlayerListEntry()); }
public yarnwrap.util.math.Vec3d lerpVelocity(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.lerpVelocity(tickDelta)); }
// public static yarnwrap.util.math.Vec3d lerpVelocity(float tickDelta, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.network.AbstractClientPlayerEntity.lerpVelocity(tickDelta)); }
public yarnwrap.client.util.SkinTextures getSkinTextures() { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures()); }
// public static yarnwrap.client.util.SkinTextures getSkinTextures() { return new yarnwrap.client.util.SkinTextures(net.minecraft.client.network.AbstractClientPlayerEntity.getSkinTextures()); }

}