package yarnwrap.client.render.entity.feature;
public class EndermanBlockFeatureRenderer { public net.minecraft.client.render.entity.feature.EndermanBlockFeatureRenderer wrapperContained; public EndermanBlockFeatureRenderer(net.minecraft.client.render.entity.feature.EndermanBlockFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }
public EndermanBlockFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.block.BlockRenderManager blockRenderManager) { this.wrapperContained = new net.minecraft.client.render.entity.feature.EndermanBlockFeatureRenderer(context.wrapperContained,blockRenderManager.wrapperContained); }

}