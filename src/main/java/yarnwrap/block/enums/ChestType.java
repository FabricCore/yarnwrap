package yarnwrap.block.enums;
public class ChestType { public net.minecraft.block.enums.ChestType wrapperContained; public ChestType(net.minecraft.block.enums.ChestType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.block.enums.ChestType.name; }
// public static void name(java.lang.String value, ) { net.minecraft.block.enums.ChestType.name = value; }

// public ChestType(java.lang.String name) { this.wrapperContained = new net.minecraft.block.enums.ChestType(name); }
public yarnwrap.block.enums.ChestType getOpposite() { return new yarnwrap.block.enums.ChestType(wrapperContained.getOpposite()); }
// public static yarnwrap.block.enums.ChestType getOpposite() { return new yarnwrap.block.enums.ChestType(net.minecraft.block.enums.ChestType.getOpposite()); }

}