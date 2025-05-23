package yarnwrap.block.dispenser;
public class MinecartDispenserBehavior { public net.minecraft.block.dispenser.MinecartDispenserBehavior wrapperContained; public MinecartDispenserBehavior(net.minecraft.block.dispenser.MinecartDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.ItemDispenserBehavior fallbackBehavior() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(wrapperContained.fallbackBehavior); }
// public void fallbackBehavior(yarnwrap.block.dispenser.ItemDispenserBehavior value) { wrapperContained.fallbackBehavior = value.wrapperContained; }
// public static yarnwrap.block.dispenser.ItemDispenserBehavior fallbackBehavior() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(net.minecraft.block.dispenser.MinecartDispenserBehavior.fallbackBehavior); }
// public static void fallbackBehavior(yarnwrap.block.dispenser.ItemDispenserBehavior value, ) { net.minecraft.block.dispenser.MinecartDispenserBehavior.fallbackBehavior = value.wrapperContained; }

// public yarnwrap.entity.EntityType minecartEntityType() { return new yarnwrap.entity.EntityType(wrapperContained.minecartEntityType); }
// public void minecartEntityType(yarnwrap.entity.EntityType value) { wrapperContained.minecartEntityType = value.wrapperContained; }
// public static yarnwrap.entity.EntityType minecartEntityType() { return new yarnwrap.entity.EntityType(net.minecraft.block.dispenser.MinecartDispenserBehavior.minecartEntityType); }
// public static void minecartEntityType(yarnwrap.entity.EntityType value, ) { net.minecraft.block.dispenser.MinecartDispenserBehavior.minecartEntityType = value.wrapperContained; }

public MinecartDispenserBehavior(yarnwrap.entity.EntityType minecartEntityType) { this.wrapperContained = new net.minecraft.block.dispenser.MinecartDispenserBehavior(minecartEntityType.wrapperContained); }
// public yarnwrap.block.enums.RailShape getRailShape(yarnwrap.block.BlockState state) { return new yarnwrap.block.enums.RailShape(wrapperContained.getRailShape(state.wrapperContained)); }
// public static yarnwrap.block.enums.RailShape getRailShape(yarnwrap.block.BlockState state, ) { return new yarnwrap.block.enums.RailShape(net.minecraft.block.dispenser.MinecartDispenserBehavior.getRailShape(state.wrapperContained)); }

}