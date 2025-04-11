package yarnwrap.client.render.block.entity;
public class SignBlockEntityRenderer { public net.minecraft.client.render.block.entity.SignBlockEntityRenderer wrapperContained; public SignBlockEntityRenderer(net.minecraft.client.render.block.entity.SignBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map typeToModel() { return wrapperContained.typeToModel; }
// public void typeToModel(java.util.Map value) { wrapperContained.typeToModel = value; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public java.lang.String STICK() { return wrapperContained.STICK; }
// public void STICK(java.lang.String value) { wrapperContained.STICK = value; }
// public int GLOWING_BLACK_COLOR() { return wrapperContained.GLOWING_BLACK_COLOR; }
// public void GLOWING_BLACK_COLOR(int value) { wrapperContained.GLOWING_BLACK_COLOR = value; }
// public int RENDER_DISTANCE() { return wrapperContained.RENDER_DISTANCE; }
// public void RENDER_DISTANCE(int value) { wrapperContained.RENDER_DISTANCE = value; }
// public float SCALE() { return wrapperContained.SCALE; }
// public void SCALE(float value) { wrapperContained.SCALE = value; }
// public yarnwrap.util.math.Vec3d TEXT_OFFSET() { return new yarnwrap.util.math.Vec3d(wrapperContained.TEXT_OFFSET); }
// public void TEXT_OFFSET(yarnwrap.util.math.Vec3d value) { wrapperContained.TEXT_OFFSET = value.wrapperContained; }
// public SignBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.SignBlockEntityRenderer(ctx); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public yarnwrap.block.WoodType method_32156(yarnwrap.block.WoodType signType) { return new yarnwrap.block.WoodType(wrapperContained.method_32156(signType.wrapperContained)); }
public Object createSignModel(yarnwrap.client.render.entity.model.EntityModelLoader entityModelLoader,yarnwrap.block.WoodType type) { return wrapperContained.createSignModel(entityModelLoader.wrapperContained,type.wrapperContained); }
// public Object method_32158(Object signType) { return wrapperContained.method_32158(signType); }
public int getColor(yarnwrap.block.entity.SignText sign) { return wrapperContained.getColor(sign.wrapperContained); }
// public boolean shouldRender(yarnwrap.util.math.BlockPos pos,int signColor) { return wrapperContained.shouldRender(pos.wrapperContained,signColor); }
// public yarnwrap.util.math.Vec3d getTextOffset() { return new yarnwrap.util.math.Vec3d(wrapperContained.getTextOffset()); }
// public yarnwrap.client.util.SpriteIdentifier getTextureId(yarnwrap.block.WoodType signType) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getTextureId(signType.wrapperContained)); }
// public void renderSignModel(yarnwrap.client.util.math.MatrixStack matrices,int light,int overlay,yarnwrap.client.model.Model model,yarnwrap.client.render.VertexConsumer vertexConsumers) { wrapperContained.renderSignModel(matrices.wrapperContained,light,overlay,model.wrapperContained,vertexConsumers.wrapperContained); }
// public void renderText(yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.SignText signText,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int lineHeight,int lineWidth,boolean front) { wrapperContained.renderText(pos.wrapperContained,signText.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,lineHeight,lineWidth,front); }
// public yarnwrap.text.OrderedText method_45799(int text) { return new yarnwrap.text.OrderedText(wrapperContained.method_45799(text)); }
// public void renderSign(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.block.WoodType woodType,yarnwrap.client.model.Model model) { wrapperContained.renderSign(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,woodType.wrapperContained,model.wrapperContained); }
// public void setAngles(yarnwrap.client.util.math.MatrixStack matrices,float rotationDegrees,yarnwrap.block.BlockState state) { wrapperContained.setAngles(matrices.wrapperContained,rotationDegrees,state.wrapperContained); }
// public void setTextAngles(yarnwrap.client.util.math.MatrixStack matrices,boolean front,yarnwrap.util.math.Vec3d translation) { wrapperContained.setTextAngles(matrices.wrapperContained,front,translation.wrapperContained); }
// public void render(yarnwrap.block.entity.SignBlockEntity entity,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.block.BlockState state,yarnwrap.block.AbstractSignBlock block,yarnwrap.block.WoodType woodType,yarnwrap.client.model.Model model) { wrapperContained.render(entity.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,state.wrapperContained,block.wrapperContained,woodType.wrapperContained,model.wrapperContained); }
public float getSignScale() { return wrapperContained.getSignScale(); }
public float getTextScale() { return wrapperContained.getTextScale(); }

}