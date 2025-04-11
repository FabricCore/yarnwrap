package yarnwrap.entity.ai.brain.task;
public class SonicBoomTask { public net.minecraft.entity.ai.brain.task.SonicBoomTask wrapperContained; public SonicBoomTask(net.minecraft.entity.ai.brain.task.SonicBoomTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int COOLDOWN() { return wrapperContained.COOLDOWN; }
// public void COOLDOWN(int value) { wrapperContained.COOLDOWN = value; }
// public int HORIZONTAL_RANGE() { return wrapperContained.HORIZONTAL_RANGE; }
// public void HORIZONTAL_RANGE(int value) { wrapperContained.HORIZONTAL_RANGE = value; }
// public int VERTICAL_RANGE() { return wrapperContained.VERTICAL_RANGE; }
// public void VERTICAL_RANGE(int value) { wrapperContained.VERTICAL_RANGE = value; }
// public int SOUND_DELAY() { return wrapperContained.SOUND_DELAY; }
// public void SOUND_DELAY(int value) { wrapperContained.SOUND_DELAY = value; }
// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
public void cooldown(yarnwrap.entity.LivingEntity warden,int cooldown) { wrapperContained.cooldown(warden.wrapperContained,cooldown); }

}