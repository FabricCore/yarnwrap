package yarnwrap.client.render.entity.animation;
public class CreakingAnimations { public net.minecraft.client.render.entity.animation.CreakingAnimations wrapperContained; public CreakingAnimations(net.minecraft.client.render.entity.animation.CreakingAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.animation.Animation WALKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.WALKING); }
// public void WALKING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.WALKING = value.wrapperContained; }
public static yarnwrap.client.render.entity.animation.Animation WALKING() { return new yarnwrap.client.render.entity.animation.Animation(net.minecraft.client.render.entity.animation.CreakingAnimations.WALKING); }
// public static void WALKING(yarnwrap.client.render.entity.animation.Animation value, ) { net.minecraft.client.render.entity.animation.CreakingAnimations.WALKING = value.wrapperContained; }

// public yarnwrap.client.render.entity.animation.Animation ATTACKING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.ATTACKING); }
// public void ATTACKING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.ATTACKING = value.wrapperContained; }
public static yarnwrap.client.render.entity.animation.Animation ATTACKING() { return new yarnwrap.client.render.entity.animation.Animation(net.minecraft.client.render.entity.animation.CreakingAnimations.ATTACKING); }
// public static void ATTACKING(yarnwrap.client.render.entity.animation.Animation value, ) { net.minecraft.client.render.entity.animation.CreakingAnimations.ATTACKING = value.wrapperContained; }

// public yarnwrap.client.render.entity.animation.Animation INVULNERABLE() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.INVULNERABLE); }
// public void INVULNERABLE(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.INVULNERABLE = value.wrapperContained; }
public static yarnwrap.client.render.entity.animation.Animation INVULNERABLE() { return new yarnwrap.client.render.entity.animation.Animation(net.minecraft.client.render.entity.animation.CreakingAnimations.INVULNERABLE); }
// public static void INVULNERABLE(yarnwrap.client.render.entity.animation.Animation value, ) { net.minecraft.client.render.entity.animation.CreakingAnimations.INVULNERABLE = value.wrapperContained; }

// public yarnwrap.client.render.entity.animation.Animation CRUMBLING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.CRUMBLING); }
// public void CRUMBLING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.CRUMBLING = value.wrapperContained; }
public static yarnwrap.client.render.entity.animation.Animation CRUMBLING() { return new yarnwrap.client.render.entity.animation.Animation(net.minecraft.client.render.entity.animation.CreakingAnimations.CRUMBLING); }
// public static void CRUMBLING(yarnwrap.client.render.entity.animation.Animation value, ) { net.minecraft.client.render.entity.animation.CreakingAnimations.CRUMBLING = value.wrapperContained; }


}