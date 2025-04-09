package yarnwrap.client.render.entity.model;
public class EvokerFangsEntityModel { public net.minecraft.client.render.entity.model.EvokerFangsEntityModel wrapperContained; public EvokerFangsEntityModel(net.minecraft.client.render.entity.model.EvokerFangsEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public java.lang.String BASE() { return wrapperContained.BASE; }
// public java.lang.String UPPER_JAW() { return wrapperContained.UPPER_JAW; }
// public java.lang.String LOWER_JAW() { return wrapperContained.LOWER_JAW; }
// public yarnwrap.client.model.ModelPart base() { return new yarnwrap.client.model.ModelPart(wrapperContained.base); }
// public yarnwrap.client.model.ModelPart lowerJaw() { return new yarnwrap.client.model.ModelPart(wrapperContained.lowerJaw); }
// public yarnwrap.client.model.ModelPart upperJaw() { return new yarnwrap.client.model.ModelPart(wrapperContained.upperJaw); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}