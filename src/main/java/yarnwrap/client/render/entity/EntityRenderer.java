package yarnwrap.client.render.entity;
public class EntityRenderer { public net.minecraft.client.render.entity.EntityRenderer wrapperContained; public EntityRenderer(net.minecraft.client.render.entity.EntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float shadowOpacity() { return wrapperContained.shadowOpacity; }
// public void shadowOpacity(float value) { wrapperContained.shadowOpacity = value; }
// public static float shadowOpacity() { return net.minecraft.client.render.entity.EntityRenderer.shadowOpacity; }
// public static void shadowOpacity(float value, ) { net.minecraft.client.render.entity.EntityRenderer.shadowOpacity = value; }

// public float shadowRadius() { return wrapperContained.shadowRadius; }
// public void shadowRadius(float value) { wrapperContained.shadowRadius = value; }
// public static float shadowRadius() { return net.minecraft.client.render.entity.EntityRenderer.shadowRadius; }
// public static void shadowRadius(float value, ) { net.minecraft.client.render.entity.EntityRenderer.shadowRadius = value; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.dispatcher); }
// public void dispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.dispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.render.entity.EntityRenderer.dispatcher); }
// public static void dispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value, ) { net.minecraft.client.render.entity.EntityRenderer.dispatcher = value.wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.render.entity.EntityRenderer.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.render.entity.EntityRenderer.textRenderer = value.wrapperContained; }

// public yarnwrap.client.render.entity.state.EntityRenderState state() { return new yarnwrap.client.render.entity.state.EntityRenderState(wrapperContained.state); }
// public void state(yarnwrap.client.render.entity.state.EntityRenderState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.client.render.entity.state.EntityRenderState state() { return new yarnwrap.client.render.entity.state.EntityRenderState(net.minecraft.client.render.entity.EntityRenderer.state); }
// public static void state(yarnwrap.client.render.entity.state.EntityRenderState value, ) { net.minecraft.client.render.entity.EntityRenderer.state = value.wrapperContained; }

// public EntityRenderer(Object context) { this.wrapperContained = new net.minecraft.client.render.entity.EntityRenderer(context); }
// public boolean hasLabel(yarnwrap.entity.Entity entity,double squaredDistanceToCamera) { return wrapperContained.hasLabel(entity.wrapperContained,squaredDistanceToCamera); }
// public static boolean hasLabel(yarnwrap.entity.Entity entity,double squaredDistanceToCamera, ) { return net.minecraft.client.render.entity.EntityRenderer.hasLabel(entity.wrapperContained,squaredDistanceToCamera); }
// public void renderLabelIfPresent(yarnwrap.client.render.entity.state.EntityRenderState state,yarnwrap.text.Text text,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.renderLabelIfPresent(state.wrapperContained,text.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public static void renderLabelIfPresent(yarnwrap.client.render.entity.state.EntityRenderState state,yarnwrap.text.Text text,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light, ) { net.minecraft.client.render.entity.EntityRenderer.renderLabelIfPresent(state.wrapperContained,text.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
public yarnwrap.client.font.TextRenderer getTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.getTextRenderer()); }
// public static yarnwrap.client.font.TextRenderer getTextRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.render.entity.EntityRenderer.getTextRenderer()); }
public boolean shouldRender(yarnwrap.entity.Entity entity,yarnwrap.client.render.Frustum frustum,double x,double y,double z) { return wrapperContained.shouldRender(entity.wrapperContained,frustum.wrapperContained,x,y,z); }
// public static boolean shouldRender(yarnwrap.entity.Entity entity,yarnwrap.client.render.Frustum frustum,double x,double y,double z, ) { return net.minecraft.client.render.entity.EntityRenderer.shouldRender(entity.wrapperContained,frustum.wrapperContained,x,y,z); }
public void render(yarnwrap.client.render.entity.state.EntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.render(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public static void render(yarnwrap.client.render.entity.state.EntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light, ) { net.minecraft.client.render.entity.EntityRenderer.render(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
public yarnwrap.util.math.Vec3d getPositionOffset(yarnwrap.client.render.entity.state.EntityRenderState state) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPositionOffset(state.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getPositionOffset(yarnwrap.client.render.entity.state.EntityRenderState state, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.EntityRenderer.getPositionOffset(state.wrapperContained)); }
// public int getBlockLight(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getBlockLight(entity.wrapperContained,pos.wrapperContained); }
// public static int getBlockLight(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.entity.EntityRenderer.getBlockLight(entity.wrapperContained,pos.wrapperContained); }
public int getLight(yarnwrap.entity.Entity entity,float tickProgress) { return wrapperContained.getLight(entity.wrapperContained,tickProgress); }
// public static int getLight(yarnwrap.entity.Entity entity,float tickProgress, ) { return net.minecraft.client.render.entity.EntityRenderer.getLight(entity.wrapperContained,tickProgress); }
// public int getSkyLight(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getSkyLight(entity.wrapperContained,pos.wrapperContained); }
// public static int getSkyLight(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.entity.EntityRenderer.getSkyLight(entity.wrapperContained,pos.wrapperContained); }
public yarnwrap.client.render.entity.state.EntityRenderState createRenderState() { return new yarnwrap.client.render.entity.state.EntityRenderState(wrapperContained.createRenderState()); }
// public static yarnwrap.client.render.entity.state.EntityRenderState createRenderState() { return new yarnwrap.client.render.entity.state.EntityRenderState(net.minecraft.client.render.entity.EntityRenderer.createRenderState()); }
// public float getShadowRadius(yarnwrap.client.render.entity.state.EntityRenderState state) { return wrapperContained.getShadowRadius(state.wrapperContained); }
// public static float getShadowRadius(yarnwrap.client.render.entity.state.EntityRenderState state, ) { return net.minecraft.client.render.entity.EntityRenderer.getShadowRadius(state.wrapperContained); }
// public void renderLeash(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object leashData) { wrapperContained.renderLeash(matrices.wrapperContained,vertexConsumers.wrapperContained,leashData); }
// public static void renderLeash(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object leashData, ) { net.minecraft.client.render.entity.EntityRenderer.renderLeash(matrices.wrapperContained,vertexConsumers.wrapperContained,leashData); }
// public void renderLeashSegment(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f matrix,float leashedEntityX,float leashedEntityY,float leashedEntityZ,float segment,float leashData) { wrapperContained.renderLeashSegment(vertexConsumer.wrapperContained,matrix,leashedEntityX,leashedEntityY,leashedEntityZ,segment,leashData); }
// public static void renderLeashSegment(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f matrix,float leashedEntityX,float leashedEntityY,float leashedEntityZ,float segment,float leashData, ) { net.minecraft.client.render.entity.EntityRenderer.renderLeashSegment(vertexConsumer.wrapperContained,matrix,leashedEntityX,leashedEntityY,leashedEntityZ,segment,leashData); }
public void updateRenderState(yarnwrap.entity.Entity entity,yarnwrap.client.render.entity.state.EntityRenderState state,float tickProgress) { wrapperContained.updateRenderState(entity.wrapperContained,state.wrapperContained,tickProgress); }
// public static void updateRenderState(yarnwrap.entity.Entity entity,yarnwrap.client.render.entity.state.EntityRenderState state,float tickProgress, ) { net.minecraft.client.render.entity.EntityRenderer.updateRenderState(entity.wrapperContained,state.wrapperContained,tickProgress); }
// public yarnwrap.util.math.Box getBoundingBox(yarnwrap.entity.Entity entity) { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox(entity.wrapperContained)); }
// public static yarnwrap.util.math.Box getBoundingBox(yarnwrap.entity.Entity entity, ) { return new yarnwrap.util.math.Box(net.minecraft.client.render.entity.EntityRenderer.getBoundingBox(entity.wrapperContained)); }
// public boolean canBeCulled(yarnwrap.entity.Entity entity) { return wrapperContained.canBeCulled(entity.wrapperContained); }
// public static boolean canBeCulled(yarnwrap.entity.Entity entity, ) { return net.minecraft.client.render.entity.EntityRenderer.canBeCulled(entity.wrapperContained); }
public yarnwrap.client.render.entity.state.EntityRenderState getAndUpdateRenderState(yarnwrap.entity.Entity entity,float tickProgress) { return new yarnwrap.client.render.entity.state.EntityRenderState(wrapperContained.getAndUpdateRenderState(entity.wrapperContained,tickProgress)); }
// public static yarnwrap.client.render.entity.state.EntityRenderState getAndUpdateRenderState(yarnwrap.entity.Entity entity,float tickProgress, ) { return new yarnwrap.client.render.entity.state.EntityRenderState(net.minecraft.client.render.entity.EntityRenderer.getAndUpdateRenderState(entity.wrapperContained,tickProgress)); }
// public yarnwrap.text.Text getDisplayName(yarnwrap.entity.Entity entity) { return new yarnwrap.text.Text(wrapperContained.getDisplayName(entity.wrapperContained)); }
// public static yarnwrap.text.Text getDisplayName(yarnwrap.entity.Entity entity, ) { return new yarnwrap.text.Text(net.minecraft.client.render.entity.EntityRenderer.getDisplayName(entity.wrapperContained)); }
// public float getShadowOpacity(yarnwrap.client.render.entity.state.EntityRenderState state) { return wrapperContained.getShadowOpacity(state.wrapperContained); }
// public static float getShadowOpacity(yarnwrap.client.render.entity.state.EntityRenderState state, ) { return net.minecraft.client.render.entity.EntityRenderer.getShadowOpacity(state.wrapperContained); }
// public void appendHitboxes(yarnwrap.entity.Entity entity,Object builder,float tickProgress) { wrapperContained.appendHitboxes(entity.wrapperContained,builder,tickProgress); }
// public static void appendHitboxes(yarnwrap.entity.Entity entity,Object builder,float tickProgress, ) { net.minecraft.client.render.entity.EntityRenderer.appendHitboxes(entity.wrapperContained,builder,tickProgress); }
// public yarnwrap.client.render.entity.state.EntityHitboxAndView createHitbox(yarnwrap.entity.Entity entity,float tickProgress,boolean green) { return new yarnwrap.client.render.entity.state.EntityHitboxAndView(wrapperContained.createHitbox(entity.wrapperContained,tickProgress,green)); }
// public static yarnwrap.client.render.entity.state.EntityHitboxAndView createHitbox(yarnwrap.entity.Entity entity,float tickProgress,boolean green, ) { return new yarnwrap.client.render.entity.state.EntityHitboxAndView(net.minecraft.client.render.entity.EntityRenderer.createHitbox(entity.wrapperContained,tickProgress,green)); }
// public void updateDebugState(yarnwrap.entity.Entity entity,yarnwrap.client.render.entity.state.EntityRenderState state,float tickProgress) { wrapperContained.updateDebugState(entity.wrapperContained,state.wrapperContained,tickProgress); }
// public static void updateDebugState(yarnwrap.entity.Entity entity,yarnwrap.client.render.entity.state.EntityRenderState state,float tickProgress, ) { net.minecraft.client.render.entity.EntityRenderer.updateDebugState(entity.wrapperContained,state.wrapperContained,tickProgress); }
// public yarnwrap.entity.Entity getServerEntity(yarnwrap.entity.Entity clientEntity) { return new yarnwrap.entity.Entity(wrapperContained.getServerEntity(clientEntity.wrapperContained)); }
// public static yarnwrap.entity.Entity getServerEntity(yarnwrap.entity.Entity clientEntity, ) { return new yarnwrap.entity.Entity(net.minecraft.client.render.entity.EntityRenderer.getServerEntity(clientEntity.wrapperContained)); }

}