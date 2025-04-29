package yarnwrap.block;
public class Oxidizable { public net.minecraft.block.Oxidizable wrapperContained; public Oxidizable(net.minecraft.block.Oxidizable wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier OXIDATION_LEVEL_INCREASES() { return wrapperContained.OXIDATION_LEVEL_INCREASES; }
// public void OXIDATION_LEVEL_INCREASES(java.util.function.Supplier value) { wrapperContained.OXIDATION_LEVEL_INCREASES = value; }
public static java.util.function.Supplier OXIDATION_LEVEL_INCREASES() { return net.minecraft.block.Oxidizable.OXIDATION_LEVEL_INCREASES; }
// public static void OXIDATION_LEVEL_INCREASES(java.util.function.Supplier value, ) { net.minecraft.block.Oxidizable.OXIDATION_LEVEL_INCREASES = value; }

// public java.util.function.Supplier OXIDATION_LEVEL_DECREASES() { return wrapperContained.OXIDATION_LEVEL_DECREASES; }
// public void OXIDATION_LEVEL_DECREASES(java.util.function.Supplier value) { wrapperContained.OXIDATION_LEVEL_DECREASES = value; }
public static java.util.function.Supplier OXIDATION_LEVEL_DECREASES() { return net.minecraft.block.Oxidizable.OXIDATION_LEVEL_DECREASES; }
// public static void OXIDATION_LEVEL_DECREASES(java.util.function.Supplier value, ) { net.minecraft.block.Oxidizable.OXIDATION_LEVEL_DECREASES = value; }

// public java.util.Optional getDecreasedOxidationBlock(yarnwrap.block.Block block) { return wrapperContained.getDecreasedOxidationBlock(block.wrapperContained); }
// public static java.util.Optional getDecreasedOxidationBlock(yarnwrap.block.Block block, ) { return net.minecraft.block.Oxidizable.getDecreasedOxidationBlock(block.wrapperContained); }
// public yarnwrap.block.BlockState method_34733(yarnwrap.block.BlockState block) { return new yarnwrap.block.BlockState(wrapperContained.method_34733(block.wrapperContained)); }
// public static yarnwrap.block.BlockState method_34733(yarnwrap.block.BlockState block, ) { return new yarnwrap.block.BlockState(net.minecraft.block.Oxidizable.method_34733(block.wrapperContained)); }
// public yarnwrap.block.Block getUnaffectedOxidationBlock(yarnwrap.block.Block block) { return new yarnwrap.block.Block(wrapperContained.getUnaffectedOxidationBlock(block.wrapperContained)); }
// public static yarnwrap.block.Block getUnaffectedOxidationBlock(yarnwrap.block.Block block, ) { return new yarnwrap.block.Block(net.minecraft.block.Oxidizable.getUnaffectedOxidationBlock(block.wrapperContained)); }
// public java.util.Optional getDecreasedOxidationState(yarnwrap.block.BlockState state) { return wrapperContained.getDecreasedOxidationState(state.wrapperContained); }
// public static java.util.Optional getDecreasedOxidationState(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Oxidizable.getDecreasedOxidationState(state.wrapperContained); }
// public yarnwrap.block.BlockState method_34736(yarnwrap.block.BlockState block) { return new yarnwrap.block.BlockState(wrapperContained.method_34736(block.wrapperContained)); }
// public static yarnwrap.block.BlockState method_34736(yarnwrap.block.BlockState block, ) { return new yarnwrap.block.BlockState(net.minecraft.block.Oxidizable.method_34736(block.wrapperContained)); }
// public java.util.Optional getIncreasedOxidationBlock(yarnwrap.block.Block block) { return wrapperContained.getIncreasedOxidationBlock(block.wrapperContained); }
// public static java.util.Optional getIncreasedOxidationBlock(yarnwrap.block.Block block, ) { return net.minecraft.block.Oxidizable.getIncreasedOxidationBlock(block.wrapperContained); }
// public yarnwrap.block.BlockState getUnaffectedOxidationState(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.getUnaffectedOxidationState(state.wrapperContained)); }
// public static yarnwrap.block.BlockState getUnaffectedOxidationState(yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.block.Oxidizable.getUnaffectedOxidationState(state.wrapperContained)); }

}