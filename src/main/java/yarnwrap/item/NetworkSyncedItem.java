package yarnwrap.item;
public class NetworkSyncedItem { public net.minecraft.item.NetworkSyncedItem wrapperContained; public NetworkSyncedItem(net.minecraft.item.NetworkSyncedItem wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.Packet createSyncPacket(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.network.packet.Packet(wrapperContained.createSyncPacket(stack.wrapperContained,world.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.network.packet.Packet createSyncPacket(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.network.packet.Packet(net.minecraft.item.NetworkSyncedItem.createSyncPacket(stack.wrapperContained,world.wrapperContained,player.wrapperContained)); }

}