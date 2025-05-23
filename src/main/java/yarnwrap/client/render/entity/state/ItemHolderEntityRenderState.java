package yarnwrap.client.render.entity.state;
public class ItemHolderEntityRenderState { public net.minecraft.client.render.entity.state.ItemHolderEntityRenderState wrapperContained; public ItemHolderEntityRenderState(net.minecraft.client.render.entity.state.ItemHolderEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.item.ItemRenderState itemRenderState() { return new yarnwrap.client.render.item.ItemRenderState(wrapperContained.itemRenderState); }
// public void itemRenderState(yarnwrap.client.render.item.ItemRenderState value) { wrapperContained.itemRenderState = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderState itemRenderState() { return new yarnwrap.client.render.item.ItemRenderState(net.minecraft.client.render.entity.state.ItemHolderEntityRenderState.itemRenderState); }
// public static void itemRenderState(yarnwrap.client.render.item.ItemRenderState value, ) { net.minecraft.client.render.entity.state.ItemHolderEntityRenderState.itemRenderState = value.wrapperContained; }

// public void update(yarnwrap.entity.LivingEntity entity,yarnwrap.client.render.entity.state.ItemHolderEntityRenderState state,yarnwrap.client.item.ItemModelManager itemModelManager) { wrapperContained.update(entity.wrapperContained,state.wrapperContained,itemModelManager.wrapperContained); }
// public static void update(yarnwrap.entity.LivingEntity entity,yarnwrap.client.render.entity.state.ItemHolderEntityRenderState state,yarnwrap.client.item.ItemModelManager itemModelManager, ) { net.minecraft.client.render.entity.state.ItemHolderEntityRenderState.update(entity.wrapperContained,state.wrapperContained,itemModelManager.wrapperContained); }

}