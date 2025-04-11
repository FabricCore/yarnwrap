package yarnwrap.client.render.entity.animation;
public class CamelAnimations { public net.minecraft.client.render.entity.animation.CamelAnimations wrapperContained; public CamelAnimations(net.minecraft.client.render.entity.animation.CamelAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation WALKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.WALKING); }
// public void WALKING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.WALKING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation SITTING_TRANSITION() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SITTING_TRANSITION); }
// public void SITTING_TRANSITION(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.SITTING_TRANSITION = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation STANDING_TRANSITION() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.STANDING_TRANSITION); }
// public void STANDING_TRANSITION(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.STANDING_TRANSITION = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation DASHING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.DASHING); }
// public void DASHING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.DASHING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation IDLING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.IDLING); }
// public void IDLING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.IDLING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation SITTING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SITTING); }
// public void SITTING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.SITTING = value.wrapperContained; }

}