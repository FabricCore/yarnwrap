package yarnwrap.entity.ai.goal;
public class HoldInHandsGoal { public net.minecraft.entity.ai.goal.HoldInHandsGoal wrapperContained; public HoldInHandsGoal(net.minecraft.entity.ai.goal.HoldInHandsGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.MobEntity actor() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.actor); }
// public yarnwrap.item.ItemStack item() { return new yarnwrap.item.ItemStack(wrapperContained.item); }
// public java.util.function.Predicate condition() { return wrapperContained.condition; }
// public yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(wrapperContained.sound); }

}