package yarnwrap.client.render.entity.model;
public class BatEntityModel { public net.minecraft.client.render.entity.model.BatEntityModel wrapperContained; public BatEntityModel(net.minecraft.client.render.entity.model.BatEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart rightWingTip() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWingTip); }
// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart leftWingTip() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWingTip); }
// public yarnwrap.client.model.ModelPart feet() { return new yarnwrap.client.model.ModelPart(wrapperContained.feet); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public void setRoostingHeadAngles(float yaw) { wrapperContained.setRoostingHeadAngles(yaw); }

}