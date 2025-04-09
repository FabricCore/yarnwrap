package yarnwrap.component.type;
public class JukeboxPlayableComponent { public net.minecraft.component.type.JukeboxPlayableComponent wrapperContained; public JukeboxPlayableComponent(net.minecraft.component.type.JukeboxPlayableComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.util.ItemActionResult tryPlayStack(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.util.ItemActionResult(wrapperContained.tryPlayStack(world.wrapperContained,pos.wrapperContained,stack.wrapperContained,player.wrapperContained)); }
public yarnwrap.component.type.JukeboxPlayableComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.JukeboxPlayableComponent(wrapperContained.withShowInTooltip(showInTooltip)); }

}