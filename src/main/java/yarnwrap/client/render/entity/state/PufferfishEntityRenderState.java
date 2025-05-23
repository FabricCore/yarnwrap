package yarnwrap.client.render.entity.state;
public class PufferfishEntityRenderState { public net.minecraft.client.render.entity.state.PufferfishEntityRenderState wrapperContained; public PufferfishEntityRenderState(net.minecraft.client.render.entity.state.PufferfishEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public int puffState() { return wrapperContained.puffState; }
public void puffState(int value) { wrapperContained.puffState = value; }
// public static int puffState() { return net.minecraft.client.render.entity.state.PufferfishEntityRenderState.puffState; }
// public static void puffState(int value, ) { net.minecraft.client.render.entity.state.PufferfishEntityRenderState.puffState = value; }


}