package yarnwrap.client.render.entity.model;
public class SinglePartEntityModel { public net.minecraft.client.render.entity.model.SinglePartEntityModel wrapperContained; public SinglePartEntityModel(net.minecraft.client.render.entity.model.SinglePartEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Vector3f TEMP() { return wrapperContained.TEMP; }
// public void TEMP(org.joml.Vector3f value) { wrapperContained.TEMP = value; }
public yarnwrap.client.model.ModelPart getPart() { return new yarnwrap.client.model.ModelPart(wrapperContained.getPart()); }
public java.util.Optional getChild(java.lang.String name) { return wrapperContained.getChild(name); }
// public yarnwrap.client.model.ModelPart method_41910(java.lang.String part) { return new yarnwrap.client.model.ModelPart(wrapperContained.method_41910(part)); }
// public boolean method_41911(java.lang.String part) { return wrapperContained.method_41911(part); }
// public void updateAnimation(yarnwrap.entity.AnimationState animationState,yarnwrap.client.render.entity.animation.Animation animation,float animationProgress) { wrapperContained.updateAnimation(animationState.wrapperContained,animation.wrapperContained,animationProgress); }
// public void updateAnimation(yarnwrap.entity.AnimationState animationState,yarnwrap.client.render.entity.animation.Animation animation,float animationProgress,float speedMultiplier) { wrapperContained.updateAnimation(animationState.wrapperContained,animation.wrapperContained,animationProgress,speedMultiplier); }
// public void method_43783(yarnwrap.client.render.entity.animation.Animation state) { wrapperContained.method_43783(state.wrapperContained); }
// public void animateMovement(yarnwrap.client.render.entity.animation.Animation animation,float limbAngle,float limbDistance,float limbAngleScale,float limbDistanceScale) { wrapperContained.animateMovement(animation.wrapperContained,limbAngle,limbDistance,limbAngleScale,limbDistanceScale); }
// public void animate(yarnwrap.client.render.entity.animation.Animation animation) { wrapperContained.animate(animation.wrapperContained); }

}