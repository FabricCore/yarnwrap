package yarnwrap.block;
public class BlockSetType { public net.minecraft.block.BlockSetType wrapperContained; public BlockSetType(net.minecraft.block.BlockSetType wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.BlockSetType IRON() { return new yarnwrap.block.BlockSetType(wrapperContained.IRON); }
public yarnwrap.block.BlockSetType GOLD() { return new yarnwrap.block.BlockSetType(wrapperContained.GOLD); }
public yarnwrap.block.BlockSetType STONE() { return new yarnwrap.block.BlockSetType(wrapperContained.STONE); }
public yarnwrap.block.BlockSetType POLISHED_BLACKSTONE() { return new yarnwrap.block.BlockSetType(wrapperContained.POLISHED_BLACKSTONE); }
public yarnwrap.block.BlockSetType OAK() { return new yarnwrap.block.BlockSetType(wrapperContained.OAK); }
public yarnwrap.block.BlockSetType SPRUCE() { return new yarnwrap.block.BlockSetType(wrapperContained.SPRUCE); }
public yarnwrap.block.BlockSetType BIRCH() { return new yarnwrap.block.BlockSetType(wrapperContained.BIRCH); }
public yarnwrap.block.BlockSetType ACACIA() { return new yarnwrap.block.BlockSetType(wrapperContained.ACACIA); }
public yarnwrap.block.BlockSetType CHERRY() { return new yarnwrap.block.BlockSetType(wrapperContained.CHERRY); }
public yarnwrap.block.BlockSetType JUNGLE() { return new yarnwrap.block.BlockSetType(wrapperContained.JUNGLE); }
public yarnwrap.block.BlockSetType DARK_OAK() { return new yarnwrap.block.BlockSetType(wrapperContained.DARK_OAK); }
public yarnwrap.block.BlockSetType CRIMSON() { return new yarnwrap.block.BlockSetType(wrapperContained.CRIMSON); }
public yarnwrap.block.BlockSetType WARPED() { return new yarnwrap.block.BlockSetType(wrapperContained.WARPED); }
public yarnwrap.block.BlockSetType MANGROVE() { return new yarnwrap.block.BlockSetType(wrapperContained.MANGROVE); }
public yarnwrap.block.BlockSetType BAMBOO() { return new yarnwrap.block.BlockSetType(wrapperContained.BAMBOO); }
// public java.util.Map VALUES() { return wrapperContained.VALUES; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.block.BlockSetType COPPER() { return new yarnwrap.block.BlockSetType(wrapperContained.COPPER); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public yarnwrap.block.BlockSetType register(yarnwrap.block.BlockSetType blockSetType) { return new yarnwrap.block.BlockSetType(wrapperContained.register(blockSetType.wrapperContained)); }

}