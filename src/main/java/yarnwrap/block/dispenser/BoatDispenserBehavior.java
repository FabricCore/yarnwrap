package yarnwrap.block.dispenser;
public class BoatDispenserBehavior { public net.minecraft.block.dispenser.BoatDispenserBehavior wrapperContained; public BoatDispenserBehavior(net.minecraft.block.dispenser.BoatDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.ItemDispenserBehavior fallbackBehavior() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(wrapperContained.fallbackBehavior); }
// public void fallbackBehavior(yarnwrap.block.dispenser.ItemDispenserBehavior value) { wrapperContained.fallbackBehavior = value.wrapperContained; }
// public static yarnwrap.block.dispenser.ItemDispenserBehavior fallbackBehavior() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(net.minecraft.block.dispenser.BoatDispenserBehavior.fallbackBehavior); }
// public static void fallbackBehavior(yarnwrap.block.dispenser.ItemDispenserBehavior value, ) { net.minecraft.block.dispenser.BoatDispenserBehavior.fallbackBehavior = value.wrapperContained; }

// public yarnwrap.entity.EntityType boatType() { return new yarnwrap.entity.EntityType(wrapperContained.boatType); }
// public void boatType(yarnwrap.entity.EntityType value) { wrapperContained.boatType = value.wrapperContained; }
// public static yarnwrap.entity.EntityType boatType() { return new yarnwrap.entity.EntityType(net.minecraft.block.dispenser.BoatDispenserBehavior.boatType); }
// public static void boatType(yarnwrap.entity.EntityType value, ) { net.minecraft.block.dispenser.BoatDispenserBehavior.boatType = value.wrapperContained; }

public BoatDispenserBehavior(yarnwrap.entity.EntityType boatType) { this.wrapperContained = new net.minecraft.block.dispenser.BoatDispenserBehavior(boatType.wrapperContained); }

}