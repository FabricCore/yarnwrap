package yarnwrap.client.render.entity.model;
public class SkullEntityModel { public net.minecraft.client.render.entity.model.SkullEntityModel wrapperContained; public SkullEntityModel(net.minecraft.client.render.entity.model.SkullEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
public SkullEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.SkullEntityModel(root.wrapperContained); }
public yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData()); }
public yarnwrap.client.model.TexturedModelData getHeadTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getHeadTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getSkullTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getSkullTexturedModelData()); }

}