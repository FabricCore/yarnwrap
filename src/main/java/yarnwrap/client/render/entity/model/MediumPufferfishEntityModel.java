package yarnwrap.client.render.entity.model;
public class MediumPufferfishEntityModel { public net.minecraft.client.render.entity.model.MediumPufferfishEntityModel wrapperContained; public MediumPufferfishEntityModel(net.minecraft.client.render.entity.model.MediumPufferfishEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.MediumPufferfishEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.MediumPufferfishEntityModel.root = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart leftBlueFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftBlueFin); }
// public void leftBlueFin(yarnwrap.client.model.ModelPart value) { wrapperContained.leftBlueFin = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftBlueFin() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.MediumPufferfishEntityModel.leftBlueFin); }
// public static void leftBlueFin(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.MediumPufferfishEntityModel.leftBlueFin = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart rightBlueFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightBlueFin); }
// public void rightBlueFin(yarnwrap.client.model.ModelPart value) { wrapperContained.rightBlueFin = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightBlueFin() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.MediumPufferfishEntityModel.rightBlueFin); }
// public static void rightBlueFin(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.MediumPufferfishEntityModel.rightBlueFin = value.wrapperContained; }

public MediumPufferfishEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.MediumPufferfishEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.MediumPufferfishEntityModel.getTexturedModelData()); }

}