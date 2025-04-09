package yarnwrap.client.render.block.entity;
public class SkullBlockEntityRenderer { public net.minecraft.client.render.block.entity.SkullBlockEntityRenderer wrapperContained; public SkullBlockEntityRenderer(net.minecraft.client.render.block.entity.SkullBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map TEXTURES() { return wrapperContained.TEXTURES; }
// public java.util.Map MODELS() { return wrapperContained.MODELS; }
public java.util.Map getModels(yarnwrap.client.render.entity.model.EntityModelLoader modelLoader) { return wrapperContained.getModels(modelLoader.wrapperContained); }
public void renderSkull(yarnwrap.util.math.Direction direction,float yaw,float animationProgress,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.client.render.block.entity.SkullBlockEntityModel model,yarnwrap.client.render.RenderLayer renderLayer) { wrapperContained.renderSkull(direction.wrapperContained,yaw,animationProgress,matrices.wrapperContained,vertexConsumers.wrapperContained,light,model.wrapperContained,renderLayer.wrapperContained); }
// public yarnwrap.client.render.RenderLayer getRenderLayer(Object type,yarnwrap.component.type.ProfileComponent profile) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getRenderLayer(type,profile.wrapperContained)); }

}