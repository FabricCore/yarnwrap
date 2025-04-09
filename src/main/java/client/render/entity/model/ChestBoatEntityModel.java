package yarnwrap.client.render.entity.model;
public class ChestBoatEntityModel { public net.minecraft.client.render.entity.model.ChestBoatEntityModel wrapperContained; public ChestBoatEntityModel(net.minecraft.client.render.entity.model.ChestBoatEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String CHEST_BOTTOM() { return wrapperContained.CHEST_BOTTOM; }
// public java.lang.String CHEST_LID() { return wrapperContained.CHEST_LID; }
// public java.lang.String CHEST_LOCK() { return wrapperContained.CHEST_LOCK; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}