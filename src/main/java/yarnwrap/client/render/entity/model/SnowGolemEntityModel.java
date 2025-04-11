package yarnwrap.client.render.entity.model;
public class SnowGolemEntityModel { public net.minecraft.client.render.entity.model.SnowGolemEntityModel wrapperContained; public SnowGolemEntityModel(net.minecraft.client.render.entity.model.SnowGolemEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart upperBody() { return new yarnwrap.client.model.ModelPart(wrapperContained.upperBody); }
// public void upperBody(yarnwrap.client.model.ModelPart value) { wrapperContained.upperBody = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public void leftArm(yarnwrap.client.model.ModelPart value) { wrapperContained.leftArm = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public void rightArm(yarnwrap.client.model.ModelPart value) { wrapperContained.rightArm = value.wrapperContained; }
// public java.lang.String UPPER_BODY() { return wrapperContained.UPPER_BODY; }
// public void UPPER_BODY(java.lang.String value) { wrapperContained.UPPER_BODY = value; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
public SnowGolemEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.SnowGolemEntityModel(root.wrapperContained); }
public yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHead()); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}