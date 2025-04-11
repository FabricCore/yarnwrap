package yarnwrap.client.render.entity.feature;
public class StuckObjectsFeatureRenderer { public net.minecraft.client.render.entity.feature.StuckObjectsFeatureRenderer wrapperContained; public StuckObjectsFeatureRenderer(net.minecraft.client.render.entity.feature.StuckObjectsFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public StuckObjectsFeatureRenderer(yarnwrap.client.render.entity.LivingEntityRenderer entityRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.StuckObjectsFeatureRenderer(entityRenderer.wrapperContained); }
// public void renderObject(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.entity.Entity entity,float directionX,float directionY,float directionZ,float tickDelta) { wrapperContained.renderObject(matrices.wrapperContained,vertexConsumers.wrapperContained,light,entity.wrapperContained,directionX,directionY,directionZ,tickDelta); }
// public int getObjectCount(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getObjectCount(entity.wrapperContained); }

}