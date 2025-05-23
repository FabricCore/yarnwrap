package yarnwrap.client.render.entity.state;
public class WitherEntityRenderState { public net.minecraft.client.render.entity.state.WitherEntityRenderState wrapperContained; public WitherEntityRenderState(net.minecraft.client.render.entity.state.WitherEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float[] sideHeadPitches() { return wrapperContained.sideHeadPitches; }
public void sideHeadPitches(float[] value) { wrapperContained.sideHeadPitches = value; }
// public static float[] sideHeadPitches() { return net.minecraft.client.render.entity.state.WitherEntityRenderState.sideHeadPitches; }
// public static void sideHeadPitches(float[] value, ) { net.minecraft.client.render.entity.state.WitherEntityRenderState.sideHeadPitches = value; }

public float[] sideHeadYaws() { return wrapperContained.sideHeadYaws; }
public void sideHeadYaws(float[] value) { wrapperContained.sideHeadYaws = value; }
// public static float[] sideHeadYaws() { return net.minecraft.client.render.entity.state.WitherEntityRenderState.sideHeadYaws; }
// public static void sideHeadYaws(float[] value, ) { net.minecraft.client.render.entity.state.WitherEntityRenderState.sideHeadYaws = value; }

public float invulnerableTimer() { return wrapperContained.invulnerableTimer; }
public void invulnerableTimer(float value) { wrapperContained.invulnerableTimer = value; }
// public static float invulnerableTimer() { return net.minecraft.client.render.entity.state.WitherEntityRenderState.invulnerableTimer; }
// public static void invulnerableTimer(float value, ) { net.minecraft.client.render.entity.state.WitherEntityRenderState.invulnerableTimer = value; }

public boolean renderOverlay() { return wrapperContained.renderOverlay; }
public void renderOverlay(boolean value) { wrapperContained.renderOverlay = value; }
// public static boolean renderOverlay() { return net.minecraft.client.render.entity.state.WitherEntityRenderState.renderOverlay; }
// public static void renderOverlay(boolean value, ) { net.minecraft.client.render.entity.state.WitherEntityRenderState.renderOverlay = value; }


}