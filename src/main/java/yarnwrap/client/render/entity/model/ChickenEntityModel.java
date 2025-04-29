package yarnwrap.client.render.entity.model;
public class ChickenEntityModel { public net.minecraft.client.render.entity.model.ChickenEntityModel wrapperContained; public ChickenEntityModel(net.minecraft.client.render.entity.model.ChickenEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public void rightLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightLeg = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ChickenEntityModel.rightLeg); }
// public static void rightLeg(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ChickenEntityModel.rightLeg = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public void leftLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftLeg = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ChickenEntityModel.leftLeg); }
// public static void leftLeg(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ChickenEntityModel.leftLeg = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public void rightWing(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWing = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ChickenEntityModel.rightWing); }
// public static void rightWing(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ChickenEntityModel.rightWing = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public void leftWing(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWing = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ChickenEntityModel.leftWing); }
// public static void leftWing(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ChickenEntityModel.leftWing = value.wrapperContained; }

// public java.lang.String RED_THING() { return wrapperContained.RED_THING; }
// public void RED_THING(java.lang.String value) { wrapperContained.RED_THING = value; }
public static java.lang.String RED_THING() { return net.minecraft.client.render.entity.model.ChickenEntityModel.RED_THING; }
// public static void RED_THING(java.lang.String value, ) { net.minecraft.client.render.entity.model.ChickenEntityModel.RED_THING = value; }

// public yarnwrap.client.model.ModelPart beak() { return new yarnwrap.client.model.ModelPart(wrapperContained.beak); }
// public void beak(yarnwrap.client.model.ModelPart value) { wrapperContained.beak = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart beak() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ChickenEntityModel.beak); }
// public static void beak(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ChickenEntityModel.beak = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart wattle() { return new yarnwrap.client.model.ModelPart(wrapperContained.wattle); }
// public void wattle(yarnwrap.client.model.ModelPart value) { wrapperContained.wattle = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart wattle() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ChickenEntityModel.wattle); }
// public static void wattle(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ChickenEntityModel.wattle = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ChickenEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ChickenEntityModel.head = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ChickenEntityModel.body); }
// public static void body(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ChickenEntityModel.body = value.wrapperContained; }

public ChickenEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.ChickenEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ChickenEntityModel.getTexturedModelData()); }

}