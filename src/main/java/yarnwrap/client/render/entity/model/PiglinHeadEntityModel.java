package yarnwrap.client.render.entity.model;
public class PiglinHeadEntityModel { public net.minecraft.client.render.entity.model.PiglinHeadEntityModel wrapperContained; public PiglinHeadEntityModel(net.minecraft.client.render.entity.model.PiglinHeadEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftEar); }
// public void leftEar(yarnwrap.client.model.ModelPart value) { wrapperContained.leftEar = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightEar); }
// public void rightEar(yarnwrap.client.model.ModelPart value) { wrapperContained.rightEar = value.wrapperContained; }
public yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData()); }

}