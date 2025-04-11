package yarnwrap.client.network;
public class AbstractClientPlayerEntity { public net.minecraft.client.network.AbstractClientPlayerEntity wrapperContained; public AbstractClientPlayerEntity(net.minecraft.client.network.AbstractClientPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.world.ClientWorld clientWorld() { return new yarnwrap.client.world.ClientWorld(wrapperContained.clientWorld); }
// public void clientWorld(yarnwrap.client.world.ClientWorld value) { wrapperContained.clientWorld = value.wrapperContained; }
public float elytraRoll() { return wrapperContained.elytraRoll; }
public void elytraRoll(float value) { wrapperContained.elytraRoll = value; }
public float elytraYaw() { return wrapperContained.elytraYaw; }
public void elytraYaw(float value) { wrapperContained.elytraYaw = value; }
public float elytraPitch() { return wrapperContained.elytraPitch; }
public void elytraPitch(float value) { wrapperContained.elytraPitch = value; }
// public yarnwrap.client.network.PlayerListEntry playerListEntry() { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.playerListEntry); }
// public void playerListEntry(yarnwrap.client.network.PlayerListEntry value) { wrapperContained.playerListEntry = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d lastVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.lastVelocity); }
// public void lastVelocity(yarnwrap.util.math.Vec3d value) { wrapperContained.lastVelocity = value.wrapperContained; }
// public AbstractClientPlayerEntity(yarnwrap.client.world.ClientWorld world,com.mojang.authlib.GameProfile profile) { this.wrapperContained = new net.minecraft.client.network.AbstractClientPlayerEntity(world.wrapperContained,profile); }
public float getFovMultiplier() { return wrapperContained.getFovMultiplier(); }
// public yarnwrap.client.network.PlayerListEntry getPlayerListEntry() { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.getPlayerListEntry()); }
public yarnwrap.util.math.Vec3d lerpVelocity(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.lerpVelocity(tickDelta)); }
public yarnwrap.client.util.SkinTextures getSkinTextures() { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures()); }

}