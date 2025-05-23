package yarnwrap.client.render.entity.state;
public class WitherSkullEntityRenderState { public net.minecraft.client.render.entity.state.WitherSkullEntityRenderState wrapperContained; public WitherSkullEntityRenderState(net.minecraft.client.render.entity.state.WitherSkullEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean charged() { return wrapperContained.charged; }
public void charged(boolean value) { wrapperContained.charged = value; }
// public static boolean charged() { return net.minecraft.client.render.entity.state.WitherSkullEntityRenderState.charged; }
// public static void charged(boolean value, ) { net.minecraft.client.render.entity.state.WitherSkullEntityRenderState.charged = value; }

public float pitch() { return wrapperContained.pitch; }
public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.render.entity.state.WitherSkullEntityRenderState.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.render.entity.state.WitherSkullEntityRenderState.pitch = value; }

public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.render.entity.state.WitherSkullEntityRenderState.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.render.entity.state.WitherSkullEntityRenderState.yaw = value; }


}