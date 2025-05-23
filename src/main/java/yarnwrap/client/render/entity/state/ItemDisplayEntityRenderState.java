package yarnwrap.client.render.entity.state;
public class ItemDisplayEntityRenderState { public net.minecraft.client.render.entity.state.ItemDisplayEntityRenderState wrapperContained; public ItemDisplayEntityRenderState(net.minecraft.client.render.entity.state.ItemDisplayEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.item.ItemRenderState itemRenderState() { return new yarnwrap.client.render.item.ItemRenderState(wrapperContained.itemRenderState); }
// public void itemRenderState(yarnwrap.client.render.item.ItemRenderState value) { wrapperContained.itemRenderState = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderState itemRenderState() { return new yarnwrap.client.render.item.ItemRenderState(net.minecraft.client.render.entity.state.ItemDisplayEntityRenderState.itemRenderState); }
// public static void itemRenderState(yarnwrap.client.render.item.ItemRenderState value, ) { net.minecraft.client.render.entity.state.ItemDisplayEntityRenderState.itemRenderState = value.wrapperContained; }


}