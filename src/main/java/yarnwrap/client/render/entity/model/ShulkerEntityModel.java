package yarnwrap.client.render.entity.model;
public class ShulkerEntityModel { public net.minecraft.client.render.entity.model.ShulkerEntityModel wrapperContained; public ShulkerEntityModel(net.minecraft.client.render.entity.model.ShulkerEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String LID() { return wrapperContained.LID; }
// public void LID(java.lang.String value) { wrapperContained.LID = value; }
// public static java.lang.String LID() { return net.minecraft.client.render.entity.model.ShulkerEntityModel.LID; }
// public static void LID(java.lang.String value, ) { net.minecraft.client.render.entity.model.ShulkerEntityModel.LID = value; }

// public java.lang.String BASE() { return wrapperContained.BASE; }
// public void BASE(java.lang.String value) { wrapperContained.BASE = value; }
// public static java.lang.String BASE() { return net.minecraft.client.render.entity.model.ShulkerEntityModel.BASE; }
// public static void BASE(java.lang.String value, ) { net.minecraft.client.render.entity.model.ShulkerEntityModel.BASE = value; }

// public yarnwrap.client.model.ModelPart base() { return new yarnwrap.client.model.ModelPart(wrapperContained.base); }
// public void base(yarnwrap.client.model.ModelPart value) { wrapperContained.base = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart base() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ShulkerEntityModel.base); }
// public static void base(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ShulkerEntityModel.base = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ShulkerEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ShulkerEntityModel.head = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart lid() { return new yarnwrap.client.model.ModelPart(wrapperContained.lid); }
// public void lid(yarnwrap.client.model.ModelPart value) { wrapperContained.lid = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart lid() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ShulkerEntityModel.lid); }
// public static void lid(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ShulkerEntityModel.lid = value.wrapperContained; }

public ShulkerEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.ShulkerEntityModel(root.wrapperContained); }
public yarnwrap.client.model.ModelPart getLid() { return new yarnwrap.client.model.ModelPart(wrapperContained.getLid()); }
// public static yarnwrap.client.model.ModelPart getLid() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ShulkerEntityModel.getLid()); }
public yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHead()); }
// public static yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ShulkerEntityModel.getHead()); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ShulkerEntityModel.getTexturedModelData()); }

}