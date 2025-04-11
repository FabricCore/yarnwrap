package yarnwrap.client.render.entity.model;
public class DolphinEntityModel { public net.minecraft.client.render.entity.model.DolphinEntityModel wrapperContained; public DolphinEntityModel(net.minecraft.client.render.entity.model.DolphinEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart tailFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.tailFin); }
// public void tailFin(yarnwrap.client.model.ModelPart value) { wrapperContained.tailFin = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public void tail(yarnwrap.client.model.ModelPart value) { wrapperContained.tail = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
public DolphinEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.DolphinEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}