package yarnwrap.client.render.block.entity;
public class DecoratedPotBlockEntityRenderer { public net.minecraft.client.render.block.entity.DecoratedPotBlockEntityRenderer wrapperContained; public DecoratedPotBlockEntityRenderer(net.minecraft.client.render.block.entity.DecoratedPotBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String NECK() { return wrapperContained.NECK; }
// public java.lang.String FRONT() { return wrapperContained.FRONT; }
// public java.lang.String BACK() { return wrapperContained.BACK; }
// public java.lang.String LEFT() { return wrapperContained.LEFT; }
// public java.lang.String RIGHT() { return wrapperContained.RIGHT; }
// public java.lang.String TOP() { return wrapperContained.TOP; }
// public java.lang.String BOTTOM() { return wrapperContained.BOTTOM; }
// public yarnwrap.client.model.ModelPart neck() { return new yarnwrap.client.model.ModelPart(wrapperContained.neck); }
// public yarnwrap.client.model.ModelPart front() { return new yarnwrap.client.model.ModelPart(wrapperContained.front); }
// public yarnwrap.client.model.ModelPart back() { return new yarnwrap.client.model.ModelPart(wrapperContained.back); }
// public yarnwrap.client.model.ModelPart left() { return new yarnwrap.client.model.ModelPart(wrapperContained.left); }
// public yarnwrap.client.model.ModelPart right() { return new yarnwrap.client.model.ModelPart(wrapperContained.right); }
// public yarnwrap.client.model.ModelPart top() { return new yarnwrap.client.model.ModelPart(wrapperContained.top); }
// public yarnwrap.client.model.ModelPart bottom() { return new yarnwrap.client.model.ModelPart(wrapperContained.bottom); }
// public yarnwrap.client.util.SpriteIdentifier getTextureIdFromSherd(java.util.Optional sherd) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getTextureIdFromSherd(sherd)); }
// public void renderDecoratedSide(yarnwrap.client.model.ModelPart part,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.client.util.SpriteIdentifier textureId) { wrapperContained.renderDecoratedSide(part.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,textureId.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTopBottomNeckTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTopBottomNeckTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getSidesTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getSidesTexturedModelData()); }

}