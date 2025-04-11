package yarnwrap.client.render.block.entity;
public class MobSpawnerBlockEntityRenderer { public net.minecraft.client.render.block.entity.MobSpawnerBlockEntityRenderer wrapperContained; public MobSpawnerBlockEntityRenderer(net.minecraft.client.render.block.entity.MobSpawnerBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.entityRenderDispatcher); }
// public void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.entityRenderDispatcher = value.wrapperContained; }
// public MobSpawnerBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.MobSpawnerBlockEntityRenderer(ctx); }
public void render(float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.entity.Entity entity,yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher,double lastRotation,double rotation) { wrapperContained.render(tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,light,entity.wrapperContained,entityRenderDispatcher.wrapperContained,lastRotation,rotation); }

}