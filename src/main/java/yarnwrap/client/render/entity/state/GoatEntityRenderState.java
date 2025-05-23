package yarnwrap.client.render.entity.state;
public class GoatEntityRenderState { public net.minecraft.client.render.entity.state.GoatEntityRenderState wrapperContained; public GoatEntityRenderState(net.minecraft.client.render.entity.state.GoatEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean hasLeftHorn() { return wrapperContained.hasLeftHorn; }
public void hasLeftHorn(boolean value) { wrapperContained.hasLeftHorn = value; }
// public static boolean hasLeftHorn() { return net.minecraft.client.render.entity.state.GoatEntityRenderState.hasLeftHorn; }
// public static void hasLeftHorn(boolean value, ) { net.minecraft.client.render.entity.state.GoatEntityRenderState.hasLeftHorn = value; }

public boolean hasRightHorn() { return wrapperContained.hasRightHorn; }
public void hasRightHorn(boolean value) { wrapperContained.hasRightHorn = value; }
// public static boolean hasRightHorn() { return net.minecraft.client.render.entity.state.GoatEntityRenderState.hasRightHorn; }
// public static void hasRightHorn(boolean value, ) { net.minecraft.client.render.entity.state.GoatEntityRenderState.hasRightHorn = value; }

public float headPitch() { return wrapperContained.headPitch; }
public void headPitch(float value) { wrapperContained.headPitch = value; }
// public static float headPitch() { return net.minecraft.client.render.entity.state.GoatEntityRenderState.headPitch; }
// public static void headPitch(float value, ) { net.minecraft.client.render.entity.state.GoatEntityRenderState.headPitch = value; }


}