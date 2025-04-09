package yarnwrap.client.render.entity.model;
public class MagmaCubeEntityModel { public net.minecraft.client.render.entity.model.MagmaCubeEntityModel wrapperContained; public MagmaCubeEntityModel(net.minecraft.client.render.entity.model.MagmaCubeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public int SLICES_COUNT() { return wrapperContained.SLICES_COUNT; }
// public net.minecraft.client.model.ModelPart[] slices() { return wrapperContained.slices; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public java.lang.String getSliceName(int index) { return wrapperContained.getSliceName(index); }

}