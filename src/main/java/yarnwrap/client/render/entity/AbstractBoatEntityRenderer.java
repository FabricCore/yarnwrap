package yarnwrap.client.render.entity;
public class AbstractBoatEntityRenderer { public net.minecraft.client.render.entity.AbstractBoatEntityRenderer wrapperContained; public AbstractBoatEntityRenderer(net.minecraft.client.render.entity.AbstractBoatEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel getModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.getModel()); }
// public static yarnwrap.client.render.entity.model.EntityModel getModel() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.AbstractBoatEntityRenderer.getModel()); }
// public yarnwrap.client.render.RenderLayer getRenderLayer() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getRenderLayer()); }
// public static yarnwrap.client.render.RenderLayer getRenderLayer() { return new yarnwrap.client.render.RenderLayer(net.minecraft.client.render.entity.AbstractBoatEntityRenderer.getRenderLayer()); }
// public void renderWaterMask(yarnwrap.client.render.entity.state.BoatEntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.renderWaterMask(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public static void renderWaterMask(yarnwrap.client.render.entity.state.BoatEntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light, ) { net.minecraft.client.render.entity.AbstractBoatEntityRenderer.renderWaterMask(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }

}