package yarnwrap.client.render.block.entity;
public class BlockEntityRenderDispatcher { public net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher wrapperContained; public BlockEntityRenderDispatcher(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(wrapperContained.entityModelLoader); }
// public void entityModelLoader(yarnwrap.client.render.entity.model.EntityModelLoader value) { wrapperContained.entityModelLoader = value.wrapperContained; }
// public java.util.function.Supplier blockRenderManager() { return wrapperContained.blockRenderManager; }
// public void blockRenderManager(java.util.function.Supplier value) { wrapperContained.blockRenderManager = value; }
// public java.util.function.Supplier itemRenderer() { return wrapperContained.itemRenderer; }
// public void itemRenderer(java.util.function.Supplier value) { wrapperContained.itemRenderer = value; }
// public java.util.function.Supplier entityRenderDispatcher() { return wrapperContained.entityRenderDispatcher; }
// public void entityRenderDispatcher(java.util.function.Supplier value) { wrapperContained.entityRenderDispatcher = value; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
public yarnwrap.client.render.Camera camera() { return new yarnwrap.client.render.Camera(wrapperContained.camera); }
public void camera(yarnwrap.client.render.Camera value) { wrapperContained.camera = value.wrapperContained; }
// public java.util.Map renderers() { return wrapperContained.renderers; }
// public void renderers(java.util.Map value) { wrapperContained.renderers = value; }
public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
public yarnwrap.util.hit.HitResult crosshairTarget() { return new yarnwrap.util.hit.HitResult(wrapperContained.crosshairTarget); }
public void crosshairTarget(yarnwrap.util.hit.HitResult value) { wrapperContained.crosshairTarget = value.wrapperContained; }
public boolean renderEntity(yarnwrap.block.entity.BlockEntity entity,yarnwrap.client.util.math.MatrixStack matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumerProvider,int light,int overlay) { return wrapperContained.renderEntity(entity.wrapperContained,matrix.wrapperContained,vertexConsumerProvider.wrapperContained,light,overlay); }
// public void render(yarnwrap.client.render.block.entity.BlockEntityRenderer renderer,yarnwrap.block.entity.BlockEntity blockEntity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.render(renderer.wrapperContained,blockEntity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained); }
public void configure(yarnwrap.world.World world,yarnwrap.client.render.Camera camera,yarnwrap.util.hit.HitResult crosshairTarget) { wrapperContained.configure(world.wrapperContained,camera.wrapperContained,crosshairTarget.wrapperContained); }
public yarnwrap.client.render.block.entity.BlockEntityRenderer get(yarnwrap.block.entity.BlockEntity blockEntity) { return new yarnwrap.client.render.block.entity.BlockEntityRenderer(wrapperContained.get(blockEntity.wrapperContained)); }
public void setWorld(yarnwrap.world.World world) { wrapperContained.setWorld(world.wrapperContained); }
// public void runReported(yarnwrap.block.entity.BlockEntity blockEntity,java.lang.Runnable runnable) { wrapperContained.runReported(blockEntity.wrapperContained,runnable); }
public void render(yarnwrap.block.entity.BlockEntity blockEntity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.render(blockEntity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained); }

}