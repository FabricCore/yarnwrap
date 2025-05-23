package yarnwrap.client.render.entity.state;
public class WardenEntityRenderState { public net.minecraft.client.render.entity.state.WardenEntityRenderState wrapperContained; public WardenEntityRenderState(net.minecraft.client.render.entity.state.WardenEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float tendrilAlpha() { return wrapperContained.tendrilAlpha; }
public void tendrilAlpha(float value) { wrapperContained.tendrilAlpha = value; }
// public static float tendrilAlpha() { return net.minecraft.client.render.entity.state.WardenEntityRenderState.tendrilAlpha; }
// public static void tendrilAlpha(float value, ) { net.minecraft.client.render.entity.state.WardenEntityRenderState.tendrilAlpha = value; }

public float heartAlpha() { return wrapperContained.heartAlpha; }
public void heartAlpha(float value) { wrapperContained.heartAlpha = value; }
// public static float heartAlpha() { return net.minecraft.client.render.entity.state.WardenEntityRenderState.heartAlpha; }
// public static void heartAlpha(float value, ) { net.minecraft.client.render.entity.state.WardenEntityRenderState.heartAlpha = value; }

public yarnwrap.entity.AnimationState roaringAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.roaringAnimationState); }
// public void roaringAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.roaringAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState roaringAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.WardenEntityRenderState.roaringAnimationState); }
// public static void roaringAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.WardenEntityRenderState.roaringAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sniffingAnimationState); }
// public void sniffingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sniffingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.WardenEntityRenderState.sniffingAnimationState); }
// public static void sniffingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.WardenEntityRenderState.sniffingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState emergingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.emergingAnimationState); }
// public void emergingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.emergingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState emergingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.WardenEntityRenderState.emergingAnimationState); }
// public static void emergingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.WardenEntityRenderState.emergingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.diggingAnimationState); }
// public void diggingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.diggingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.WardenEntityRenderState.diggingAnimationState); }
// public static void diggingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.WardenEntityRenderState.diggingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState attackingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.attackingAnimationState); }
// public void attackingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.attackingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState attackingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.WardenEntityRenderState.attackingAnimationState); }
// public static void attackingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.WardenEntityRenderState.attackingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState chargingSonicBoomAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.chargingSonicBoomAnimationState); }
// public void chargingSonicBoomAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.chargingSonicBoomAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState chargingSonicBoomAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.WardenEntityRenderState.chargingSonicBoomAnimationState); }
// public static void chargingSonicBoomAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.WardenEntityRenderState.chargingSonicBoomAnimationState = value.wrapperContained; }


}