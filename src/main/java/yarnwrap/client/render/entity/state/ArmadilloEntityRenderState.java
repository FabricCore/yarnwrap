package yarnwrap.client.render.entity.state;
public class ArmadilloEntityRenderState { public net.minecraft.client.render.entity.state.ArmadilloEntityRenderState wrapperContained; public ArmadilloEntityRenderState(net.minecraft.client.render.entity.state.ArmadilloEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean rolledUp() { return wrapperContained.rolledUp; }
public void rolledUp(boolean value) { wrapperContained.rolledUp = value; }
// public static boolean rolledUp() { return net.minecraft.client.render.entity.state.ArmadilloEntityRenderState.rolledUp; }
// public static void rolledUp(boolean value, ) { net.minecraft.client.render.entity.state.ArmadilloEntityRenderState.rolledUp = value; }

public yarnwrap.entity.AnimationState unrollingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.unrollingAnimationState); }
// public void unrollingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.unrollingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState unrollingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.ArmadilloEntityRenderState.unrollingAnimationState); }
// public static void unrollingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.ArmadilloEntityRenderState.unrollingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState rollingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.rollingAnimationState); }
// public void rollingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.rollingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState rollingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.ArmadilloEntityRenderState.rollingAnimationState); }
// public static void rollingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.ArmadilloEntityRenderState.rollingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState scaredAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.scaredAnimationState); }
// public void scaredAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.scaredAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState scaredAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.ArmadilloEntityRenderState.scaredAnimationState); }
// public static void scaredAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.ArmadilloEntityRenderState.scaredAnimationState = value.wrapperContained; }


}