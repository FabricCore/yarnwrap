package yarnwrap.entity.ai.brain.task;
public class StayAboveWaterTask { public net.minecraft.entity.ai.brain.task.StayAboveWaterTask wrapperContained; public StayAboveWaterTask(net.minecraft.entity.ai.brain.task.StayAboveWaterTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public float chance() { return wrapperContained.chance; }
// public void chance(float value) { wrapperContained.chance = value; }
// public static float chance() { return net.minecraft.entity.ai.brain.task.StayAboveWaterTask.chance; }
// public static void chance(float value, ) { net.minecraft.entity.ai.brain.task.StayAboveWaterTask.chance = value; }

public StayAboveWaterTask(float chance) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.StayAboveWaterTask(chance); }
// public boolean isUnderwater(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.isUnderwater(entity.wrapperContained); }
// public static boolean isUnderwater(yarnwrap.entity.mob.MobEntity entity, ) { return net.minecraft.entity.ai.brain.task.StayAboveWaterTask.isUnderwater(entity.wrapperContained); }

}