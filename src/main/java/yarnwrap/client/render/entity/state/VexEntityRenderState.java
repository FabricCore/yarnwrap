package yarnwrap.client.render.entity.state;
public class VexEntityRenderState { public net.minecraft.client.render.entity.state.VexEntityRenderState wrapperContained; public VexEntityRenderState(net.minecraft.client.render.entity.state.VexEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean charging() { return wrapperContained.charging; }
public void charging(boolean value) { wrapperContained.charging = value; }
// public static boolean charging() { return net.minecraft.client.render.entity.state.VexEntityRenderState.charging; }
// public static void charging(boolean value, ) { net.minecraft.client.render.entity.state.VexEntityRenderState.charging = value; }


}