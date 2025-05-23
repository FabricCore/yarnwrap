package yarnwrap.client.render.entity.state;
public class BatEntityRenderState { public net.minecraft.client.render.entity.state.BatEntityRenderState wrapperContained; public BatEntityRenderState(net.minecraft.client.render.entity.state.BatEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean roosting() { return wrapperContained.roosting; }
public void roosting(boolean value) { wrapperContained.roosting = value; }
// public static boolean roosting() { return net.minecraft.client.render.entity.state.BatEntityRenderState.roosting; }
// public static void roosting(boolean value, ) { net.minecraft.client.render.entity.state.BatEntityRenderState.roosting = value; }

public yarnwrap.entity.AnimationState flyingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.flyingAnimationState); }
// public void flyingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.flyingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState flyingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.BatEntityRenderState.flyingAnimationState); }
// public static void flyingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.BatEntityRenderState.flyingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState roostingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.roostingAnimationState); }
// public void roostingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.roostingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState roostingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.BatEntityRenderState.roostingAnimationState); }
// public static void roostingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.BatEntityRenderState.roostingAnimationState = value.wrapperContained; }


}