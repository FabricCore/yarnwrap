package yarnwrap.client.render.entity.state;
public class ShulkerBulletEntityRenderState { public net.minecraft.client.render.entity.state.ShulkerBulletEntityRenderState wrapperContained; public ShulkerBulletEntityRenderState(net.minecraft.client.render.entity.state.ShulkerBulletEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float pitch() { return wrapperContained.pitch; }
public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.render.entity.state.ShulkerBulletEntityRenderState.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.render.entity.state.ShulkerBulletEntityRenderState.pitch = value; }

public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.render.entity.state.ShulkerBulletEntityRenderState.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.render.entity.state.ShulkerBulletEntityRenderState.yaw = value; }


}