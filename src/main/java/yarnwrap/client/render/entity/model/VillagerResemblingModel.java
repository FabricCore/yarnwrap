package yarnwrap.client.render.entity.model;
public class VillagerResemblingModel { public net.minecraft.client.render.entity.model.VillagerResemblingModel wrapperContained; public VillagerResemblingModel(net.minecraft.client.render.entity.model.VillagerResemblingModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart nose() { return new yarnwrap.client.model.ModelPart(wrapperContained.nose); }
// public void nose(yarnwrap.client.model.ModelPart value) { wrapperContained.nose = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart hat() { return new yarnwrap.client.model.ModelPart(wrapperContained.hat); }
// public void hat(yarnwrap.client.model.ModelPart value) { wrapperContained.hat = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart hatRim() { return new yarnwrap.client.model.ModelPart(wrapperContained.hatRim); }
// public void hatRim(yarnwrap.client.model.ModelPart value) { wrapperContained.hatRim = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public void rightLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public void leftLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftLeg = value.wrapperContained; }
public yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData()); }

}