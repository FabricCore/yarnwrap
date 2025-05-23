package yarnwrap.client.render.entity.state;
public class FrogEntityRenderState { public net.minecraft.client.render.entity.state.FrogEntityRenderState wrapperContained; public FrogEntityRenderState(net.minecraft.client.render.entity.state.FrogEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean insideWaterOrBubbleColumn() { return wrapperContained.insideWaterOrBubbleColumn; }
public void insideWaterOrBubbleColumn(boolean value) { wrapperContained.insideWaterOrBubbleColumn = value; }
// public static boolean insideWaterOrBubbleColumn() { return net.minecraft.client.render.entity.state.FrogEntityRenderState.insideWaterOrBubbleColumn; }
// public static void insideWaterOrBubbleColumn(boolean value, ) { net.minecraft.client.render.entity.state.FrogEntityRenderState.insideWaterOrBubbleColumn = value; }

public yarnwrap.entity.AnimationState longJumpingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.longJumpingAnimationState); }
// public void longJumpingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.longJumpingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState longJumpingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.FrogEntityRenderState.longJumpingAnimationState); }
// public static void longJumpingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.FrogEntityRenderState.longJumpingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState croakingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.croakingAnimationState); }
// public void croakingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.croakingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState croakingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.FrogEntityRenderState.croakingAnimationState); }
// public static void croakingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.FrogEntityRenderState.croakingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState usingTongueAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.usingTongueAnimationState); }
// public void usingTongueAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.usingTongueAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState usingTongueAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.FrogEntityRenderState.usingTongueAnimationState); }
// public static void usingTongueAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.FrogEntityRenderState.usingTongueAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState idlingInWaterAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.idlingInWaterAnimationState); }
// public void idlingInWaterAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.idlingInWaterAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState idlingInWaterAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.FrogEntityRenderState.idlingInWaterAnimationState); }
// public static void idlingInWaterAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.FrogEntityRenderState.idlingInWaterAnimationState = value.wrapperContained; }

public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.state.FrogEntityRenderState.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.state.FrogEntityRenderState.texture = value.wrapperContained; }

// public yarnwrap.util.Identifier DEFAULT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DEFAULT_TEXTURE); }
// public void DEFAULT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.DEFAULT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier DEFAULT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.state.FrogEntityRenderState.DEFAULT_TEXTURE); }
// public static void DEFAULT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.state.FrogEntityRenderState.DEFAULT_TEXTURE = value.wrapperContained; }


}