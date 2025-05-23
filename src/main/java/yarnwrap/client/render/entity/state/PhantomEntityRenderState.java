package yarnwrap.client.render.entity.state;
public class PhantomEntityRenderState { public net.minecraft.client.render.entity.state.PhantomEntityRenderState wrapperContained; public PhantomEntityRenderState(net.minecraft.client.render.entity.state.PhantomEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float wingFlapProgress() { return wrapperContained.wingFlapProgress; }
public void wingFlapProgress(float value) { wrapperContained.wingFlapProgress = value; }
// public static float wingFlapProgress() { return net.minecraft.client.render.entity.state.PhantomEntityRenderState.wingFlapProgress; }
// public static void wingFlapProgress(float value, ) { net.minecraft.client.render.entity.state.PhantomEntityRenderState.wingFlapProgress = value; }

public int size() { return wrapperContained.size; }
public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.client.render.entity.state.PhantomEntityRenderState.size; }
// public static void size(int value, ) { net.minecraft.client.render.entity.state.PhantomEntityRenderState.size = value; }


}