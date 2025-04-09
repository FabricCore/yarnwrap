package yarnwrap.client.render.entity.model;
public class EntityModel { public net.minecraft.client.render.entity.model.EntityModel wrapperContained; public EntityModel(net.minecraft.client.render.entity.model.EntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public float handSwingProgress() { return wrapperContained.handSwingProgress; }
public boolean child() { return wrapperContained.child; }
public boolean riding() { return wrapperContained.riding; }
public void copyStateTo(yarnwrap.client.render.entity.model.EntityModel copy) { wrapperContained.copyStateTo(copy.wrapperContained); }
public void animateModel(yarnwrap.entity.Entity entity,float limbAngle,float limbDistance,float tickDelta) { wrapperContained.animateModel(entity.wrapperContained,limbAngle,limbDistance,tickDelta); }
public void setAngles(yarnwrap.entity.Entity entity,float limbAngle,float limbDistance,float animationProgress,float headYaw,float headPitch) { wrapperContained.setAngles(entity.wrapperContained,limbAngle,limbDistance,animationProgress,headYaw,headPitch); }

}