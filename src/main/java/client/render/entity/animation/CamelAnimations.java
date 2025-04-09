package yarnwrap.client.render.entity.animation;
public class CamelAnimations { public net.minecraft.client.render.entity.animation.CamelAnimations wrapperContained; public CamelAnimations(net.minecraft.client.render.entity.animation.CamelAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation WALKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.WALKING); }
public yarnwrap.client.render.entity.animation.Animation SITTING_TRANSITION() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SITTING_TRANSITION); }
public yarnwrap.client.render.entity.animation.Animation STANDING_TRANSITION() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.STANDING_TRANSITION); }
public yarnwrap.client.render.entity.animation.Animation DASHING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.DASHING); }
public yarnwrap.client.render.entity.animation.Animation IDLING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.IDLING); }
public yarnwrap.client.render.entity.animation.Animation SITTING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SITTING); }

}