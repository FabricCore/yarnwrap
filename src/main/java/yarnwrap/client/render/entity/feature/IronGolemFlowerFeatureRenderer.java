package yarnwrap.client.render.entity.feature;
public class IronGolemFlowerFeatureRenderer { public net.minecraft.client.render.entity.feature.IronGolemFlowerFeatureRenderer wrapperContained; public IronGolemFlowerFeatureRenderer(net.minecraft.client.render.entity.feature.IronGolemFlowerFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }

}