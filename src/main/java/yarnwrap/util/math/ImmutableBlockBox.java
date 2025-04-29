package yarnwrap.util.math;
public class ImmutableBlockBox { public net.minecraft.util.math.ImmutableBlockBox wrapperContained; public ImmutableBlockBox(net.minecraft.util.math.ImmutableBlockBox wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.math.ImmutableBlockBox.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.math.ImmutableBlockBox.PACKET_CODEC = value.wrapperContained; }

public ImmutableBlockBox(yarnwrap.util.math.BlockPos first,yarnwrap.util.math.BlockPos second) { this.wrapperContained = new net.minecraft.util.math.ImmutableBlockBox(first.wrapperContained,second.wrapperContained); }
public boolean isSingleBlock() { return wrapperContained.isSingleBlock(); }
// public static boolean isSingleBlock() { return net.minecraft.util.math.ImmutableBlockBox.isSingleBlock(); }
// public yarnwrap.util.math.ImmutableBlockBox of(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.of(pos.wrapperContained)); }
// public static yarnwrap.util.math.ImmutableBlockBox of(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.ImmutableBlockBox(net.minecraft.util.math.ImmutableBlockBox.of(pos.wrapperContained)); }
// public yarnwrap.util.math.ImmutableBlockBox of(yarnwrap.util.math.BlockPos first,yarnwrap.util.math.BlockPos second) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.of(first.wrapperContained,second.wrapperContained)); }
// public static yarnwrap.util.math.ImmutableBlockBox of(yarnwrap.util.math.BlockPos first,yarnwrap.util.math.BlockPos second, ) { return new yarnwrap.util.math.ImmutableBlockBox(net.minecraft.util.math.ImmutableBlockBox.of(first.wrapperContained,second.wrapperContained)); }
public yarnwrap.util.math.ImmutableBlockBox expand(yarnwrap.util.math.Direction direction,int offset) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.expand(direction.wrapperContained,offset)); }
// public static yarnwrap.util.math.ImmutableBlockBox expand(yarnwrap.util.math.Direction direction,int offset, ) { return new yarnwrap.util.math.ImmutableBlockBox(net.minecraft.util.math.ImmutableBlockBox.expand(direction.wrapperContained,offset)); }
public yarnwrap.util.math.ImmutableBlockBox move(yarnwrap.util.math.Vec3i offset) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.move(offset.wrapperContained)); }
// public static yarnwrap.util.math.ImmutableBlockBox move(yarnwrap.util.math.Vec3i offset, ) { return new yarnwrap.util.math.ImmutableBlockBox(net.minecraft.util.math.ImmutableBlockBox.move(offset.wrapperContained)); }
public yarnwrap.util.math.Box enclosingBox() { return new yarnwrap.util.math.Box(wrapperContained.enclosingBox()); }
// public static yarnwrap.util.math.Box enclosingBox() { return new yarnwrap.util.math.Box(net.minecraft.util.math.ImmutableBlockBox.enclosingBox()); }
public yarnwrap.util.math.ImmutableBlockBox encompass(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.encompass(pos.wrapperContained)); }
// public static yarnwrap.util.math.ImmutableBlockBox encompass(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.ImmutableBlockBox(net.minecraft.util.math.ImmutableBlockBox.encompass(pos.wrapperContained)); }
public yarnwrap.util.math.ImmutableBlockBox move(yarnwrap.util.math.Direction direction,int offset) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.move(direction.wrapperContained,offset)); }
// public static yarnwrap.util.math.ImmutableBlockBox move(yarnwrap.util.math.Direction direction,int offset, ) { return new yarnwrap.util.math.ImmutableBlockBox(net.minecraft.util.math.ImmutableBlockBox.move(direction.wrapperContained,offset)); }
public int getBlockCountX() { return wrapperContained.getBlockCountX(); }
// public static int getBlockCountX() { return net.minecraft.util.math.ImmutableBlockBox.getBlockCountX(); }
public boolean includes(yarnwrap.util.math.BlockPos pos) { return wrapperContained.includes(pos.wrapperContained); }
// public static boolean includes(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.util.math.ImmutableBlockBox.includes(pos.wrapperContained); }
public int getBlockCountY() { return wrapperContained.getBlockCountY(); }
// public static int getBlockCountY() { return net.minecraft.util.math.ImmutableBlockBox.getBlockCountY(); }
public int getBlockCountZ() { return wrapperContained.getBlockCountZ(); }
// public static int getBlockCountZ() { return net.minecraft.util.math.ImmutableBlockBox.getBlockCountZ(); }

}