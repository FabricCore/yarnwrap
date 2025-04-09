package yarnwrap.client.render.entity.model;
public class PhantomEntityModel { public net.minecraft.client.render.entity.model.PhantomEntityModel wrapperContained; public PhantomEntityModel(net.minecraft.client.render.entity.model.PhantomEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public java.lang.String TAIL_BASE() { return wrapperContained.TAIL_BASE; }
// public java.lang.String TAIL_TIP() { return wrapperContained.TAIL_TIP; }
// public yarnwrap.client.model.ModelPart tailBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.tailBase); }
// public yarnwrap.client.model.ModelPart rightWingTip() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWingTip); }
// public yarnwrap.client.model.ModelPart tailTip() { return new yarnwrap.client.model.ModelPart(wrapperContained.tailTip); }
// public yarnwrap.client.model.ModelPart rightWingBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWingBase); }
// public yarnwrap.client.model.ModelPart leftWingTip() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWingTip); }
// public yarnwrap.client.model.ModelPart leftWingBase() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWingBase); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}