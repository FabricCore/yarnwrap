package yarnwrap.client.render.entity.animation;
public class WardenAnimations { public net.minecraft.client.render.entity.animation.WardenAnimations wrapperContained; public WardenAnimations(net.minecraft.client.render.entity.animation.WardenAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation EMERGING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.EMERGING); }
public yarnwrap.client.render.entity.animation.Animation DIGGING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.DIGGING); }
public yarnwrap.client.render.entity.animation.Animation ROARING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.ROARING); }
public yarnwrap.client.render.entity.animation.Animation SNIFFING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SNIFFING); }
public yarnwrap.client.render.entity.animation.Animation ATTACKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.ATTACKING); }
public yarnwrap.client.render.entity.animation.Animation CHARGING_SONIC_BOOM() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.CHARGING_SONIC_BOOM); }

}