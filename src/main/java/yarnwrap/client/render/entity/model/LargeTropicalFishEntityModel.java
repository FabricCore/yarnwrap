package yarnwrap.client.render.entity.model;
public class LargeTropicalFishEntityModel { public net.minecraft.client.render.entity.model.LargeTropicalFishEntityModel wrapperContained; public LargeTropicalFishEntityModel(net.minecraft.client.render.entity.model.LargeTropicalFishEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.LargeTropicalFishEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.LargeTropicalFishEntityModel.root = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public void tail(yarnwrap.client.model.ModelPart value) { wrapperContained.tail = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.LargeTropicalFishEntityModel.tail); }
// public static void tail(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.LargeTropicalFishEntityModel.tail = value.wrapperContained; }

public LargeTropicalFishEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.LargeTropicalFishEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }
// public static yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation, ) { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.LargeTropicalFishEntityModel.getTexturedModelData(dilation.wrapperContained)); }

}