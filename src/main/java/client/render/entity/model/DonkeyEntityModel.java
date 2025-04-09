package yarnwrap.client.render.entity.model;
public class DonkeyEntityModel { public net.minecraft.client.render.entity.model.DonkeyEntityModel wrapperContained; public DonkeyEntityModel(net.minecraft.client.render.entity.model.DonkeyEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart leftChest() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftChest); }
// public yarnwrap.client.model.ModelPart rightChest() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightChest); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}