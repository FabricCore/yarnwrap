package yarnwrap.client.render.entity.model;
public class ChestBoatEntityModel { public net.minecraft.client.render.entity.model.ChestBoatEntityModel wrapperContained; public ChestBoatEntityModel(net.minecraft.client.render.entity.model.ChestBoatEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String CHEST_BOTTOM() { return wrapperContained.CHEST_BOTTOM; }
// public void CHEST_BOTTOM(java.lang.String value) { wrapperContained.CHEST_BOTTOM = value; }
// public java.lang.String CHEST_LID() { return wrapperContained.CHEST_LID; }
// public void CHEST_LID(java.lang.String value) { wrapperContained.CHEST_LID = value; }
// public java.lang.String CHEST_LOCK() { return wrapperContained.CHEST_LOCK; }
// public void CHEST_LOCK(java.lang.String value) { wrapperContained.CHEST_LOCK = value; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}