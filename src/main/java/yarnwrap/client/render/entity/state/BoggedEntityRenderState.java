package yarnwrap.client.render.entity.state;
public class BoggedEntityRenderState { public net.minecraft.client.render.entity.state.BoggedEntityRenderState wrapperContained; public BoggedEntityRenderState(net.minecraft.client.render.entity.state.BoggedEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean sheared() { return wrapperContained.sheared; }
public void sheared(boolean value) { wrapperContained.sheared = value; }
// public static boolean sheared() { return net.minecraft.client.render.entity.state.BoggedEntityRenderState.sheared; }
// public static void sheared(boolean value, ) { net.minecraft.client.render.entity.state.BoggedEntityRenderState.sheared = value; }


}