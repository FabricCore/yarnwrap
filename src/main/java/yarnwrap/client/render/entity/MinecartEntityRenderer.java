package yarnwrap.client.render.entity;
public class MinecartEntityRenderer { public net.minecraft.client.render.entity.MinecartEntityRenderer wrapperContained; public MinecartEntityRenderer(net.minecraft.client.render.entity.MinecartEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }
// public static yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(net.minecraft.client.render.entity.MinecartEntityRenderer.blockRenderManager); }
// public static void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value, ) { net.minecraft.client.render.entity.MinecartEntityRenderer.blockRenderManager = value.wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.MinecartEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.MinecartEntityRenderer.TEXTURE = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.MinecartEntityRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.MinecartEntityRenderer.model = value.wrapperContained; }

// public MinecartEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.EntityModelLayer layer) { this.wrapperContained = new net.minecraft.client.render.entity.MinecartEntityRenderer(ctx,layer.wrapperContained); }
// public void renderBlock(yarnwrap.entity.vehicle.AbstractMinecartEntity entity,float delta,yarnwrap.block.BlockState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.renderBlock(entity.wrapperContained,delta,state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public static void renderBlock(yarnwrap.entity.vehicle.AbstractMinecartEntity entity,float delta,yarnwrap.block.BlockState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light, ) { net.minecraft.client.render.entity.MinecartEntityRenderer.renderBlock(entity.wrapperContained,delta,state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }

}