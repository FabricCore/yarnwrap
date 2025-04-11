package yarnwrap.client.render.entity;
public class FallingBlockEntityRenderer { public net.minecraft.client.render.entity.FallingBlockEntityRenderer wrapperContained; public FallingBlockEntityRenderer(net.minecraft.client.render.entity.FallingBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }

}