package yarnwrap.client.render.entity.model;
public class LeashKnotEntityModel { public net.minecraft.client.render.entity.model.LeashKnotEntityModel wrapperContained; public LeashKnotEntityModel(net.minecraft.client.render.entity.model.LeashKnotEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public java.lang.String KNOT() { return wrapperContained.KNOT; }
// public yarnwrap.client.model.ModelPart knot() { return new yarnwrap.client.model.ModelPart(wrapperContained.knot); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}