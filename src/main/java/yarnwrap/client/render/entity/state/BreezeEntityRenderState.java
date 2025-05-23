package yarnwrap.client.render.entity.state;
public class BreezeEntityRenderState { public net.minecraft.client.render.entity.state.BreezeEntityRenderState wrapperContained; public BreezeEntityRenderState(net.minecraft.client.render.entity.state.BreezeEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState shootingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.shootingAnimationState); }
// public void shootingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.shootingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState shootingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.BreezeEntityRenderState.shootingAnimationState); }
// public static void shootingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.BreezeEntityRenderState.shootingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState slidingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.slidingAnimationState); }
// public void slidingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.slidingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState slidingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.BreezeEntityRenderState.slidingAnimationState); }
// public static void slidingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.BreezeEntityRenderState.slidingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState slidingBackAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.slidingBackAnimationState); }
// public void slidingBackAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.slidingBackAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState slidingBackAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.BreezeEntityRenderState.slidingBackAnimationState); }
// public static void slidingBackAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.BreezeEntityRenderState.slidingBackAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState inhalingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.inhalingAnimationState); }
// public void inhalingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.inhalingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState inhalingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.BreezeEntityRenderState.inhalingAnimationState); }
// public static void inhalingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.BreezeEntityRenderState.inhalingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState longJumpingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.longJumpingAnimationState); }
// public void longJumpingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.longJumpingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState longJumpingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.BreezeEntityRenderState.longJumpingAnimationState); }
// public static void longJumpingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.BreezeEntityRenderState.longJumpingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState idleAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.idleAnimationState); }
// public void idleAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.idleAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState idleAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.BreezeEntityRenderState.idleAnimationState); }
// public static void idleAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.BreezeEntityRenderState.idleAnimationState = value.wrapperContained; }


}