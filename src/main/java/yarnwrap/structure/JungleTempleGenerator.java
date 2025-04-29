package yarnwrap.structure;
public class JungleTempleGenerator { public net.minecraft.structure.JungleTempleGenerator wrapperContained; public JungleTempleGenerator(net.minecraft.structure.JungleTempleGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean placedTrap2() { return wrapperContained.placedTrap2; }
// public void placedTrap2(boolean value) { wrapperContained.placedTrap2 = value; }
// public static boolean placedTrap2() { return net.minecraft.structure.JungleTempleGenerator.placedTrap2; }
// public static void placedTrap2(boolean value, ) { net.minecraft.structure.JungleTempleGenerator.placedTrap2 = value; }

// public boolean placedTrap1() { return wrapperContained.placedTrap1; }
// public void placedTrap1(boolean value) { wrapperContained.placedTrap1 = value; }
// public static boolean placedTrap1() { return net.minecraft.structure.JungleTempleGenerator.placedTrap1; }
// public static void placedTrap1(boolean value, ) { net.minecraft.structure.JungleTempleGenerator.placedTrap1 = value; }

// public boolean placedHiddenChest() { return wrapperContained.placedHiddenChest; }
// public void placedHiddenChest(boolean value) { wrapperContained.placedHiddenChest = value; }
// public static boolean placedHiddenChest() { return net.minecraft.structure.JungleTempleGenerator.placedHiddenChest; }
// public static void placedHiddenChest(boolean value, ) { net.minecraft.structure.JungleTempleGenerator.placedHiddenChest = value; }

// public boolean placedMainChest() { return wrapperContained.placedMainChest; }
// public void placedMainChest(boolean value) { wrapperContained.placedMainChest = value; }
// public static boolean placedMainChest() { return net.minecraft.structure.JungleTempleGenerator.placedMainChest; }
// public static void placedMainChest(boolean value, ) { net.minecraft.structure.JungleTempleGenerator.placedMainChest = value; }

// public Object COBBLESTONE_RANDOMIZER() { return wrapperContained.COBBLESTONE_RANDOMIZER; }
// // public void COBBLESTONE_RANDOMIZER(Object value) { wrapperContained.COBBLESTONE_RANDOMIZER = value; }
// // public static Object COBBLESTONE_RANDOMIZER() { return net.minecraft.structure.JungleTempleGenerator.COBBLESTONE_RANDOMIZER; }
// // public static void COBBLESTONE_RANDOMIZER(Object value, ) { net.minecraft.structure.JungleTempleGenerator.COBBLESTONE_RANDOMIZER = value; }

// public int DEPTH() { return wrapperContained.DEPTH; }
// public void DEPTH(int value) { wrapperContained.DEPTH = value; }
public static int DEPTH() { return net.minecraft.structure.JungleTempleGenerator.DEPTH; }
// public static void DEPTH(int value, ) { net.minecraft.structure.JungleTempleGenerator.DEPTH = value; }

public JungleTempleGenerator(yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.structure.JungleTempleGenerator(nbt.wrapperContained); }
public JungleTempleGenerator(yarnwrap.util.math.random.Random random,int x,int z) { this.wrapperContained = new net.minecraft.structure.JungleTempleGenerator(random.wrapperContained,x,z); }

}