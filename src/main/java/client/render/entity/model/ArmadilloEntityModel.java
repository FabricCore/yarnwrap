package yarnwrap.client.render.entity.model;
public class ArmadilloEntityModel { public net.minecraft.client.render.entity.model.ArmadilloEntityModel wrapperContained; public ArmadilloEntityModel(net.minecraft.client.render.entity.model.ArmadilloEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String HEAD_CUBE() { return wrapperContained.HEAD_CUBE; }
// public java.lang.String RIGHT_EAR_CUBE() { return wrapperContained.RIGHT_EAR_CUBE; }
// public java.lang.String LEFT_EAR_CUBE() { return wrapperContained.LEFT_EAR_CUBE; }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public yarnwrap.client.model.ModelPart cube() { return new yarnwrap.client.model.ModelPart(wrapperContained.cube); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}