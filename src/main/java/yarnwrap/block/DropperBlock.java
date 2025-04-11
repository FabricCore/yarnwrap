package yarnwrap.block;
public class DropperBlock { public net.minecraft.block.DropperBlock wrapperContained; public DropperBlock(net.minecraft.block.DropperBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.DispenserBehavior BEHAVIOR() { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.BEHAVIOR); }
// public void BEHAVIOR(yarnwrap.block.dispenser.DispenserBehavior value) { wrapperContained.BEHAVIOR = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}