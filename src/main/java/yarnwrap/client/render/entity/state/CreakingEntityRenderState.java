package yarnwrap.client.render.entity.state;
public class CreakingEntityRenderState { public net.minecraft.client.render.entity.state.CreakingEntityRenderState wrapperContained; public CreakingEntityRenderState(net.minecraft.client.render.entity.state.CreakingEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState invulnerableAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.invulnerableAnimationState); }
// public void invulnerableAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.invulnerableAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState invulnerableAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.CreakingEntityRenderState.invulnerableAnimationState); }
// public static void invulnerableAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.CreakingEntityRenderState.invulnerableAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState attackAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.attackAnimationState); }
// public void attackAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.attackAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState attackAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.CreakingEntityRenderState.attackAnimationState); }
// public static void attackAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.CreakingEntityRenderState.attackAnimationState = value.wrapperContained; }

public boolean glowingEyes() { return wrapperContained.glowingEyes; }
public void glowingEyes(boolean value) { wrapperContained.glowingEyes = value; }
// public static boolean glowingEyes() { return net.minecraft.client.render.entity.state.CreakingEntityRenderState.glowingEyes; }
// public static void glowingEyes(boolean value, ) { net.minecraft.client.render.entity.state.CreakingEntityRenderState.glowingEyes = value; }

public boolean unrooted() { return wrapperContained.unrooted; }
public void unrooted(boolean value) { wrapperContained.unrooted = value; }
// public static boolean unrooted() { return net.minecraft.client.render.entity.state.CreakingEntityRenderState.unrooted; }
// public static void unrooted(boolean value, ) { net.minecraft.client.render.entity.state.CreakingEntityRenderState.unrooted = value; }

public yarnwrap.entity.AnimationState crumblingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.crumblingAnimationState); }
// public void crumblingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.crumblingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState crumblingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.CreakingEntityRenderState.crumblingAnimationState); }
// public static void crumblingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.CreakingEntityRenderState.crumblingAnimationState = value.wrapperContained; }


}