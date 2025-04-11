package yarnwrap.client.render.entity.model;
public class PlayerEntityModel { public net.minecraft.client.render.entity.model.PlayerEntityModel wrapperContained; public PlayerEntityModel(net.minecraft.client.render.entity.model.PlayerEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List parts() { return wrapperContained.parts; }
// public void parts(java.util.List value) { wrapperContained.parts = value; }
// public java.lang.String LEFT_PANTS() { return wrapperContained.LEFT_PANTS; }
// public void LEFT_PANTS(java.lang.String value) { wrapperContained.LEFT_PANTS = value; }
// public java.lang.String RIGHT_PANTS() { return wrapperContained.RIGHT_PANTS; }
// public void RIGHT_PANTS(java.lang.String value) { wrapperContained.RIGHT_PANTS = value; }
// public java.lang.String EAR() { return wrapperContained.EAR; }
// public void EAR(java.lang.String value) { wrapperContained.EAR = value; }
// public java.lang.String CLOAK() { return wrapperContained.CLOAK; }
// public void CLOAK(java.lang.String value) { wrapperContained.CLOAK = value; }
// public java.lang.String LEFT_SLEEVE() { return wrapperContained.LEFT_SLEEVE; }
// public void LEFT_SLEEVE(java.lang.String value) { wrapperContained.LEFT_SLEEVE = value; }
// public java.lang.String RIGHT_SLEEVE() { return wrapperContained.RIGHT_SLEEVE; }
// public void RIGHT_SLEEVE(java.lang.String value) { wrapperContained.RIGHT_SLEEVE = value; }
public yarnwrap.client.model.ModelPart rightPants() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightPants); }
// public void rightPants(yarnwrap.client.model.ModelPart value) { wrapperContained.rightPants = value.wrapperContained; }
// public boolean thinArms() { return wrapperContained.thinArms; }
// public void thinArms(boolean value) { wrapperContained.thinArms = value; }
// public yarnwrap.client.model.ModelPart ear() { return new yarnwrap.client.model.ModelPart(wrapperContained.ear); }
// public void ear(yarnwrap.client.model.ModelPart value) { wrapperContained.ear = value.wrapperContained; }
public yarnwrap.client.model.ModelPart leftPants() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftPants); }
// public void leftPants(yarnwrap.client.model.ModelPart value) { wrapperContained.leftPants = value.wrapperContained; }
public yarnwrap.client.model.ModelPart jacket() { return new yarnwrap.client.model.ModelPart(wrapperContained.jacket); }
// public void jacket(yarnwrap.client.model.ModelPart value) { wrapperContained.jacket = value.wrapperContained; }
public yarnwrap.client.model.ModelPart leftSleeve() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftSleeve); }
// public void leftSleeve(yarnwrap.client.model.ModelPart value) { wrapperContained.leftSleeve = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart cloak() { return new yarnwrap.client.model.ModelPart(wrapperContained.cloak); }
// public void cloak(yarnwrap.client.model.ModelPart value) { wrapperContained.cloak = value.wrapperContained; }
public yarnwrap.client.model.ModelPart rightSleeve() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightSleeve); }
// public void rightSleeve(yarnwrap.client.model.ModelPart value) { wrapperContained.rightSleeve = value.wrapperContained; }
public PlayerEntityModel(yarnwrap.client.model.ModelPart root,boolean thinArms) { this.wrapperContained = new net.minecraft.client.render.entity.model.PlayerEntityModel(root.wrapperContained,thinArms); }
public yarnwrap.client.model.ModelPart getRandomPart(yarnwrap.util.math.random.Random random) { return new yarnwrap.client.model.ModelPart(wrapperContained.getRandomPart(random.wrapperContained)); }
public void renderCape(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay) { wrapperContained.renderCape(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }
public void renderEars(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay) { wrapperContained.renderEars(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }
// public boolean method_32027(yarnwrap.client.model.ModelPart part) { return wrapperContained.method_32027(part.wrapperContained); }
public yarnwrap.client.model.ModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation,boolean slim) { return new yarnwrap.client.model.ModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained,slim)); }

}