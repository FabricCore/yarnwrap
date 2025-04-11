package yarnwrap.client.render.entity.model;
public class WindChargeEntityModel { public net.minecraft.client.render.entity.model.WindChargeEntityModel wrapperContained; public WindChargeEntityModel(net.minecraft.client.render.entity.model.WindChargeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart bone() { return new yarnwrap.client.model.ModelPart(wrapperContained.bone); }
// public void bone(yarnwrap.client.model.ModelPart value) { wrapperContained.bone = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart windCharge() { return new yarnwrap.client.model.ModelPart(wrapperContained.windCharge); }
// public void windCharge(yarnwrap.client.model.ModelPart value) { wrapperContained.windCharge = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart wind() { return new yarnwrap.client.model.ModelPart(wrapperContained.wind); }
// public void wind(yarnwrap.client.model.ModelPart value) { wrapperContained.wind = value.wrapperContained; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}