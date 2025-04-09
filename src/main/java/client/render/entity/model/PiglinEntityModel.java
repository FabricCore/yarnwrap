package yarnwrap.client.render.entity.model;
public class PiglinEntityModel { public net.minecraft.client.render.entity.model.PiglinEntityModel wrapperContained; public PiglinEntityModel(net.minecraft.client.render.entity.model.PiglinEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelTransform leftArmRotation() { return new yarnwrap.client.model.ModelTransform(wrapperContained.leftArmRotation); }
// public yarnwrap.client.model.ModelTransform rightArmRotation() { return new yarnwrap.client.model.ModelTransform(wrapperContained.rightArmRotation); }
// public yarnwrap.client.model.ModelTransform bodyRotation() { return new yarnwrap.client.model.ModelTransform(wrapperContained.bodyRotation); }
// public yarnwrap.client.model.ModelTransform headRotation() { return new yarnwrap.client.model.ModelTransform(wrapperContained.headRotation); }
public yarnwrap.client.model.ModelPart rightEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightEar); }
// public yarnwrap.client.model.ModelPart leftEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftEar); }
// public void rotateMainArm(yarnwrap.entity.mob.MobEntity entity) { wrapperContained.rotateMainArm(entity.wrapperContained); }
public yarnwrap.client.model.ModelData getModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData(dilation.wrapperContained)); }
public void addHead(yarnwrap.client.model.Dilation dilation,yarnwrap.client.model.ModelData baseModelData) { wrapperContained.addHead(dilation.wrapperContained,baseModelData.wrapperContained); }

}