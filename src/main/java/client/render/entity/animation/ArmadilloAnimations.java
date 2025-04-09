package yarnwrap.client.render.entity.animation;
public class ArmadilloAnimations { public net.minecraft.client.render.entity.animation.ArmadilloAnimations wrapperContained; public ArmadilloAnimations(net.minecraft.client.render.entity.animation.ArmadilloAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation IDLE() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.IDLE); }
public yarnwrap.client.render.entity.animation.Animation ROLLING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.ROLLING); }
public yarnwrap.client.render.entity.animation.Animation SCARED() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SCARED); }
public yarnwrap.client.render.entity.animation.Animation UNROLLING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.UNROLLING); }

}