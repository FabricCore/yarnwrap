package yarnwrap.client.render.entity.model;
public class SmallTropicalFishEntityModel { public net.minecraft.client.render.entity.model.SmallTropicalFishEntityModel wrapperContained; public SmallTropicalFishEntityModel(net.minecraft.client.render.entity.model.SmallTropicalFishEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }

}