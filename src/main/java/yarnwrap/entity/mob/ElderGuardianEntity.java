package yarnwrap.entity.mob;
public class ElderGuardianEntity { public net.minecraft.entity.mob.ElderGuardianEntity wrapperContained; public ElderGuardianEntity(net.minecraft.entity.mob.ElderGuardianEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float SCALE() { return wrapperContained.SCALE; }
// public void SCALE(float value) { wrapperContained.SCALE = value; }
// public int AFFECTED_PLAYER_RANGE() { return wrapperContained.AFFECTED_PLAYER_RANGE; }
// public void AFFECTED_PLAYER_RANGE(int value) { wrapperContained.AFFECTED_PLAYER_RANGE = value; }
// public int MINING_FATIGUE_DURATION() { return wrapperContained.MINING_FATIGUE_DURATION; }
// public void MINING_FATIGUE_DURATION(int value) { wrapperContained.MINING_FATIGUE_DURATION = value; }
// public int MINING_FATIGUE_AMPLIFIER() { return wrapperContained.MINING_FATIGUE_AMPLIFIER; }
// public void MINING_FATIGUE_AMPLIFIER(int value) { wrapperContained.MINING_FATIGUE_AMPLIFIER = value; }
public Object createElderGuardianAttributes() { return wrapperContained.createElderGuardianAttributes(); }

}