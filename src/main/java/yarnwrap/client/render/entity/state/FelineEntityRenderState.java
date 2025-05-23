package yarnwrap.client.render.entity.state;
public class FelineEntityRenderState { public net.minecraft.client.render.entity.state.FelineEntityRenderState wrapperContained; public FelineEntityRenderState(net.minecraft.client.render.entity.state.FelineEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean inSneakingPose() { return wrapperContained.inSneakingPose; }
public void inSneakingPose(boolean value) { wrapperContained.inSneakingPose = value; }
// public static boolean inSneakingPose() { return net.minecraft.client.render.entity.state.FelineEntityRenderState.inSneakingPose; }
// public static void inSneakingPose(boolean value, ) { net.minecraft.client.render.entity.state.FelineEntityRenderState.inSneakingPose = value; }

public boolean sprinting() { return wrapperContained.sprinting; }
public void sprinting(boolean value) { wrapperContained.sprinting = value; }
// public static boolean sprinting() { return net.minecraft.client.render.entity.state.FelineEntityRenderState.sprinting; }
// public static void sprinting(boolean value, ) { net.minecraft.client.render.entity.state.FelineEntityRenderState.sprinting = value; }

public boolean inSittingPose() { return wrapperContained.inSittingPose; }
public void inSittingPose(boolean value) { wrapperContained.inSittingPose = value; }
// public static boolean inSittingPose() { return net.minecraft.client.render.entity.state.FelineEntityRenderState.inSittingPose; }
// public static void inSittingPose(boolean value, ) { net.minecraft.client.render.entity.state.FelineEntityRenderState.inSittingPose = value; }

public float sleepAnimationProgress() { return wrapperContained.sleepAnimationProgress; }
public void sleepAnimationProgress(float value) { wrapperContained.sleepAnimationProgress = value; }
// public static float sleepAnimationProgress() { return net.minecraft.client.render.entity.state.FelineEntityRenderState.sleepAnimationProgress; }
// public static void sleepAnimationProgress(float value, ) { net.minecraft.client.render.entity.state.FelineEntityRenderState.sleepAnimationProgress = value; }

public float tailCurlAnimationProgress() { return wrapperContained.tailCurlAnimationProgress; }
public void tailCurlAnimationProgress(float value) { wrapperContained.tailCurlAnimationProgress = value; }
// public static float tailCurlAnimationProgress() { return net.minecraft.client.render.entity.state.FelineEntityRenderState.tailCurlAnimationProgress; }
// public static void tailCurlAnimationProgress(float value, ) { net.minecraft.client.render.entity.state.FelineEntityRenderState.tailCurlAnimationProgress = value; }

public float headDownAnimationProgress() { return wrapperContained.headDownAnimationProgress; }
public void headDownAnimationProgress(float value) { wrapperContained.headDownAnimationProgress = value; }
// public static float headDownAnimationProgress() { return net.minecraft.client.render.entity.state.FelineEntityRenderState.headDownAnimationProgress; }
// public static void headDownAnimationProgress(float value, ) { net.minecraft.client.render.entity.state.FelineEntityRenderState.headDownAnimationProgress = value; }


}