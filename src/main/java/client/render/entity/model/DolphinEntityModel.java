package yarnwrap.client.render.entity.model;
public class DolphinEntityModel { public net.minecraft.client.render.entity.model.DolphinEntityModel wrapperContained; public DolphinEntityModel(net.minecraft.client.render.entity.model.DolphinEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart tailFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.tailFin); }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}