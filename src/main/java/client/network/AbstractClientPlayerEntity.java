package yarnwrap.client.network;
public class AbstractClientPlayerEntity { public net.minecraft.client.network.AbstractClientPlayerEntity wrapperContained; public AbstractClientPlayerEntity(net.minecraft.client.network.AbstractClientPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.world.ClientWorld clientWorld() { return new yarnwrap.client.world.ClientWorld(wrapperContained.clientWorld); }
public float elytraRoll() { return wrapperContained.elytraRoll; }
public float elytraYaw() { return wrapperContained.elytraYaw; }
public float elytraPitch() { return wrapperContained.elytraPitch; }
// public yarnwrap.client.network.PlayerListEntry playerListEntry() { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.playerListEntry); }
// public yarnwrap.util.math.Vec3d lastVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.lastVelocity); }
public float getFovMultiplier() { return wrapperContained.getFovMultiplier(); }
// public yarnwrap.client.network.PlayerListEntry getPlayerListEntry() { return new yarnwrap.client.network.PlayerListEntry(wrapperContained.getPlayerListEntry()); }
public yarnwrap.util.math.Vec3d lerpVelocity(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.lerpVelocity(tickDelta)); }
public yarnwrap.client.util.SkinTextures getSkinTextures() { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures()); }

}