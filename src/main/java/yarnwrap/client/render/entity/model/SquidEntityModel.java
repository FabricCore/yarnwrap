package yarnwrap.client.render.entity.model;
public class SquidEntityModel { public net.minecraft.client.render.entity.model.SquidEntityModel wrapperContained; public SquidEntityModel(net.minecraft.client.render.entity.model.SquidEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public net.minecraft.client.model.ModelPart[] tentacles() { return wrapperContained.tentacles; }
// public void tentacles(net.minecraft.client.model.ModelPart[] value) { wrapperContained.tentacles = value; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public java.lang.String getTentacleName(int index) { return wrapperContained.getTentacleName(index); }

}