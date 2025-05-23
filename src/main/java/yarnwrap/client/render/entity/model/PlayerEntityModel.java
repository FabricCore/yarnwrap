package yarnwrap.client.render.entity.model;
public class PlayerEntityModel { public net.minecraft.client.render.entity.model.PlayerEntityModel wrapperContained; public PlayerEntityModel(net.minecraft.client.render.entity.model.PlayerEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.ModelPart rightPants() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightPants); }
// public void rightPants(yarnwrap.client.model.ModelPart value) { wrapperContained.rightPants = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightPants() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.PlayerEntityModel.rightPants); }
// public static void rightPants(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.rightPants = value.wrapperContained; }

// public boolean thinArms() { return wrapperContained.thinArms; }
// public void thinArms(boolean value) { wrapperContained.thinArms = value; }
// public static boolean thinArms() { return net.minecraft.client.render.entity.model.PlayerEntityModel.thinArms; }
// public static void thinArms(boolean value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.thinArms = value; }

public yarnwrap.client.model.ModelPart leftPants() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftPants); }
// public void leftPants(yarnwrap.client.model.ModelPart value) { wrapperContained.leftPants = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftPants() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.PlayerEntityModel.leftPants); }
// public static void leftPants(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.leftPants = value.wrapperContained; }

public yarnwrap.client.model.ModelPart jacket() { return new yarnwrap.client.model.ModelPart(wrapperContained.jacket); }
// public void jacket(yarnwrap.client.model.ModelPart value) { wrapperContained.jacket = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart jacket() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.PlayerEntityModel.jacket); }
// public static void jacket(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.jacket = value.wrapperContained; }

public yarnwrap.client.model.ModelPart leftSleeve() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftSleeve); }
// public void leftSleeve(yarnwrap.client.model.ModelPart value) { wrapperContained.leftSleeve = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftSleeve() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.PlayerEntityModel.leftSleeve); }
// public static void leftSleeve(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.leftSleeve = value.wrapperContained; }

public yarnwrap.client.model.ModelPart rightSleeve() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightSleeve); }
// public void rightSleeve(yarnwrap.client.model.ModelPart value) { wrapperContained.rightSleeve = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightSleeve() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.PlayerEntityModel.rightSleeve); }
// public static void rightSleeve(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.rightSleeve = value.wrapperContained; }

// public java.util.List parts() { return wrapperContained.parts; }
// public void parts(java.util.List value) { wrapperContained.parts = value; }
// public static java.util.List parts() { return net.minecraft.client.render.entity.model.PlayerEntityModel.parts; }
// public static void parts(java.util.List value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.parts = value; }

// public java.lang.String LEFT_PANTS() { return wrapperContained.LEFT_PANTS; }
// public void LEFT_PANTS(java.lang.String value) { wrapperContained.LEFT_PANTS = value; }
// public static java.lang.String LEFT_PANTS() { return net.minecraft.client.render.entity.model.PlayerEntityModel.LEFT_PANTS; }
// public static void LEFT_PANTS(java.lang.String value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.LEFT_PANTS = value; }

// public java.lang.String RIGHT_PANTS() { return wrapperContained.RIGHT_PANTS; }
// public void RIGHT_PANTS(java.lang.String value) { wrapperContained.RIGHT_PANTS = value; }
// public static java.lang.String RIGHT_PANTS() { return net.minecraft.client.render.entity.model.PlayerEntityModel.RIGHT_PANTS; }
// public static void RIGHT_PANTS(java.lang.String value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.RIGHT_PANTS = value; }

// public java.lang.String LEFT_SLEEVE() { return wrapperContained.LEFT_SLEEVE; }
// public void LEFT_SLEEVE(java.lang.String value) { wrapperContained.LEFT_SLEEVE = value; }
// public static java.lang.String LEFT_SLEEVE() { return net.minecraft.client.render.entity.model.PlayerEntityModel.LEFT_SLEEVE; }
// public static void LEFT_SLEEVE(java.lang.String value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.LEFT_SLEEVE = value; }

// public java.lang.String RIGHT_SLEEVE() { return wrapperContained.RIGHT_SLEEVE; }
// public void RIGHT_SLEEVE(java.lang.String value) { wrapperContained.RIGHT_SLEEVE = value; }
// public static java.lang.String RIGHT_SLEEVE() { return net.minecraft.client.render.entity.model.PlayerEntityModel.RIGHT_SLEEVE; }
// public static void RIGHT_SLEEVE(java.lang.String value, ) { net.minecraft.client.render.entity.model.PlayerEntityModel.RIGHT_SLEEVE = value; }

// public PlayerEntityModel(yarnwrap.client.model.ModelPart thinArms) { this.wrapperContained = new net.minecraft.client.render.entity.model.PlayerEntityModel(thinArms.wrapperContained); }
public yarnwrap.client.model.ModelPart getRandomPart(yarnwrap.util.math.random.Random random) { return new yarnwrap.client.model.ModelPart(wrapperContained.getRandomPart(random.wrapperContained)); }
// public static yarnwrap.client.model.ModelPart getRandomPart(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.PlayerEntityModel.getRandomPart(random.wrapperContained)); }
// public yarnwrap.client.model.ModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation,boolean slim) { return new yarnwrap.client.model.ModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained,slim)); }
// public static yarnwrap.client.model.ModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation,boolean slim, ) { return new yarnwrap.client.model.ModelData(net.minecraft.client.render.entity.model.PlayerEntityModel.getTexturedModelData(dilation.wrapperContained,slim)); }

}