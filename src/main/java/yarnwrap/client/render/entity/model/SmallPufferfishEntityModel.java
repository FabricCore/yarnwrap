package yarnwrap.client.render.entity.model;
public class SmallPufferfishEntityModel { public net.minecraft.client.render.entity.model.SmallPufferfishEntityModel wrapperContained; public SmallPufferfishEntityModel(net.minecraft.client.render.entity.model.SmallPufferfishEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SmallPufferfishEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SmallPufferfishEntityModel.root = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart leftFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFin); }
// public void leftFin(yarnwrap.client.model.ModelPart value) { wrapperContained.leftFin = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftFin() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SmallPufferfishEntityModel.leftFin); }
// public static void leftFin(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SmallPufferfishEntityModel.leftFin = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart rightFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFin); }
// public void rightFin(yarnwrap.client.model.ModelPart value) { wrapperContained.rightFin = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightFin() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SmallPufferfishEntityModel.rightFin); }
// public static void rightFin(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SmallPufferfishEntityModel.rightFin = value.wrapperContained; }

public SmallPufferfishEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.SmallPufferfishEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SmallPufferfishEntityModel.getTexturedModelData()); }

}