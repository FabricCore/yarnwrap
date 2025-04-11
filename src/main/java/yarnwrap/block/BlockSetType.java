package yarnwrap.block;
public class BlockSetType { public net.minecraft.block.BlockSetType wrapperContained; public BlockSetType(net.minecraft.block.BlockSetType wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.BlockSetType IRON() { return new yarnwrap.block.BlockSetType(wrapperContained.IRON); }
// public void IRON(yarnwrap.block.BlockSetType value) { wrapperContained.IRON = value.wrapperContained; }
public yarnwrap.block.BlockSetType GOLD() { return new yarnwrap.block.BlockSetType(wrapperContained.GOLD); }
// public void GOLD(yarnwrap.block.BlockSetType value) { wrapperContained.GOLD = value.wrapperContained; }
public yarnwrap.block.BlockSetType STONE() { return new yarnwrap.block.BlockSetType(wrapperContained.STONE); }
// public void STONE(yarnwrap.block.BlockSetType value) { wrapperContained.STONE = value.wrapperContained; }
public yarnwrap.block.BlockSetType POLISHED_BLACKSTONE() { return new yarnwrap.block.BlockSetType(wrapperContained.POLISHED_BLACKSTONE); }
// public void POLISHED_BLACKSTONE(yarnwrap.block.BlockSetType value) { wrapperContained.POLISHED_BLACKSTONE = value.wrapperContained; }
public yarnwrap.block.BlockSetType OAK() { return new yarnwrap.block.BlockSetType(wrapperContained.OAK); }
// public void OAK(yarnwrap.block.BlockSetType value) { wrapperContained.OAK = value.wrapperContained; }
public yarnwrap.block.BlockSetType SPRUCE() { return new yarnwrap.block.BlockSetType(wrapperContained.SPRUCE); }
// public void SPRUCE(yarnwrap.block.BlockSetType value) { wrapperContained.SPRUCE = value.wrapperContained; }
public yarnwrap.block.BlockSetType BIRCH() { return new yarnwrap.block.BlockSetType(wrapperContained.BIRCH); }
// public void BIRCH(yarnwrap.block.BlockSetType value) { wrapperContained.BIRCH = value.wrapperContained; }
public yarnwrap.block.BlockSetType ACACIA() { return new yarnwrap.block.BlockSetType(wrapperContained.ACACIA); }
// public void ACACIA(yarnwrap.block.BlockSetType value) { wrapperContained.ACACIA = value.wrapperContained; }
public yarnwrap.block.BlockSetType CHERRY() { return new yarnwrap.block.BlockSetType(wrapperContained.CHERRY); }
// public void CHERRY(yarnwrap.block.BlockSetType value) { wrapperContained.CHERRY = value.wrapperContained; }
public yarnwrap.block.BlockSetType JUNGLE() { return new yarnwrap.block.BlockSetType(wrapperContained.JUNGLE); }
// public void JUNGLE(yarnwrap.block.BlockSetType value) { wrapperContained.JUNGLE = value.wrapperContained; }
public yarnwrap.block.BlockSetType DARK_OAK() { return new yarnwrap.block.BlockSetType(wrapperContained.DARK_OAK); }
// public void DARK_OAK(yarnwrap.block.BlockSetType value) { wrapperContained.DARK_OAK = value.wrapperContained; }
public yarnwrap.block.BlockSetType CRIMSON() { return new yarnwrap.block.BlockSetType(wrapperContained.CRIMSON); }
// public void CRIMSON(yarnwrap.block.BlockSetType value) { wrapperContained.CRIMSON = value.wrapperContained; }
public yarnwrap.block.BlockSetType WARPED() { return new yarnwrap.block.BlockSetType(wrapperContained.WARPED); }
// public void WARPED(yarnwrap.block.BlockSetType value) { wrapperContained.WARPED = value.wrapperContained; }
public yarnwrap.block.BlockSetType MANGROVE() { return new yarnwrap.block.BlockSetType(wrapperContained.MANGROVE); }
// public void MANGROVE(yarnwrap.block.BlockSetType value) { wrapperContained.MANGROVE = value.wrapperContained; }
public yarnwrap.block.BlockSetType BAMBOO() { return new yarnwrap.block.BlockSetType(wrapperContained.BAMBOO); }
// public void BAMBOO(yarnwrap.block.BlockSetType value) { wrapperContained.BAMBOO = value.wrapperContained; }
// public java.util.Map VALUES() { return wrapperContained.VALUES; }
// public void VALUES(java.util.Map value) { wrapperContained.VALUES = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.block.BlockSetType COPPER() { return new yarnwrap.block.BlockSetType(wrapperContained.COPPER); }
// public void COPPER(yarnwrap.block.BlockSetType value) { wrapperContained.COPPER = value.wrapperContained; }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public yarnwrap.block.BlockSetType register(yarnwrap.block.BlockSetType blockSetType) { return new yarnwrap.block.BlockSetType(wrapperContained.register(blockSetType.wrapperContained)); }

}