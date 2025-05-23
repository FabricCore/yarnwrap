package yarnwrap.client.render.entity.state;
public class ItemEntityRenderState { public net.minecraft.client.render.entity.state.ItemEntityRenderState wrapperContained; public ItemEntityRenderState(net.minecraft.client.render.entity.state.ItemEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float uniqueOffset() { return wrapperContained.uniqueOffset; }
public void uniqueOffset(float value) { wrapperContained.uniqueOffset = value; }
// public static float uniqueOffset() { return net.minecraft.client.render.entity.state.ItemEntityRenderState.uniqueOffset; }
// public static void uniqueOffset(float value, ) { net.minecraft.client.render.entity.state.ItemEntityRenderState.uniqueOffset = value; }


}