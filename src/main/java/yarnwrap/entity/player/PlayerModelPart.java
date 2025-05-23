package yarnwrap.entity.player;
public class PlayerModelPart { public net.minecraft.entity.player.PlayerModelPart wrapperContained; public PlayerModelPart(net.minecraft.entity.player.PlayerModelPart wrapperContained) { this.wrapperContained = wrapperContained; }

// public int bitFlag() { return wrapperContained.bitFlag; }
// public void bitFlag(int value) { wrapperContained.bitFlag = value; }
// public static int bitFlag() { return net.minecraft.entity.player.PlayerModelPart.bitFlag; }
// public static void bitFlag(int value, ) { net.minecraft.entity.player.PlayerModelPart.bitFlag = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.entity.player.PlayerModelPart.id; }
// public static void id(int value, ) { net.minecraft.entity.player.PlayerModelPart.id = value; }

// public yarnwrap.text.Text optionName() { return new yarnwrap.text.Text(wrapperContained.optionName); }
// public void optionName(yarnwrap.text.Text value) { wrapperContained.optionName = value.wrapperContained; }
// public static yarnwrap.text.Text optionName() { return new yarnwrap.text.Text(net.minecraft.entity.player.PlayerModelPart.optionName); }
// public static void optionName(yarnwrap.text.Text value, ) { net.minecraft.entity.player.PlayerModelPart.optionName = value.wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.entity.player.PlayerModelPart.name; }
// public static void name(java.lang.String value, ) { net.minecraft.entity.player.PlayerModelPart.name = value; }

// // public PlayerModelPart(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.entity.player.PlayerModelPart(id,name); }
public yarnwrap.text.Text getOptionName() { return new yarnwrap.text.Text(wrapperContained.getOptionName()); }
// public static yarnwrap.text.Text getOptionName() { return new yarnwrap.text.Text(net.minecraft.entity.player.PlayerModelPart.getOptionName()); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.entity.player.PlayerModelPart.getName(); }
public int getBitFlag() { return wrapperContained.getBitFlag(); }
// public static int getBitFlag() { return net.minecraft.entity.player.PlayerModelPart.getBitFlag(); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.entity.player.PlayerModelPart.getId(); }

}