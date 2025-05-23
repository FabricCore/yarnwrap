package yarnwrap.client.render.block.entity;
public class BlockEntityRenderDispatcher { public net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher wrapperContained; public BlockEntityRenderDispatcher(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

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

// public java.util.function.Supplier entityModelsGetter() { return wrapperContained.entityModelsGetter; }
// public void entityModelsGetter(java.util.function.Supplier value) { wrapperContained.entityModelsGetter = value; }
// public static java.util.function.Supplier entityModelsGetter() { return net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.entityModelsGetter; }
// public static void entityModelsGetter(java.util.function.Supplier value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.entityModelsGetter = value; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }
// public static yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.blockRenderManager); }
// public static void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.blockRenderManager = value.wrapperContained; }

// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.itemRenderer); }
// public static void itemRenderer(yarnwrap.client.render.item.ItemRenderer value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.itemRenderer = value.wrapperContained; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.entityRenderDispatcher); }
// public void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.entityRenderDispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.entityRenderDispatcher); }
// public static void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.entityRenderDispatcher = value.wrapperContained; }

// public yarnwrap.client.item.ItemModelManager itemModelManager() { return new yarnwrap.client.item.ItemModelManager(wrapperContained.itemModelManager); }
// public void itemModelManager(yarnwrap.client.item.ItemModelManager value) { wrapperContained.itemModelManager = value.wrapperContained; }
// public static yarnwrap.client.item.ItemModelManager itemModelManager() { return new yarnwrap.client.item.ItemModelManager(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.itemModelManager); }
// public static void itemModelManager(yarnwrap.client.item.ItemModelManager value, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.itemModelManager = value.wrapperContained; }

public BlockEntityRenderDispatcher(yarnwrap.client.font.TextRenderer textRenderer,java.util.function.Supplier entityModelsGetter,yarnwrap.client.render.block.BlockRenderManager blockRenderManager,yarnwrap.client.item.ItemModelManager itemModelManager,yarnwrap.client.render.item.ItemRenderer itemRenderer,yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher) { this.wrapperContained = new net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher(textRenderer.wrapperContained,entityModelsGetter,blockRenderManager.wrapperContained,itemModelManager.wrapperContained,itemRenderer.wrapperContained,entityRenderDispatcher.wrapperContained); }
public void configure(yarnwrap.world.World world,yarnwrap.client.render.Camera camera,yarnwrap.util.hit.HitResult crosshairTarget) { wrapperContained.configure(world.wrapperContained,camera.wrapperContained,crosshairTarget.wrapperContained); }
// public static void configure(yarnwrap.world.World world,yarnwrap.client.render.Camera camera,yarnwrap.util.hit.HitResult crosshairTarget, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.configure(world.wrapperContained,camera.wrapperContained,crosshairTarget.wrapperContained); }
public yarnwrap.client.render.block.entity.BlockEntityRenderer get(yarnwrap.block.entity.BlockEntity blockEntity) { return new yarnwrap.client.render.block.entity.BlockEntityRenderer(wrapperContained.get(blockEntity.wrapperContained)); }
// public static yarnwrap.client.render.block.entity.BlockEntityRenderer get(yarnwrap.block.entity.BlockEntity blockEntity, ) { return new yarnwrap.client.render.block.entity.BlockEntityRenderer(net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.get(blockEntity.wrapperContained)); }
public void setWorld(yarnwrap.world.World world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.world.World world, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.setWorld(world.wrapperContained); }
public void render(yarnwrap.block.entity.BlockEntity blockEntity,float tickProgress,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.render(blockEntity.wrapperContained,tickProgress,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public static void render(yarnwrap.block.entity.BlockEntity blockEntity,float tickProgress,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.render(blockEntity.wrapperContained,tickProgress,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public void render(yarnwrap.client.render.block.entity.BlockEntityRenderer renderer,yarnwrap.block.entity.BlockEntity blockEntity,float tickProgress,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Vec3d cameraPos) { wrapperContained.render(renderer.wrapperContained,blockEntity.wrapperContained,tickProgress,matrices.wrapperContained,vertexConsumers.wrapperContained,cameraPos.wrapperContained); }
// public static void render(yarnwrap.client.render.block.entity.BlockEntityRenderer renderer,yarnwrap.block.entity.BlockEntity blockEntity,float tickProgress,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Vec3d cameraPos, ) { net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher.render(renderer.wrapperContained,blockEntity.wrapperContained,tickProgress,matrices.wrapperContained,vertexConsumers.wrapperContained,cameraPos.wrapperContained); }

}