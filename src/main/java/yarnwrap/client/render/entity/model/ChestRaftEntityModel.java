package yarnwrap.client.render.entity.model;
public class ChestRaftEntityModel { public net.minecraft.client.render.entity.model.ChestRaftEntityModel wrapperContained; public ChestRaftEntityModel(net.minecraft.client.render.entity.model.ChestRaftEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String CHEST_BOTTOM() { return wrapperContained.CHEST_BOTTOM; }
// public void CHEST_BOTTOM(java.lang.String value) { wrapperContained.CHEST_BOTTOM = value; }
// public static java.lang.String CHEST_BOTTOM() { return net.minecraft.client.render.entity.model.ChestRaftEntityModel.CHEST_BOTTOM; }
// public static void CHEST_BOTTOM(java.lang.String value, ) { net.minecraft.client.render.entity.model.ChestRaftEntityModel.CHEST_BOTTOM = value; }

// public java.lang.String CHEST_LID() { return wrapperContained.CHEST_LID; }
// public void CHEST_LID(java.lang.String value) { wrapperContained.CHEST_LID = value; }
// public static java.lang.String CHEST_LID() { return net.minecraft.client.render.entity.model.ChestRaftEntityModel.CHEST_LID; }
// public static void CHEST_LID(java.lang.String value, ) { net.minecraft.client.render.entity.model.ChestRaftEntityModel.CHEST_LID = value; }

// public java.lang.String CHEST_LOCK() { return wrapperContained.CHEST_LOCK; }
// public void CHEST_LOCK(java.lang.String value) { wrapperContained.CHEST_LOCK = value; }
// public static java.lang.String CHEST_LOCK() { return net.minecraft.client.render.entity.model.ChestRaftEntityModel.CHEST_LOCK; }
// public static void CHEST_LOCK(java.lang.String value, ) { net.minecraft.client.render.entity.model.ChestRaftEntityModel.CHEST_LOCK = value; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ChestRaftEntityModel.getTexturedModelData()); }

}