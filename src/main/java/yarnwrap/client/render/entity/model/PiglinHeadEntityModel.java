package yarnwrap.client.render.entity.model;
public class PiglinHeadEntityModel { public net.minecraft.client.render.entity.model.PiglinHeadEntityModel wrapperContained; public PiglinHeadEntityModel(net.minecraft.client.render.entity.model.PiglinHeadEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.PiglinHeadEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.PiglinHeadEntityModel.head = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart leftEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftEar); }
// public void leftEar(yarnwrap.client.model.ModelPart value) { wrapperContained.leftEar = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftEar() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.PiglinHeadEntityModel.leftEar); }
// public static void leftEar(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.PiglinHeadEntityModel.leftEar = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart rightEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightEar); }
// public void rightEar(yarnwrap.client.model.ModelPart value) { wrapperContained.rightEar = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightEar() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.PiglinHeadEntityModel.rightEar); }
// public static void rightEar(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.PiglinHeadEntityModel.rightEar = value.wrapperContained; }

public PiglinHeadEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.PiglinHeadEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData()); }
public static yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(net.minecraft.client.render.entity.model.PiglinHeadEntityModel.getModelData()); }

}