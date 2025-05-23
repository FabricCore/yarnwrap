package yarnwrap.client.render.entity.state;
public class EvokerFangsEntityRenderState { public net.minecraft.client.render.entity.state.EvokerFangsEntityRenderState wrapperContained; public EvokerFangsEntityRenderState(net.minecraft.client.render.entity.state.EvokerFangsEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.render.entity.state.EvokerFangsEntityRenderState.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.render.entity.state.EvokerFangsEntityRenderState.yaw = value; }

public float animationProgress() { return wrapperContained.animationProgress; }
public void animationProgress(float value) { wrapperContained.animationProgress = value; }
// public static float animationProgress() { return net.minecraft.client.render.entity.state.EvokerFangsEntityRenderState.animationProgress; }
// public static void animationProgress(float value, ) { net.minecraft.client.render.entity.state.EvokerFangsEntityRenderState.animationProgress = value; }


}