package yarnwrap.client.render.entity;
public class ItemFrameEntityRenderer { public net.minecraft.client.render.entity.ItemFrameEntityRenderer wrapperContained; public ItemFrameEntityRenderer(net.minecraft.client.render.entity.ItemFrameEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int GLOW_FRAME_BLOCK_LIGHT() { return wrapperContained.GLOW_FRAME_BLOCK_LIGHT; }
// public void GLOW_FRAME_BLOCK_LIGHT(int value) { wrapperContained.GLOW_FRAME_BLOCK_LIGHT = value; }
public static int GLOW_FRAME_BLOCK_LIGHT() { return net.minecraft.client.render.entity.ItemFrameEntityRenderer.GLOW_FRAME_BLOCK_LIGHT; }
// public static void GLOW_FRAME_BLOCK_LIGHT(int value, ) { net.minecraft.client.render.entity.ItemFrameEntityRenderer.GLOW_FRAME_BLOCK_LIGHT = value; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }
// public static yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(net.minecraft.client.render.entity.ItemFrameEntityRenderer.blockRenderManager); }
// public static void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value, ) { net.minecraft.client.render.entity.ItemFrameEntityRenderer.blockRenderManager = value.wrapperContained; }

// public yarnwrap.client.render.MapRenderer mapRenderer() { return new yarnwrap.client.render.MapRenderer(wrapperContained.mapRenderer); }
// public void mapRenderer(yarnwrap.client.render.MapRenderer value) { wrapperContained.mapRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.MapRenderer mapRenderer() { return new yarnwrap.client.render.MapRenderer(net.minecraft.client.render.entity.ItemFrameEntityRenderer.mapRenderer); }
// public static void mapRenderer(yarnwrap.client.render.MapRenderer value, ) { net.minecraft.client.render.entity.ItemFrameEntityRenderer.mapRenderer = value.wrapperContained; }

// public yarnwrap.client.item.ItemModelManager itemModelManager() { return new yarnwrap.client.item.ItemModelManager(wrapperContained.itemModelManager); }
// public void itemModelManager(yarnwrap.client.item.ItemModelManager value) { wrapperContained.itemModelManager = value.wrapperContained; }
// public static yarnwrap.client.item.ItemModelManager itemModelManager() { return new yarnwrap.client.item.ItemModelManager(net.minecraft.client.render.entity.ItemFrameEntityRenderer.itemModelManager); }
// public static void itemModelManager(yarnwrap.client.item.ItemModelManager value, ) { net.minecraft.client.render.entity.ItemFrameEntityRenderer.itemModelManager = value.wrapperContained; }

// public int getLight(boolean glow,int glowLight,int regularLight) { return wrapperContained.getLight(glow,glowLight,regularLight); }
// public static int getLight(boolean glow,int glowLight,int regularLight, ) { return net.minecraft.client.render.entity.ItemFrameEntityRenderer.getLight(glow,glowLight,regularLight); }

}