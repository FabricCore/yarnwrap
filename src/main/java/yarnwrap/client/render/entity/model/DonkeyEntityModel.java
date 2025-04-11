package yarnwrap.client.render.entity.model;
public class DonkeyEntityModel { public net.minecraft.client.render.entity.model.DonkeyEntityModel wrapperContained; public DonkeyEntityModel(net.minecraft.client.render.entity.model.DonkeyEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart leftChest() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftChest); }
// public void leftChest(yarnwrap.client.model.ModelPart value) { wrapperContained.leftChest = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightChest() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightChest); }
// public void rightChest(yarnwrap.client.model.ModelPart value) { wrapperContained.rightChest = value.wrapperContained; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}