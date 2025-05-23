package yarnwrap.client.render.block.entity.model;
public class ChestBlockModel { public net.minecraft.client.render.block.entity.model.ChestBlockModel wrapperContained; public ChestBlockModel(net.minecraft.client.render.block.entity.model.ChestBlockModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String BOTTOM() { return wrapperContained.BOTTOM; }
// public void BOTTOM(java.lang.String value) { wrapperContained.BOTTOM = value; }
// public static java.lang.String BOTTOM() { return net.minecraft.client.render.block.entity.model.ChestBlockModel.BOTTOM; }
// public static void BOTTOM(java.lang.String value, ) { net.minecraft.client.render.block.entity.model.ChestBlockModel.BOTTOM = value; }

// public java.lang.String LID() { return wrapperContained.LID; }
// public void LID(java.lang.String value) { wrapperContained.LID = value; }
// public static java.lang.String LID() { return net.minecraft.client.render.block.entity.model.ChestBlockModel.LID; }
// public static void LID(java.lang.String value, ) { net.minecraft.client.render.block.entity.model.ChestBlockModel.LID = value; }

// public java.lang.String LOCK() { return wrapperContained.LOCK; }
// public void LOCK(java.lang.String value) { wrapperContained.LOCK = value; }
// public static java.lang.String LOCK() { return net.minecraft.client.render.block.entity.model.ChestBlockModel.LOCK; }
// public static void LOCK(java.lang.String value, ) { net.minecraft.client.render.block.entity.model.ChestBlockModel.LOCK = value; }

// public yarnwrap.client.model.ModelPart lid() { return new yarnwrap.client.model.ModelPart(wrapperContained.lid); }
// public void lid(yarnwrap.client.model.ModelPart value) { wrapperContained.lid = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart lid() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.block.entity.model.ChestBlockModel.lid); }
// public static void lid(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.block.entity.model.ChestBlockModel.lid = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart lock() { return new yarnwrap.client.model.ModelPart(wrapperContained.lock); }
// public void lock(yarnwrap.client.model.ModelPart value) { wrapperContained.lock = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart lock() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.block.entity.model.ChestBlockModel.lock); }
// public static void lock(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.block.entity.model.ChestBlockModel.lock = value.wrapperContained; }

public ChestBlockModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.block.entity.model.ChestBlockModel(root.wrapperContained); }
public void setLockAndLidPitch(float animationProgress) { wrapperContained.setLockAndLidPitch(animationProgress); }
// public static void setLockAndLidPitch(float animationProgress, ) { net.minecraft.client.render.block.entity.model.ChestBlockModel.setLockAndLidPitch(animationProgress); }
// public yarnwrap.client.model.TexturedModelData getSingleTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getSingleTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getSingleTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.block.entity.model.ChestBlockModel.getSingleTexturedModelData()); }
// public yarnwrap.client.model.TexturedModelData getDoubleChestRightTexturedBlockData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getDoubleChestRightTexturedBlockData()); }
public static yarnwrap.client.model.TexturedModelData getDoubleChestRightTexturedBlockData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.block.entity.model.ChestBlockModel.getDoubleChestRightTexturedBlockData()); }
// public yarnwrap.client.model.TexturedModelData getDoubleChestLeftTexturedBlockData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getDoubleChestLeftTexturedBlockData()); }
public static yarnwrap.client.model.TexturedModelData getDoubleChestLeftTexturedBlockData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.block.entity.model.ChestBlockModel.getDoubleChestLeftTexturedBlockData()); }

}