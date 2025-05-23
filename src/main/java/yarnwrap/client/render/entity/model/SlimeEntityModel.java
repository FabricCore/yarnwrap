package yarnwrap.client.render.entity.model;
public class SlimeEntityModel { public net.minecraft.client.render.entity.model.SlimeEntityModel wrapperContained; public SlimeEntityModel(net.minecraft.client.render.entity.model.SlimeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getOuterTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getOuterTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getOuterTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SlimeEntityModel.getOuterTexturedModelData()); }
// public yarnwrap.client.model.TexturedModelData getInnerTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getInnerTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getInnerTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SlimeEntityModel.getInnerTexturedModelData()); }

}