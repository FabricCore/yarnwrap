package yarnwrap.client.render.entity.model;
public class WolfEntityModel { public net.minecraft.client.render.entity.model.WolfEntityModel wrapperContained; public WolfEntityModel(net.minecraft.client.render.entity.model.WolfEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart realHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.realHead); }
// public void realHead(yarnwrap.client.model.ModelPart value) { wrapperContained.realHead = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart realTail() { return new yarnwrap.client.model.ModelPart(wrapperContained.realTail); }
// public void realTail(yarnwrap.client.model.ModelPart value) { wrapperContained.realTail = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public void rightHindLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightHindLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public void leftHindLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftHindLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public void rightFrontLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightFrontLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public void leftFrontLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftFrontLeg = value.wrapperContained; }
// public java.lang.String REAL_HEAD() { return wrapperContained.REAL_HEAD; }
// public void REAL_HEAD(java.lang.String value) { wrapperContained.REAL_HEAD = value; }
// public java.lang.String UPPER_BODY() { return wrapperContained.UPPER_BODY; }
// public void UPPER_BODY(java.lang.String value) { wrapperContained.UPPER_BODY = value; }
// public java.lang.String REAL_TAIL() { return wrapperContained.REAL_TAIL; }
// public void REAL_TAIL(java.lang.String value) { wrapperContained.REAL_TAIL = value; }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public void tail(yarnwrap.client.model.ModelPart value) { wrapperContained.tail = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart neck() { return new yarnwrap.client.model.ModelPart(wrapperContained.neck); }
// public void neck(yarnwrap.client.model.ModelPart value) { wrapperContained.neck = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart torso() { return new yarnwrap.client.model.ModelPart(wrapperContained.torso); }
// public void torso(yarnwrap.client.model.ModelPart value) { wrapperContained.torso = value.wrapperContained; }
public WolfEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.WolfEntityModel(root.wrapperContained); }
public yarnwrap.client.model.ModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.ModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }

}