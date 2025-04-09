package yarnwrap.client.render.entity.model;
public class SnowGolemEntityModel { public net.minecraft.client.render.entity.model.SnowGolemEntityModel wrapperContained; public SnowGolemEntityModel(net.minecraft.client.render.entity.model.SnowGolemEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart upperBody() { return new yarnwrap.client.model.ModelPart(wrapperContained.upperBody); }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public java.lang.String UPPER_BODY() { return wrapperContained.UPPER_BODY; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
public yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHead()); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}