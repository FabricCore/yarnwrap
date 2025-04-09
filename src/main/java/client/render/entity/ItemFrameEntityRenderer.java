package yarnwrap.client.render.entity;
public class ItemFrameEntityRenderer { public net.minecraft.client.render.entity.ItemFrameEntityRenderer wrapperContained; public ItemFrameEntityRenderer(net.minecraft.client.render.entity.ItemFrameEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.ModelIdentifier GLOW_FRAME() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.GLOW_FRAME); }
// public yarnwrap.client.util.ModelIdentifier MAP_GLOW_FRAME() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.MAP_GLOW_FRAME); }
public int GLOW_FRAME_BLOCK_LIGHT() { return wrapperContained.GLOW_FRAME_BLOCK_LIGHT; }
// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public yarnwrap.client.util.ModelIdentifier NORMAL_FRAME() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.NORMAL_FRAME); }
// public yarnwrap.client.util.ModelIdentifier MAP_FRAME() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.MAP_FRAME); }
// public int getLight(yarnwrap.entity.decoration.ItemFrameEntity itemFrame,int glowLight,int regularLight) { return wrapperContained.getLight(itemFrame.wrapperContained,glowLight,regularLight); }
// public yarnwrap.client.util.ModelIdentifier getModelId(yarnwrap.entity.decoration.ItemFrameEntity entity,yarnwrap.item.ItemStack stack) { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.getModelId(entity.wrapperContained,stack.wrapperContained)); }

}