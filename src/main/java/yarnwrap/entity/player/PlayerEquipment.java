package yarnwrap.entity.player;
public class PlayerEquipment { public net.minecraft.entity.player.PlayerEquipment wrapperContained; public PlayerEquipment(net.minecraft.entity.player.PlayerEquipment wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.entity.player.PlayerEquipment.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.entity.player.PlayerEquipment.player = value.wrapperContained; }

public PlayerEquipment(yarnwrap.entity.player.PlayerEntity player) { this.wrapperContained = new net.minecraft.entity.player.PlayerEquipment(player.wrapperContained); }

}