package yarnwrap.client.render.entity.feature;
public class SnowGolemPumpkinFeatureRenderer { public net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer wrapperContained; public SnowGolemPumpkinFeatureRenderer(net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }
// public static yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer.blockRenderManager); }
// public static void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value, ) { net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer.blockRenderManager = value.wrapperContained; }

// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer.itemRenderer); }
// public static void itemRenderer(yarnwrap.client.render.item.ItemRenderer value, ) { net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer.itemRenderer = value.wrapperContained; }

public SnowGolemPumpkinFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.block.BlockRenderManager blockRenderManager,yarnwrap.client.render.item.ItemRenderer itemRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer(context.wrapperContained,blockRenderManager.wrapperContained,itemRenderer.wrapperContained); }

}