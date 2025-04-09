package yarnwrap.client.render.entity;
public class EntityRenderDispatcher { public net.minecraft.client.render.entity.EntityRenderDispatcher wrapperContained; public EntityRenderDispatcher(net.minecraft.client.render.entity.EntityRenderDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderLayer SHADOW_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.SHADOW_LAYER); }
// public org.joml.Quaternionf rotation() { return wrapperContained.rotation; }
// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public yarnwrap.client.render.entity.model.EntityModelLoader modelLoader() { return new yarnwrap.client.render.entity.model.EntityModelLoader(wrapperContained.modelLoader); }
// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.heldItemRenderer); }
public yarnwrap.entity.Entity targetedEntity() { return new yarnwrap.entity.Entity(wrapperContained.targetedEntity); }
// public boolean renderHitboxes() { return wrapperContained.renderHitboxes; }
// public boolean renderShadows() { return wrapperContained.renderShadows; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
public yarnwrap.client.render.Camera camera() { return new yarnwrap.client.render.Camera(wrapperContained.camera); }
// public java.util.Map modelRenderers() { return wrapperContained.modelRenderers; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
public yarnwrap.client.option.GameOptions gameOptions() { return new yarnwrap.client.option.GameOptions(wrapperContained.gameOptions); }
// public java.util.Map renderers() { return wrapperContained.renderers; }
// public void drawFireVertex(Object entry,yarnwrap.client.render.VertexConsumer vertices,float x,float y,float z,float u,float v) { wrapperContained.drawFireVertex(entry,vertices.wrapperContained,x,y,z,u,v); }
// public void drawShadowVertex(Object entry,yarnwrap.client.render.VertexConsumer vertices,int x,float y,float z,float u,float v) { wrapperContained.drawShadowVertex(entry,vertices.wrapperContained,x,y,z,u,v); }
// public void renderShadowPart(Object entry,yarnwrap.client.render.VertexConsumer vertices,yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,double x,double y,double z,float radius,float opacity) { wrapperContained.renderShadowPart(entry,vertices.wrapperContained,chunk.wrapperContained,world.wrapperContained,pos.wrapperContained,x,y,z,radius,opacity); }
// public void renderFire(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.Entity entity,org.joml.Quaternionf rotation) { wrapperContained.renderFire(matrices.wrapperContained,vertexConsumers.wrapperContained,entity.wrapperContained,rotation); }
// public void renderShadow(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.Entity entity,float opacity,float tickDelta,yarnwrap.world.WorldView world,float radius) { wrapperContained.renderShadow(matrices.wrapperContained,vertexConsumers.wrapperContained,entity.wrapperContained,opacity,tickDelta,world.wrapperContained,radius); }
public double getSquaredDistanceToCamera(yarnwrap.entity.Entity entity) { return wrapperContained.getSquaredDistanceToCamera(entity.wrapperContained); }
public int getLight(yarnwrap.entity.Entity entity,float tickDelta) { return wrapperContained.getLight(entity.wrapperContained,tickDelta); }
public void setRotation(org.joml.Quaternionf rotation) { wrapperContained.setRotation(rotation); }
public org.joml.Quaternionf getRotation() { return wrapperContained.getRotation(); }
public void configure(yarnwrap.world.World world,yarnwrap.client.render.Camera camera,yarnwrap.entity.Entity target) { wrapperContained.configure(world.wrapperContained,camera.wrapperContained,target.wrapperContained); }
public void setWorld(yarnwrap.world.World world) { wrapperContained.setWorld(world.wrapperContained); }
public void setRenderShadows(boolean renderShadows) { wrapperContained.setRenderShadows(renderShadows); }
public boolean shouldRender(yarnwrap.entity.Entity entity,yarnwrap.client.render.Frustum frustum,double x,double y,double z) { return wrapperContained.shouldRender(entity.wrapperContained,frustum.wrapperContained,x,y,z); }
public yarnwrap.client.render.entity.EntityRenderer getRenderer(yarnwrap.entity.Entity entity) { return new yarnwrap.client.render.entity.EntityRenderer(wrapperContained.getRenderer(entity.wrapperContained)); }
public void render(yarnwrap.entity.Entity entity,double x,double y,double z,float yaw,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.render(entity.wrapperContained,x,y,z,yaw,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
public void setRenderHitboxes(boolean renderHitboxes) { wrapperContained.setRenderHitboxes(renderHitboxes); }
// public void renderHitbox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,yarnwrap.entity.Entity entity,float tickDelta,float red,float green,float blue) { wrapperContained.renderHitbox(matrices.wrapperContained,vertices.wrapperContained,entity.wrapperContained,tickDelta,red,green,blue); }
public boolean shouldRenderHitboxes() { return wrapperContained.shouldRenderHitboxes(); }
public double getSquaredDistanceToCamera(double x,double y,double z) { return wrapperContained.getSquaredDistanceToCamera(x,y,z); }
public yarnwrap.client.render.item.HeldItemRenderer getHeldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.getHeldItemRenderer()); }
// public void renderServerSideHitbox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.entity.Entity entity,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.renderServerSideHitbox(matrices.wrapperContained,entity.wrapperContained,vertexConsumers.wrapperContained); }
// public void drawVector(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumers,org.joml.Vector3f offset,yarnwrap.util.math.Vec3d vec,int color) { wrapperContained.drawVector(matrices.wrapperContained,vertexConsumers.wrapperContained,offset,vec.wrapperContained,color); }
// public yarnwrap.entity.Entity getIntegratedServerEntity(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.Entity(wrapperContained.getIntegratedServerEntity(entity.wrapperContained)); }

}