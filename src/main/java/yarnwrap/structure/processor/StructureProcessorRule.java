package yarnwrap.structure.processor;
public class StructureProcessorRule { public net.minecraft.structure.processor.StructureProcessorRule wrapperContained; public StructureProcessorRule(net.minecraft.structure.processor.StructureProcessorRule wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.structure.rule.RuleTest inputPredicate() { return new yarnwrap.structure.rule.RuleTest(wrapperContained.inputPredicate); }
// public void inputPredicate(yarnwrap.structure.rule.RuleTest value) { wrapperContained.inputPredicate = value.wrapperContained; }
// public yarnwrap.structure.rule.RuleTest locationPredicate() { return new yarnwrap.structure.rule.RuleTest(wrapperContained.locationPredicate); }
// public void locationPredicate(yarnwrap.structure.rule.RuleTest value) { wrapperContained.locationPredicate = value.wrapperContained; }
// public yarnwrap.block.BlockState outputState() { return new yarnwrap.block.BlockState(wrapperContained.outputState); }
// public void outputState(yarnwrap.block.BlockState value) { wrapperContained.outputState = value.wrapperContained; }
// public yarnwrap.structure.rule.PosRuleTest positionPredicate() { return new yarnwrap.structure.rule.PosRuleTest(wrapperContained.positionPredicate); }
// public void positionPredicate(yarnwrap.structure.rule.PosRuleTest value) { wrapperContained.positionPredicate = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier DEFAULT_BLOCK_ENTITY_MODIFIER() { return new yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier(wrapperContained.DEFAULT_BLOCK_ENTITY_MODIFIER); }
// public void DEFAULT_BLOCK_ENTITY_MODIFIER(yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier value) { wrapperContained.DEFAULT_BLOCK_ENTITY_MODIFIER = value.wrapperContained; }
// public yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier blockEntityModifier() { return new yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier(wrapperContained.blockEntityModifier); }
// public void blockEntityModifier(yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier value) { wrapperContained.blockEntityModifier = value.wrapperContained; }
public yarnwrap.nbt.NbtCompound getOutputNbt(yarnwrap.util.math.random.Random random,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getOutputNbt(random.wrapperContained,nbt.wrapperContained)); }
public boolean test(yarnwrap.block.BlockState input,yarnwrap.block.BlockState currentState,yarnwrap.util.math.BlockPos originalPos,yarnwrap.util.math.BlockPos currentPos,yarnwrap.util.math.BlockPos pivot,yarnwrap.util.math.random.Random random) { return wrapperContained.test(input.wrapperContained,currentState.wrapperContained,originalPos.wrapperContained,currentPos.wrapperContained,pivot.wrapperContained,random.wrapperContained); }
public yarnwrap.block.BlockState getOutputState() { return new yarnwrap.block.BlockState(wrapperContained.getOutputState()); }

}