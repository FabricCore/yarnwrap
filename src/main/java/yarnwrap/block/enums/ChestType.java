package yarnwrap.block.enums;
public class ChestType { public net.minecraft.block.enums.ChestType wrapperContained; public ChestType(net.minecraft.block.enums.ChestType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public yarnwrap.block.enums.ChestType getOpposite() { return new yarnwrap.block.enums.ChestType(wrapperContained.getOpposite()); }

}