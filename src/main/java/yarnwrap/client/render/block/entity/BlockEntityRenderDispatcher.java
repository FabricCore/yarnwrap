package yarnwrap.client.render.block.entity;
public class BlockEntityRenderDispatcher { public net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher wrapperContained; public BlockEntityRenderDispatcher(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(wrapperContained.entityModelLoader); }
// public void entityModelLoader(yarnwrap.client.render.entity.model.EntityModelLoader value) { wrapperContained.entityModelLoader = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.entityModelLoader); }
// public static void entityModelLoader(yarnwrap.client.render.entity.model.EntityModelLoader value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.entityModelLoader = value.wrapperContained; }

// public java.util.function.Supplier blockRenderManager() { return wrapperContained.blockRenderManager; }
// public void blockRenderManager(java.util.function.Supplier value) { wrapperContained.blockRenderManager = value; }
// public static java.util.function.Supplier blockRenderManager() { return net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.blockRenderManager; }
// public static void blockRenderManager(java.util.function.Supplier value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.blockRenderManager = value; }

// public java.util.function.Supplier itemRenderer() { return wrapperContained.itemRenderer; }
// public void itemRenderer(java.util.function.Supplier value) { wrapperContained.itemRenderer = value; }
// public static java.util.function.Supplier itemRenderer() { return net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.itemRenderer; }
// public static void itemRenderer(java.util.function.Supplier value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.itemRenderer = value; }

// public java.util.function.Supplier entityRenderDispatcher() { return wrapperContained.entityRenderDispatcher; }
// public void entityRenderDispatcher(java.util.function.Supplier value) { wrapperContained.entityRenderDispatcher = value; }
// public static java.util.function.Supplier entityRenderDispatcher() { return net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.entityRenderDispatcher; }
// public static void entityRenderDispatcher(java.util.function.Supplier value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.entityRenderDispatcher = value; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.textRenderer = value.wrapperContained; }

public yarnwrap.client.render.Camera camera() { return new yarnwrap.client.render.Camera(wrapperContained.camera); }
public void camera(yarnwrap.client.render.Camera value) { wrapperContained.camera = value.wrapperContained; }
// public static yarnwrap.client.render.Camera camera() { return new yarnwrap.client.render.Camera(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.camera); }
// public static void camera(yarnwrap.client.render.Camera value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.camera = value.wrapperContained; }

// public java.util.Map renderers() { return wrapperContained.renderers; }
// public void renderers(java.util.Map value) { wrapperContained.renderers = value; }
// public static java.util.Map renderers() { return net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.renderers; }
// public static void renderers(java.util.Map value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.renderers = value; }

public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.world = value.wrapperContained; }

public yarnwrap.util.hit.HitResult crosshairTarget() { return new yarnwrap.util.hit.HitResult(wrapperContained.crosshairTarget); }
public void crosshairTarget(yarnwrap.util.hit.HitResult value) { wrapperContained.crosshairTarget = value.wrapperContained; }
// public static yarnwrap.util.hit.HitResult crosshairTarget() { return new yarnwrap.util.hit.HitResult(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.crosshairTarget); }
// public static void crosshairTarget(yarnwrap.util.hit.HitResult value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.crosshairTarget = value.wrapperContained; }

public BlockEntityRenderDispatcher(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader,java.util.function.Supplier blockRenderManager,java.util.function.Supplier itemRenderer,java.util.function.Supplier entityRenderDispatcher) { this.wrapperContained = new net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher(textRenderer.wrapperContained,entityModelLoader.wrapperContained,blockRenderManager,itemRenderer,entityRenderDispatcher); }
public boolean renderEntity(yarnwrap.block.entity.BlockEntity entity,yarnwrap.client.util.math.MatrixStack matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumerProvider,int light,int overlay) { return wrapperContained.renderEntity(entity.wrapperContained,matrix.wrapperContained,vertexConsumerProvider.wrapperContained,light,overlay); }
// public static boolean renderEntity(yarnwrap.block.entity.BlockEntity entity,yarnwrap.client.util.math.MatrixStack matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumerProvider,int light,int overlay, ) { return net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.renderEntity(entity.wrapperContained,matrix.wrapperContained,vertexConsumerProvider.wrapperContained,light,overlay); }
// public void render(yarnwrap.client.render.block.entity.BlockEntityRenderer renderer,yarnwrap.block.entity.BlockEntity blockEntity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.render(renderer.wrapperContained,blockEntity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public static void render(yarnwrap.client.render.block.entity.BlockEntityRenderer renderer,yarnwrap.block.entity.BlockEntity blockEntity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.render(renderer.wrapperContained,blockEntity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained); }
public void configure(yarnwrap.world.World world,yarnwrap.client.render.Camera camera,yarnwrap.util.hit.HitResult crosshairTarget) { wrapperContained.configure(world.wrapperContained,camera.wrapperContained,crosshairTarget.wrapperContained); }
// public static void configure(yarnwrap.world.World world,yarnwrap.client.render.Camera camera,yarnwrap.util.hit.HitResult crosshairTarget, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.configure(world.wrapperContained,camera.wrapperContained,crosshairTarget.wrapperContained); }
public yarnwrap.client.render.block.entity.BlockEntityRenderer get(yarnwrap.block.entity.BlockEntity blockEntity) { return new yarnwrap.client.render.block.entity.BlockEntityRenderer(wrapperContained.get(blockEntity.wrapperContained)); }
// public static yarnwrap.client.render.block.entity.BlockEntityRenderer get(yarnwrap.block.entity.BlockEntity blockEntity, ) { return new yarnwrap.client.render.block.entity.BlockEntityRenderer(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.get(blockEntity.wrapperContained)); }
public void setWorld(yarnwrap.world.World world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.world.World world, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.setWorld(world.wrapperContained); }
// public void runReported(yarnwrap.block.entity.BlockEntity blockEntity,java.lang.Runnable runnable) { wrapperContained.runReported(blockEntity.wrapperContained,runnable); }
// public static void runReported(yarnwrap.block.entity.BlockEntity blockEntity,java.lang.Runnable runnable, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.runReported(blockEntity.wrapperContained,runnable); }
public void render(yarnwrap.block.entity.BlockEntity blockEntity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.render(blockEntity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public static void render(yarnwrap.block.entity.BlockEntity blockEntity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.render(blockEntity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained); }

}