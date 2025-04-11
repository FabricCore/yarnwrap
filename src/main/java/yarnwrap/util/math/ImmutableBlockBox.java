package yarnwrap.util.math;
public class ImmutableBlockBox { public net.minecraft.util.math.ImmutableBlockBox wrapperContained; public ImmutableBlockBox(net.minecraft.util.math.ImmutableBlockBox wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public ImmutableBlockBox(yarnwrap.util.math.BlockPos first,yarnwrap.util.math.BlockPos second) { this.wrapperContained = new net.minecraft.util.math.ImmutableBlockBox(first.wrapperContained,second.wrapperContained); }
public boolean isSingleBlock() { return wrapperContained.isSingleBlock(); }
public yarnwrap.util.math.ImmutableBlockBox of(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.of(pos.wrapperContained)); }
public yarnwrap.util.math.ImmutableBlockBox of(yarnwrap.util.math.BlockPos first,yarnwrap.util.math.BlockPos second) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.of(first.wrapperContained,second.wrapperContained)); }
public yarnwrap.util.math.ImmutableBlockBox expand(yarnwrap.util.math.Direction direction,int offset) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.expand(direction.wrapperContained,offset)); }
public yarnwrap.util.math.ImmutableBlockBox move(yarnwrap.util.math.Vec3i offset) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.move(offset.wrapperContained)); }
public yarnwrap.util.math.Box enclosingBox() { return new yarnwrap.util.math.Box(wrapperContained.enclosingBox()); }
public yarnwrap.util.math.ImmutableBlockBox encompass(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.encompass(pos.wrapperContained)); }
public yarnwrap.util.math.ImmutableBlockBox move(yarnwrap.util.math.Direction direction,int offset) { return new yarnwrap.util.math.ImmutableBlockBox(wrapperContained.move(direction.wrapperContained,offset)); }
public int getBlockCountX() { return wrapperContained.getBlockCountX(); }
public boolean includes(yarnwrap.util.math.BlockPos pos) { return wrapperContained.includes(pos.wrapperContained); }
public int getBlockCountY() { return wrapperContained.getBlockCountY(); }
public int getBlockCountZ() { return wrapperContained.getBlockCountZ(); }

}