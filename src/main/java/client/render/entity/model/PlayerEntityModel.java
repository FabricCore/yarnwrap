package yarnwrap.client.render.entity.model;
public class PlayerEntityModel { public net.minecraft.client.render.entity.model.PlayerEntityModel wrapperContained; public PlayerEntityModel(net.minecraft.client.render.entity.model.PlayerEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List parts() { return wrapperContained.parts; }
// public java.lang.String LEFT_PANTS() { return wrapperContained.LEFT_PANTS; }
// public java.lang.String RIGHT_PANTS() { return wrapperContained.RIGHT_PANTS; }
// public java.lang.String EAR() { return wrapperContained.EAR; }
// public java.lang.String CLOAK() { return wrapperContained.CLOAK; }
// public java.lang.String LEFT_SLEEVE() { return wrapperContained.LEFT_SLEEVE; }
// public java.lang.String RIGHT_SLEEVE() { return wrapperContained.RIGHT_SLEEVE; }
public yarnwrap.client.model.ModelPart rightPants() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightPants); }
// public boolean thinArms() { return wrapperContained.thinArms; }
// public yarnwrap.client.model.ModelPart ear() { return new yarnwrap.client.model.ModelPart(wrapperContained.ear); }
public yarnwrap.client.model.ModelPart leftPants() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftPants); }
public yarnwrap.client.model.ModelPart jacket() { return new yarnwrap.client.model.ModelPart(wrapperContained.jacket); }
public yarnwrap.client.model.ModelPart leftSleeve() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftSleeve); }
// public yarnwrap.client.model.ModelPart cloak() { return new yarnwrap.client.model.ModelPart(wrapperContained.cloak); }
public yarnwrap.client.model.ModelPart rightSleeve() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightSleeve); }
public yarnwrap.client.model.ModelPart getRandomPart(yarnwrap.util.math.random.Random random) { return new yarnwrap.client.model.ModelPart(wrapperContained.getRandomPart(random.wrapperContained)); }
public void renderCape(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay) { wrapperContained.renderCape(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }
public void renderEars(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay) { wrapperContained.renderEars(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }
public yarnwrap.client.model.ModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation,boolean slim) { return new yarnwrap.client.model.ModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained,slim)); }

}