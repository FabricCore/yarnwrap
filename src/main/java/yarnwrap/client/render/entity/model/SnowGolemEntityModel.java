package yarnwrap.client.render.entity.model;
public class SnowGolemEntityModel { public net.minecraft.client.render.entity.model.SnowGolemEntityModel wrapperContained; public SnowGolemEntityModel(net.minecraft.client.render.entity.model.SnowGolemEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SnowGolemEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SnowGolemEntityModel.root = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart upperBody() { return new yarnwrap.client.model.ModelPart(wrapperContained.upperBody); }
// public void upperBody(yarnwrap.client.model.ModelPart value) { wrapperContained.upperBody = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart upperBody() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SnowGolemEntityModel.upperBody); }
// public static void upperBody(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SnowGolemEntityModel.upperBody = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public void leftArm(yarnwrap.client.model.ModelPart value) { wrapperContained.leftArm = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SnowGolemEntityModel.leftArm); }
// public static void leftArm(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SnowGolemEntityModel.leftArm = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public void rightArm(yarnwrap.client.model.ModelPart value) { wrapperContained.rightArm = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SnowGolemEntityModel.rightArm); }
// public static void rightArm(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SnowGolemEntityModel.rightArm = value.wrapperContained; }

// public java.lang.String UPPER_BODY() { return wrapperContained.UPPER_BODY; }
// public void UPPER_BODY(java.lang.String value) { wrapperContained.UPPER_BODY = value; }
// public static java.lang.String UPPER_BODY() { return net.minecraft.client.render.entity.model.SnowGolemEntityModel.UPPER_BODY; }
// public static void UPPER_BODY(java.lang.String value, ) { net.minecraft.client.render.entity.model.SnowGolemEntityModel.UPPER_BODY = value; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SnowGolemEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SnowGolemEntityModel.head = value.wrapperContained; }

public SnowGolemEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.SnowGolemEntityModel(root.wrapperContained); }
public yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHead()); }
// public static yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SnowGolemEntityModel.getHead()); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SnowGolemEntityModel.getTexturedModelData()); }

}