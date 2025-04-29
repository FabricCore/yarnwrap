package yarnwrap.block.dispenser;
public class BoatDispenserBehavior { public net.minecraft.block.dispenser.BoatDispenserBehavior wrapperContained; public BoatDispenserBehavior(net.minecraft.block.dispenser.BoatDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.ItemDispenserBehavior itemDispenser() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(wrapperContained.itemDispenser); }
// public void itemDispenser(yarnwrap.block.dispenser.ItemDispenserBehavior value) { wrapperContained.itemDispenser = value.wrapperContained; }
// public static yarnwrap.block.dispenser.ItemDispenserBehavior itemDispenser() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(net.minecraft.block.dispenser.BoatDispenserBehavior.itemDispenser); }
// public static void itemDispenser(yarnwrap.block.dispenser.ItemDispenserBehavior value, ) { net.minecraft.block.dispenser.BoatDispenserBehavior.itemDispenser = value.wrapperContained; }

// public Object boatType() { return wrapperContained.boatType; }
// // public void boatType(Object value) { wrapperContained.boatType = value; }
// // public static Object boatType() { return net.minecraft.block.dispenser.BoatDispenserBehavior.boatType; }
// // public static void boatType(Object value, ) { net.minecraft.block.dispenser.BoatDispenserBehavior.boatType = value; }

// public boolean chest() { return wrapperContained.chest; }
// public void chest(boolean value) { wrapperContained.chest = value; }
// public static boolean chest() { return net.minecraft.block.dispenser.BoatDispenserBehavior.chest; }
// public static void chest(boolean value, ) { net.minecraft.block.dispenser.BoatDispenserBehavior.chest = value; }

// public BoatDispenserBehavior(Object type) { this.wrapperContained = new net.minecraft.block.dispenser.BoatDispenserBehavior(type); }
// public BoatDispenserBehavior(Object boatType,boolean chest) { this.wrapperContained = new net.minecraft.block.dispenser.BoatDispenserBehavior(boatType,chest); }

}