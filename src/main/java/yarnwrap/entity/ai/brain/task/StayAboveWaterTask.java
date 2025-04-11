package yarnwrap.entity.ai.brain.task;
public class StayAboveWaterTask { public net.minecraft.entity.ai.brain.task.StayAboveWaterTask wrapperContained; public StayAboveWaterTask(net.minecraft.entity.ai.brain.task.StayAboveWaterTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public float chance() { return wrapperContained.chance; }
// public void chance(float value) { wrapperContained.chance = value; }
public boolean isUnderwater(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.isUnderwater(entity.wrapperContained); }

}