package yarnwrap.client.render.entity;
public class EntityRenderDispatcher { public net.minecraft.client.render.entity.EntityRenderDispatcher wrapperContained; public EntityRenderDispatcher(net.minecraft.client.render.entity.EntityRenderDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderLayer SHADOW_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.SHADOW_LAYER); }
// public void SHADOW_LAYER(yarnwrap.client.render.RenderLayer value) { wrapperContained.SHADOW_LAYER = value.wrapperContained; }
// public static yarnwrap.client.render.RenderLayer SHADOW_LAYER() { return new yarnwrap.client.render.RenderLayer(net.minecraft.client.render.entity.EntityRenderDispatcher.SHADOW_LAYER); }
// public static void SHADOW_LAYER(yarnwrap.client.render.RenderLayer value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.SHADOW_LAYER = value.wrapperContained; }

// public org.joml.Quaternionf rotation() { return wrapperContained.rotation; }
// public void rotation(org.joml.Quaternionf value) { wrapperContained.rotation = value; }
// public static org.joml.Quaternionf rotation() { return net.minecraft.client.render.entity.EntityRenderDispatcher.rotation; }
// public static void rotation(org.joml.Quaternionf value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.rotation = value; }

// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(net.minecraft.client.render.entity.EntityRenderDispatcher.itemRenderer); }
// public static void itemRenderer(yarnwrap.client.render.item.ItemRenderer value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.itemRenderer = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModelLoader modelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(wrapperContained.modelLoader); }
// public void modelLoader(yarnwrap.client.render.entity.model.EntityModelLoader value) { wrapperContained.modelLoader = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModelLoader modelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(net.minecraft.client.render.entity.EntityRenderDispatcher.modelLoader); }
// public static void modelLoader(yarnwrap.client.render.entity.model.EntityModelLoader value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.modelLoader = value.wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.blockRenderManager = value.wrapperContained; }
// public static yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(net.minecraft.client.render.entity.EntityRenderDispatcher.blockRenderManager); }
// public static void blockRenderManager(yarnwrap.client.render.block.BlockRenderManager value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.blockRenderManager = value.wrapperContained; }

// public yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.heldItemRenderer); }
// public void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value) { wrapperContained.heldItemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(net.minecraft.client.render.entity.EntityRenderDispatcher.heldItemRenderer); }
// public static void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.heldItemRenderer = value.wrapperContained; }

public yarnwrap.entity.Entity targetedEntity() { return new yarnwrap.entity.Entity(wrapperContained.targetedEntity); }
public void targetedEntity(yarnwrap.entity.Entity value) { wrapperContained.targetedEntity = value.wrapperContained; }
// public static yarnwrap.entity.Entity targetedEntity() { return new yarnwrap.entity.Entity(net.minecraft.client.render.entity.EntityRenderDispatcher.targetedEntity); }
// public static void targetedEntity(yarnwrap.entity.Entity value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.targetedEntity = value.wrapperContained; }

// public boolean renderHitboxes() { return wrapperContained.renderHitboxes; }
// public void renderHitboxes(boolean value) { wrapperContained.renderHitboxes = value; }
// public static boolean renderHitboxes() { return net.minecraft.client.render.entity.EntityRenderDispatcher.renderHitboxes; }
// public static void renderHitboxes(boolean value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.renderHitboxes = value; }

// public boolean renderShadows() { return wrapperContained.renderShadows; }
// public void renderShadows(boolean value) { wrapperContained.renderShadows = value; }
// public static boolean renderShadows() { return net.minecraft.client.render.entity.EntityRenderDispatcher.renderShadows; }
// public static void renderShadows(boolean value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.renderShadows = value; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.client.render.entity.EntityRenderDispatcher.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.world = value.wrapperContained; }

public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public static yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(net.minecraft.client.render.entity.EntityRenderDispatcher.textureManager); }
// public static void textureManager(yarnwrap.client.texture.TextureManager value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.textureManager = value.wrapperContained; }

public yarnwrap.client.render.Camera camera() { return new yarnwrap.client.render.Camera(wrapperContained.camera); }
public void camera(yarnwrap.client.render.Camera value) { wrapperContained.camera = value.wrapperContained; }
// public static yarnwrap.client.render.Camera camera() { return new yarnwrap.client.render.Camera(net.minecraft.client.render.entity.EntityRenderDispatcher.camera); }
// public static void camera(yarnwrap.client.render.Camera value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.camera = value.wrapperContained; }

// public java.util.Map modelRenderers() { return wrapperContained.modelRenderers; }
// public void modelRenderers(java.util.Map value) { wrapperContained.modelRenderers = value; }
// public static java.util.Map modelRenderers() { return net.minecraft.client.render.entity.EntityRenderDispatcher.modelRenderers; }
// public static void modelRenderers(java.util.Map value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.modelRenderers = value; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.render.entity.EntityRenderDispatcher.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.textRenderer = value.wrapperContained; }

public yarnwrap.client.option.GameOptions gameOptions() { return new yarnwrap.client.option.GameOptions(wrapperContained.gameOptions); }
// public void gameOptions(yarnwrap.client.option.GameOptions value) { wrapperContained.gameOptions = value.wrapperContained; }
// public static yarnwrap.client.option.GameOptions gameOptions() { return new yarnwrap.client.option.GameOptions(net.minecraft.client.render.entity.EntityRenderDispatcher.gameOptions); }
// public static void gameOptions(yarnwrap.client.option.GameOptions value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.gameOptions = value.wrapperContained; }

// public java.util.Map renderers() { return wrapperContained.renderers; }
// public void renderers(java.util.Map value) { wrapperContained.renderers = value; }
// public static java.util.Map renderers() { return net.minecraft.client.render.entity.EntityRenderDispatcher.renderers; }
// public static void renderers(java.util.Map value, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.renderers = value; }

public EntityRenderDispatcher(yarnwrap.client.MinecraftClient client,yarnwrap.client.texture.TextureManager textureManager,yarnwrap.client.render.item.ItemRenderer itemRenderer,yarnwrap.client.render.block.BlockRenderManager blockRenderManager,yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.client.option.GameOptions gameOptions,yarnwrap.client.render.entity.model.EntityModelLoader modelLoader) { this.wrapperContained = new net.minecraft.client.render.entity.EntityRenderDispatcher(client.wrapperContained,textureManager.wrapperContained,itemRenderer.wrapperContained,blockRenderManager.wrapperContained,textRenderer.wrapperContained,gameOptions.wrapperContained,modelLoader.wrapperContained); }
// public void drawFireVertex(Object entry,yarnwrap.client.render.VertexConsumer vertices,float x,float y,float z,float u,float v) { wrapperContained.drawFireVertex(entry,vertices.wrapperContained,x,y,z,u,v); }
// public static void drawFireVertex(Object entry,yarnwrap.client.render.VertexConsumer vertices,float x,float y,float z,float u,float v, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.drawFireVertex(entry,vertices.wrapperContained,x,y,z,u,v); }
// public void drawShadowVertex(Object entry,yarnwrap.client.render.VertexConsumer vertices,int x,float y,float z,float u,float v) { wrapperContained.drawShadowVertex(entry,vertices.wrapperContained,x,y,z,u,v); }
// public static void drawShadowVertex(Object entry,yarnwrap.client.render.VertexConsumer vertices,int x,float y,float z,float u,float v, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.drawShadowVertex(entry,vertices.wrapperContained,x,y,z,u,v); }
// public void renderShadowPart(Object entry,yarnwrap.client.render.VertexConsumer vertices,yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,double x,double y,double z,float radius,float opacity) { wrapperContained.renderShadowPart(entry,vertices.wrapperContained,chunk.wrapperContained,world.wrapperContained,pos.wrapperContained,x,y,z,radius,opacity); }
// public static void renderShadowPart(Object entry,yarnwrap.client.render.VertexConsumer vertices,yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,double x,double y,double z,float radius,float opacity, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.renderShadowPart(entry,vertices.wrapperContained,chunk.wrapperContained,world.wrapperContained,pos.wrapperContained,x,y,z,radius,opacity); }
// public void renderFire(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.Entity entity,org.joml.Quaternionf rotation) { wrapperContained.renderFire(matrices.wrapperContained,vertexConsumers.wrapperContained,entity.wrapperContained,rotation); }
// public static void renderFire(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.Entity entity,org.joml.Quaternionf rotation, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.renderFire(matrices.wrapperContained,vertexConsumers.wrapperContained,entity.wrapperContained,rotation); }
// public void renderShadow(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.Entity entity,float opacity,float tickDelta,yarnwrap.world.WorldView world,float radius) { wrapperContained.renderShadow(matrices.wrapperContained,vertexConsumers.wrapperContained,entity.wrapperContained,opacity,tickDelta,world.wrapperContained,radius); }
// public static void renderShadow(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.Entity entity,float opacity,float tickDelta,yarnwrap.world.WorldView world,float radius, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.renderShadow(matrices.wrapperContained,vertexConsumers.wrapperContained,entity.wrapperContained,opacity,tickDelta,world.wrapperContained,radius); }
public double getSquaredDistanceToCamera(yarnwrap.entity.Entity entity) { return wrapperContained.getSquaredDistanceToCamera(entity.wrapperContained); }
// public static double getSquaredDistanceToCamera(yarnwrap.entity.Entity entity, ) { return net.minecraft.client.render.entity.EntityRenderDispatcher.getSquaredDistanceToCamera(entity.wrapperContained); }
public int getLight(yarnwrap.entity.Entity entity,float tickDelta) { return wrapperContained.getLight(entity.wrapperContained,tickDelta); }
// public static int getLight(yarnwrap.entity.Entity entity,float tickDelta, ) { return net.minecraft.client.render.entity.EntityRenderDispatcher.getLight(entity.wrapperContained,tickDelta); }
public void setRotation(org.joml.Quaternionf rotation) { wrapperContained.setRotation(rotation); }
// public static void setRotation(org.joml.Quaternionf rotation, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.setRotation(rotation); }
public org.joml.Quaternionf getRotation() { return wrapperContained.getRotation(); }
// public static org.joml.Quaternionf getRotation() { return net.minecraft.client.render.entity.EntityRenderDispatcher.getRotation(); }
public void configure(yarnwrap.world.World world,yarnwrap.client.render.Camera camera,yarnwrap.entity.Entity target) { wrapperContained.configure(world.wrapperContained,camera.wrapperContained,target.wrapperContained); }
// public static void configure(yarnwrap.world.World world,yarnwrap.client.render.Camera camera,yarnwrap.entity.Entity target, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.configure(world.wrapperContained,camera.wrapperContained,target.wrapperContained); }
public void setWorld(yarnwrap.world.World world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.world.World world, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.setWorld(world.wrapperContained); }
public void setRenderShadows(boolean renderShadows) { wrapperContained.setRenderShadows(renderShadows); }
// public static void setRenderShadows(boolean renderShadows, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.setRenderShadows(renderShadows); }
public boolean shouldRender(yarnwrap.entity.Entity entity,yarnwrap.client.render.Frustum frustum,double x,double y,double z) { return wrapperContained.shouldRender(entity.wrapperContained,frustum.wrapperContained,x,y,z); }
// public static boolean shouldRender(yarnwrap.entity.Entity entity,yarnwrap.client.render.Frustum frustum,double x,double y,double z, ) { return net.minecraft.client.render.entity.EntityRenderDispatcher.shouldRender(entity.wrapperContained,frustum.wrapperContained,x,y,z); }
public yarnwrap.client.render.entity.EntityRenderer getRenderer(yarnwrap.entity.Entity entity) { return new yarnwrap.client.render.entity.EntityRenderer(wrapperContained.getRenderer(entity.wrapperContained)); }
// public static yarnwrap.client.render.entity.EntityRenderer getRenderer(yarnwrap.entity.Entity entity, ) { return new yarnwrap.client.render.entity.EntityRenderer(net.minecraft.client.render.entity.EntityRenderDispatcher.getRenderer(entity.wrapperContained)); }
public void render(yarnwrap.entity.Entity entity,double x,double y,double z,float yaw,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.render(entity.wrapperContained,x,y,z,yaw,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public static void render(yarnwrap.entity.Entity entity,double x,double y,double z,float yaw,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.render(entity.wrapperContained,x,y,z,yaw,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
public void setRenderHitboxes(boolean renderHitboxes) { wrapperContained.setRenderHitboxes(renderHitboxes); }
// public static void setRenderHitboxes(boolean renderHitboxes, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.setRenderHitboxes(renderHitboxes); }
// public void renderHitbox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,yarnwrap.entity.Entity entity,float tickDelta,float red,float green,float blue) { wrapperContained.renderHitbox(matrices.wrapperContained,vertices.wrapperContained,entity.wrapperContained,tickDelta,red,green,blue); }
// public static void renderHitbox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,yarnwrap.entity.Entity entity,float tickDelta,float red,float green,float blue, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.renderHitbox(matrices.wrapperContained,vertices.wrapperContained,entity.wrapperContained,tickDelta,red,green,blue); }
public boolean shouldRenderHitboxes() { return wrapperContained.shouldRenderHitboxes(); }
// public static boolean shouldRenderHitboxes() { return net.minecraft.client.render.entity.EntityRenderDispatcher.shouldRenderHitboxes(); }
public double getSquaredDistanceToCamera(double x,double y,double z) { return wrapperContained.getSquaredDistanceToCamera(x,y,z); }
// public static double getSquaredDistanceToCamera(double x,double y,double z, ) { return net.minecraft.client.render.entity.EntityRenderDispatcher.getSquaredDistanceToCamera(x,y,z); }
public yarnwrap.client.render.item.HeldItemRenderer getHeldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.getHeldItemRenderer()); }
// public static yarnwrap.client.render.item.HeldItemRenderer getHeldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(net.minecraft.client.render.entity.EntityRenderDispatcher.getHeldItemRenderer()); }
// public void renderServerSideHitbox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.entity.Entity entity,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.renderServerSideHitbox(matrices.wrapperContained,entity.wrapperContained,vertexConsumers.wrapperContained); }
// public static void renderServerSideHitbox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.entity.Entity entity,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.renderServerSideHitbox(matrices.wrapperContained,entity.wrapperContained,vertexConsumers.wrapperContained); }
// public void drawVector(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumers,org.joml.Vector3f offset,yarnwrap.util.math.Vec3d vec,int color) { wrapperContained.drawVector(matrices.wrapperContained,vertexConsumers.wrapperContained,offset,vec.wrapperContained,color); }
// public static void drawVector(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumers,org.joml.Vector3f offset,yarnwrap.util.math.Vec3d vec,int color, ) { net.minecraft.client.render.entity.EntityRenderDispatcher.drawVector(matrices.wrapperContained,vertexConsumers.wrapperContained,offset,vec.wrapperContained,color); }
// public yarnwrap.entity.Entity getIntegratedServerEntity(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.Entity(wrapperContained.getIntegratedServerEntity(entity.wrapperContained)); }
// public static yarnwrap.entity.Entity getIntegratedServerEntity(yarnwrap.entity.Entity entity, ) { return new yarnwrap.entity.Entity(net.minecraft.client.render.entity.EntityRenderDispatcher.getIntegratedServerEntity(entity.wrapperContained)); }

}