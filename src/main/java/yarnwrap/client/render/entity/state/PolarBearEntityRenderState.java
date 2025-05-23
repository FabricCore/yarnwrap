package yarnwrap.client.render.entity.state;
public class PolarBearEntityRenderState { public net.minecraft.client.render.entity.state.PolarBearEntityRenderState wrapperContained; public PolarBearEntityRenderState(net.minecraft.client.render.entity.state.PolarBearEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float warningAnimationProgress() { return wrapperContained.warningAnimationProgress; }
public void warningAnimationProgress(float value) { wrapperContained.warningAnimationProgress = value; }
// public static float warningAnimationProgress() { return net.minecraft.client.render.entity.state.PolarBearEntityRenderState.warningAnimationProgress; }
// public static void warningAnimationProgress(float value, ) { net.minecraft.client.render.entity.state.PolarBearEntityRenderState.warningAnimationProgress = value; }


}