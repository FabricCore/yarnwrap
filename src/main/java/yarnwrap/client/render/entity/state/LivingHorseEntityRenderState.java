package yarnwrap.client.render.entity.state;
public class LivingHorseEntityRenderState { public net.minecraft.client.render.entity.state.LivingHorseEntityRenderState wrapperContained; public LivingHorseEntityRenderState(net.minecraft.client.render.entity.state.LivingHorseEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean hasPassengers() { return wrapperContained.hasPassengers; }
public void hasPassengers(boolean value) { wrapperContained.hasPassengers = value; }
// public static boolean hasPassengers() { return net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.hasPassengers; }
// public static void hasPassengers(boolean value, ) { net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.hasPassengers = value; }

public boolean waggingTail() { return wrapperContained.waggingTail; }
public void waggingTail(boolean value) { wrapperContained.waggingTail = value; }
// public static boolean waggingTail() { return net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.waggingTail; }
// public static void waggingTail(boolean value, ) { net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.waggingTail = value; }

public float eatingGrassAnimationProgress() { return wrapperContained.eatingGrassAnimationProgress; }
public void eatingGrassAnimationProgress(float value) { wrapperContained.eatingGrassAnimationProgress = value; }
// public static float eatingGrassAnimationProgress() { return net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.eatingGrassAnimationProgress; }
// public static void eatingGrassAnimationProgress(float value, ) { net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.eatingGrassAnimationProgress = value; }

public float angryAnimationProgress() { return wrapperContained.angryAnimationProgress; }
public void angryAnimationProgress(float value) { wrapperContained.angryAnimationProgress = value; }
// public static float angryAnimationProgress() { return net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.angryAnimationProgress; }
// public static void angryAnimationProgress(float value, ) { net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.angryAnimationProgress = value; }

public float eatingAnimationProgress() { return wrapperContained.eatingAnimationProgress; }
public void eatingAnimationProgress(float value) { wrapperContained.eatingAnimationProgress = value; }
// public static float eatingAnimationProgress() { return net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.eatingAnimationProgress; }
// public static void eatingAnimationProgress(float value, ) { net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.eatingAnimationProgress = value; }

public yarnwrap.item.ItemStack saddleStack() { return new yarnwrap.item.ItemStack(wrapperContained.saddleStack); }
public void saddleStack(yarnwrap.item.ItemStack value) { wrapperContained.saddleStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack saddleStack() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.saddleStack); }
// public static void saddleStack(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.LivingHorseEntityRenderState.saddleStack = value.wrapperContained; }


}