package yarnwrap.entity.player;
public class PlayerModelPart { public net.minecraft.entity.player.PlayerModelPart wrapperContained; public PlayerModelPart(net.minecraft.entity.player.PlayerModelPart wrapperContained) { this.wrapperContained = wrapperContained; }

// public int bitFlag() { return wrapperContained.bitFlag; }
// public void bitFlag(int value) { wrapperContained.bitFlag = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public yarnwrap.text.Text optionName() { return new yarnwrap.text.Text(wrapperContained.optionName); }
// public void optionName(yarnwrap.text.Text value) { wrapperContained.optionName = value.wrapperContained; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// // public PlayerModelPart(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.entity.player.PlayerModelPart(id,name); }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.text.Text getOptionName() { return new yarnwrap.text.Text(wrapperContained.getOptionName()); }
public java.lang.String getName() { return wrapperContained.getName(); }
public int getBitFlag() { return wrapperContained.getBitFlag(); }

}