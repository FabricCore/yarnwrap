package yarnwrap.client.network;
public class OtherClientPlayerEntity { public net.minecraft.client.network.OtherClientPlayerEntity wrapperContained; public OtherClientPlayerEntity(net.minecraft.client.network.OtherClientPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d clientVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.clientVelocity); }
// public int velocityLerpDivisor() { return wrapperContained.velocityLerpDivisor; }

}