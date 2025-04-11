package yarnwrap.client.render.entity.model;
public class CrossbowPosing { public net.minecraft.client.render.entity.model.CrossbowPosing wrapperContained; public CrossbowPosing(net.minecraft.client.render.entity.model.CrossbowPosing wrapperContained) { this.wrapperContained = wrapperContained; }

public void charge(yarnwrap.client.model.ModelPart holdingArm,yarnwrap.client.model.ModelPart pullingArm,yarnwrap.entity.LivingEntity actor,boolean rightArmed) { wrapperContained.charge(holdingArm.wrapperContained,pullingArm.wrapperContained,actor.wrapperContained,rightArmed); }
public void hold(yarnwrap.client.model.ModelPart holdingArm,yarnwrap.client.model.ModelPart otherArm,yarnwrap.client.model.ModelPart head,boolean rightArmed) { wrapperContained.hold(holdingArm.wrapperContained,otherArm.wrapperContained,head.wrapperContained,rightArmed); }
public void swingArm(yarnwrap.client.model.ModelPart arm,float animationProgress,float sigma) { wrapperContained.swingArm(arm.wrapperContained,animationProgress,sigma); }
public void meleeAttack(yarnwrap.client.model.ModelPart leftArm,yarnwrap.client.model.ModelPart rightArm,yarnwrap.entity.mob.MobEntity actor,float swingProgress,float animationProgress) { wrapperContained.meleeAttack(leftArm.wrapperContained,rightArm.wrapperContained,actor.wrapperContained,swingProgress,animationProgress); }
public void meleeAttack(yarnwrap.client.model.ModelPart leftArm,yarnwrap.client.model.ModelPart rightArm,boolean attacking,float swingProgress,float animationProgress) { wrapperContained.meleeAttack(leftArm.wrapperContained,rightArm.wrapperContained,attacking,swingProgress,animationProgress); }
public void swingArms(yarnwrap.client.model.ModelPart leftArm,yarnwrap.client.model.ModelPart rightArm,float animationProgress) { wrapperContained.swingArms(leftArm.wrapperContained,rightArm.wrapperContained,animationProgress); }

}