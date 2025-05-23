package yarnwrap.client.render.entity.state;
public class DisplayEntityRenderState { public net.minecraft.client.render.entity.state.DisplayEntityRenderState wrapperContained; public DisplayEntityRenderState(net.minecraft.client.render.entity.state.DisplayEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public Object displayRenderState() { return wrapperContained.displayRenderState; }
// public void displayRenderState(Object value) { wrapperContained.displayRenderState = value; }
// // public static Object displayRenderState() { return net.minecraft.client.render.entity.state.DisplayEntityRenderState.displayRenderState; }
// // public static void displayRenderState(Object value, ) { net.minecraft.client.render.entity.state.DisplayEntityRenderState.displayRenderState = value; }

public float lerpProgress() { return wrapperContained.lerpProgress; }
public void lerpProgress(float value) { wrapperContained.lerpProgress = value; }
// public static float lerpProgress() { return net.minecraft.client.render.entity.state.DisplayEntityRenderState.lerpProgress; }
// public static void lerpProgress(float value, ) { net.minecraft.client.render.entity.state.DisplayEntityRenderState.lerpProgress = value; }

public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.render.entity.state.DisplayEntityRenderState.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.render.entity.state.DisplayEntityRenderState.yaw = value; }

public float pitch() { return wrapperContained.pitch; }
public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.render.entity.state.DisplayEntityRenderState.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.render.entity.state.DisplayEntityRenderState.pitch = value; }

public boolean canRender() { return wrapperContained.canRender(); }
// public static boolean canRender() { return net.minecraft.client.render.entity.state.DisplayEntityRenderState.canRender(); }

}