package yarnwrap.entity.passive;
public class SnifferBrain { public net.minecraft.entity.passive.SnifferBrain wrapperContained; public SnifferBrain(net.minecraft.entity.passive.SnifferBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List SENSORS() { return wrapperContained.SENSORS; }
// public java.util.List MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int SNIFF_COOLDOWN_EXPIRY() { return wrapperContained.SNIFF_COOLDOWN_EXPIRY; }
// public float FLEE_SPEED() { return wrapperContained.FLEE_SPEED; }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
// public void updateActivities(yarnwrap.entity.passive.SnifferEntity sniffer) { wrapperContained.updateActivities(sniffer.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
// public void addSniffActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addSniffActivities(brain.wrapperContained); }
// public void addDigActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addDigActivities(brain.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }
public java.util.function.Predicate getTemptItemPredicate() { return wrapperContained.getTemptItemPredicate(); }
// public yarnwrap.entity.passive.SnifferEntity stopDiggingOrSniffing(yarnwrap.entity.passive.SnifferEntity sniffer) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.stopDiggingOrSniffing(sniffer.wrapperContained)); }

}