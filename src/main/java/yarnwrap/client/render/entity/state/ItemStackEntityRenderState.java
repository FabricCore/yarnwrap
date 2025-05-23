package yarnwrap.client.render.entity.state;
public class ItemStackEntityRenderState { public net.minecraft.client.render.entity.state.ItemStackEntityRenderState wrapperContained; public ItemStackEntityRenderState(net.minecraft.client.render.entity.state.ItemStackEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.item.ItemRenderState itemRenderState() { return new yarnwrap.client.render.item.ItemRenderState(wrapperContained.itemRenderState); }
// public void itemRenderState(yarnwrap.client.render.item.ItemRenderState value) { wrapperContained.itemRenderState = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderState itemRenderState() { return new yarnwrap.client.render.item.ItemRenderState(net.minecraft.client.render.entity.state.ItemStackEntityRenderState.itemRenderState); }
// public static void itemRenderState(yarnwrap.client.render.item.ItemRenderState value, ) { net.minecraft.client.render.entity.state.ItemStackEntityRenderState.itemRenderState = value.wrapperContained; }

public int renderedAmount() { return wrapperContained.renderedAmount; }
public void renderedAmount(int value) { wrapperContained.renderedAmount = value; }
// public static int renderedAmount() { return net.minecraft.client.render.entity.state.ItemStackEntityRenderState.renderedAmount; }
// public static void renderedAmount(int value, ) { net.minecraft.client.render.entity.state.ItemStackEntityRenderState.renderedAmount = value; }

public int seed() { return wrapperContained.seed; }
public void seed(int value) { wrapperContained.seed = value; }
// public static int seed() { return net.minecraft.client.render.entity.state.ItemStackEntityRenderState.seed; }
// public static void seed(int value, ) { net.minecraft.client.render.entity.state.ItemStackEntityRenderState.seed = value; }

// public int getRenderedAmount(int count) { return wrapperContained.getRenderedAmount(count); }
// public static int getRenderedAmount(int count, ) { return net.minecraft.client.render.entity.state.ItemStackEntityRenderState.getRenderedAmount(count); }
public void update(yarnwrap.entity.Entity entity,yarnwrap.item.ItemStack stack,yarnwrap.client.item.ItemModelManager itemModelManager) { wrapperContained.update(entity.wrapperContained,stack.wrapperContained,itemModelManager.wrapperContained); }
// public static void update(yarnwrap.entity.Entity entity,yarnwrap.item.ItemStack stack,yarnwrap.client.item.ItemModelManager itemModelManager, ) { net.minecraft.client.render.entity.state.ItemStackEntityRenderState.update(entity.wrapperContained,stack.wrapperContained,itemModelManager.wrapperContained); }
// public int getSeed(yarnwrap.item.ItemStack stack) { return wrapperContained.getSeed(stack.wrapperContained); }
// public static int getSeed(yarnwrap.item.ItemStack stack, ) { return net.minecraft.client.render.entity.state.ItemStackEntityRenderState.getSeed(stack.wrapperContained); }

}