package yarnwrap.client.render.entity.model;
public class CodEntityModel { public net.minecraft.client.render.entity.model.CodEntityModel wrapperContained; public CodEntityModel(net.minecraft.client.render.entity.model.CodEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart tailFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.tailFin); }
// public void tailFin(yarnwrap.client.model.ModelPart value) { wrapperContained.tailFin = value.wrapperContained; }
public CodEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.CodEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}