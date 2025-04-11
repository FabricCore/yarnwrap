package yarnwrap.client.render.entity.model;
public class AllayEntityModel { public net.minecraft.client.render.entity.model.AllayEntityModel wrapperContained; public AllayEntityModel(net.minecraft.client.render.entity.model.AllayEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public void rightArm(yarnwrap.client.model.ModelPart value) { wrapperContained.rightArm = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public void leftArm(yarnwrap.client.model.ModelPart value) { wrapperContained.leftArm = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public void rightWing(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWing = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public void leftWing(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWing = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
public AllayEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.AllayEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}