package yarnwrap.entity.mob;
public class ElderGuardianEntity { public net.minecraft.entity.mob.ElderGuardianEntity wrapperContained; public ElderGuardianEntity(net.minecraft.entity.mob.ElderGuardianEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float SCALE() { return wrapperContained.SCALE; }
// public int AFFECTED_PLAYER_RANGE() { return wrapperContained.AFFECTED_PLAYER_RANGE; }
// public int MINING_FATIGUE_DURATION() { return wrapperContained.MINING_FATIGUE_DURATION; }
// public int MINING_FATIGUE_AMPLIFIER() { return wrapperContained.MINING_FATIGUE_AMPLIFIER; }
public Object createElderGuardianAttributes() { return wrapperContained.createElderGuardianAttributes(); }

}