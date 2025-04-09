package yarnwrap.client.render.entity.model;
public class MediumPufferfishEntityModel { public net.minecraft.client.render.entity.model.MediumPufferfishEntityModel wrapperContained; public MediumPufferfishEntityModel(net.minecraft.client.render.entity.model.MediumPufferfishEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart leftBlueFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftBlueFin); }
// public yarnwrap.client.model.ModelPart rightBlueFin() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightBlueFin); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}