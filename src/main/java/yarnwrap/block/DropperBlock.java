package yarnwrap.block;
public class DropperBlock { public net.minecraft.block.DropperBlock wrapperContained; public DropperBlock(net.minecraft.block.DropperBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.DispenserBehavior BEHAVIOR() { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.BEHAVIOR); }
// public void BEHAVIOR(yarnwrap.block.dispenser.DispenserBehavior value) { wrapperContained.BEHAVIOR = value.wrapperContained; }
// public static yarnwrap.block.dispenser.DispenserBehavior BEHAVIOR() { return new yarnwrap.block.dispenser.DispenserBehavior(net.minecraft.block.DropperBlock.BEHAVIOR); }
// public static void BEHAVIOR(yarnwrap.block.dispenser.DispenserBehavior value, ) { net.minecraft.block.DropperBlock.BEHAVIOR = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.DropperBlock.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.DropperBlock.LOGGER = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.DropperBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.DropperBlock.CODEC = value; }


}