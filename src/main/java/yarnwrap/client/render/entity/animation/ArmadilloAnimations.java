package yarnwrap.client.render.entity.animation;
public class ArmadilloAnimations { public net.minecraft.client.render.entity.animation.ArmadilloAnimations wrapperContained; public ArmadilloAnimations(net.minecraft.client.render.entity.animation.ArmadilloAnimations wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.animation.Animation IDLE() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.IDLE); }
// public void IDLE(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.IDLE = value.wrapperContained; }
public static yarnwrap.client.render.entity.animation.Animation IDLE() { return new yarnwrap.client.render.entity.animation.Animation(net.minecraft.client.render.entity.animation.ArmadilloAnimations.IDLE); }
// public static void IDLE(yarnwrap.client.render.entity.animation.Animation value, ) { net.minecraft.client.render.entity.animation.ArmadilloAnimations.IDLE = value.wrapperContained; }

// public yarnwrap.client.render.entity.animation.Animation ROLLING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.ROLLING); }
// public void ROLLING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.ROLLING = value.wrapperContained; }
public static yarnwrap.client.render.entity.animation.Animation ROLLING() { return new yarnwrap.client.render.entity.animation.Animation(net.minecraft.client.render.entity.animation.ArmadilloAnimations.ROLLING); }
// public static void ROLLING(yarnwrap.client.render.entity.animation.Animation value, ) { net.minecraft.client.render.entity.animation.ArmadilloAnimations.ROLLING = value.wrapperContained; }

// public yarnwrap.client.render.entity.animation.Animation SCARED() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.SCARED); }
// public void SCARED(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.SCARED = value.wrapperContained; }
public static yarnwrap.client.render.entity.animation.Animation SCARED() { return new yarnwrap.client.render.entity.animation.Animation(net.minecraft.client.render.entity.animation.ArmadilloAnimations.SCARED); }
// public static void SCARED(yarnwrap.client.render.entity.animation.Animation value, ) { net.minecraft.client.render.entity.animation.ArmadilloAnimations.SCARED = value.wrapperContained; }

// public yarnwrap.client.render.entity.animation.Animation UNROLLING() { return new yarnwrap.client.render.entity.animation.Animation(wrapperContained.UNROLLING); }
// public void UNROLLING(yarnwrap.client.render.entity.animation.Animation value) { wrapperContained.UNROLLING = value.wrapperContained; }
public static yarnwrap.client.render.entity.animation.Animation UNROLLING() { return new yarnwrap.client.render.entity.animation.Animation(net.minecraft.client.render.entity.animation.ArmadilloAnimations.UNROLLING); }
// public static void UNROLLING(yarnwrap.client.render.entity.animation.Animation value, ) { net.minecraft.client.render.entity.animation.ArmadilloAnimations.UNROLLING = value.wrapperContained; }


}