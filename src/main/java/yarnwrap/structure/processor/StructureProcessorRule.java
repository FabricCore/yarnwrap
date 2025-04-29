package yarnwrap.structure.processor;
public class StructureProcessorRule { public net.minecraft.structure.processor.StructureProcessorRule wrapperContained; public StructureProcessorRule(net.minecraft.structure.processor.StructureProcessorRule wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.structure.rule.RuleTest inputPredicate() { return new yarnwrap.structure.rule.RuleTest(wrapperContained.inputPredicate); }
// public void inputPredicate(yarnwrap.structure.rule.RuleTest value) { wrapperContained.inputPredicate = value.wrapperContained; }
// public static yarnwrap.structure.rule.RuleTest inputPredicate() { return new yarnwrap.structure.rule.RuleTest(net.minecraft.structure.processor.StructureProcessorRule.inputPredicate); }
// public static void inputPredicate(yarnwrap.structure.rule.RuleTest value, ) { net.minecraft.structure.processor.StructureProcessorRule.inputPredicate = value.wrapperContained; }

// public yarnwrap.structure.rule.RuleTest locationPredicate() { return new yarnwrap.structure.rule.RuleTest(wrapperContained.locationPredicate); }
// public void locationPredicate(yarnwrap.structure.rule.RuleTest value) { wrapperContained.locationPredicate = value.wrapperContained; }
// public static yarnwrap.structure.rule.RuleTest locationPredicate() { return new yarnwrap.structure.rule.RuleTest(net.minecraft.structure.processor.StructureProcessorRule.locationPredicate); }
// public static void locationPredicate(yarnwrap.structure.rule.RuleTest value, ) { net.minecraft.structure.processor.StructureProcessorRule.locationPredicate = value.wrapperContained; }

// public yarnwrap.block.BlockState outputState() { return new yarnwrap.block.BlockState(wrapperContained.outputState); }
// public void outputState(yarnwrap.block.BlockState value) { wrapperContained.outputState = value.wrapperContained; }
// public static yarnwrap.block.BlockState outputState() { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.StructureProcessorRule.outputState); }
// public static void outputState(yarnwrap.block.BlockState value, ) { net.minecraft.structure.processor.StructureProcessorRule.outputState = value.wrapperContained; }

// public yarnwrap.structure.rule.PosRuleTest positionPredicate() { return new yarnwrap.structure.rule.PosRuleTest(wrapperContained.positionPredicate); }
// public void positionPredicate(yarnwrap.structure.rule.PosRuleTest value) { wrapperContained.positionPredicate = value.wrapperContained; }
// public static yarnwrap.structure.rule.PosRuleTest positionPredicate() { return new yarnwrap.structure.rule.PosRuleTest(net.minecraft.structure.processor.StructureProcessorRule.positionPredicate); }
// public static void positionPredicate(yarnwrap.structure.rule.PosRuleTest value, ) { net.minecraft.structure.processor.StructureProcessorRule.positionPredicate = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.structure.processor.StructureProcessorRule.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.structure.processor.StructureProcessorRule.CODEC = value; }

// public yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier DEFAULT_BLOCK_ENTITY_MODIFIER() { return new yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier(wrapperContained.DEFAULT_BLOCK_ENTITY_MODIFIER); }
// public void DEFAULT_BLOCK_ENTITY_MODIFIER(yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier value) { wrapperContained.DEFAULT_BLOCK_ENTITY_MODIFIER = value.wrapperContained; }
public static yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier DEFAULT_BLOCK_ENTITY_MODIFIER() { return new yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier(net.minecraft.structure.processor.StructureProcessorRule.DEFAULT_BLOCK_ENTITY_MODIFIER); }
// public static void DEFAULT_BLOCK_ENTITY_MODIFIER(yarnwrap.structure.rule.blockentity.PassthroughRuleBlockEntityModifier value, ) { net.minecraft.structure.processor.StructureProcessorRule.DEFAULT_BLOCK_ENTITY_MODIFIER = value.wrapperContained; }

// public yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier blockEntityModifier() { return new yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier(wrapperContained.blockEntityModifier); }
// public void blockEntityModifier(yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier value) { wrapperContained.blockEntityModifier = value.wrapperContained; }
// public static yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier blockEntityModifier() { return new yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier(net.minecraft.structure.processor.StructureProcessorRule.blockEntityModifier); }
// public static void blockEntityModifier(yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier value, ) { net.minecraft.structure.processor.StructureProcessorRule.blockEntityModifier = value.wrapperContained; }

public StructureProcessorRule(yarnwrap.structure.rule.RuleTest inputPredicate,yarnwrap.structure.rule.RuleTest locationPredicate,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.structure.processor.StructureProcessorRule(inputPredicate.wrapperContained,locationPredicate.wrapperContained,state.wrapperContained); }
public StructureProcessorRule(yarnwrap.structure.rule.RuleTest inputPredicate,yarnwrap.structure.rule.RuleTest locationPredicate,yarnwrap.structure.rule.PosRuleTest positionPredicate,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.structure.processor.StructureProcessorRule(inputPredicate.wrapperContained,locationPredicate.wrapperContained,positionPredicate.wrapperContained,state.wrapperContained); }
public StructureProcessorRule(yarnwrap.structure.rule.RuleTest inputPredicate,yarnwrap.structure.rule.RuleTest locationPredicate,yarnwrap.structure.rule.PosRuleTest positionPredicate,yarnwrap.block.BlockState outputState,yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier blockEntityModifier) { this.wrapperContained = new net.minecraft.structure.processor.StructureProcessorRule(inputPredicate.wrapperContained,locationPredicate.wrapperContained,positionPredicate.wrapperContained,outputState.wrapperContained,blockEntityModifier.wrapperContained); }
public yarnwrap.nbt.NbtCompound getOutputNbt(yarnwrap.util.math.random.Random random,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getOutputNbt(random.wrapperContained,nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound getOutputNbt(yarnwrap.util.math.random.Random random,yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.structure.processor.StructureProcessorRule.getOutputNbt(random.wrapperContained,nbt.wrapperContained)); }
public boolean test(yarnwrap.block.BlockState input,yarnwrap.block.BlockState currentState,yarnwrap.util.math.BlockPos originalPos,yarnwrap.util.math.BlockPos currentPos,yarnwrap.util.math.BlockPos pivot,yarnwrap.util.math.random.Random random) { return wrapperContained.test(input.wrapperContained,currentState.wrapperContained,originalPos.wrapperContained,currentPos.wrapperContained,pivot.wrapperContained,random.wrapperContained); }
// public static boolean test(yarnwrap.block.BlockState input,yarnwrap.block.BlockState currentState,yarnwrap.util.math.BlockPos originalPos,yarnwrap.util.math.BlockPos currentPos,yarnwrap.util.math.BlockPos pivot,yarnwrap.util.math.random.Random random, ) { return net.minecraft.structure.processor.StructureProcessorRule.test(input.wrapperContained,currentState.wrapperContained,originalPos.wrapperContained,currentPos.wrapperContained,pivot.wrapperContained,random.wrapperContained); }
public yarnwrap.block.BlockState getOutputState() { return new yarnwrap.block.BlockState(wrapperContained.getOutputState()); }
// public static yarnwrap.block.BlockState getOutputState() { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.StructureProcessorRule.getOutputState()); }
// public com.mojang.datafixers.kinds.App method_28984(Object instance) { return wrapperContained.method_28984(instance); }
// public static com.mojang.datafixers.kinds.App method_28984(Object instance, ) { return net.minecraft.structure.processor.StructureProcessorRule.method_28984(instance); }
// public yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier method_28985(yarnwrap.structure.processor.StructureProcessorRule rule) { return new yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier(wrapperContained.method_28985(rule.wrapperContained)); }
// public static yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier method_28985(yarnwrap.structure.processor.StructureProcessorRule rule, ) { return new yarnwrap.structure.rule.blockentity.RuleBlockEntityModifier(net.minecraft.structure.processor.StructureProcessorRule.method_28985(rule.wrapperContained)); }
// public yarnwrap.block.BlockState method_28986(yarnwrap.structure.processor.StructureProcessorRule rule) { return new yarnwrap.block.BlockState(wrapperContained.method_28986(rule.wrapperContained)); }
// public static yarnwrap.block.BlockState method_28986(yarnwrap.structure.processor.StructureProcessorRule rule, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.StructureProcessorRule.method_28986(rule.wrapperContained)); }
// public yarnwrap.structure.rule.PosRuleTest method_28987(yarnwrap.structure.processor.StructureProcessorRule rule) { return new yarnwrap.structure.rule.PosRuleTest(wrapperContained.method_28987(rule.wrapperContained)); }
// public static yarnwrap.structure.rule.PosRuleTest method_28987(yarnwrap.structure.processor.StructureProcessorRule rule, ) { return new yarnwrap.structure.rule.PosRuleTest(net.minecraft.structure.processor.StructureProcessorRule.method_28987(rule.wrapperContained)); }
// public yarnwrap.structure.rule.RuleTest method_28988(yarnwrap.structure.processor.StructureProcessorRule rule) { return new yarnwrap.structure.rule.RuleTest(wrapperContained.method_28988(rule.wrapperContained)); }
// public static yarnwrap.structure.rule.RuleTest method_28988(yarnwrap.structure.processor.StructureProcessorRule rule, ) { return new yarnwrap.structure.rule.RuleTest(net.minecraft.structure.processor.StructureProcessorRule.method_28988(rule.wrapperContained)); }
// public yarnwrap.structure.rule.RuleTest method_28989(yarnwrap.structure.processor.StructureProcessorRule rule) { return new yarnwrap.structure.rule.RuleTest(wrapperContained.method_28989(rule.wrapperContained)); }
// public static yarnwrap.structure.rule.RuleTest method_28989(yarnwrap.structure.processor.StructureProcessorRule rule, ) { return new yarnwrap.structure.rule.RuleTest(net.minecraft.structure.processor.StructureProcessorRule.method_28989(rule.wrapperContained)); }

}