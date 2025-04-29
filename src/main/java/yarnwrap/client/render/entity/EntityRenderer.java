package yarnwrap.client.render.entity;
public class EntityRenderer { public net.minecraft.client.render.entity.EntityRenderer wrapperContained; public EntityRenderer(net.minecraft.client.render.entity.EntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.render.entity.EntityRenderer.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.render.entity.EntityRenderer.textRenderer = value.wrapperContained; }

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

// public EntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.entity.EntityRenderer(ctx); }
public yarnwrap.util.math.Vec3d getPositionOffset(yarnwrap.entity.Entity entity,float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPositionOffset(entity.wrapperContained,tickDelta)); }
// public static yarnwrap.util.math.Vec3d getPositionOffset(yarnwrap.entity.Entity entity,float tickDelta, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.EntityRenderer.getPositionOffset(entity.wrapperContained,tickDelta)); }
// public int getBlockLight(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getBlockLight(entity.wrapperContained,pos.wrapperContained); }
// public static int getBlockLight(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.entity.EntityRenderer.getBlockLight(entity.wrapperContained,pos.wrapperContained); }
public int getLight(yarnwrap.entity.Entity entity,float tickDelta) { return wrapperContained.getLight(entity.wrapperContained,tickDelta); }
// public static int getLight(yarnwrap.entity.Entity entity,float tickDelta, ) { return net.minecraft.client.render.entity.EntityRenderer.getLight(entity.wrapperContained,tickDelta); }
// public int getSkyLight(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getSkyLight(entity.wrapperContained,pos.wrapperContained); }
// public static int getSkyLight(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.entity.EntityRenderer.getSkyLight(entity.wrapperContained,pos.wrapperContained); }
// public boolean hasLabel(yarnwrap.entity.Entity entity) { return wrapperContained.hasLabel(entity.wrapperContained); }
// public static boolean hasLabel(yarnwrap.entity.Entity entity, ) { return net.minecraft.client.render.entity.EntityRenderer.hasLabel(entity.wrapperContained); }
// public void renderLabelIfPresent(yarnwrap.entity.Entity entity,yarnwrap.text.Text text,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,float tickDelta) { wrapperContained.renderLabelIfPresent(entity.wrapperContained,text.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,tickDelta); }
// public static void renderLabelIfPresent(yarnwrap.entity.Entity entity,yarnwrap.text.Text text,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,float tickDelta, ) { net.minecraft.client.render.entity.EntityRenderer.renderLabelIfPresent(entity.wrapperContained,text.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,tickDelta); }
public yarnwrap.util.Identifier getTexture(yarnwrap.entity.Entity entity) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(entity.wrapperContained)); }
// public static yarnwrap.util.Identifier getTexture(yarnwrap.entity.Entity entity, ) { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.EntityRenderer.getTexture(entity.wrapperContained)); }
public yarnwrap.client.font.TextRenderer getTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.getTextRenderer()); }
// public static yarnwrap.client.font.TextRenderer getTextRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.render.entity.EntityRenderer.getTextRenderer()); }
public boolean shouldRender(yarnwrap.entity.Entity entity,yarnwrap.client.render.Frustum frustum,double x,double y,double z) { return wrapperContained.shouldRender(entity.wrapperContained,frustum.wrapperContained,x,y,z); }
// public static boolean shouldRender(yarnwrap.entity.Entity entity,yarnwrap.client.render.Frustum frustum,double x,double y,double z, ) { return net.minecraft.client.render.entity.EntityRenderer.shouldRender(entity.wrapperContained,frustum.wrapperContained,x,y,z); }
public void render(yarnwrap.entity.Entity entity,float yaw,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.render(entity.wrapperContained,yaw,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public static void render(yarnwrap.entity.Entity entity,float yaw,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light, ) { net.minecraft.client.render.entity.EntityRenderer.render(entity.wrapperContained,yaw,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public float getShadowRadius(yarnwrap.entity.Entity entity) { return wrapperContained.getShadowRadius(entity.wrapperContained); }
// public static float getShadowRadius(yarnwrap.entity.Entity entity, ) { return net.minecraft.client.render.entity.EntityRenderer.getShadowRadius(entity.wrapperContained); }
// public void renderLeash(yarnwrap.entity.Entity entity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.Entity leashHolder) { wrapperContained.renderLeash(entity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,leashHolder.wrapperContained); }
// public static void renderLeash(yarnwrap.entity.Entity entity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.Entity leashHolder, ) { net.minecraft.client.render.entity.EntityRenderer.renderLeash(entity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,leashHolder.wrapperContained); }
// public void renderLeashSegment(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f matrix,float leashedEntityX,float leashedEntityY,float leashedEntityZ,int leashedEntityBlockLight,int leashHolderBlockLight,int leashedEntitySkyLight,int leashHolderSkyLight,float segmentIndex,float isLeashKnot) { wrapperContained.renderLeashSegment(vertexConsumer.wrapperContained,matrix,leashedEntityX,leashedEntityY,leashedEntityZ,leashedEntityBlockLight,leashHolderBlockLight,leashedEntitySkyLight,leashHolderSkyLight,segmentIndex,isLeashKnot); }
// public static void renderLeashSegment(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f matrix,float leashedEntityX,float leashedEntityY,float leashedEntityZ,int leashedEntityBlockLight,int leashHolderBlockLight,int leashedEntitySkyLight,int leashHolderSkyLight,float segmentIndex,float isLeashKnot, ) { net.minecraft.client.render.entity.EntityRenderer.renderLeashSegment(vertexConsumer.wrapperContained,matrix,leashedEntityX,leashedEntityY,leashedEntityZ,leashedEntityBlockLight,leashHolderBlockLight,leashedEntitySkyLight,leashHolderSkyLight,segmentIndex,isLeashKnot); }

}