package yarnwrap.entity.player;
public class PlayerModelPart { public net.minecraft.entity.player.PlayerModelPart wrapperContained; public PlayerModelPart(net.minecraft.entity.player.PlayerModelPart wrapperContained) { this.wrapperContained = wrapperContained; }

// public int bitFlag() { return wrapperContained.bitFlag; }
// public int id() { return wrapperContained.id; }
// public yarnwrap.text.Text optionName() { return new yarnwrap.text.Text(wrapperContained.optionName); }
// public java.lang.String name() { return wrapperContained.name; }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.text.Text getOptionName() { return new yarnwrap.text.Text(wrapperContained.getOptionName()); }
public java.lang.String getName() { return wrapperContained.getName(); }
public int getBitFlag() { return wrapperContained.getBitFlag(); }

}