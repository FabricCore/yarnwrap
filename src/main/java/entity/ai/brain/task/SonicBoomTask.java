package yarnwrap.entity.ai.brain.task;
public class SonicBoomTask { public net.minecraft.entity.ai.brain.task.SonicBoomTask wrapperContained; public SonicBoomTask(net.minecraft.entity.ai.brain.task.SonicBoomTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int COOLDOWN() { return wrapperContained.COOLDOWN; }
// public int HORIZONTAL_RANGE() { return wrapperContained.HORIZONTAL_RANGE; }
// public int VERTICAL_RANGE() { return wrapperContained.VERTICAL_RANGE; }
// public int SOUND_DELAY() { return wrapperContained.SOUND_DELAY; }
// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
public void cooldown(yarnwrap.entity.LivingEntity warden,int cooldown) { wrapperContained.cooldown(warden.wrapperContained,cooldown); }

}