package yarnwrap.structure;
public class JungleTempleGenerator { public net.minecraft.structure.JungleTempleGenerator wrapperContained; public JungleTempleGenerator(net.minecraft.structure.JungleTempleGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean placedTrap2() { return wrapperContained.placedTrap2; }
// public boolean placedTrap1() { return wrapperContained.placedTrap1; }
// public boolean placedHiddenChest() { return wrapperContained.placedHiddenChest; }
// public boolean placedMainChest() { return wrapperContained.placedMainChest; }
// public Object COBBLESTONE_RANDOMIZER() { return wrapperContained.COBBLESTONE_RANDOMIZER; }
public int DEPTH() { return wrapperContained.DEPTH; }

}