package yarnwrap.client.render.entity.model;
public class VillagerResemblingModel { public net.minecraft.client.render.entity.model.VillagerResemblingModel wrapperContained; public VillagerResemblingModel(net.minecraft.client.render.entity.model.VillagerResemblingModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart nose() { return new yarnwrap.client.model.ModelPart(wrapperContained.nose); }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart hat() { return new yarnwrap.client.model.ModelPart(wrapperContained.hat); }
// public yarnwrap.client.model.ModelPart hatRim() { return new yarnwrap.client.model.ModelPart(wrapperContained.hatRim); }
// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
public yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData()); }

}