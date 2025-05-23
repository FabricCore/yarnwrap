package yarnwrap.client.render.entity.state;
public class CamelEntityRenderState { public net.minecraft.client.render.entity.state.CamelEntityRenderState wrapperContained; public CamelEntityRenderState(net.minecraft.client.render.entity.state.CamelEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean hasPassengers() { return wrapperContained.hasPassengers; }
public void hasPassengers(boolean value) { wrapperContained.hasPassengers = value; }
// public static boolean hasPassengers() { return net.minecraft.client.render.entity.state.CamelEntityRenderState.hasPassengers; }
// public static void hasPassengers(boolean value, ) { net.minecraft.client.render.entity.state.CamelEntityRenderState.hasPassengers = value; }

public float jumpCooldown() { return wrapperContained.jumpCooldown; }
public void jumpCooldown(float value) { wrapperContained.jumpCooldown = value; }
// public static float jumpCooldown() { return net.minecraft.client.render.entity.state.CamelEntityRenderState.jumpCooldown; }
// public static void jumpCooldown(float value, ) { net.minecraft.client.render.entity.state.CamelEntityRenderState.jumpCooldown = value; }

public yarnwrap.entity.AnimationState sittingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sittingTransitionAnimationState); }
// public void sittingTransitionAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sittingTransitionAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState sittingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.CamelEntityRenderState.sittingTransitionAnimationState); }
// public static void sittingTransitionAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.CamelEntityRenderState.sittingTransitionAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState sittingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sittingAnimationState); }
// public void sittingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sittingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState sittingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.CamelEntityRenderState.sittingAnimationState); }
// public static void sittingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.CamelEntityRenderState.sittingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState standingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.standingTransitionAnimationState); }
// public void standingTransitionAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.standingTransitionAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState standingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.CamelEntityRenderState.standingTransitionAnimationState); }
// public static void standingTransitionAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.CamelEntityRenderState.standingTransitionAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState idlingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.idlingAnimationState); }
// public void idlingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.idlingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState idlingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.CamelEntityRenderState.idlingAnimationState); }
// public static void idlingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.CamelEntityRenderState.idlingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState dashingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.dashingAnimationState); }
// public void dashingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.dashingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState dashingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.CamelEntityRenderState.dashingAnimationState); }
// public static void dashingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.CamelEntityRenderState.dashingAnimationState = value.wrapperContained; }

public yarnwrap.item.ItemStack saddleStack() { return new yarnwrap.item.ItemStack(wrapperContained.saddleStack); }
public void saddleStack(yarnwrap.item.ItemStack value) { wrapperContained.saddleStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack saddleStack() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.CamelEntityRenderState.saddleStack); }
// public static void saddleStack(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.CamelEntityRenderState.saddleStack = value.wrapperContained; }


}