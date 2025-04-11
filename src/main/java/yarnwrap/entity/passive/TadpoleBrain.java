package yarnwrap.entity.passive;
public class TadpoleBrain { public net.minecraft.entity.passive.TadpoleBrain wrapperContained; public TadpoleBrain(net.minecraft.entity.passive.TadpoleBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public float FLEE_SPEED() { return wrapperContained.FLEE_SPEED; }
// public void FLEE_SPEED(float value) { wrapperContained.FLEE_SPEED = value; }
// public float TEMPT_SPEED() { return wrapperContained.TEMPT_SPEED; }
// public void TEMPT_SPEED(float value) { wrapperContained.TEMPT_SPEED = value; }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
public void updateActivities(yarnwrap.entity.passive.TadpoleEntity tadpole) { wrapperContained.updateActivities(tadpole.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }

}