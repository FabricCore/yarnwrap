package yarnwrap.client.render.entity.animation;
public class WardenAnimations { public net.minecraft.client.render.entity.animation.WardenAnimations wrapperContained; public WardenAnimations(net.minecraft.client.render.entity.animation.WardenAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.animation.Animation EMERGING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.EMERGING); }
// public void EMERGING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.EMERGING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation DIGGING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.DIGGING); }
// public void DIGGING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.DIGGING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation ROARING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.ROARING); }
// public void ROARING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.ROARING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation SNIFFING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SNIFFING); }
// public void SNIFFING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.SNIFFING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation ATTACKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.ATTACKING); }
// public void ATTACKING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.ATTACKING = value.wrapperContained; }
public yarnwrap.client.render.entity.animation.Animation CHARGING_SONIC_BOOM() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.CHARGING_SONIC_BOOM); }
// public void CHARGING_SONIC_BOOM(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.CHARGING_SONIC_BOOM = value.wrapperContained; }

}