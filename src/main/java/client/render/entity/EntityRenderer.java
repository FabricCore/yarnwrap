package yarnwrap.client.render.entity;
public class EntityRenderer { public net.minecraft.client.render.entity.EntityRenderer wrapperContained; public EntityRenderer(net.minecraft.client.render.entity.EntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public float shadowOpacity() { return wrapperContained.shadowOpacity; }
// public float shadowRadius() { return wrapperContained.shadowRadius; }
// public yarnwrap.client.render.entity.EntityRenderDispatcher dispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.dispatcher); }
public yarnwrap.util.math.Vec3d getPositionOffset(yarnwrap.entity.Entity entity,float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPositionOffset(entity.wrapperContained,tickDelta)); }
// public int getBlockLight(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getBlockLight(entity.wrapperContained,pos.wrapperContained); }
public int getLight(yarnwrap.entity.Entity entity,float tickDelta) { return wrapperContained.getLight(entity.wrapperContained,tickDelta); }
// public int getSkyLight(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getSkyLight(entity.wrapperContained,pos.wrapperContained); }
// public boolean hasLabel(yarnwrap.entity.Entity entity) { return wrapperContained.hasLabel(entity.wrapperContained); }
// public void renderLabelIfPresent(yarnwrap.entity.Entity entity,yarnwrap.text.Text text,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,float tickDelta) { wrapperContained.renderLabelIfPresent(entity.wrapperContained,text.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,tickDelta); }
public yarnwrap.util.Identifier getTexture(yarnwrap.entity.Entity entity) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(entity.wrapperContained)); }
public yarnwrap.client.font.TextRenderer getTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.getTextRenderer()); }
public boolean shouldRender(yarnwrap.entity.Entity entity,yarnwrap.client.render.Frustum frustum,double x,double y,double z) { return wrapperContained.shouldRender(entity.wrapperContained,frustum.wrapperContained,x,y,z); }
public void render(yarnwrap.entity.Entity entity,float yaw,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.render(entity.wrapperContained,yaw,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public float getShadowRadius(yarnwrap.entity.Entity entity) { return wrapperContained.getShadowRadius(entity.wrapperContained); }
// public void renderLeash(yarnwrap.entity.Entity entity,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.Entity leashHolder) { wrapperContained.renderLeash(entity.wrapperContained,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained,leashHolder.wrapperContained); }
// public void renderLeashSegment(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f matrix,float leashedEntityX,float leashedEntityY,float leashedEntityZ,int leashedEntityBlockLight,int leashHolderBlockLight,int leashedEntitySkyLight,int leashHolderSkyLight,float segmentIndex,float isLeashKnot) { wrapperContained.renderLeashSegment(vertexConsumer.wrapperContained,matrix,leashedEntityX,leashedEntityY,leashedEntityZ,leashedEntityBlockLight,leashHolderBlockLight,leashedEntitySkyLight,leashHolderSkyLight,segmentIndex,isLeashKnot); }

}