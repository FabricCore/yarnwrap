package yarnwrap.client.render.entity.model;
public class LeashKnotEntityModel { public net.minecraft.client.render.entity.model.LeashKnotEntityModel wrapperContained; public LeashKnotEntityModel(net.minecraft.client.render.entity.model.LeashKnotEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public java.lang.String KNOT() { return wrapperContained.KNOT; }
// public void KNOT(java.lang.String value) { wrapperContained.KNOT = value; }
// public yarnwrap.client.model.ModelPart knot() { return new yarnwrap.client.model.ModelPart(wrapperContained.knot); }
// public void knot(yarnwrap.client.model.ModelPart value) { wrapperContained.knot = value.wrapperContained; }
public LeashKnotEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.LeashKnotEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}