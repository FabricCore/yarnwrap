package yarnwrap.client.render.entity.model;
public class LargePufferfishEntityModel { public net.minecraft.client.render.entity.model.LargePufferfishEntityModel wrapperContained; public LargePufferfishEntityModel(net.minecraft.client.render.entity.model.LargePufferfishEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.LargePufferfishEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.LargePufferfishEntityModel.root = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart leftBlueFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftBlueFin); }
// public void leftBlueFin(yarnwrap.client.model.ModelPart value) { wrapperContained.leftBlueFin = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftBlueFin() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.LargePufferfishEntityModel.leftBlueFin); }
// public static void leftBlueFin(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.LargePufferfishEntityModel.leftBlueFin = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart rightBlueFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightBlueFin); }
// public void rightBlueFin(yarnwrap.client.model.ModelPart value) { wrapperContained.rightBlueFin = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightBlueFin() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.LargePufferfishEntityModel.rightBlueFin); }
// public static void rightBlueFin(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.LargePufferfishEntityModel.rightBlueFin = value.wrapperContained; }

public LargePufferfishEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.LargePufferfishEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.LargePufferfishEntityModel.getTexturedModelData()); }

}