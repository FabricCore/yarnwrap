package yarnwrap.component.type;
public class JukeboxPlayableComponent { public net.minecraft.component.type.JukeboxPlayableComponent wrapperContained; public JukeboxPlayableComponent(net.minecraft.component.type.JukeboxPlayableComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.JukeboxPlayableComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.JukeboxPlayableComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.JukeboxPlayableComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.JukeboxPlayableComponent.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_60746(Object instance) { return wrapperContained.method_60746(instance); }
// public static com.mojang.datafixers.kinds.App method_60746(Object instance, ) { return net.minecraft.component.type.JukeboxPlayableComponent.method_60746(instance); }
// public yarnwrap.util.ItemActionResult tryPlayStack(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.util.ItemActionResult(wrapperContained.tryPlayStack(world.wrapperContained,pos.wrapperContained,stack.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.util.ItemActionResult tryPlayStack(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.util.ItemActionResult(net.minecraft.component.type.JukeboxPlayableComponent.tryPlayStack(world.wrapperContained,pos.wrapperContained,stack.wrapperContained,player.wrapperContained)); }
public yarnwrap.component.type.JukeboxPlayableComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.JukeboxPlayableComponent(wrapperContained.withShowInTooltip(showInTooltip)); }
// public static yarnwrap.component.type.JukeboxPlayableComponent withShowInTooltip(boolean showInTooltip, ) { return new yarnwrap.component.type.JukeboxPlayableComponent(net.minecraft.component.type.JukeboxPlayableComponent.withShowInTooltip(showInTooltip)); }

}