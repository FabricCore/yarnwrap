package yarnwrap.client.render.entity.model;
public class BatEntityModel { public net.minecraft.client.render.entity.model.BatEntityModel wrapperContained; public BatEntityModel(net.minecraft.client.render.entity.model.BatEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightWingTip() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWingTip); }
// public void rightWingTip(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWingTip = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public void leftWing(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWing = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public void rightWing(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWing = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftWingTip() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWingTip); }
// public void leftWingTip(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWingTip = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart feet() { return new yarnwrap.client.model.ModelPart(wrapperContained.feet); }
// public void feet(yarnwrap.client.model.ModelPart value) { wrapperContained.feet = value.wrapperContained; }
public BatEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.BatEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public void setRoostingHeadAngles(float yaw) { wrapperContained.setRoostingHeadAngles(yaw); }

}