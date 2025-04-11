package yarnwrap.client.render.entity;
public class TntEntityRenderer { public net.minecraft.client.render.entity.TntEntityRenderer wrapperContained; public TntEntityRenderer(net.minecraft.client.render.entity.TntEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }

}