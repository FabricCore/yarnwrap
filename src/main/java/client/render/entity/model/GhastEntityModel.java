package yarnwrap.client.render.entity.model;
public class GhastEntityModel { public net.minecraft.client.render.entity.model.GhastEntityModel wrapperContained; public GhastEntityModel(net.minecraft.client.render.entity.model.GhastEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public net.minecraft.client.model.ModelPart[] tentacles() { return wrapperContained.tentacles; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public java.lang.String getTentacleName(int index) { return wrapperContained.getTentacleName(index); }

}