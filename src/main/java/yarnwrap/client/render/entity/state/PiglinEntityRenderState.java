package yarnwrap.client.render.entity.state;
public class PiglinEntityRenderState { public net.minecraft.client.render.entity.state.PiglinEntityRenderState wrapperContained; public PiglinEntityRenderState(net.minecraft.client.render.entity.state.PiglinEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean brute() { return wrapperContained.brute; }
public void brute(boolean value) { wrapperContained.brute = value; }
// public static boolean brute() { return net.minecraft.client.render.entity.state.PiglinEntityRenderState.brute; }
// public static void brute(boolean value, ) { net.minecraft.client.render.entity.state.PiglinEntityRenderState.brute = value; }

public boolean shouldZombify() { return wrapperContained.shouldZombify; }
public void shouldZombify(boolean value) { wrapperContained.shouldZombify = value; }
// public static boolean shouldZombify() { return net.minecraft.client.render.entity.state.PiglinEntityRenderState.shouldZombify; }
// public static void shouldZombify(boolean value, ) { net.minecraft.client.render.entity.state.PiglinEntityRenderState.shouldZombify = value; }

public float piglinCrossbowPullTime() { return wrapperContained.piglinCrossbowPullTime; }
public void piglinCrossbowPullTime(float value) { wrapperContained.piglinCrossbowPullTime = value; }
// public static float piglinCrossbowPullTime() { return net.minecraft.client.render.entity.state.PiglinEntityRenderState.piglinCrossbowPullTime; }
// public static void piglinCrossbowPullTime(float value, ) { net.minecraft.client.render.entity.state.PiglinEntityRenderState.piglinCrossbowPullTime = value; }

public yarnwrap.entity.mob.PiglinActivity activity() { return new yarnwrap.entity.mob.PiglinActivity(wrapperContained.activity); }
public void activity(yarnwrap.entity.mob.PiglinActivity value) { wrapperContained.activity = value.wrapperContained; }
// public static yarnwrap.entity.mob.PiglinActivity activity() { return new yarnwrap.entity.mob.PiglinActivity(net.minecraft.client.render.entity.state.PiglinEntityRenderState.activity); }
// public static void activity(yarnwrap.entity.mob.PiglinActivity value, ) { net.minecraft.client.render.entity.state.PiglinEntityRenderState.activity = value.wrapperContained; }


}