package yarnwrap.entity.ai.goal;
public class HoldInHandsGoal { public net.minecraft.entity.ai.goal.HoldInHandsGoal wrapperContained; public HoldInHandsGoal(net.minecraft.entity.ai.goal.HoldInHandsGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.MobEntity actor() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.actor); }
// public void actor(yarnwrap.entity.mob.MobEntity value) { wrapperContained.actor = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity actor() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.HoldInHandsGoal.actor); }
// public static void actor(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.HoldInHandsGoal.actor = value.wrapperContained; }

// public yarnwrap.item.ItemStack item() { return new yarnwrap.item.ItemStack(wrapperContained.item); }
// public void item(yarnwrap.item.ItemStack value) { wrapperContained.item = value.wrapperContained; }
// public static yarnwrap.item.ItemStack item() { return new yarnwrap.item.ItemStack(net.minecraft.entity.ai.goal.HoldInHandsGoal.item); }
// public static void item(yarnwrap.item.ItemStack value, ) { net.minecraft.entity.ai.goal.HoldInHandsGoal.item = value.wrapperContained; }

// public java.util.function.Predicate condition() { return wrapperContained.condition; }
// public void condition(java.util.function.Predicate value) { wrapperContained.condition = value; }
// public static java.util.function.Predicate condition() { return net.minecraft.entity.ai.goal.HoldInHandsGoal.condition; }
// public static void condition(java.util.function.Predicate value, ) { net.minecraft.entity.ai.goal.HoldInHandsGoal.condition = value; }

// public yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(wrapperContained.sound); }
// public void sound(yarnwrap.sound.SoundEvent value) { wrapperContained.sound = value.wrapperContained; }
// public static yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.ai.goal.HoldInHandsGoal.sound); }
// public static void sound(yarnwrap.sound.SoundEvent value, ) { net.minecraft.entity.ai.goal.HoldInHandsGoal.sound = value.wrapperContained; }

public HoldInHandsGoal(yarnwrap.entity.mob.MobEntity actor,yarnwrap.item.ItemStack item,yarnwrap.sound.SoundEvent sound,java.util.function.Predicate condition) { this.wrapperContained = new net.minecraft.entity.ai.goal.HoldInHandsGoal(actor.wrapperContained,item.wrapperContained,sound.wrapperContained,condition); }

}