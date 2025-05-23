package yarnwrap.client.render.entity.model;
public class TadpoleEntityModel { public net.minecraft.client.render.entity.model.TadpoleEntityModel wrapperContained; public TadpoleEntityModel(net.minecraft.client.render.entity.model.TadpoleEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public void tail(yarnwrap.client.model.ModelPart value) { wrapperContained.tail = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.TadpoleEntityModel.tail); }
// public static void tail(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.TadpoleEntityModel.tail = value.wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.TadpoleEntityModel.getTexturedModelData()); }

}