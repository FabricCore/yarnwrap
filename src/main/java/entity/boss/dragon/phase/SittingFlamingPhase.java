package yarnwrap.entity.boss.dragon.phase;
public class SittingFlamingPhase { public net.minecraft.entity.boss.dragon.phase.SittingFlamingPhase wrapperContained; public SittingFlamingPhase(net.minecraft.entity.boss.dragon.phase.SittingFlamingPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DURATION() { return wrapperContained.DURATION; }
// public int MAX_TIMES_RUN() { return wrapperContained.MAX_TIMES_RUN; }
// public int DRAGON_BREATH_MAX_TICK() { return wrapperContained.DRAGON_BREATH_MAX_TICK; }
// public yarnwrap.entity.AreaEffectCloudEntity dragonBreathEntity() { return new yarnwrap.entity.AreaEffectCloudEntity(wrapperContained.dragonBreathEntity); }
// public int timesRun() { return wrapperContained.timesRun; }
// public int ticks() { return wrapperContained.ticks; }
public void reset() { wrapperContained.reset(); }

}