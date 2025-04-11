package yarnwrap.client.render.entity.animation;
public class AnimationHelper { public net.minecraft.client.render.entity.animation.AnimationHelper wrapperContained; public AnimationHelper(net.minecraft.client.render.entity.animation.AnimationHelper wrapperContained) { this.wrapperContained = wrapperContained; }

public org.joml.Vector3f createScalingVector(double x,double y,double z) { return wrapperContained.createScalingVector(x,y,z); }
public org.joml.Vector3f createTranslationalVector(float x,float y,float z) { return wrapperContained.createTranslationalVector(x,y,z); }
// public void method_41824(float transformation) { wrapperContained.method_41824(transformation); }
// public boolean method_41825(float index) { return wrapperContained.method_41825(index); }
// public float getRunningSeconds(yarnwrap.client.render.entity.animation.Animation animation,long runningTime) { return wrapperContained.getRunningSeconds(animation.wrapperContained,runningTime); }
public void animate(yarnwrap.client.render.entity.model.SinglePartEntityModel model,yarnwrap.client.render.entity.animation.Animation animation,long runningTime,float scale,org.joml.Vector3f tempVec) { wrapperContained.animate(model.wrapperContained,animation.wrapperContained,runningTime,scale,tempVec); }
// public void method_41828(java.util.List part) { wrapperContained.method_41828(part); }
public org.joml.Vector3f createRotationalVector(float x,float y,float z) { return wrapperContained.createRotationalVector(x,y,z); }

}