package yarnwrap.structure;
public class JungleTempleGenerator { public net.minecraft.structure.JungleTempleGenerator wrapperContained; public JungleTempleGenerator(net.minecraft.structure.JungleTempleGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean placedTrap2() { return wrapperContained.placedTrap2; }
// public void placedTrap2(boolean value) { wrapperContained.placedTrap2 = value; }
// public boolean placedTrap1() { return wrapperContained.placedTrap1; }
// public void placedTrap1(boolean value) { wrapperContained.placedTrap1 = value; }
// public boolean placedHiddenChest() { return wrapperContained.placedHiddenChest; }
// public void placedHiddenChest(boolean value) { wrapperContained.placedHiddenChest = value; }
// public boolean placedMainChest() { return wrapperContained.placedMainChest; }
// public void placedMainChest(boolean value) { wrapperContained.placedMainChest = value; }
// public Object COBBLESTONE_RANDOMIZER() { return wrapperContained.COBBLESTONE_RANDOMIZER; }
// // public void COBBLESTONE_RANDOMIZER(Object value) { wrapperContained.COBBLESTONE_RANDOMIZER = value; }
public int DEPTH() { return wrapperContained.DEPTH; }
// public void DEPTH(int value) { wrapperContained.DEPTH = value; }
public JungleTempleGenerator(yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.structure.JungleTempleGenerator(nbt.wrapperContained); }
public JungleTempleGenerator(yarnwrap.util.math.random.Random random,int x,int z) { this.wrapperContained = new net.minecraft.structure.JungleTempleGenerator(random.wrapperContained,x,z); }

}