package yarnwrap.block;
public class WoodType { public net.minecraft.block.WoodType wrapperContained; public WoodType(net.minecraft.block.WoodType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.block.WoodType OAK() { return new yarnwrap.block.WoodType(wrapperContained.OAK); }
public yarnwrap.block.WoodType SPRUCE() { return new yarnwrap.block.WoodType(wrapperContained.SPRUCE); }
public yarnwrap.block.WoodType BIRCH() { return new yarnwrap.block.WoodType(wrapperContained.BIRCH); }
public yarnwrap.block.WoodType ACACIA() { return new yarnwrap.block.WoodType(wrapperContained.ACACIA); }
public yarnwrap.block.WoodType JUNGLE() { return new yarnwrap.block.WoodType(wrapperContained.JUNGLE); }
public yarnwrap.block.WoodType DARK_OAK() { return new yarnwrap.block.WoodType(wrapperContained.DARK_OAK); }
public yarnwrap.block.WoodType CRIMSON() { return new yarnwrap.block.WoodType(wrapperContained.CRIMSON); }
public yarnwrap.block.WoodType WARPED() { return new yarnwrap.block.WoodType(wrapperContained.WARPED); }
public yarnwrap.block.WoodType MANGROVE() { return new yarnwrap.block.WoodType(wrapperContained.MANGROVE); }
public yarnwrap.block.WoodType BAMBOO() { return new yarnwrap.block.WoodType(wrapperContained.BAMBOO); }
public yarnwrap.block.WoodType CHERRY() { return new yarnwrap.block.WoodType(wrapperContained.CHERRY); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.util.Map VALUES() { return wrapperContained.VALUES; }
// public java.lang.String name() { return wrapperContained.name(); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public yarnwrap.block.WoodType register(yarnwrap.block.WoodType type) { return new yarnwrap.block.WoodType(wrapperContained.register(type.wrapperContained)); }

}