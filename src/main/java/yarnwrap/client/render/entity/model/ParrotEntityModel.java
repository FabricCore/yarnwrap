package yarnwrap.client.render.entity.model;
public class ParrotEntityModel { public net.minecraft.client.render.entity.model.ParrotEntityModel wrapperContained; public ParrotEntityModel(net.minecraft.client.render.entity.model.ParrotEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public void leftWing(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWing = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public void rightWing(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWing = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public void leftLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public void rightLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightLeg = value.wrapperContained; }
// public java.lang.String FEATHER() { return wrapperContained.FEATHER; }
// public void FEATHER(java.lang.String value) { wrapperContained.FEATHER = value; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart feather() { return new yarnwrap.client.model.ModelPart(wrapperContained.feather); }
// public void feather(yarnwrap.client.model.ModelPart value) { wrapperContained.feather = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public void tail(yarnwrap.client.model.ModelPart value) { wrapperContained.tail = value.wrapperContained; }
public void poseOnShoulder(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,int light,int overlay,float limbAngle,float limbDistance,float headYaw,float headPitch,int danceAngle) { wrapperContained.poseOnShoulder(matrices.wrapperContained,vertexConsumer.wrapperContained,light,overlay,limbAngle,limbDistance,headYaw,headPitch,danceAngle); }
// public Object getPose(yarnwrap.entity.passive.ParrotEntity parrot) { return wrapperContained.getPose(parrot.wrapperContained); }
// public void animateModel(Object pose) { wrapperContained.animateModel(pose); }
// public void setAngles(Object pose,int danceAngle,float limbAngle,float limbDistance,float age,float headYaw,float headPitch) { wrapperContained.setAngles(pose,danceAngle,limbAngle,limbDistance,age,headYaw,headPitch); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}