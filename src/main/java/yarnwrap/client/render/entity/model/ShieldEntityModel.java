package yarnwrap.client.render.entity.model;
public class ShieldEntityModel { public net.minecraft.client.render.entity.model.ShieldEntityModel wrapperContained; public ShieldEntityModel(net.minecraft.client.render.entity.model.ShieldEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart plate() { return new yarnwrap.client.model.ModelPart(wrapperContained.plate); }
// public void plate(yarnwrap.client.model.ModelPart value) { wrapperContained.plate = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart plate() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ShieldEntityModel.plate); }
// public static void plate(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ShieldEntityModel.plate = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart handle() { return new yarnwrap.client.model.ModelPart(wrapperContained.handle); }
// public void handle(yarnwrap.client.model.ModelPart value) { wrapperContained.handle = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart handle() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ShieldEntityModel.handle); }
// public static void handle(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ShieldEntityModel.handle = value.wrapperContained; }

// public java.lang.String PLATE() { return wrapperContained.PLATE; }
// public void PLATE(java.lang.String value) { wrapperContained.PLATE = value; }
// public static java.lang.String PLATE() { return net.minecraft.client.render.entity.model.ShieldEntityModel.PLATE; }
// public static void PLATE(java.lang.String value, ) { net.minecraft.client.render.entity.model.ShieldEntityModel.PLATE = value; }

// public java.lang.String HANDLE() { return wrapperContained.HANDLE; }
// public void HANDLE(java.lang.String value) { wrapperContained.HANDLE = value; }
// public static java.lang.String HANDLE() { return net.minecraft.client.render.entity.model.ShieldEntityModel.HANDLE; }
// public static void HANDLE(java.lang.String value, ) { net.minecraft.client.render.entity.model.ShieldEntityModel.HANDLE = value; }

public ShieldEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.ShieldEntityModel(root.wrapperContained); }
public yarnwrap.client.model.ModelPart getPlate() { return new yarnwrap.client.model.ModelPart(wrapperContained.getPlate()); }
// public static yarnwrap.client.model.ModelPart getPlate() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ShieldEntityModel.getPlate()); }
public yarnwrap.client.model.ModelPart getHandle() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHandle()); }
// public static yarnwrap.client.model.ModelPart getHandle() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ShieldEntityModel.getHandle()); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ShieldEntityModel.getTexturedModelData()); }

}