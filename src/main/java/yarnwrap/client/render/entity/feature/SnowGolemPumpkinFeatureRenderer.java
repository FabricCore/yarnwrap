package yarnwrap.client.render.entity.feature;
public class SnowGolemPumpkinFeatureRenderer { public net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer wrapperContained; public SnowGolemPumpkinFeatureRenderer(net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }
// public static yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer.blockRenderManager); }
// public static void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value, ) { net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer.blockRenderManager = value.wrapperContained; }

public SnowGolemPumpkinFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.block.BlockRenderManager blockRenderManager) { this.wrapperContained = new net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer(context.wrapperContained,blockRenderManager.wrapperContained); }

}