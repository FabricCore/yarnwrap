package yarnwrap.client.render.entity.model;
public class LlamaEntityModel { public net.minecraft.client.render.entity.model.LlamaEntityModel wrapperContained; public LlamaEntityModel(net.minecraft.client.render.entity.model.LlamaEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public void rightHindLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightHindLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public void leftHindLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftHindLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public void rightFrontLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightFrontLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public void leftFrontLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftFrontLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightChest() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightChest); }
// public void rightChest(yarnwrap.client.model.ModelPart value) { wrapperContained.rightChest = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftChest() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftChest); }
// public void leftChest(yarnwrap.client.model.ModelPart value) { wrapperContained.leftChest = value.wrapperContained; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }

}