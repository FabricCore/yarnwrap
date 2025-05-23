package yarnwrap.client.render.entity.state;
public class GhastEntityRenderState { public net.minecraft.client.render.entity.state.GhastEntityRenderState wrapperContained; public GhastEntityRenderState(net.minecraft.client.render.entity.state.GhastEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean shooting() { return wrapperContained.shooting; }
public void shooting(boolean value) { wrapperContained.shooting = value; }
// public static boolean shooting() { return net.minecraft.client.render.entity.state.GhastEntityRenderState.shooting; }
// public static void shooting(boolean value, ) { net.minecraft.client.render.entity.state.GhastEntityRenderState.shooting = value; }


}