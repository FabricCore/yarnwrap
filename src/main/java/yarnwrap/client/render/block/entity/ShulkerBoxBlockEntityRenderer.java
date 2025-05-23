package yarnwrap.client.render.block.entity;
public class ShulkerBoxBlockEntityRenderer { public net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer wrapperContained; public ShulkerBoxBlockEntityRenderer(net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object model() { return wrapperContained.model; }
// // public void model(Object value) { wrapperContained.model = value; }
// // public static Object model() { return net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer.model; }
// // public static void model(Object value, ) { net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer.model = value; }

public ShulkerBoxBlockEntityRenderer(yarnwrap.client.render.entity.model.LoadedEntityModels models) { this.wrapperContained = new net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer(models.wrapperContained); }
// public ShulkerBoxBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer(ctx); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.util.math.Direction facing,float openness,yarnwrap.client.util.SpriteIdentifier textureId) { wrapperContained.render(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,facing.wrapperContained,openness,textureId.wrapperContained); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.util.math.Direction facing,float openness,yarnwrap.client.util.SpriteIdentifier textureId, ) { net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer.render(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,facing.wrapperContained,openness,textureId.wrapperContained); }

}