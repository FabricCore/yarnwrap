package yarnwrap.client.render.entity.feature;
public class SnowGolemPumpkinFeatureRenderer { public net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer wrapperContained; public SnowGolemPumpkinFeatureRenderer(net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }
// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }

}