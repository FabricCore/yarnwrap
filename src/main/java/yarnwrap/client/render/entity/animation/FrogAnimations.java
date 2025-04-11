package yarnwrap.client.render.entity.animation;
public class FrogAnimations { public net.minecraft.client.render.entity.animation.FrogAnimations wrapperContained; public FrogAnimations(net.minecraft.client.render.entity.animation.FrogAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation CROAKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.CROAKING); }
// public void CROAKING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.CROAKING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation WALKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.WALKING); }
// public void WALKING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.WALKING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation LONG_JUMPING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.LONG_JUMPING); }
// public void LONG_JUMPING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.LONG_JUMPING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation USING_TONGUE() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.USING_TONGUE); }
// public void USING_TONGUE(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.USING_TONGUE = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation SWIMMING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SWIMMING); }
// public void SWIMMING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.SWIMMING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation IDLING_IN_WATER() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.IDLING_IN_WATER); }
// public void IDLING_IN_WATER(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.IDLING_IN_WATER = value.wrapperContained; }

}