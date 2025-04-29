package yarnwrap.client.render.entity.model;
public class ParrotEntityModel { public net.minecraft.client.render.entity.model.ParrotEntityModel wrapperContained; public ParrotEntityModel(net.minecraft.client.render.entity.model.ParrotEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ParrotEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.root = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public void leftWing(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWing = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ParrotEntityModel.leftWing); }
// public static void leftWing(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.leftWing = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public void rightWing(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWing = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ParrotEntityModel.rightWing); }
// public static void rightWing(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.rightWing = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public void leftLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftLeg = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ParrotEntityModel.leftLeg); }
// public static void leftLeg(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.leftLeg = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public void rightLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightLeg = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ParrotEntityModel.rightLeg); }
// public static void rightLeg(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.rightLeg = value.wrapperContained; }

// public java.lang.String FEATHER() { return wrapperContained.FEATHER; }
// public void FEATHER(java.lang.String value) { wrapperContained.FEATHER = value; }
// public static java.lang.String FEATHER() { return net.minecraft.client.render.entity.model.ParrotEntityModel.FEATHER; }
// public static void FEATHER(java.lang.String value, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.FEATHER = value; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ParrotEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.head = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart feather() { return new yarnwrap.client.model.ModelPart(wrapperContained.feather); }
// public void feather(yarnwrap.client.model.ModelPart value) { wrapperContained.feather = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart feather() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ParrotEntityModel.feather); }
// public static void feather(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.feather = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ParrotEntityModel.body); }
// public static void body(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.body = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public void tail(yarnwrap.client.model.ModelPart value) { wrapperContained.tail = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ParrotEntityModel.tail); }
// public static void tail(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.tail = value.wrapperContained; }

public ParrotEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.ParrotEntityModel(root.wrapperContained); }
public void poseOnShoulder(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,int light,int overlay,float limbAngle,float limbDistance,float headYaw,float headPitch,int danceAngle) { wrapperContained.poseOnShoulder(matrices.wrapperContained,vertexConsumer.wrapperContained,light,overlay,limbAngle,limbDistance,headYaw,headPitch,danceAngle); }
// public static void poseOnShoulder(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,int light,int overlay,float limbAngle,float limbDistance,float headYaw,float headPitch,int danceAngle, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.poseOnShoulder(matrices.wrapperContained,vertexConsumer.wrapperContained,light,overlay,limbAngle,limbDistance,headYaw,headPitch,danceAngle); }
// public Object getPose(yarnwrap.entity.passive.ParrotEntity parrot) { return wrapperContained.getPose(parrot.wrapperContained); }
// public static Object getPose(yarnwrap.entity.passive.ParrotEntity parrot, ) { return net.minecraft.client.render.entity.model.ParrotEntityModel.getPose(parrot.wrapperContained); }
// public void animateModel(Object pose) { wrapperContained.animateModel(pose); }
// public static void animateModel(Object pose, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.animateModel(pose); }
// public void setAngles(Object pose,int danceAngle,float limbAngle,float limbDistance,float age,float headYaw,float headPitch) { wrapperContained.setAngles(pose,danceAngle,limbAngle,limbDistance,age,headYaw,headPitch); }
// public static void setAngles(Object pose,int danceAngle,float limbAngle,float limbDistance,float age,float headYaw,float headPitch, ) { net.minecraft.client.render.entity.model.ParrotEntityModel.setAngles(pose,danceAngle,limbAngle,limbDistance,age,headYaw,headPitch); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ParrotEntityModel.getTexturedModelData()); }

}