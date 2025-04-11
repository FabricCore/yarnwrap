package yarnwrap.entity.boss.dragon.phase;
public class SittingFlamingPhase { public net.minecraft.entity.boss.dragon.phase.SittingFlamingPhase wrapperContained; public SittingFlamingPhase(net.minecraft.entity.boss.dragon.phase.SittingFlamingPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DURATION() { return wrapperContained.DURATION; }
// public void DURATION(int value) { wrapperContained.DURATION = value; }
// public int MAX_TIMES_RUN() { return wrapperContained.MAX_TIMES_RUN; }
// public void MAX_TIMES_RUN(int value) { wrapperContained.MAX_TIMES_RUN = value; }
// public int DRAGON_BREATH_MAX_TICK() { return wrapperContained.DRAGON_BREATH_MAX_TICK; }
// public void DRAGON_BREATH_MAX_TICK(int value) { wrapperContained.DRAGON_BREATH_MAX_TICK = value; }
// public yarnwrap.entity.AreaEffectCloudEntity dragonBreathEntity() { return new yarnwrap.entity.AreaEffectCloudEntity(wrapperContained.dragonBreathEntity); }
// public void dragonBreathEntity(yarnwrap.entity.AreaEffectCloudEntity value) { wrapperContained.dragonBreathEntity = value.wrapperContained; }
// public int timesRun() { return wrapperContained.timesRun; }
// public void timesRun(int value) { wrapperContained.timesRun = value; }
// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
public void reset() { wrapperContained.reset(); }

}