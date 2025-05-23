package yarnwrap.client.render.entity.state;
public class WolfEntityRenderState { public net.minecraft.client.render.entity.state.WolfEntityRenderState wrapperContained; public WolfEntityRenderState(net.minecraft.client.render.entity.state.WolfEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean angerTime() { return wrapperContained.angerTime; }
public void angerTime(boolean value) { wrapperContained.angerTime = value; }
// public static boolean angerTime() { return net.minecraft.client.render.entity.state.WolfEntityRenderState.angerTime; }
// public static void angerTime(boolean value, ) { net.minecraft.client.render.entity.state.WolfEntityRenderState.angerTime = value; }

public boolean inSittingPose() { return wrapperContained.inSittingPose; }
public void inSittingPose(boolean value) { wrapperContained.inSittingPose = value; }
// public static boolean inSittingPose() { return net.minecraft.client.render.entity.state.WolfEntityRenderState.inSittingPose; }
// public static void inSittingPose(boolean value, ) { net.minecraft.client.render.entity.state.WolfEntityRenderState.inSittingPose = value; }

public float tailAngle() { return wrapperContained.tailAngle; }
public void tailAngle(float value) { wrapperContained.tailAngle = value; }
// public static float tailAngle() { return net.minecraft.client.render.entity.state.WolfEntityRenderState.tailAngle; }
// public static void tailAngle(float value, ) { net.minecraft.client.render.entity.state.WolfEntityRenderState.tailAngle = value; }

public float begAnimationProgress() { return wrapperContained.begAnimationProgress; }
public void begAnimationProgress(float value) { wrapperContained.begAnimationProgress = value; }
// public static float begAnimationProgress() { return net.minecraft.client.render.entity.state.WolfEntityRenderState.begAnimationProgress; }
// public static void begAnimationProgress(float value, ) { net.minecraft.client.render.entity.state.WolfEntityRenderState.begAnimationProgress = value; }

public float shakeProgress() { return wrapperContained.shakeProgress; }
public void shakeProgress(float value) { wrapperContained.shakeProgress = value; }
// public static float shakeProgress() { return net.minecraft.client.render.entity.state.WolfEntityRenderState.shakeProgress; }
// public static void shakeProgress(float value, ) { net.minecraft.client.render.entity.state.WolfEntityRenderState.shakeProgress = value; }

public float furWetBrightnessMultiplier() { return wrapperContained.furWetBrightnessMultiplier; }
public void furWetBrightnessMultiplier(float value) { wrapperContained.furWetBrightnessMultiplier = value; }
// public static float furWetBrightnessMultiplier() { return net.minecraft.client.render.entity.state.WolfEntityRenderState.furWetBrightnessMultiplier; }
// public static void furWetBrightnessMultiplier(float value, ) { net.minecraft.client.render.entity.state.WolfEntityRenderState.furWetBrightnessMultiplier = value; }

public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.state.WolfEntityRenderState.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.state.WolfEntityRenderState.texture = value.wrapperContained; }

public yarnwrap.util.DyeColor collarColor() { return new yarnwrap.util.DyeColor(wrapperContained.collarColor); }
public void collarColor(yarnwrap.util.DyeColor value) { wrapperContained.collarColor = value.wrapperContained; }
// public static yarnwrap.util.DyeColor collarColor() { return new yarnwrap.util.DyeColor(net.minecraft.client.render.entity.state.WolfEntityRenderState.collarColor); }
// public static void collarColor(yarnwrap.util.DyeColor value, ) { net.minecraft.client.render.entity.state.WolfEntityRenderState.collarColor = value.wrapperContained; }

public yarnwrap.item.ItemStack bodyArmor() { return new yarnwrap.item.ItemStack(wrapperContained.bodyArmor); }
public void bodyArmor(yarnwrap.item.ItemStack value) { wrapperContained.bodyArmor = value.wrapperContained; }
// public static yarnwrap.item.ItemStack bodyArmor() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.WolfEntityRenderState.bodyArmor); }
// public static void bodyArmor(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.WolfEntityRenderState.bodyArmor = value.wrapperContained; }

// public yarnwrap.util.Identifier DEFAULT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DEFAULT_TEXTURE); }
// public void DEFAULT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.DEFAULT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier DEFAULT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.state.WolfEntityRenderState.DEFAULT_TEXTURE); }
// public static void DEFAULT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.state.WolfEntityRenderState.DEFAULT_TEXTURE = value.wrapperContained; }

public float getRoll(float shakeOffset) { return wrapperContained.getRoll(shakeOffset); }
// public static float getRoll(float shakeOffset, ) { return net.minecraft.client.render.entity.state.WolfEntityRenderState.getRoll(shakeOffset); }

}