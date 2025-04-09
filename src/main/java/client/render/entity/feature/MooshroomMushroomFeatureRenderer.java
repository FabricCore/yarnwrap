package yarnwrap.client.render.entity.feature;
public class MooshroomMushroomFeatureRenderer { public net.minecraft.client.render.entity.feature.MooshroomMushroomFeatureRenderer wrapperContained; public MooshroomMushroomFeatureRenderer(net.minecraft.client.render.entity.feature.MooshroomMushroomFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void renderMushroom(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,boolean renderAsModel,yarnwrap.block.BlockState mushroomState,int overlay,yarnwrap.client.render.model.BakedModel mushroomModel) { wrapperContained.renderMushroom(matrices.wrapperContained,vertexConsumers.wrapperContained,light,renderAsModel,mushroomState.wrapperContained,overlay,mushroomModel.wrapperContained); }

}