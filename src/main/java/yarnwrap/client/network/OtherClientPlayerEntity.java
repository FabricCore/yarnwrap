package yarnwrap.client.network;
public class OtherClientPlayerEntity { public net.minecraft.client.network.OtherClientPlayerEntity wrapperContained; public OtherClientPlayerEntity(net.minecraft.client.network.OtherClientPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d clientVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.clientVelocity); }
// public void clientVelocity(yarnwrap.util.math.Vec3d value) { wrapperContained.clientVelocity = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d clientVelocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.network.OtherClientPlayerEntity.clientVelocity); }
// public static void clientVelocity(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.network.OtherClientPlayerEntity.clientVelocity = value.wrapperContained; }

// public int velocityLerpDivisor() { return wrapperContained.velocityLerpDivisor; }
// public void velocityLerpDivisor(int value) { wrapperContained.velocityLerpDivisor = value; }
// public static int velocityLerpDivisor() { return net.minecraft.client.network.OtherClientPlayerEntity.velocityLerpDivisor; }
// public static void velocityLerpDivisor(int value, ) { net.minecraft.client.network.OtherClientPlayerEntity.velocityLerpDivisor = value; }


}