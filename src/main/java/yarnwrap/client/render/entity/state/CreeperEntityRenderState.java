package yarnwrap.client.render.entity.state;
public class CreeperEntityRenderState { public net.minecraft.client.render.entity.state.CreeperEntityRenderState wrapperContained; public CreeperEntityRenderState(net.minecraft.client.render.entity.state.CreeperEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float fuseTime() { return wrapperContained.fuseTime; }
public void fuseTime(float value) { wrapperContained.fuseTime = value; }
// public static float fuseTime() { return net.minecraft.client.render.entity.state.CreeperEntityRenderState.fuseTime; }
// public static void fuseTime(float value, ) { net.minecraft.client.render.entity.state.CreeperEntityRenderState.fuseTime = value; }

public boolean charged() { return wrapperContained.charged; }
public void charged(boolean value) { wrapperContained.charged = value; }
// public static boolean charged() { return net.minecraft.client.render.entity.state.CreeperEntityRenderState.charged; }
// public static void charged(boolean value, ) { net.minecraft.client.render.entity.state.CreeperEntityRenderState.charged = value; }


}