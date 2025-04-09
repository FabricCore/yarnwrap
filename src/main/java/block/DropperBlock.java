package yarnwrap.block;
public class DropperBlock { public net.minecraft.block.DropperBlock wrapperContained; public DropperBlock(net.minecraft.block.DropperBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.DispenserBehavior BEHAVIOR() { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.BEHAVIOR); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}