package yarnwrap.client.render.entity.state;
public class SnifferEntityRenderState { public net.minecraft.client.render.entity.state.SnifferEntityRenderState wrapperContained; public SnifferEntityRenderState(net.minecraft.client.render.entity.state.SnifferEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean searching() { return wrapperContained.searching; }
public void searching(boolean value) { wrapperContained.searching = value; }
// public static boolean searching() { return net.minecraft.client.render.entity.state.SnifferEntityRenderState.searching; }
// public static void searching(boolean value, ) { net.minecraft.client.render.entity.state.SnifferEntityRenderState.searching = value; }

public yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.diggingAnimationState); }
// public void diggingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.diggingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.SnifferEntityRenderState.diggingAnimationState); }
// public static void diggingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.SnifferEntityRenderState.diggingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sniffingAnimationState); }
// public void sniffingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sniffingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.SnifferEntityRenderState.sniffingAnimationState); }
// public static void sniffingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.SnifferEntityRenderState.sniffingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState risingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.risingAnimationState); }
// public void risingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.risingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState risingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.SnifferEntityRenderState.risingAnimationState); }
// public static void risingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.SnifferEntityRenderState.risingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState feelingHappyAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.feelingHappyAnimationState); }
// public void feelingHappyAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.feelingHappyAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState feelingHappyAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.SnifferEntityRenderState.feelingHappyAnimationState); }
// public static void feelingHappyAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.SnifferEntityRenderState.feelingHappyAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState scentingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.scentingAnimationState); }
// public void scentingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.scentingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState scentingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.client.render.entity.state.SnifferEntityRenderState.scentingAnimationState); }
// public static void scentingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.client.render.entity.state.SnifferEntityRenderState.scentingAnimationState = value.wrapperContained; }


}