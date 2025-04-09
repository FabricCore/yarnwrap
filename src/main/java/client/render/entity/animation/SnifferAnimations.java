package yarnwrap.client.render.entity.animation;
public class SnifferAnimations { public net.minecraft.client.render.entity.animation.SnifferAnimations wrapperContained; public SnifferAnimations(net.minecraft.client.render.entity.animation.SnifferAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation SCENTING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SCENTING); }
public yarnwrap.client.render.entity.animation.Animation SNIFFING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SNIFFING); }
public yarnwrap.client.render.entity.animation.Animation WALKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.WALKING); }
public yarnwrap.client.render.entity.animation.Animation SEARCHING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SEARCHING); }
public yarnwrap.client.render.entity.animation.Animation DIGGING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.DIGGING); }
public yarnwrap.client.render.entity.animation.Animation RISING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.RISING); }
public yarnwrap.client.render.entity.animation.Animation FEELING_HAPPY() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.FEELING_HAPPY); }
public yarnwrap.client.render.entity.animation.Animation BABY_GROWTH() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.BABY_GROWTH); }

}