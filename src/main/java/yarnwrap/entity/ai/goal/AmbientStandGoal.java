package yarnwrap.entity.ai.goal;
public class AmbientStandGoal { public net.minecraft.entity.ai.goal.AmbientStandGoal wrapperContained; public AmbientStandGoal(net.minecraft.entity.ai.goal.AmbientStandGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.AbstractHorseEntity entity() { return new yarnwrap.entity.passive.AbstractHorseEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.passive.AbstractHorseEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.passive.AbstractHorseEntity entity() { return new yarnwrap.entity.passive.AbstractHorseEntity(net.minecraft.entity.ai.goal.AmbientStandGoal.entity); }
// public static void entity(yarnwrap.entity.passive.AbstractHorseEntity value, ) { net.minecraft.entity.ai.goal.AmbientStandGoal.entity = value.wrapperContained; }

// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public static int cooldown() { return net.minecraft.entity.ai.goal.AmbientStandGoal.cooldown; }
// public static void cooldown(int value, ) { net.minecraft.entity.ai.goal.AmbientStandGoal.cooldown = value; }

public AmbientStandGoal(yarnwrap.entity.passive.AbstractHorseEntity entity) { this.wrapperContained = new net.minecraft.entity.ai.goal.AmbientStandGoal(entity.wrapperContained); }
// public void resetCooldown(yarnwrap.entity.passive.AbstractHorseEntity entity) { wrapperContained.resetCooldown(entity.wrapperContained); }
// public static void resetCooldown(yarnwrap.entity.passive.AbstractHorseEntity entity, ) { net.minecraft.entity.ai.goal.AmbientStandGoal.resetCooldown(entity.wrapperContained); }
// public void playAmbientStandSound() { wrapperContained.playAmbientStandSound(); }
// public static void playAmbientStandSound() { net.minecraft.entity.ai.goal.AmbientStandGoal.playAmbientStandSound(); }

}