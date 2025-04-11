package yarnwrap.client.render.block.entity;
public class BannerBlockEntityRenderer { public net.minecraft.client.render.block.entity.BannerBlockEntityRenderer wrapperContained; public BannerBlockEntityRenderer(net.minecraft.client.render.block.entity.BannerBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart banner() { return new yarnwrap.client.model.ModelPart(wrapperContained.banner); }
// public void banner(yarnwrap.client.model.ModelPart value) { wrapperContained.banner = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart pillar() { return new yarnwrap.client.model.ModelPart(wrapperContained.pillar); }
// public void pillar(yarnwrap.client.model.ModelPart value) { wrapperContained.pillar = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart crossbar() { return new yarnwrap.client.model.ModelPart(wrapperContained.crossbar); }
// public void crossbar(yarnwrap.client.model.ModelPart value) { wrapperContained.crossbar = value.wrapperContained; }
public java.lang.String BANNER() { return wrapperContained.BANNER; }
// public void BANNER(java.lang.String value) { wrapperContained.BANNER = value; }
// public int WIDTH() { return wrapperContained.WIDTH; }
// public void WIDTH(int value) { wrapperContained.WIDTH = value; }
// public int HEIGHT() { return wrapperContained.HEIGHT; }
// public void HEIGHT(int value) { wrapperContained.HEIGHT = value; }
// public int ROTATIONS() { return wrapperContained.ROTATIONS; }
// public void ROTATIONS(int value) { wrapperContained.ROTATIONS = value; }
// public java.lang.String PILLAR() { return wrapperContained.PILLAR; }
// public void PILLAR(java.lang.String value) { wrapperContained.PILLAR = value; }
// public java.lang.String CROSSBAR() { return wrapperContained.CROSSBAR; }
// public void CROSSBAR(java.lang.String value) { wrapperContained.CROSSBAR = value; }
public void renderCanvas(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.client.model.ModelPart canvas,yarnwrap.client.util.SpriteIdentifier baseSprite,boolean isBanner,yarnwrap.util.DyeColor color,yarnwrap.component.type.BannerPatternsComponent patterns,boolean glint) { wrapperContained.renderCanvas(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,canvas.wrapperContained,baseSprite.wrapperContained,isBanner,color.wrapperContained,patterns.wrapperContained,glint); }
public void renderCanvas(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.client.model.ModelPart canvas,yarnwrap.client.util.SpriteIdentifier baseSprite,boolean isBanner,yarnwrap.util.DyeColor color,yarnwrap.component.type.BannerPatternsComponent patterns) { wrapperContained.renderCanvas(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,canvas.wrapperContained,baseSprite.wrapperContained,isBanner,color.wrapperContained,patterns.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public void renderLayer(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,yarnwrap.client.model.ModelPart canvas,yarnwrap.client.util.SpriteIdentifier textureId,yarnwrap.util.DyeColor color) { wrapperContained.renderLayer(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,canvas.wrapperContained,textureId.wrapperContained,color.wrapperContained); }

}