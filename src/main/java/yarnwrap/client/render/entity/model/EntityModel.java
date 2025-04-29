package yarnwrap.client.render.entity.model;
public class EntityModel { public net.minecraft.client.render.entity.model.EntityModel wrapperContained; public EntityModel(net.minecraft.client.render.entity.model.EntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public float handSwingProgress() { return wrapperContained.handSwingProgress; }
public void handSwingProgress(float value) { wrapperContained.handSwingProgress = value; }
// public static float handSwingProgress() { return net.minecraft.client.render.entity.model.EntityModel.handSwingProgress; }
// public static void handSwingProgress(float value, ) { net.minecraft.client.render.entity.model.EntityModel.handSwingProgress = value; }

public boolean child() { return wrapperContained.child; }
public void child(boolean value) { wrapperContained.child = value; }
// public static boolean child() { return net.minecraft.client.render.entity.model.EntityModel.child; }
// public static void child(boolean value, ) { net.minecraft.client.render.entity.model.EntityModel.child = value; }

public boolean riding() { return wrapperContained.riding; }
public void riding(boolean value) { wrapperContained.riding = value; }
// public static boolean riding() { return net.minecraft.client.render.entity.model.EntityModel.riding; }
// public static void riding(boolean value, ) { net.minecraft.client.render.entity.model.EntityModel.riding = value; }

public void copyStateTo(yarnwrap.client.render.entity.model.EntityModel copy) { wrapperContained.copyStateTo(copy.wrapperContained); }
// public static void copyStateTo(yarnwrap.client.render.entity.model.EntityModel copy, ) { net.minecraft.client.render.entity.model.EntityModel.copyStateTo(copy.wrapperContained); }
public void animateModel(yarnwrap.entity.Entity entity,float limbAngle,float limbDistance,float tickDelta) { wrapperContained.animateModel(entity.wrapperContained,limbAngle,limbDistance,tickDelta); }
// public static void animateModel(yarnwrap.entity.Entity entity,float limbAngle,float limbDistance,float tickDelta, ) { net.minecraft.client.render.entity.model.EntityModel.animateModel(entity.wrapperContained,limbAngle,limbDistance,tickDelta); }
public void setAngles(yarnwrap.entity.Entity entity,float limbAngle,float limbDistance,float animationProgress,float headYaw,float headPitch) { wrapperContained.setAngles(entity.wrapperContained,limbAngle,limbDistance,animationProgress,headYaw,headPitch); }
// public static void setAngles(yarnwrap.entity.Entity entity,float limbAngle,float limbDistance,float animationProgress,float headYaw,float headPitch, ) { net.minecraft.client.render.entity.model.EntityModel.setAngles(entity.wrapperContained,limbAngle,limbDistance,animationProgress,headYaw,headPitch); }

}