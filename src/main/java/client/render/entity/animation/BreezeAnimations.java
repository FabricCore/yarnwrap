package yarnwrap.client.render.entity.animation;
public class BreezeAnimations { public net.minecraft.client.render.entity.animation.BreezeAnimations wrapperContained; public BreezeAnimations(net.minecraft.client.render.entity.animation.BreezeAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation SHOOTING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SHOOTING); }
public yarnwrap.client.render.entity.animation.Animation INHALING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.INHALING); }
public yarnwrap.client.render.entity.animation.Animation SLIDING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SLIDING); }

}