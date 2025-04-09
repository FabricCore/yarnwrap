package yarnwrap.client.render.entity.model;
public class WindChargeEntityModel { public net.minecraft.client.render.entity.model.WindChargeEntityModel wrapperContained; public WindChargeEntityModel(net.minecraft.client.render.entity.model.WindChargeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart bone() { return new yarnwrap.client.model.ModelPart(wrapperContained.bone); }
// public yarnwrap.client.model.ModelPart windCharge() { return new yarnwrap.client.model.ModelPart(wrapperContained.windCharge); }
// public yarnwrap.client.model.ModelPart wind() { return new yarnwrap.client.model.ModelPart(wrapperContained.wind); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}