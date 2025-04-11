package yarnwrap.client.render.entity.model;
public class PhantomEntityModel { public net.minecraft.client.render.entity.model.PhantomEntityModel wrapperContained; public PhantomEntityModel(net.minecraft.client.render.entity.model.PhantomEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public java.lang.String TAIL_BASE() { return wrapperContained.TAIL_BASE; }
// public void TAIL_BASE(java.lang.String value) { wrapperContained.TAIL_BASE = value; }
// public java.lang.String TAIL_TIP() { return wrapperContained.TAIL_TIP; }
// public void TAIL_TIP(java.lang.String value) { wrapperContained.TAIL_TIP = value; }
// public yarnwrap.client.model.ModelPart tailBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.tailBase); }
// public void tailBase(yarnwrap.client.model.ModelPart value) { wrapperContained.tailBase = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightWingTip() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWingTip); }
// public void rightWingTip(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWingTip = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart tailTip() { return new yarnwrap.client.model.ModelPart(wrapperContained.tailTip); }
// public void tailTip(yarnwrap.client.model.ModelPart value) { wrapperContained.tailTip = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightWingBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWingBase); }
// public void rightWingBase(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWingBase = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftWingTip() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWingTip); }
// public void leftWingTip(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWingTip = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftWingBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWingBase); }
// public void leftWingBase(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWingBase = value.wrapperContained; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}