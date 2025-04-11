package yarnwrap.client.render.entity.model;
public class MagmaCubeEntityModel { public net.minecraft.client.render.entity.model.MagmaCubeEntityModel wrapperContained; public MagmaCubeEntityModel(net.minecraft.client.render.entity.model.MagmaCubeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public int SLICES_COUNT() { return wrapperContained.SLICES_COUNT; }
// public void SLICES_COUNT(int value) { wrapperContained.SLICES_COUNT = value; }
// public net.minecraft.client.model.ModelPart[] slices() { return wrapperContained.slices; }
// public void slices(net.minecraft.client.model.ModelPart[] value) { wrapperContained.slices = value; }
public MagmaCubeEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.MagmaCubeEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public java.lang.String getSliceName(int index) { return wrapperContained.getSliceName(index); }
// public yarnwrap.client.model.ModelPart method_32016(yarnwrap.client.model.ModelPart index) { return new yarnwrap.client.model.ModelPart(wrapperContained.method_32016(index.wrapperContained)); }

}