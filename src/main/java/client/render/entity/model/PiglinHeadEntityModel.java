package yarnwrap.client.render.entity.model;
public class PiglinHeadEntityModel { public net.minecraft.client.render.entity.model.PiglinHeadEntityModel wrapperContained; public PiglinHeadEntityModel(net.minecraft.client.render.entity.model.PiglinHeadEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart leftEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftEar); }
// public yarnwrap.client.model.ModelPart rightEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightEar); }
public yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData()); }

}