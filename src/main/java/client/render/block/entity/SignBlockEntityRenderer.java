package yarnwrap.client.render.block.entity;
public class SignBlockEntityRenderer { public net.minecraft.client.render.block.entity.SignBlockEntityRenderer wrapperContained; public SignBlockEntityRenderer(net.minecraft.client.render.block.entity.SignBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map typeToModel() { return wrapperContained.typeToModel; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public java.lang.String STICK() { return wrapperContained.STICK; }
// public int GLOWING_BLACK_COLOR() { return wrapperContained.GLOWING_BLACK_COLOR; }
// public int RENDER_DISTANCE() { return wrapperContained.RENDER_DISTANCE; }
// public float SCALE() { return wrapperContained.SCALE; }
// public yarnwrap.util.math.Vec3d TEXT_OFFSET() { return new yarnwrap.util.math.Vec3d(wrapperContained.TEXT_OFFSET); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public Object createSignModel(yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader,yarnwrap.block.WoodType type) { return wrapperContained.createSignModel(entityModelLoader.wrapperContained,type.wrapperContained); }
public int getColor(yarnwrap.block.entity.SignText sign) { return wrapperContained.getColor(sign.wrapperContained); }
// public boolean shouldRender(yarnwrap.util.math.BlockPos pos,int signColor) { return wrapperContained.shouldRender(pos.wrapperContained,signColor); }
// public yarnwrap.util.math.Vec3d getTextOffset() { return new yarnwrap.util.math.Vec3d(wrapperContained.getTextOffset()); }
// public yarnwrap.client.util.SpriteIdentifier getTextureId(yarnwrap.block.WoodType signType) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getTextureId(signType.wrapperContained)); }
// public void renderSignModel(yarnwrap.client.util.math.MatrixStack matrices,int light,int overlay,yarnwrap.client.model.Model model,yarnwrap.client.render.VertexConsumer vertexConsumers) { wrapperContained.renderSignModel(matrices.wrapperContained,light,overlay,model.wrapperContained,vertexConsumers.wrapperContained); }
// public void renderText(yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.SignText signText,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int lineHeight,int lineWidth,boolean front) { wrapperContained.renderText(pos.wrapperContained,signText.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,lineHeight,lineWidth,front); }
// public void renderSign(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.block.WoodType woodType,yarnwrap.client.model.Model model) { wrapperContained.renderSign(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,woodType.wrapperContained,model.wrapperContained); }
// public void setAngles(yarnwrap.client.util.math.MatrixStack matrices,float rotationDegrees,yarnwrap.block.BlockState state) { wrapperContained.setAngles(matrices.wrapperContained,rotationDegrees,state.wrapperContained); }
// public void setTextAngles(yarnwrap.client.util.math.MatrixStack matrices,boolean front,yarnwrap.util.math.Vec3d translation) { wrapperContained.setTextAngles(matrices.wrapperContained,front,translation.wrapperContained); }
// public void render(yarnwrap.block.entity.SignBlockEntity entity,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.block.BlockState state,yarnwrap.block.AbstractSignBlock block,yarnwrap.block.WoodType woodType,yarnwrap.client.model.Model model) { wrapperContained.render(entity.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,state.wrapperContained,block.wrapperContained,woodType.wrapperContained,model.wrapperContained); }
public float getSignScale() { return wrapperContained.getSignScale(); }
public float getTextScale() { return wrapperContained.getTextScale(); }

}