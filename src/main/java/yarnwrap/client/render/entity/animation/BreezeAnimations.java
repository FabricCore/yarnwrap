package yarnwrap.client.render.entity.animation;
public class BreezeAnimations { public net.minecraft.client.render.entity.animation.BreezeAnimations wrapperContained; public BreezeAnimations(net.minecraft.client.render.entity.animation.BreezeAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation SHOOTING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SHOOTING); }
// public void SHOOTING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.SHOOTING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation INHALING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.INHALING); }
// public void INHALING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.INHALING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation SLIDING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SLIDING); }
// public void SLIDING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.SLIDING = value.wrapperContained; }

}