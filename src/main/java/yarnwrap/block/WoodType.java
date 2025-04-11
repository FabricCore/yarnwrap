package yarnwrap.block;
public class WoodType { public net.minecraft.block.WoodType wrapperContained; public WoodType(net.minecraft.block.WoodType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public yarnwrap.block.WoodType OAK() { return new yarnwrap.block.WoodType(wrapperContained.OAK); }
// public void OAK(yarnwrap.block.WoodType value) { wrapperContained.OAK = value.wrapperContained; }
public yarnwrap.block.WoodType SPRUCE() { return new yarnwrap.block.WoodType(wrapperContained.SPRUCE); }
// public void SPRUCE(yarnwrap.block.WoodType value) { wrapperContained.SPRUCE = value.wrapperContained; }
public yarnwrap.block.WoodType BIRCH() { return new yarnwrap.block.WoodType(wrapperContained.BIRCH); }
// public void BIRCH(yarnwrap.block.WoodType value) { wrapperContained.BIRCH = value.wrapperContained; }
public yarnwrap.block.WoodType ACACIA() { return new yarnwrap.block.WoodType(wrapperContained.ACACIA); }
// public void ACACIA(yarnwrap.block.WoodType value) { wrapperContained.ACACIA = value.wrapperContained; }
public yarnwrap.block.WoodType JUNGLE() { return new yarnwrap.block.WoodType(wrapperContained.JUNGLE); }
// public void JUNGLE(yarnwrap.block.WoodType value) { wrapperContained.JUNGLE = value.wrapperContained; }
public yarnwrap.block.WoodType DARK_OAK() { return new yarnwrap.block.WoodType(wrapperContained.DARK_OAK); }
// public void DARK_OAK(yarnwrap.block.WoodType value) { wrapperContained.DARK_OAK = value.wrapperContained; }
public yarnwrap.block.WoodType CRIMSON() { return new yarnwrap.block.WoodType(wrapperContained.CRIMSON); }
// public void CRIMSON(yarnwrap.block.WoodType value) { wrapperContained.CRIMSON = value.wrapperContained; }
public yarnwrap.block.WoodType WARPED() { return new yarnwrap.block.WoodType(wrapperContained.WARPED); }
// public void WARPED(yarnwrap.block.WoodType value) { wrapperContained.WARPED = value.wrapperContained; }
public yarnwrap.block.WoodType MANGROVE() { return new yarnwrap.block.WoodType(wrapperContained.MANGROVE); }
// public void MANGROVE(yarnwrap.block.WoodType value) { wrapperContained.MANGROVE = value.wrapperContained; }
public yarnwrap.block.WoodType BAMBOO() { return new yarnwrap.block.WoodType(wrapperContained.BAMBOO); }
// public void BAMBOO(yarnwrap.block.WoodType value) { wrapperContained.BAMBOO = value.wrapperContained; }
public yarnwrap.block.WoodType CHERRY() { return new yarnwrap.block.WoodType(wrapperContained.CHERRY); }
// public void CHERRY(yarnwrap.block.WoodType value) { wrapperContained.CHERRY = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.Map VALUES() { return wrapperContained.VALUES; }
// public void VALUES(java.util.Map value) { wrapperContained.VALUES = value; }
public WoodType(java.lang.String name,yarnwrap.block.BlockSetType setType) { this.wrapperContained = new net.minecraft.block.WoodType(name,setType.wrapperContained); }
// public java.lang.String name() { return wrapperContained.name(); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public yarnwrap.block.WoodType register(yarnwrap.block.WoodType type) { return new yarnwrap.block.WoodType(wrapperContained.register(type.wrapperContained)); }

}