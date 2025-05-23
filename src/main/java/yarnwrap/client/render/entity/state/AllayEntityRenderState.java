package yarnwrap.client.render.entity.state;
public class AllayEntityRenderState { public net.minecraft.client.render.entity.state.AllayEntityRenderState wrapperContained; public AllayEntityRenderState(net.minecraft.client.render.entity.state.AllayEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean dancing() { return wrapperContained.dancing; }
public void dancing(boolean value) { wrapperContained.dancing = value; }
// public static boolean dancing() { return net.minecraft.client.render.entity.state.AllayEntityRenderState.dancing; }
// public static void dancing(boolean value, ) { net.minecraft.client.render.entity.state.AllayEntityRenderState.dancing = value; }

public boolean spinning() { return wrapperContained.spinning; }
public void spinning(boolean value) { wrapperContained.spinning = value; }
// public static boolean spinning() { return net.minecraft.client.render.entity.state.AllayEntityRenderState.spinning; }
// public static void spinning(boolean value, ) { net.minecraft.client.render.entity.state.AllayEntityRenderState.spinning = value; }

public float spinningAnimationTicks() { return wrapperContained.spinningAnimationTicks; }
public void spinningAnimationTicks(float value) { wrapperContained.spinningAnimationTicks = value; }
// public static float spinningAnimationTicks() { return net.minecraft.client.render.entity.state.AllayEntityRenderState.spinningAnimationTicks; }
// public static void spinningAnimationTicks(float value, ) { net.minecraft.client.render.entity.state.AllayEntityRenderState.spinningAnimationTicks = value; }

public float itemHoldAnimationTicks() { return wrapperContained.itemHoldAnimationTicks; }
public void itemHoldAnimationTicks(float value) { wrapperContained.itemHoldAnimationTicks = value; }
// public static float itemHoldAnimationTicks() { return net.minecraft.client.render.entity.state.AllayEntityRenderState.itemHoldAnimationTicks; }
// public static void itemHoldAnimationTicks(float value, ) { net.minecraft.client.render.entity.state.AllayEntityRenderState.itemHoldAnimationTicks = value; }


}