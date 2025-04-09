package yarnwrap.client.render.entity.model;
public class TadpoleEntityModel { public net.minecraft.client.render.entity.model.TadpoleEntityModel wrapperContained; public TadpoleEntityModel(net.minecraft.client.render.entity.model.TadpoleEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}