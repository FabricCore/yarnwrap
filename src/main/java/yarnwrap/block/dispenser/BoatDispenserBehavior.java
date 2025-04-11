package yarnwrap.block.dispenser;
public class BoatDispenserBehavior { public net.minecraft.block.dispenser.BoatDispenserBehavior wrapperContained; public BoatDispenserBehavior(net.minecraft.block.dispenser.BoatDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.ItemDispenserBehavior itemDispenser() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(wrapperContained.itemDispenser); }
// public void itemDispenser(yarnwrap.block.dispenser.ItemDispenserBehavior value) { wrapperContained.itemDispenser = value.wrapperContained; }
// public Object boatType() { return wrapperContained.boatType; }
// // public void boatType(Object value) { wrapperContained.boatType = value; }
// public boolean chest() { return wrapperContained.chest; }
// public void chest(boolean value) { wrapperContained.chest = value; }
// public BoatDispenserBehavior(Object type) { this.wrapperContained = new net.minecraft.block.dispenser.BoatDispenserBehavior(type); }
// public BoatDispenserBehavior(Object boatType,boolean chest) { this.wrapperContained = new net.minecraft.block.dispenser.BoatDispenserBehavior(boatType,chest); }

}