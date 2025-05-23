package yarnwrap.client.render.entity.state;
public class ArrowEntityRenderState { public net.minecraft.client.render.entity.state.ArrowEntityRenderState wrapperContained; public ArrowEntityRenderState(net.minecraft.client.render.entity.state.ArrowEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean tipped() { return wrapperContained.tipped; }
public void tipped(boolean value) { wrapperContained.tipped = value; }
// public static boolean tipped() { return net.minecraft.client.render.entity.state.ArrowEntityRenderState.tipped; }
// public static void tipped(boolean value, ) { net.minecraft.client.render.entity.state.ArrowEntityRenderState.tipped = value; }


}