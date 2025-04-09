package yarnwrap.block;
public class Oxidizable { public net.minecraft.block.Oxidizable wrapperContained; public Oxidizable(net.minecraft.block.Oxidizable wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Supplier OXIDATION_LEVEL_INCREASES() { return wrapperContained.OXIDATION_LEVEL_INCREASES; }
public java.util.function.Supplier OXIDATION_LEVEL_DECREASES() { return wrapperContained.OXIDATION_LEVEL_DECREASES; }
// public java.util.Optional getDecreasedOxidationBlock(yarnwrap.block.Block block) { return wrapperContained.getDecreasedOxidationBlock(block.wrapperContained); }
// public yarnwrap.block.Block getUnaffectedOxidationBlock(yarnwrap.block.Block block) { return new yarnwrap.block.Block(wrapperContained.getUnaffectedOxidationBlock(block.wrapperContained)); }
// public java.util.Optional getDecreasedOxidationState(yarnwrap.block.BlockState state) { return wrapperContained.getDecreasedOxidationState(state.wrapperContained); }
// public java.util.Optional getIncreasedOxidationBlock(yarnwrap.block.Block block) { return wrapperContained.getIncreasedOxidationBlock(block.wrapperContained); }
// public yarnwrap.block.BlockState getUnaffectedOxidationState(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.getUnaffectedOxidationState(state.wrapperContained)); }

}