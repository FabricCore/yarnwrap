package yarnwrap.client.render.block.entity;
public class DecoratedPotBlockEntityRenderer { public net.minecraft.client.render.block.entity.DecoratedPotBlockEntityRenderer wrapperContained; public DecoratedPotBlockEntityRenderer(net.minecraft.client.render.block.entity.DecoratedPotBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String NECK() { return wrapperContained.NECK; }
// public void NECK(java.lang.String value) { wrapperContained.NECK = value; }
// public java.lang.String FRONT() { return wrapperContained.FRONT; }
// public void FRONT(java.lang.String value) { wrapperContained.FRONT = value; }
// public java.lang.String BACK() { return wrapperContained.BACK; }
// public void BACK(java.lang.String value) { wrapperContained.BACK = value; }
// public java.lang.String LEFT() { return wrapperContained.LEFT; }
// public void LEFT(java.lang.String value) { wrapperContained.LEFT = value; }
// public java.lang.String RIGHT() { return wrapperContained.RIGHT; }
// public void RIGHT(java.lang.String value) { wrapperContained.RIGHT = value; }
// public java.lang.String TOP() { return wrapperContained.TOP; }
// public void TOP(java.lang.String value) { wrapperContained.TOP = value; }
// public java.lang.String BOTTOM() { return wrapperContained.BOTTOM; }
// public void BOTTOM(java.lang.String value) { wrapperContained.BOTTOM = value; }
// public yarnwrap.client.model.ModelPart neck() { return new yarnwrap.client.model.ModelPart(wrapperContained.neck); }
// public void neck(yarnwrap.client.model.ModelPart value) { wrapperContained.neck = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart front() { return new yarnwrap.client.model.ModelPart(wrapperContained.front); }
// public void front(yarnwrap.client.model.ModelPart value) { wrapperContained.front = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart back() { return new yarnwrap.client.model.ModelPart(wrapperContained.back); }
// public void back(yarnwrap.client.model.ModelPart value) { wrapperContained.back = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart left() { return new yarnwrap.client.model.ModelPart(wrapperContained.left); }
// public void left(yarnwrap.client.model.ModelPart value) { wrapperContained.left = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart right() { return new yarnwrap.client.model.ModelPart(wrapperContained.right); }
// public void right(yarnwrap.client.model.ModelPart value) { wrapperContained.right = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart top() { return new yarnwrap.client.model.ModelPart(wrapperContained.top); }
// public void top(yarnwrap.client.model.ModelPart value) { wrapperContained.top = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart bottom() { return new yarnwrap.client.model.ModelPart(wrapperContained.bottom); }
// public void bottom(yarnwrap.client.model.ModelPart value) { wrapperContained.bottom = value.wrapperContained; }
// public DecoratedPotBlockEntityRenderer(Object context) { this.wrapperContained = new net.minecraft.client.render.block.entity.DecoratedPotBlockEntityRenderer(context); }
// public yarnwrap.client.util.SpriteIdentifier getTextureIdFromSherd(java.util.Optional sherd) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getTextureIdFromSherd(sherd)); }
// public void renderDecoratedSide(yarnwrap.client.model.ModelPart part,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.client.util.SpriteIdentifier textureId) { wrapperContained.renderDecoratedSide(part.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,textureId.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTopBottomNeckTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTopBottomNeckTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getSidesTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getSidesTexturedModelData()); }

}