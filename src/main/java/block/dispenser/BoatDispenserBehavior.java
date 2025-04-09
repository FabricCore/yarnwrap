package yarnwrap.block.dispenser;
public class BoatDispenserBehavior { public net.minecraft.block.dispenser.BoatDispenserBehavior wrapperContained; public BoatDispenserBehavior(net.minecraft.block.dispenser.BoatDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.ItemDispenserBehavior itemDispenser() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(wrapperContained.itemDispenser); }
// public Object boatType() { return wrapperContained.boatType; }
// public boolean chest() { return wrapperContained.chest; }

}