package yarnwrap.client.render.entity.animation;
public class BatAnimations { public net.minecraft.client.render.entity.animation.BatAnimations wrapperContained; public BatAnimations(net.minecraft.client.render.entity.animation.BatAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation ROOSTING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.ROOSTING); }
// public void ROOSTING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.ROOSTING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation FLYING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.FLYING); }
// public void FLYING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.FLYING = value.wrapperContained; }

}