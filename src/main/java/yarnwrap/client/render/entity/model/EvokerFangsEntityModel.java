package yarnwrap.client.render.entity.model;
public class EvokerFangsEntityModel { public net.minecraft.client.render.entity.model.EvokerFangsEntityModel wrapperContained; public EvokerFangsEntityModel(net.minecraft.client.render.entity.model.EvokerFangsEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public java.lang.String BASE() { return wrapperContained.BASE; }
// public void BASE(java.lang.String value) { wrapperContained.BASE = value; }
// public java.lang.String UPPER_JAW() { return wrapperContained.UPPER_JAW; }
// public void UPPER_JAW(java.lang.String value) { wrapperContained.UPPER_JAW = value; }
// public java.lang.String LOWER_JAW() { return wrapperContained.LOWER_JAW; }
// public void LOWER_JAW(java.lang.String value) { wrapperContained.LOWER_JAW = value; }
// public yarnwrap.client.model.ModelPart base() { return new yarnwrap.client.model.ModelPart(wrapperContained.base); }
// public void base(yarnwrap.client.model.ModelPart value) { wrapperContained.base = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart lowerJaw() { return new yarnwrap.client.model.ModelPart(wrapperContained.lowerJaw); }
// public void lowerJaw(yarnwrap.client.model.ModelPart value) { wrapperContained.lowerJaw = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart upperJaw() { return new yarnwrap.client.model.ModelPart(wrapperContained.upperJaw); }
// public void upperJaw(yarnwrap.client.model.ModelPart value) { wrapperContained.upperJaw = value.wrapperContained; }
public EvokerFangsEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.EvokerFangsEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}