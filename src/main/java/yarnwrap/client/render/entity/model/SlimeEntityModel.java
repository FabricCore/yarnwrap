package yarnwrap.client.render.entity.model;
public class SlimeEntityModel { public net.minecraft.client.render.entity.model.SlimeEntityModel wrapperContained; public SlimeEntityModel(net.minecraft.client.render.entity.model.SlimeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
public SlimeEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.SlimeEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getOuterTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getOuterTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getInnerTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getInnerTexturedModelData()); }

}