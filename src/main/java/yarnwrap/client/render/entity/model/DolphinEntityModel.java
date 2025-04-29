package yarnwrap.client.render.entity.model;
public class DolphinEntityModel { public net.minecraft.client.render.entity.model.DolphinEntityModel wrapperContained; public DolphinEntityModel(net.minecraft.client.render.entity.model.DolphinEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.DolphinEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.DolphinEntityModel.root = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart tailFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.tailFin); }
// public void tailFin(yarnwrap.client.model.ModelPart value) { wrapperContained.tailFin = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart tailFin() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.DolphinEntityModel.tailFin); }
// public static void tailFin(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.DolphinEntityModel.tailFin = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public void tail(yarnwrap.client.model.ModelPart value) { wrapperContained.tail = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.DolphinEntityModel.tail); }
// public static void tail(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.DolphinEntityModel.tail = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.DolphinEntityModel.body); }
// public static void body(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.DolphinEntityModel.body = value.wrapperContained; }

public DolphinEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.DolphinEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.DolphinEntityModel.getTexturedModelData()); }

}