package yarnwrap.client.render.entity.state;
public class ProjectileEntityRenderState { public net.minecraft.client.render.entity.state.ProjectileEntityRenderState wrapperContained; public ProjectileEntityRenderState(net.minecraft.client.render.entity.state.ProjectileEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float pitch() { return wrapperContained.pitch; }
public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.render.entity.state.ProjectileEntityRenderState.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.render.entity.state.ProjectileEntityRenderState.pitch = value; }

public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.render.entity.state.ProjectileEntityRenderState.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.render.entity.state.ProjectileEntityRenderState.yaw = value; }

public float shake() { return wrapperContained.shake; }
public void shake(float value) { wrapperContained.shake = value; }
// public static float shake() { return net.minecraft.client.render.entity.state.ProjectileEntityRenderState.shake; }
// public static void shake(float value, ) { net.minecraft.client.render.entity.state.ProjectileEntityRenderState.shake = value; }


}