package yarnwrap.block;
public class TrialSpawnerBlock { public net.minecraft.block.TrialSpawnerBlock wrapperContained; public TrialSpawnerBlock(net.minecraft.block.TrialSpawnerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.state.property.EnumProperty TRIAL_SPAWNER_STATE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.TRIAL_SPAWNER_STATE); }
// public void TRIAL_SPAWNER_STATE(yarnwrap.state.property.EnumProperty value) { wrapperContained.TRIAL_SPAWNER_STATE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty OMINOUS() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OMINOUS); }
// public void OMINOUS(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OMINOUS = value.wrapperContained; }

}