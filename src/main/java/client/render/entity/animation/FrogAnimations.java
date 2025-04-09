package yarnwrap.client.render.entity.animation;
public class FrogAnimations { public net.minecraft.client.render.entity.animation.FrogAnimations wrapperContained; public FrogAnimations(net.minecraft.client.render.entity.animation.FrogAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation CROAKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.CROAKING); }
public yarnwrap.client.render.entity.animation.Animation WALKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.WALKING); }
public yarnwrap.client.render.entity.animation.Animation LONG_JUMPING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.LONG_JUMPING); }
public yarnwrap.client.render.entity.animation.Animation USING_TONGUE() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.USING_TONGUE); }
public yarnwrap.client.render.entity.animation.Animation SWIMMING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SWIMMING); }
public yarnwrap.client.render.entity.animation.Animation IDLING_IN_WATER() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.IDLING_IN_WATER); }

}