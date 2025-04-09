package yarnwrap.client.render.entity.model;
public class WolfEntityModel { public net.minecraft.client.render.entity.model.WolfEntityModel wrapperContained; public WolfEntityModel(net.minecraft.client.render.entity.model.WolfEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart realHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.realHead); }
// public yarnwrap.client.model.ModelPart realTail() { return new yarnwrap.client.model.ModelPart(wrapperContained.realTail); }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public java.lang.String REAL_HEAD() { return wrapperContained.REAL_HEAD; }
// public java.lang.String UPPER_BODY() { return wrapperContained.UPPER_BODY; }
// public java.lang.String REAL_TAIL() { return wrapperContained.REAL_TAIL; }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public yarnwrap.client.model.ModelPart neck() { return new yarnwrap.client.model.ModelPart(wrapperContained.neck); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart torso() { return new yarnwrap.client.model.ModelPart(wrapperContained.torso); }
public yarnwrap.client.model.ModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.ModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }

}